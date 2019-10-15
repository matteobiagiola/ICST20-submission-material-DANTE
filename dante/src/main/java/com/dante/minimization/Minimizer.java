package com.dante.minimization;

import com.dante.coverage.CovUnit;
import com.dante.coverage.CoverageReport;
import com.dante.tedd.graph.GraphEdge;
import com.dante.tedd.graph.GraphNode;
import com.dante.tedd.graph.GraphUtils;
import com.dante.utils.Properties;
import com.microsoft.z3.*;
import org.apache.log4j.Logger;
import org.jgrapht.Graph;

import java.util.*;

public class Minimizer {

    private final static Logger logger = Logger.getLogger(Minimizer.class.getName());
    private Context ctx;

    // setup z3 on mac: https://github.com/Z3Prover/z3/issues/294#issuecomment-352472522

    public Minimizer() {

        try {
            logger.debug("Z3 Major Version: ");
            logger.debug(Version.getMajor());
            logger.debug("Z3 Full Version: ");
            logger.debug(Version.getString());
            logger.debug("Z3 Full Version String: ");
            logger.debug(Version.getFullVersion());

            HashMap<String, String> cfg = new HashMap<>();
            cfg.put("model", "true");
            this.ctx = new Context(cfg);
        } catch (Z3Exception ex) {
            logger.error("Z3 Managed Exception: " + ex.getMessage());
            logger.error("Stack trace: " + ex);
            System.exit(1);
        } catch (Exception ex) {
            logger.error("Unknown Exception: " + ex.getMessage());
            logger.error("Stack trace: " + ex);
            System.exit(1);
        }
    }

    public void minimizeTestSuite(CoverageReport coverageReport, boolean multipleSolutions) {
        try {

            logger.info("Minimize test suite");

            Optimize opt = this.ctx.mkOptimize();

            // Create variables (one for each test)
            List<IntExpr> testVariables = new LinkedList<>();
            List<GraphNode<String>> orderedListOfNodes
                    = new ArrayList<>(GraphUtils.mapTestsOrderToNodesOrder(Arrays
                        .asList(Properties.tests_order)));
            orderedListOfNodes.sort(Comparator.comparingInt(GraphNode::getNumOrder));
            Map<String, IntExpr> mapNodeExpr = new HashMap<>();
            for (GraphNode<String> graphNode : orderedListOfNodes) {
                IntExpr testVariable = ctx.mkIntConst(graphNode.getTestCase());
                testVariables.add(testVariable);
                mapNodeExpr.put(graphNode.getTestCase(), testVariable);
            }

            logger.info("Number of variables: " + testVariables.size());

            // all constraints
            List<BoolExpr> constraints = new ArrayList<>();

            // constraints for integer variables
            List<BoolExpr> integerConstraints = new ArrayList<>();
            IntNum zero = this.ctx.mkInt(0);
            IntNum one = this.ctx.mkInt(1);
            for (IntExpr testVariable : testVariables) {
                integerConstraints.add(this.ctx.mkGe(testVariable, zero)); // >= 0 constraints
                integerConstraints.add(this.ctx.mkLe(testVariable, one)); // <= 1 constraints
            }

            constraints.add(this.ctx.mkAnd(integerConstraints.toArray(new BoolExpr[0])));

            // coverage unit (cov unit) can be either line or byte
            Set<String> uniqueTestCasesCoveringCovUnits = new HashSet<>();
            Map<CovUnit, List<GraphNode<String>>> mapCovUnitCoveringTestCases = coverageReport.getMapCovUnitCoveringTestCases();
            for (CovUnit covUnit : mapCovUnitCoveringTestCases.keySet()) {
                List<GraphNode<String>> testsCoveringCovUnit = mapCovUnitCoveringTestCases.get(covUnit);
                IntExpr[] testVariablesCovUnit = testsCoveringCovUnit.stream()
                        .map(node -> mapNodeExpr.get(node.getTestCase())).toArray(IntExpr[]::new);
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < testVariablesCovUnit.length; i++) {
                    IntExpr testVariableCovUnit = testVariablesCovUnit[i];
                    builder.append(testVariableCovUnit.toString());
                    if(i < testVariablesCovUnit.length - 1) {
                        builder.append("_");
                    }
                }
                if(uniqueTestCasesCoveringCovUnits.add(builder.toString())) {
                    if(testVariablesCovUnit.length == 1) {
                        constraints.add(this.ctx.mkEq(testVariablesCovUnit[0], one));
                    } else {
                        constraints.add(this.ctx.mkGe(this.ctx.mkAdd(testVariablesCovUnit), one));
                    }
                }
            }

            logger.info("Number of unique coverage unit constraints: " + uniqueTestCasesCoveringCovUnits.size());

            logger.debug("Constraints: " + constraints);
            // Set constraints.
            opt.Add(constraints.toArray(new BoolExpr[0]));

            // Set objectives.
            List<RealExpr> weightedSum = new ArrayList<>();
            Map<GraphNode<String>, Double> mapTestCaseExecutionTime = coverageReport.getMapTestCaseExecutionTime();
            for (GraphNode<String> test : mapTestCaseExecutionTime.keySet()) {
                Double executionTime = mapTestCaseExecutionTime.get(test);
                IntExpr testVariable = mapNodeExpr.get(test.getTestCase());
                RealExpr executionTimeExpression = ctx.mkReal(String.valueOf(executionTime));
                weightedSum.add((RealExpr) ctx.mkMul(executionTimeExpression, testVariable));
            }
            Optimize.Handle testsWithExecutionCost = opt.MkMinimize(this.ctx.mkAdd(weightedSum.toArray(new RealExpr[0])));

//            Optimize.Handle testsSum = opt.MkMinimize(this.ctx.mkAdd(testVariables.toArray(new IntExpr[0])));

            if(multipleSolutions) {
                // get all satisfying models: https://stackoverflow.com/questions/13395391/z3-finding-all-satisfying-models
                Set<BoolExpr> newConstraints = new LinkedHashSet<>();
                int solutionCount = 1;
                Status status = opt.Check();

                while(status.equals(Status.SATISFIABLE)) {
                    logger.info("Model found, solution #" + solutionCount);

                    // negate solution just got and add it as a constraint
                    for (IntExpr testVariable : testVariables) {
                        logger.info("Test variable: " + testVariable + " - "
                                + opt.getModel().evaluate(testVariable, false));
                        newConstraints.add(this.ctx.mkNot(this.ctx.mkEq(testVariable, opt.getModel().evaluate(testVariable, false))));
                    }

                    opt.Add(this.ctx.mkOr(newConstraints.toArray(new BoolExpr[0])));
                    newConstraints.clear();

                    logger.info("Solution as byte string: " +
                            this.buildByteStringSolution(opt, mapNodeExpr, orderedListOfNodes));
                    logger.info("Obj function: " + testsWithExecutionCost);
                    System.out.println();

                    // add constraint on objective function (only first time)
                    if(solutionCount == 1) {
//                        opt.Add(this.ctx.mkLe(this.ctx.mkAdd(testVariables.toArray(new IntExpr[0])), this.ctx.mkReal(testsSum.toString())));
                        opt.Add(this.ctx.mkLe(this.ctx.mkAdd(weightedSum.toArray(new RealExpr[0])),
                                this.ctx.mkReal(testsWithExecutionCost.toString())));
                    }

                    solutionCount++;
                    status = opt.Check();
                }

                if(solutionCount == 1) {
                    logger.info("No models found. Result: " + status);
                }


            } else {
                Status status = opt.Check();
                if(status.equals(Status.SATISFIABLE)) {
                    logger.info("Model found. Result: " + status);
                    for (IntExpr testVariable : testVariables) {
                        logger.info("Test variable: " + testVariable + " - "
                                + opt.getModel().evaluate(testVariable, false));
                    }
                    logger.info("Solution as byte string: " +
                            this.buildByteStringSolution(opt, mapNodeExpr, orderedListOfNodes));
                    logger.info("Obj function: " + testsWithExecutionCost);
                } else {
                    logger.info("No models found. Result: " + status);
                }
            }
        } catch (Z3Exception ex) {
            logger.error("Z3 Managed Exception: " + ex.getMessage());
            ex.printStackTrace();
            System.exit(1);
        } catch (Exception ex) {
            logger.error("Unknown Exception: " + ex.getMessage());
            ex.printStackTrace();
            System.exit(1);
        }
    }

    public void minimizeTestSuite(CoverageReport coverageReport,
                                  Graph<GraphNode<String>, GraphEdge> dependencyGraph, boolean multipleSolution) {
        try {
            logger.info("Minimize test suite");

            Optimize opt = this.ctx.mkOptimize();

            List<GraphNode<String>> originalOrderedListOfNodes
                    = new ArrayList<>(GraphUtils.mapTestsOrderToNodesOrder(Arrays
                    .asList(Properties.tests_order)));

            // Create variables (one for each test)
            List<IntExpr> testVariables = new LinkedList<>();
            List<GraphNode<String>> orderedListOfNodes = new ArrayList<>(dependencyGraph.vertexSet());
            orderedListOfNodes.sort(Comparator.comparingInt(GraphNode::getNumOrder));
            Map<String, IntExpr> mapNodeExpr = new HashMap<>();
            for (GraphNode<String> graphNode : orderedListOfNodes) {
                IntExpr testVariable = ctx.mkIntConst(graphNode.getTestCase());
                testVariables.add(testVariable);
                mapNodeExpr.put(graphNode.getTestCase(), testVariable);
            }

            logger.info("Number of variables: " + testVariables.size());

            // all constraints
            List<BoolExpr> constraints = new ArrayList<>();

            // constraints for integer variables
            List<BoolExpr> integerConstraints = new ArrayList<>();
            IntNum zero = this.ctx.mkInt(0);
            IntNum one = this.ctx.mkInt(1);
            for (IntExpr testVariable : testVariables) {
                integerConstraints.add(this.ctx.mkGe(testVariable, zero)); // >= 0 constraints
                integerConstraints.add(this.ctx.mkLe(testVariable, one)); // <= 1 constraints
            }

            constraints.add(this.ctx.mkAnd(integerConstraints.toArray(new BoolExpr[0])));

            // coverage unit (cov unit) can be either line or byte
            Set<String> uniqueTestCasesCoveringCovUnits = new HashSet<>();
            Map<CovUnit, List<GraphNode<String>>> mapCovUnitCoveringTestCases = coverageReport.getMapCovUnitCoveringTestCases();
            for (CovUnit covUnit : mapCovUnitCoveringTestCases.keySet()) {
                List<GraphNode<String>> testsCoveringCovUnit = mapCovUnitCoveringTestCases.get(covUnit);
                IntExpr[] testVariablesCovUnit = testsCoveringCovUnit.stream()
                        .map(node -> mapNodeExpr.get(node.getTestCase())).toArray(IntExpr[]::new);
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < testVariablesCovUnit.length; i++) {
                    IntExpr testVariableCovUnit = testVariablesCovUnit[i];
                    builder.append(testVariableCovUnit.toString());
                    if(i < testVariablesCovUnit.length - 1) {
                        builder.append("_");
                    }
                }
                if(uniqueTestCasesCoveringCovUnits.add(builder.toString())) {
                    if(testVariablesCovUnit.length == 1) {
                        constraints.add(this.ctx.mkEq(testVariablesCovUnit[0], one));
                    } else {
                        constraints.add(this.ctx.mkGe(this.ctx.mkAdd(testVariablesCovUnit), one));
                    }
                }
            }

            logger.info("Number of unique coverage unit constraints: " + uniqueTestCasesCoveringCovUnits.size());

            // constraints on dependencies
            for (GraphEdge graphEdge : dependencyGraph.edgeSet()) {
                GraphNode<String> graphSource = dependencyGraph.getEdgeSource(graphEdge);
                GraphNode<String> graphTarget = dependencyGraph.getEdgeTarget(graphEdge);
                constraints.add(this.ctx.mkImplies(this.ctx.mkEq(mapNodeExpr.get(graphSource.getTestCase()), one),
                        this.ctx.mkEq(mapNodeExpr.get(graphTarget.getTestCase()), one)));
            }

            logger.info("Number of constraints on dependencies: " + dependencyGraph.edgeSet());

            logger.debug("Constraints: " + constraints);
            // Set constraints.
            opt.Add(constraints.toArray(new BoolExpr[0]));

            // Set objectives.
            List<RealExpr> weightedSum = new ArrayList<>();
            Map<GraphNode<String>, Double> mapTestCaseExecutionTime = coverageReport.getMapTestCaseExecutionTime();
            for (GraphNode<String> test : mapTestCaseExecutionTime.keySet()) {
                Double executionTime = mapTestCaseExecutionTime.get(test);
                IntExpr testVariable = mapNodeExpr.get(test.getTestCase());
                RealExpr executionTimeExpression = ctx.mkReal(String.valueOf(executionTime));
                weightedSum.add((RealExpr) ctx.mkMul(executionTimeExpression, testVariable));
            }
            Optimize.Handle testsWithExecutionCost = opt.MkMinimize(this.ctx.mkAdd(weightedSum.toArray(new RealExpr[0])));

            if(multipleSolution) {
                // get all satisfying models: https://stackoverflow.com/questions/13395391/z3-finding-all-satisfying-models
                Set<BoolExpr> newConstraints = new LinkedHashSet<>();
                int solutionCount = 1;
                Status status = opt.Check();

                while(status.equals(Status.SATISFIABLE)) {
                    logger.info("Model found, solution #" + solutionCount);

                    // negate solution just got and add it as a constraint
                    for (IntExpr testVariable : testVariables) {
                        logger.info("Test variable: " + testVariable + " - "
                                + opt.getModel().evaluate(testVariable, false));
                        newConstraints.add(this.ctx.mkNot(this.ctx.mkEq(testVariable, opt.getModel().evaluate(testVariable, false))));
                    }
                    opt.Add(this.ctx.mkOr(newConstraints.toArray(new BoolExpr[0])));
                    newConstraints.clear();

                    logger.info("Solution as byte string: " + this.buildByteStringSolution(opt, mapNodeExpr, originalOrderedListOfNodes));
                    logger.info("Obj function: " + testsWithExecutionCost);
                    System.out.println();

                    // add constraint on objective function (only first time)
                    if(solutionCount == 1) {
                        opt.Add(this.ctx.mkLe(this.ctx.mkAdd(weightedSum.toArray(new RealExpr[0])), this.ctx.mkReal(testsWithExecutionCost.toString())));
                    }

                    solutionCount++;
                    status = opt.Check();
                }

                if(solutionCount == 1) {
                    logger.info("No models found. Result: " + status);
                }


            } else {
                Status status = opt.Check();
                if(status.equals(Status.SATISFIABLE)) {
                    logger.info("Model found. Result: " + status);
                    for (IntExpr testVariable : testVariables) {
                        logger.info("Test variable: " + testVariable + " - "
                                + opt.getModel().evaluate(testVariable, false));
                    }
                    logger.info("Solution as byte string: " + this.buildByteStringSolution(opt, mapNodeExpr, originalOrderedListOfNodes));
                    logger.info("Obj function: " + testsWithExecutionCost);
                } else {
                    logger.info("No models found. Result: " + status);
                }
            }
        } catch (Z3Exception ex) {
            logger.error("Z3 Managed Exception: " + ex.getMessage());
            ex.printStackTrace();
//            logger.error("Stack trace: " + ex);
            System.exit(1);
        } catch (Exception ex) {
            logger.error("Unknown Exception: " + ex.getMessage());
            ex.printStackTrace();
//            logger.error("Stack trace: " + ex);
            System.exit(1);
        }

    }

    private String buildByteStringSolution(Optimize opt, Map<String, IntExpr> mapNodeExpr,
                                           List<GraphNode<String>> originalOrderedListOfNodes) {
        StringBuilder solutionBuilder = new StringBuilder();
        for (GraphNode<String> graphNode : originalOrderedListOfNodes) {
            IntExpr testVariable = mapNodeExpr.get(graphNode.getTestCase());
            if(testVariable == null) {
                solutionBuilder.append("0");
            } else {
                solutionBuilder.append(opt.getModel().evaluate(testVariable, false).toString());
            }
        }
        return solutionBuilder.toString();
    }
}

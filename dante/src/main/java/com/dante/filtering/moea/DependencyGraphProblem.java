package com.dante.filtering.moea;

import com.dante.tedd.graph.GraphEdge;
import com.dante.tedd.graph.GraphNode;
import com.dante.tedd.graph.dot.importgraph.GraphImporter;
import com.dante.utils.Properties;
import org.apache.log4j.Logger;
import org.jgrapht.Graph;
import org.jgrapht.traverse.BreadthFirstIterator;
import org.uma.jmetal.problem.impl.AbstractBinaryProblem;
import org.uma.jmetal.solution.BinarySolution;
import org.uma.jmetal.util.JMetalException;
import org.uma.jmetal.util.binarySet.BinarySet;

import java.util.*;


public class DependencyGraphProblem extends AbstractBinaryProblem {

    private int[] bitsPerVariable;
    private final Graph<GraphNode<String>, GraphEdge> graph;

    private final static Logger logger = Logger.getLogger(DependencyGraphProblem.class.getName());

    private Set<CustomBinarySolution> uniqueSolutions = new HashSet<>();

    /**
     * Creates a instance of problem DependencyGraphProblem
     */
    public DependencyGraphProblem() {

        GraphImporter graphImporter = new GraphImporter();
        this.graph = graphImporter.importGraph(Properties.GRAPH_PATH);

        int numberOfBits = this.graph.edgeSet().size();
        int numberOfVariables = this.graph.vertexSet().size() - 1;

        setNumberOfVariables(numberOfVariables);
        setNumberOfObjectives(2);
        setName("DependencyGraphProblem");

        bitsPerVariable = new int[numberOfVariables];

        for (int i = 0; i < numberOfVariables; i++) {
            bitsPerVariable[i] = i + 1;
        }

        int computedNumberOfBits = 0;
        for (int i = 0; i < bitsPerVariable.length; i++) {
            computedNumberOfBits += bitsPerVariable[i];
        }

        if(computedNumberOfBits != numberOfBits) {
            throw new IllegalStateException("Number of bits must be = number of edges ("
                    + numberOfBits + "). Found: " + computedNumberOfBits + ". Number of nodes = num of var: "
                    + numberOfVariables);
        }


    }

    @Override
    protected int getBitsPerVariable(int index) {
        if ((index < 0) || (index >= this.getNumberOfVariables())) {
            throw new JMetalException("Index value is incorrect: " + index) ;
        }
        return bitsPerVariable[index] ;
    }

    /** Evaluate() method */
    public void evaluate(BinarySolution solution) {
        double[] f = new double[solution.getNumberOfObjectives()];

        // num of dependencies
        f[0] = getNumberOfDependencies(solution);
        f[1] = getRecoveryCost(solution);

        solution.setObjective(0, f[0]);
        solution.setObjective(1, f[1]);
    }

    private double getNumberOfDependencies(BinarySolution solution) {
        double res = 0.0;
        for (BinarySet variable : solution.getVariables()) {
            for (int i = 0; i < variable.getBinarySetLength(); i++) {
                if(variable.get(i)){
                    res += 1.0;
                }
            }
        }
        return res;
    }

    private double getRecoveryCost(BinarySolution solution) {
        double res = 0.0;
        if(Properties.CONSIDER_INDIRECT_DEPENDENCIES) {
            GraphInt graph = new GraphInt(solution);
            List<List<Dependency>> dependencyRepresentation
                    = this.getDependencyRepresentation(solution, graph);
            for (int i = 0; i < solution.getVariables().size(); i++) {
                BinarySet variable = solution.getVariableValue(i);
                double costPerVariable = 0.0;
                int numOfBitsSetToZero = 0;
                for (int j = 0; j < variable.getBinarySetLength(); j++) {
                    if(!variable.get(j) && !this.isMissingIndirectDependency(i, j, dependencyRepresentation)) {
                        numOfBitsSetToZero++;
                    }
                }
                for (int j = 0; j < variable.getBinarySetLength(); j++) {
                    if(!variable.get(j) && !this.isMissingIndirectDependency(i, j, dependencyRepresentation)) {
                        costPerVariable += numOfBitsSetToZero;
                    } else if(!variable.get(j)) {
                        // indirect dependency
                        costPerVariable += 1/2d;
                    }
                    costPerVariable += ((double) solution.getVariables().size() / (i + 1));
                }
                res += costPerVariable;
            }
        }
        else {
            for (int i = 0; i < solution.getVariables().size(); i++) {
                BinarySet variable = solution.getVariableValue(i);
                double costPerVariable = 0.0;
                int numOfBitsSetToZero = 0;
                for (int j = 0; j < variable.getBinarySetLength(); j++) {
                    if(!variable.get(j)) {
                        numOfBitsSetToZero++;
                    }
                }
                for (int j = 0; j < variable.getBinarySetLength(); j++) {
                    if(!variable.get(j)) {
                        costPerVariable += numOfBitsSetToZero;
                    }
                }
                costPerVariable += ((double) solution.getVariables().size() / (i + 1));
                res += costPerVariable;
            }
        }
        return res / this.getTotalNumberOfBits();
    }

    @Override
    public BinarySolution createSolution() {
        CustomBinarySolution solution = null;
        boolean unique = true;
        while(unique) {
            solution = new CustomBinarySolution(this);
            unique = this.uniqueSolutions.contains(solution);
        }
        this.uniqueSolutions.add(solution);
        return solution;
    }

    private List<List<Dependency>> getDependencyRepresentation(BinarySolution solution, GraphInt graph) {
        List<List<Dependency>> result = new LinkedList<>();
        for (int i = 0; i < solution.getVariables().size(); i++) {
            List<Dependency> dependencies = new LinkedList<>();
            BinarySet variable = solution.getVariableValue(i);
            for (int j = 0; j < variable.getBinarySetLength(); j++) {
                Dependency dependency;
                int source = i + 2;
                int target = j + 1;
                if(!variable.get(j)) {
                    int missingIndirect;
                    if(variable.getBinarySetLength() == 1 || j == variable.getBinarySetLength() - 1) {
                        missingIndirect = 0;
                        dependency = new Dependency(source, target, variable.get(j), missingIndirect);
                    } else {
                        missingIndirect = graph.isReachable(source, target) ? 0 : 1;
                        dependency = new Dependency(source, target, variable.get(j), missingIndirect);
                    }
                } else {
                    dependency = new Dependency(source, target, variable.get(j));
                }
                dependencies.add(dependency);
            }
            result.add(dependencies);
        }


        return result;
    }


    private List<List<Dependency>> getDependencyRepresentation(BinarySolution solution,
                                                               Graph<GraphNode<String>, GraphEdge> graph) {
        List<List<Dependency>> result = new LinkedList<>();
        for (int i = 0; i < solution.getVariables().size(); i++) {
            List<Dependency> dependencies = new LinkedList<>();
            BinarySet variable = solution.getVariableValue(i);
            for (int j = 0; j < variable.getBinarySetLength(); j++) {
                Dependency dependency;
                int source = i + 2;
                int target = j + 1;
                if(!variable.get(j)) {
                    int missingIndirect;
                    if(variable.getBinarySetLength() == 1 || j == variable.getBinarySetLength() - 1) {
                        missingIndirect = 0;
                        dependency = new Dependency(source, target, variable.get(j), missingIndirect);
                    } else {
                        GraphNode<String> graphSource
                                = graph.vertexSet().stream().filter(graphNode -> graphNode.getNumOrder() == source)
                                    .findFirst().orElseThrow(RuntimeException::new);
                        GraphNode<String> graphTarget
                                = graph.vertexSet().stream().filter(graphNode -> graphNode.getNumOrder() == target)
                                .findFirst().orElseThrow(RuntimeException::new);
                        BreadthFirstIterator<GraphNode<String>, GraphEdge> iterator
                                = new BreadthFirstIterator<>(graph, graphSource);
                        boolean pathExists = false;
                        while (iterator.hasNext()) {
                            GraphNode<String> next = iterator.next();
                            if(next.equals(graphTarget)) {
                                pathExists = true;
                                break;
                            }
                        }
                        missingIndirect = pathExists ? 0 : 1;
                        dependency = new Dependency(source, target, variable.get(j), missingIndirect);
                    }
                } else {
                    dependency = new Dependency(source, target, variable.get(j));
                }

                dependencies.add(dependency);
            }
            result.add(dependencies);
        }

        return result;
    }


    private boolean isMissingIndirectDependency(int variableIndex, int dependencyIndex,
                                                List<List<Dependency>> dependencyRepresentation) {
        return dependencyRepresentation.get(variableIndex).get(dependencyIndex).isMissingIndirect();
    }

}

package com.dante.minimization;

import com.dante.coverage.CovUnit;
import com.dante.coverage.CoverageReport;
import com.dante.tedd.graph.GraphEdge;
import com.dante.tedd.graph.GraphNode;
import org.apache.log4j.Logger;
import org.jgrapht.Graph;
import org.jgrapht.graph.DirectedAcyclicGraph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MinimizeSuiteExample {

    private final static Logger logger = Logger.getLogger(MinimizeSuiteExample.class.getName());

    public static void main(String[] args) {

        Minimizer minimizer = new Minimizer();

        Graph<GraphNode<String>, GraphEdge> dependencyGraph = new DirectedAcyclicGraph<>(GraphEdge.class);
        dependencyGraph.addVertex(new GraphNode<>("t1",1));
        dependencyGraph.addVertex(new GraphNode<>("t2",2));
        dependencyGraph.addVertex(new GraphNode<>("t3",3));
        dependencyGraph.addVertex(new GraphNode<>("t4",4));
        dependencyGraph.addVertex(new GraphNode<>("t5",5));
        dependencyGraph.addVertex(new GraphNode<>("t6",6));
        dependencyGraph.addEdge(new GraphNode<>("t2",2),
                new GraphNode<>("t1", 1),
                new GraphEdge(new ArrayList<>(), new GraphNode<>("t2", 2),
                        new GraphNode<>("t1", 1)));
        dependencyGraph.addEdge(new GraphNode<>("t6",6),
                new GraphNode<>("t2", 2),
                new GraphEdge(new ArrayList<>(), new GraphNode<>("t6", 6),
                        new GraphNode<>("t2", 2)));

        Map<CovUnit, List<GraphNode<String>>> mapCovUnitCoveringTestCases = new HashMap<>();
        String scriptName = "asd"; // considering only one script
        mapCovUnitCoveringTestCases.put(new CovUnit(1, scriptName), Arrays.asList(new GraphNode<>("t1",1),
                new GraphNode<>("t3",3), new GraphNode<>("t4",4)));
        mapCovUnitCoveringTestCases.put(new CovUnit(2, scriptName), Arrays.asList(new GraphNode<>("t2",2),
                new GraphNode<>("t4",4)));
        mapCovUnitCoveringTestCases.put(new CovUnit(3, scriptName), Arrays.asList(new GraphNode<>("t1",1),
                new GraphNode<>("t2",2), new GraphNode<>("t5",5)));
        mapCovUnitCoveringTestCases.put(new CovUnit(4, scriptName), Arrays.asList(new GraphNode<>("t1",1),
                new GraphNode<>("t2",2), new GraphNode<>("t5",5)));
        mapCovUnitCoveringTestCases.put(new CovUnit(5, scriptName), Arrays.asList(new GraphNode<>("t3",3),
                new GraphNode<>("t4",4), new GraphNode<>("t5",5)));
        mapCovUnitCoveringTestCases.put(new CovUnit(6, scriptName), Arrays.asList(new GraphNode<>("t6",6)));

        Map<GraphNode<String>, Double> mapTestCaseExecutionTime = new HashMap<>();
        mapTestCaseExecutionTime.put(new GraphNode<>("t1", 1), 3.0);
        mapTestCaseExecutionTime.put(new GraphNode<>("t2", 2), 3.0);
        mapTestCaseExecutionTime.put(new GraphNode<>("t3", 3), 2.5);
        mapTestCaseExecutionTime.put(new GraphNode<>("t4", 4), 3.5);
        mapTestCaseExecutionTime.put(new GraphNode<>("t5", 5), 4.5);
        mapTestCaseExecutionTime.put(new GraphNode<>("t6", 6), 1.0);

        CoverageReport coverageReport = new CoverageReport(mapCovUnitCoveringTestCases, mapTestCaseExecutionTime);

        logger.info("======================================");
        logger.info("Finding solution to the minimization problem...");
        long start = System.currentTimeMillis();
        minimizer.minimizeTestSuite(coverageReport, dependencyGraph, false);
        logger.info("Time elapsed for minimization: " + ((System.currentTimeMillis() - start)/1000) + "s");
        logger.info("======================================");

        System.out.println();
        logger.info("======================================");
        logger.info("Finding all the solutions to the minimization problem...");
        start = System.currentTimeMillis();
        minimizer.minimizeTestSuite(coverageReport, dependencyGraph, true);
        logger.info("Time elapsed for minimization: " + ((System.currentTimeMillis() - start)/1000) + "s");
        logger.info("======================================");
    }
}

package com.dante.tedd.extraction.coverage_selection;

import com.dante.subjects.Config;
import com.dante.tedd.extraction.DependencyGraphExtractor;
import com.dante.tedd.graph.DependencyGraphManager;
import com.dante.tedd.graph.GraphEdge;
import com.dante.tedd.graph.GraphNode;
import com.dante.utils.Properties;
import org.apache.log4j.Logger;
import org.jgrapht.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CoverageDrivenGraphExtraction implements DependencyGraphExtractor {

    private final String mapOfNodesToAdd;

    private final static Logger logger = Logger.getLogger(CoverageDrivenGraphExtraction.class.getName());

    public CoverageDrivenGraphExtraction(Config config) {
        this.mapOfNodesToAdd = config.getDependencyGraphExtractionConfig()
                .getFixedMinimizedTestSuite();
        if(this.mapOfNodesToAdd.toCharArray().length != Properties.tests_order.length) {
            throw new IllegalArgumentException("The number of nodes in the fixed minimized test suite "
                    + this.mapOfNodesToAdd.toCharArray().length + " != number of tests in the test suite "
                    + Properties.tests_order.length);
        }
    }

    @Override
    public Graph<GraphNode<String>, GraphEdge> computeDependencies() {
        List<GraphNode<String>> nodes = this.buildNodes();
        DependencyGraphManager<String> dependencyGraphManager = new DependencyGraphManager<>();
        for (int i = 1; i < nodes.size(); i++) {
            this.addDependenciesTowards(nodes.subList(0, i), nodes.get(i), dependencyGraphManager);
        }
        return dependencyGraphManager.getDependencyGraph();
    }

    private List<GraphNode<String>> buildNodes() {
        List<GraphNode<String>> result = new LinkedList<>();
        char[] solutionBits = this.mapOfNodesToAdd.toCharArray();
        for (int i = 0; i < solutionBits.length; i++) {
            char solutionBit = solutionBits[i];
            if(solutionBit == '1') {
                result.add(new GraphNode<>(Properties.tests_order[i], i));
            }
        }
        return result;
    }

    private void addDependenciesTowards(List<GraphNode<String>> targetNodes,
                                        GraphNode<String> sourceNode,
                                        DependencyGraphManager<String> dependencyGraphManager){
        for (GraphNode<String> targetNode : targetNodes) {
            dependencyGraphManager.addDependency(sourceNode, targetNode,
                    new GraphEdge(new ArrayList<>(), sourceNode, targetNode));
        }
    }

}

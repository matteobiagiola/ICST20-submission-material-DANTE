package com.dante.tedd.extraction.moea;

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

public class MoeaDependencyGraphExtraction implements DependencyGraphExtractor {

    private final String mapOfDependenciesToAdd;

    private final static Logger logger = Logger.getLogger(MoeaDependencyGraphExtraction.class.getName());

    public MoeaDependencyGraphExtraction(Config config) {
        this.mapOfDependenciesToAdd = config.getDependencyGraphExtractionConfig().getParetoFrontSolution();
    }

    public MoeaDependencyGraphExtraction(String mapOfDependenciesToAdd) {
        if(mapOfDependenciesToAdd == null || mapOfDependenciesToAdd.isEmpty())
            throw new IllegalArgumentException("Map of dependencies cannot be null nor empty!");
        this.mapOfDependenciesToAdd = mapOfDependenciesToAdd;
    }

    public Graph<GraphNode<String>, GraphEdge> generateGraph(int nodeOrderOffset) {
        List<String> mapNodesDeps = Arrays.stream(this.mapOfDependenciesToAdd.split("-"))
                .collect(Collectors.toList());
        DependencyGraphManager<String> dependencyGraphManager = new DependencyGraphManager<>();
        List<GraphNode<String>> nodes = new LinkedList<>();
        for (int i = 0; i < mapNodesDeps.size() + 1; i++) {
            GraphNode<String> graphNode = new GraphNode<>("t" + (i + nodeOrderOffset), i + nodeOrderOffset);
            nodes.add(graphNode);
            dependencyGraphManager.addNode(graphNode);
        }
        for (int i = 1; i < nodes.size(); i++) {
            char[] bits = mapNodesDeps.get(i - 1).toCharArray();
            this.addDependenciesTowards(nodes.subList(0, i), bits, nodes.get(i), dependencyGraphManager);
        }
        return dependencyGraphManager.getDependencyGraph();
    }

    @Override
    public Graph<GraphNode<String>, GraphEdge> computeDependencies() {
        List<String> mapNodesDeps = Arrays.stream(this.mapOfDependenciesToAdd.split("-"))
                .collect(Collectors.toList());
        DependencyGraphManager<String> dependencyGraphManager = new DependencyGraphManager<>();
        int numberOfVariables = mapNodesDeps.size();
        if(numberOfVariables != Properties.tests_order.length - 1) {
            throw new IllegalStateException("Number of variables must be equal to num of tests (nodes) - 1: "
                    + (Properties.tests_order.length - 1) + ". Found: " + numberOfVariables);
        }
        List<GraphNode<String>> nodes = this.buildNodes();
        for (int i = 1; i < nodes.size(); i++) {
            char[] bits = mapNodesDeps.get(i - 1).toCharArray();
            this.addDependenciesTowards(nodes.subList(0, i), bits, nodes.get(i), dependencyGraphManager);
        }
        return dependencyGraphManager.getDependencyGraph();
    }

    private List<GraphNode<String>> buildNodes() {
        List<GraphNode<String>> result = new LinkedList<>();
        for (int i = 0; i < Properties.tests_order.length; i++) {
            result.add(new GraphNode<>(Properties.tests_order[i], i));
        }
        return result;
    }

    private void addDependenciesTowards(List<GraphNode<String>> targetNodes,
                                        char[] bits,
                                        GraphNode<String> sourceNode,
                                        DependencyGraphManager<String> dependencyGraphManager){
        for (int i = 0; i < targetNodes.size(); i++) {
            GraphNode<String> targetNode = targetNodes.get(i);
            if(bits[i] == '1') {
                dependencyGraphManager.addDependency(sourceNode, targetNode,
                        new GraphEdge(new ArrayList<>(), sourceNode, targetNode));
            }
        }
    }




}

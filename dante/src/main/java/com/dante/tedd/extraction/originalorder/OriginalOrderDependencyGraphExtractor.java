package com.dante.tedd.extraction.originalorder;

import com.dante.tedd.extraction.DependencyGraphExtractor;
import com.dante.tedd.graph.DependencyGraphManager;
import com.dante.tedd.graph.GraphEdge;
import com.dante.tedd.graph.GraphNode;
import com.dante.utils.ExecutionTime;
import com.dante.utils.Properties;
import org.apache.log4j.Logger;
import org.jgrapht.Graph;

import java.util.ArrayList;
import java.util.List;

public class OriginalOrderDependencyGraphExtractor implements DependencyGraphExtractor {

    private final static Logger logger = Logger.getLogger(OriginalOrderDependencyGraphExtractor.class.getName());

    @Override
    public Graph<GraphNode<String>, GraphEdge> computeDependencies() {
        long start = System.currentTimeMillis();
        DependencyGraphManager<String> dependencyGraphManager = new DependencyGraphManager<>();
        List<GraphNode<String>> nodes = new ArrayList<>();
        for (int i = 0; i < Properties.tests_order.length; i++) {
            nodes.add(new GraphNode<>(Properties.tests_order[i], i));
        }
        for (int i = 1; i < nodes.size(); i++) {
            this.addDependenciesTowards(nodes.subList(0, i), nodes.get(i), dependencyGraphManager);
        }
        long timeElapsed = System.currentTimeMillis() - start;
        logger.info("Time to compute the initial dependency graph: "
                + new ExecutionTime().computeExecutionTime(timeElapsed));
        return dependencyGraphManager.getDependencyGraph();
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

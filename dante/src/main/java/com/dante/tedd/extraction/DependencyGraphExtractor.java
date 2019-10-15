package com.dante.tedd.extraction;

import com.dante.tedd.graph.GraphEdge;
import com.dante.tedd.graph.GraphNode;
import org.jgrapht.Graph;

public interface DependencyGraphExtractor {

    Graph<GraphNode<String>, GraphEdge> computeDependencies();
}

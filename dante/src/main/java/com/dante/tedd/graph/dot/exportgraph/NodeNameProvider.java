package com.dante.tedd.graph.dot.exportgraph;

import com.dante.tedd.graph.GraphNode;
import com.dante.tedd.graph.dot.NodeId;
import org.jgrapht.io.ComponentNameProvider;

public class NodeNameProvider<T> implements ComponentNameProvider<GraphNode<T>> {

    @Override
    public String getName(GraphNode<T> graphNode) {
        return NodeId.getId(graphNode);
    }
}

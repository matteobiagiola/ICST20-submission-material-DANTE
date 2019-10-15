package com.dante.tedd.graph.dot.importgraph;

import com.dante.tedd.graph.GraphNode;
import com.dante.tedd.graph.dot.NodeId;
import org.jgrapht.io.Attribute;
import org.jgrapht.io.VertexProvider;

import java.util.Map;

public class NodeNameProvider implements VertexProvider<GraphNode<String>> {

    @Override
    public GraphNode<String> buildVertex(String nodeId, Map<String, Attribute> map) {
        String nodeName = NodeId.getNodeName(nodeId);
        int numOrder = NodeId.getNumOrder(nodeId);
        return new GraphNode<>(nodeName, numOrder);
    }
}

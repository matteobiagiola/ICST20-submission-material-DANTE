package com.dante.tedd.graph.dot;

import com.dante.tedd.graph.GraphNode;

public class NodeId {

    public static String getId(GraphNode<?> graphNode){
        return graphNode.getTestCase().toString() + "_" + graphNode.getNumOrder();
    }

    public static String getNodeName(String nodeId){
        String[] nodeIdSplit = nodeId.split("_");
        return nodeIdSplit[0];
    }

    public static int getNumOrder(String nodeId){
        String[] nodeIdSplit = nodeId.split("_");
        return Integer.valueOf(nodeIdSplit[1]);
    }
}

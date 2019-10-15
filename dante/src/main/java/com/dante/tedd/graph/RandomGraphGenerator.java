package com.dante.tedd.graph;

import com.dante.tedd.extraction.moea.MoeaDependencyGraphExtraction;
import com.dante.utils.Randomness;
import org.jgrapht.Graph;

public class RandomGraphGenerator {

    public static Graph<GraphNode<String>, GraphEdge> generateGraph(int numOfNodes) {

        int numberOfVariables = numOfNodes - 1;

        int[] bitsPerVariable = new int[numberOfVariables];
        for (int i = 0; i < numberOfVariables; i++) {
            bitsPerVariable[i] = i + 1;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < bitsPerVariable.length; i++) {
            int bitPerVariable = bitsPerVariable[i];
            for (int j = 0; j < bitPerVariable; j++) {
                if(Randomness.nextDouble() <= 0.5) {
                    stringBuilder.append("0");
                } else {
                    stringBuilder.append("1");
                }
            }
            if(i < bitsPerVariable.length - 1) {
                stringBuilder.append(" ");
            }
        }

        String mapOfDependenciesToAdd = stringBuilder.toString();
        MoeaDependencyGraphExtraction moeaDependencyGraphExtraction
                = new MoeaDependencyGraphExtraction(mapOfDependenciesToAdd);

        return moeaDependencyGraphExtraction.generateGraph(0);
    }
}

package com.dante.tedd.graph.dot.importgraph;

import com.dante.tedd.graph.GraphEdge;
import com.dante.tedd.graph.GraphNode;
import com.dante.tedd.graph.dot.EdgeLabel;
import org.jgrapht.Graph;
import org.jgrapht.graph.DirectedAcyclicGraph;
import org.jgrapht.io.DOTImporter;
import org.jgrapht.io.ImportException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class GraphImporter {

    public Graph<GraphNode<String>, GraphEdge> importGraph(String dependencyGraphPath){
        Graph<GraphNode<String>, GraphEdge> graph = new DirectedAcyclicGraph<>(GraphEdge.class);
        NodeNameProvider nodeNameProvider = new NodeNameProvider();
        EdgeLabelProvider<String> edgeLabelProvider = new EdgeLabelProvider<>();

        DOTImporter<GraphNode<String>, GraphEdge> importer = new DOTImporter<>(nodeNameProvider, edgeLabelProvider);
        try {
            File newGroundTruthFile = this.cleanGraphFile(new File(dependencyGraphPath));
            importer.importGraph(graph, newGroundTruthFile);
            if(!newGroundTruthFile.delete()) {
                throw new IllegalStateException("Delete of file " + newGroundTruthFile.getAbsolutePath() + " failed");
            }
            return graph;
        } catch (ImportException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @implNote if graph file contains \n separator for edge labels the importer is not able to interpret the label
     * @return the file in which the cleaned graph is written
     * */
    private File cleanGraphFile(File groundTruthGraphFile){
        try (BufferedReader br = new BufferedReader(new FileReader(groundTruthGraphFile))) {
            String line;
            List<String> lines = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                lines.add(line.replace(" \\n ", EdgeLabel.import_separator));
            }
            String newGroundTruthFileName = groundTruthGraphFile.getAbsolutePath()
                    .substring(0, groundTruthGraphFile.getAbsolutePath().lastIndexOf("/")) + "/new-ground-truth-file.txt";
            File newGroundTruthFile = new File(newGroundTruthFileName);
            try(PrintWriter pw = new PrintWriter(newGroundTruthFile)){
                lines.forEach(newLine -> pw.write(newLine + "\n"));
            }
            return newGroundTruthFile;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

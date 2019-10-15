package com.dante.tedd.graph;

import com.dante.tedd.extraction.string.StringConstantValue;
import com.dante.tedd.extraction.string.StringValue;
import com.dante.tedd.statement.LiteralParameter;
import org.apache.log4j.Logger;
import org.jgrapht.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class GraphUtils {

    public static String missingDepPrefix = "missing_added_";

    private final static Logger logger = Logger.getLogger(GraphUtils.class.getName());

    public static Set<GraphNode<String>> mapTestsOrderToNodesOrder(List<String> testsOrder){
        Set<GraphNode<String>> nodesOrder = new LinkedHashSet<>();
        for (int i = 0; i < testsOrder.size(); i++) {
            nodesOrder.add(new GraphNode<>(testsOrder.get(i), i));
        }
        return nodesOrder;
    }


    /**
     * @implNote modifies @param graph
     * @return graphEdgeInverted
     * */
    public static GraphEdge invertEdge(Graph<GraphNode<String>, GraphEdge> graph, GraphEdge edgeToInvert){
        GraphNode<String> graphNodeSource = graph.getEdgeSource(edgeToInvert);
        GraphNode<String> graphNodeTarget = graph.getEdgeTarget(edgeToInvert);
        GraphEdge graphEdgeInverted = new GraphEdge(new ArrayList<>(edgeToInvert.getDependentValues()), graphNodeTarget, graphNodeSource);
        if(!graph.removeEdge(edgeToInvert)){
            throw new IllegalArgumentException("Edge " + edgeToInvert + " is not in the graph.");
        }
        if(!graph.addEdge(graphNodeTarget, graphNodeSource, graphEdgeInverted)){
            throw new IllegalArgumentException("Edge " + edgeToInvert + " is still in the graph.");
        }
        return graphEdgeInverted;
    }

    /**
     * @implNote modifies graph by automatically adding an edge.
     * @param graph dependency graph
     * @param graphSourceNode of a missing dependency
     * @param graphTargetNode of a missing dependency
     * @param isManifest if true the method adds the dependency as manifest
     * @return graphEdge added if @param graph does not contain the edge, empty otherwise
     * */
    @SuppressWarnings("unchecked")
    public static Optional<GraphEdge> addEdgeToGraphAutomatically(Graph<GraphNode<String>, GraphEdge> graph,
                                                                  GraphNode<String> graphSourceNode,
                                                                  GraphNode<String> graphTargetNode,
                                                                  boolean isManifest){
        StringValue stringValue = new StringConstantValue(new LiteralParameter(missingDepPrefix + "automatically"));
        GraphEdge graphEdge = new GraphEdge(Arrays.asList(stringValue), graphSourceNode, graphTargetNode);
        if(!graph.addEdge(graphSourceNode, graphTargetNode, graphEdge)){
            logger.warn("Graph already contains " + graphEdge);
            return Optional.empty();
        }
        if(isManifest)
            graphEdge.setManifest(true);
        return Optional.of(graphEdge);
    }

    public static Graph<GraphNode<String>, GraphEdge> extractSubgraph(Graph<GraphNode<String>, GraphEdge> graph,
                                                                       Set<GraphNode<String>> nodesOrder, int numberOfNodes) {
        Set<GraphNode<String>> nodesSubset = nodesOrder.stream()
                .filter(node -> node.getNumOrder() <= numberOfNodes)
                .collect(Collectors.toSet());

        DependencyGraphManager<String> dependencyGraphManager
                = getSubgraph(graph, nodesSubset, null);

        return dependencyGraphManager.getDependencyGraph();
    }

    private static DependencyGraphManager<String> getSubgraph(Graph<GraphNode<String>, GraphEdge> graph,
                                                              Set<GraphNode<String>> vertexFilter,
                                                              Set<GraphEdge> edgeFilter) {
        Set<GraphNode<String>> vertexSet = new LinkedHashSet<>();
        Set<GraphEdge> edgeSet = new LinkedHashSet<>();

        DependencyGraphManager<String> dependencyGraphManager = new DependencyGraphManager<>();

        if (vertexFilter == null && edgeFilter == null) {
            vertexSet.addAll(graph.vertexSet());
            edgeSet.addAll(graph.edgeSet());

            vertexSet.forEach(dependencyGraphManager::addNode);

            for (GraphEdge graphEdge : edgeSet) {
                dependencyGraphManager.addDependency(graph.getEdgeSource(graphEdge),
                        graph.getEdgeTarget(graphEdge), graphEdge.clone());
            }

            return dependencyGraphManager;
        }

        // add vertices
        if (vertexFilter == null) {
            vertexSet.addAll(graph.vertexSet());
        } else {
            if (vertexFilter.size() > graph.vertexSet().size()) {
                graph.vertexSet().stream().filter(vertexFilter::contains).forEach(vertexSet::add);
            } else {
                vertexFilter.stream().filter(v -> v != null && graph.containsVertex(v)).forEach(
                        vertexSet::add);
            }
        }

        // add edges
        if (edgeFilter == null) {
            graph
                    .edgeSet().stream()
                    .filter(
                            e -> vertexSet.contains(graph.getEdgeSource(e))
                                    && vertexSet.contains(graph.getEdgeTarget(e)))
                    .forEach(edgeSet::add);
        } else {
            if (edgeFilter.size() > graph.edgeSet().size()) {
                graph
                        .edgeSet().stream()
                        .filter(
                                e -> edgeFilter.contains(e) && vertexSet.contains(graph.getEdgeSource(e))
                                        && vertexSet.contains(graph.getEdgeTarget(e)))
                        .forEach(edgeSet::add);
            } else {
                edgeFilter
                        .stream()
                        .filter(
                                e -> e != null && graph.containsEdge(e)
                                        && vertexSet.contains(graph.getEdgeSource(e))
                                        && vertexSet.contains(graph.getEdgeTarget(e)))
                        .forEach(edgeSet::add);
            }
        }

        vertexSet.forEach(dependencyGraphManager::addNode);

        for (GraphEdge graphEdge : edgeSet) {
            dependencyGraphManager.addDependency(graph.getEdgeSource(graphEdge),
                    graph.getEdgeTarget(graphEdge), graphEdge.clone());
        }

        return dependencyGraphManager;
    }

}

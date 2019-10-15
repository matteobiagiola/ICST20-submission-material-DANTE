package com.dante.suitegenerator.atusa.extraction;

import com.dante.suitegenerator.atusa.json.model.Edge;
import com.dante.suitegenerator.atusa.json.model.State;
import org.jgrapht.event.ConnectedComponentTraversalEvent;
import org.jgrapht.event.EdgeTraversalEvent;
import org.jgrapht.event.TraversalListenerAdapter;
import org.jgrapht.event.VertexTraversalEvent;
import org.jgrapht.graph.DirectedPseudograph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PathListener extends TraversalListenerAdapter<State, Edge> {

    private DirectedPseudograph<State,Edge> graph;
    public ArrayList<CrawlWalk> paths = new ArrayList<>();
    private Deque<State> visited = new ArrayDeque<>();
    private Deque<CrawlWalk> queues = new ArrayDeque<>();
    private Map<String, State> vertexMap = new LinkedHashMap<>();
    private State startVertex;

    public CrawlWalk currentWalk;

    public PathListener(DirectedPseudograph<State,Edge> graph, State startVertex){
        this.graph = graph;
        this.startVertex = startVertex;
    }

    public void connectedComponentFinished(ConnectedComponentTraversalEvent connectedComponentTraversalEvent) {
//        System.out.println("connectedComponentFinished: " + connectedComponentTraversalEvent);
        this.paths.addAll(this.queues);
    }

    public void connectedComponentStarted(ConnectedComponentTraversalEvent connectedComponentTraversalEvent) {
//        System.out.println("connectedComponentStarted: " + connectedComponentTraversalEvent);
        for(State state: this.graph.vertexSet()){
            this.vertexMap.put(state.getName(), state);
        }
    }

    public void edgeTraversed(EdgeTraversalEvent<Edge> edge) {
        System.out.println("--- edgeTraversed: " + edge.getEdge().getFrom() + " -> " + edge.getEdge().getTo());
//        System.out.println("edge traversed: (" + edge.getText() + "-" + edge.getFrom() + "-" + edge.getTo() + ")");

        String from = edge.getEdge().getFrom();
        String to = edge.getEdge().getTo();

        State vertexTo = this.vertexMap.get(to);

        if(this.startVertex.getName().equals(from)) {
            CrawlWalk crawlWalk = new CrawlWalk();
            crawlWalk.getVertices().add(this.vertexMap.get(from));
            crawlWalk.getVertices().add(this.vertexMap.get(to));
            crawlWalk.getEdges().add(edge.getEdge());
            System.out.println("Path to expand: " + crawlWalk.getEdges().stream().map(edge1 -> edge1.getFrom() + "->"
                    + edge1.getTo()).collect(Collectors.joining(":")));
            this.queues.add(crawlWalk);
        } else {
            ArrayList<State> vertices = (ArrayList<State>) this.currentWalk.getVertices().clone();
            ArrayList<Edge> edges = (ArrayList<Edge>) this.currentWalk.getEdges().clone();
            vertices.add(vertexTo);
            edges.add(edge.getEdge());
            CrawlWalk crawlWalk = new CrawlWalk(vertices, edges);
            //store the path that it is not going to be expanded anymore
            if(vertexTo.equals(this.startVertex) || this.visited.contains(vertexTo)){
                System.out.println("Path added: " + edges.stream().map(edge1 -> edge1.getFrom() + "->"
                        + edge1.getTo()).collect(Collectors.joining(":")));
                this.paths.add(crawlWalk);
            }else{
                System.out.println("Path to expand: " + edges.stream().map(edge1 -> edge1.getFrom() + "->"
                        + edge1.getTo()).collect(Collectors.joining(":")));
                this.queues.add(crawlWalk);
            }
        }

        if(!this.visited.contains(vertexTo)){
            this.visited.add(vertexTo);
        }

    }

    public void vertexTraversed(VertexTraversalEvent<State> state) {
        System.out.println("vertexTraversed: " + state.getVertex().getName());
        if(!this.queues.isEmpty()){
            this.currentWalk = this.queues.remove();
            System.out.println("Current path to expand: " + currentWalk.getEdges().stream()
                    .map(edge1 -> edge1.getFrom() + "->"
                        + edge1.getTo()).collect(Collectors.joining(":")));
        }
    }

    public void vertexFinished(VertexTraversalEvent<State> state) {
        System.out.println("vertexFinished: " + state.getVertex().getName());
    }
}

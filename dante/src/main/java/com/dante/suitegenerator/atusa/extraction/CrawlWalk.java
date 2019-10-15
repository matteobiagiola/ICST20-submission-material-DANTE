package com.dante.suitegenerator.atusa.extraction;

import com.dante.suitegenerator.atusa.json.model.Edge;
import com.dante.suitegenerator.atusa.json.model.State;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;

import java.util.ArrayList;
import java.util.List;

public class CrawlWalk implements GraphPath<State, Edge> {

    public Graph<State,Edge> graph;
    public ArrayList<State> vertices = new ArrayList<>();
    public ArrayList<Edge> edges = new ArrayList<>();
    public ArrayList<Integer> edgesInCode = new ArrayList<>();

    public CrawlWalk(){

    }

    public CrawlWalk(ArrayList<State> vertices, ArrayList<Edge> edges){
        this.vertices = vertices;
        this.edges = edges;
    }

    public CrawlWalk(Graph<State,Edge> graph, ArrayList<State> vertices, ArrayList<Edge> edges){
        this.graph = graph;
        this.vertices = vertices;
        this.edges = edges;
    }

    public State getEndVertex() {
        return null;
    }

    @Override
    public List<Edge> getEdgeList() {
        throw new UnsupportedOperationException("getEdgeList not implemented");
    }

    public Graph<State, Edge> getGraph() {
        return this.graph;
    }

    public State getStartVertex() {
        return null;
    }

    public double getWeight() {
        return 0;
    }

    public ArrayList<Edge> getEdges(){
        return this.edges;
    }

    public ArrayList<State> getVertices(){
        return this.vertices;
    }

    public ArrayList<Integer> getEdgesInCode() {
        return edgesInCode;
    }

    public void setEdgesInCode(ArrayList<Integer> edgesInCode) {
        this.edgesInCode = edgesInCode;
    }

}

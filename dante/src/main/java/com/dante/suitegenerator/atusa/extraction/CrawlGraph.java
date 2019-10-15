package com.dante.suitegenerator.atusa.extraction;

import com.dante.suitegenerator.atusa.json.model.CrawlResults;
import com.dante.suitegenerator.atusa.json.model.Edge;
import com.dante.suitegenerator.atusa.json.model.State;
import com.dante.utils.Properties;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.shortestpath.YenKShortestPath;
import org.jgrapht.graph.DirectedPseudograph;
import org.jgrapht.graph.GraphWalk;
import org.jgrapht.traverse.BreadthFirstIterator;
import org.jgrapht.traverse.GraphIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class CrawlGraph {
    public CrawlResults crawlResults;
    public State startVertex;
    public CrawlGraph(){

    }

    public CrawlGraph(CrawlResults crawlResults){
        this.crawlResults = crawlResults;
    }

    public DirectedPseudograph<State, Edge> buildGraph(){
        DirectedPseudograph<State,Edge> graph = new DirectedPseudograph<>(Edge.class);
        //add nodes to graph
        Set<String> keys = this.crawlResults.getStates().keySet();
        for(String key: keys){
            State state = this.crawlResults.getStates().get(key);
            if(state.getName().equals("index")){
                this.startVertex = state;
            }
            graph.addVertex(state);
        }
        //add edges to graph
        List<Edge> edges = this.crawlResults.getEdges();
        for(Edge edge: edges){
            State from = null;
            State to = null;
            for(State state: graph.vertexSet()){
                if(state.getName().equals(edge.getFrom())) from = state;
                if(state.getName().equals(edge.getTo())) to = state;
                if(from != null && to != null) break;
            }
            graph.addEdge(from, to, edge);
        }
        return graph;
    }

    public List<GraphPath<State,Edge>> generatePaths(DirectedPseudograph<State,Edge> graph){
        // collect all sinks in the graph
		Set<State> sinks = new LinkedHashSet<State>();
		State index = null;
		for(State state: graph.vertexSet()){
			Set<Edge> edges = graph.outgoingEdgesOf(state);
			if(state.getName().equals("index")) index = state;
			if(edges.size() == 0) sinks.add(state);
		}
        if(index == null) throw new IllegalStateException("generatePaths: there must be an index vertex in the crawled graph");
        List<GraphPath<State,Edge>> graphPaths = new LinkedList<>();
		if(sinks.size() > 0) {
            System.out.println("Sinks size: " + sinks.size());
            YenKShortestPath<State,Edge> yenKShortestPath = new YenKShortestPath<>(graph);
            int k = Properties.K_SHORTEST_PATH;
            Set<GraphPath<State,Edge>> graphPathSet = new HashSet<>();
//            int max = -1;
//            for (int i = 0; i < 1000; i++) {
//                for (State sink : sinks) {
//                    graphPathSet.addAll(yenKShortestPath.getPaths(index, sink, i));
//                }
//                int numPaths = graphPathSet.size();
//                if(numPaths > max) {
//                    max = numPaths;
//                    System.out.println("Max paths: " + max + ", k = " + i);
//                    k = i;
//                    if(max >= 200 || this.isTransitionCoverageReached(graphPaths, graph.edgeSet())) {
//                        break;
//                    }
//                }
//            }
//            graphPaths.clear();
            for (State sink : sinks) {
                graphPathSet.addAll(yenKShortestPath.getPaths(index, sink, k));
            }
            graphPaths.addAll(graphPathSet);
//            Properties.K_SHORTEST_PATH = k;
            System.out.println("KShortestPaths extracted paths size: " + graphPaths.size() + " with k = "
                    + Properties.K_SHORTEST_PATH);
            this.computePotentialTransitionCoverage(graphPaths, graph.edgeSet());
        } else {
            System.out.println("The graph has no sinks: resort to breadth first search for transition coverage");
            GraphIterator<State,Edge> iterator = new BreadthFirstIterator<>(graph, this.startVertex);
            /*
             * The algorithm (Listener) has a bug that manifests when the
             * index node has multiple outgoing edges towards another node.
             * FIXME
             * */
            PathListener crawlPathListener = new PathListener(graph, this.startVertex);
            iterator.addTraversalListener(crawlPathListener);
            while(iterator.hasNext()){
                iterator.next();
            }
            System.out.println("Breadth first extracted paths size: " + crawlPathListener.paths.size());
            graphPaths = crawlPathListener.paths.stream().map(crawlWalk -> {
                GraphPath<State,Edge> graphPath = new GraphWalk<>(graph, crawlWalk.getVertices().get(0),
                        crawlWalk.getVertices().get(crawlWalk.getVertices().size() - 1), crawlWalk.getEdges(),0);
                return graphPath;
            }).collect(Collectors.toList());
        }

        return graphPaths;
    }

    private boolean isTransitionCoverageReached(List<GraphPath<State,Edge>> graphPaths,
                                                Set<Edge> edges) {
        for (Edge edge : edges) {
            Optional<GraphPath<State,Edge>> optionalGraphPath = graphPaths.stream()
                    .filter(graphPath -> graphPath.getEdgeList().contains(edge)).findAny();
            if(!optionalGraphPath.isPresent()) {
                return false;
            }
        }
        return true;
    }

    private void computePotentialTransitionCoverage(List<GraphPath<State,Edge>> graphPaths,
                                                    Set<Edge> edges) {
        double result = 0.0;
        for (Edge edge : edges) {
            Optional<GraphPath<State,Edge>> optionalGraphPath = graphPaths.stream()
                    .filter(graphPath -> graphPath.getEdgeList().contains(edge)).findAny();
            if(optionalGraphPath.isPresent()) {
                result += 1.0;
            }
        }
        System.out.println("Potential transition coverage reached by those paths: " + (100 * result / edges.size()));
    }

    public ClickableLocator parseEdgeId(Edge edge){
        String[] locatorInfo = new String[2];
        String id = edge.getId();
        if(!id.contains("xpath")){
            throw new UnsupportedOperationException("Id " + id + " does not contain xpath.");
        }
        String[] splitted = id.split("xpath");
        locatorInfo[0] = "xpath";
        for(int i = 1; i < splitted.length; i++){
            locatorInfo[i] = splitted[i];
        }
        ClickableLocator clickableLocator = new ClickableLocator();
        clickableLocator.setType(locatorInfo[0]);
        clickableLocator.setId(locatorInfo[1]);
        String inputValues = edge.getInputValues();
        List<InputFieldLocator> inputFieldLocators = new ArrayList<InputFieldLocator>();
        if(!inputValues.equals("none")){
//            System.out.print("parseEdgeId: input values -> " + inputValues);
            String[] inputValuesInForm = inputValues.split(":");
            for (int i = 0; i < inputValuesInForm.length; i++) {
                InputFieldLocator inputFieldLocator = new InputFieldLocator();
                String[] inputValuesFields = inputValuesInForm[i].split("##");
                inputFieldLocator.setType(inputValuesFields[0]);
                inputFieldLocator.setId(inputValuesFields[1]);
                List<String> inputValuesList = Arrays.asList(inputValuesFields[2].split(","));
                inputFieldLocator.setValues(inputValuesList);
                inputFieldLocator.setValue(inputValuesList.get(0).trim());
                inputFieldLocators.add(inputFieldLocator);
            }
        }
        clickableLocator.setInputFieldLocators(inputFieldLocators);
        return clickableLocator;
    }

    /**
     * return only form submission details
     * */
    public String parseEdgeElement(Edge edge){
        String valueField = null;
        List<String> info = new ArrayList<String>();
        String element = edge.getElement();
        int indexFirstCurl = element.indexOf("{");
        int lastIndexCurl = element.lastIndexOf("}");
        String content = element.substring(indexFirstCurl + 1, lastIndexCurl - 1);
        String splitted[] = content.split(",");
        for(int i = 0; i < splitted.length; i++){
            //remove white spaces
            String replaced = splitted[i].replaceAll("\\s+", "");
            info.add(replaced);
            //System.out.println(replaced);
        }
        if(info.contains("tag=INPUT") && info.contains("type=submit")){
            for(String string: info){
                if(string.contains("value=")){
                    String[] keyValuePair = string.split("=");
                    //the second value is the value
                    valueField = keyValuePair[1];
                }
            }
            return valueField;
        }
        return valueField;
    }
}

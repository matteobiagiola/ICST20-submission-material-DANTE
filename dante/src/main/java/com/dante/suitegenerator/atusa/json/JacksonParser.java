package com.dante.suitegenerator.atusa.json;

import com.dante.suitegenerator.atusa.json.model.CrawlResults;
import com.dante.suitegenerator.atusa.json.model.Edge;
import com.dante.suitegenerator.atusa.json.model.State;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jgrapht.graph.DirectedPseudograph;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class JacksonParser {
	
	public CrawlResults parse(String absoluteFileNamePath){
		
		try {
			//create ObjectMapper instance
			ObjectMapper objectMapper = new ObjectMapper();
			//convert json string to object
			return objectMapper.readValue(new File(absoluteFileNamePath), CrawlResults.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public DirectedPseudograph<String,String> buildGraph(CrawlResults crawlResults){
		DirectedPseudograph<String,String> graph = new DirectedPseudograph<>(String.class);
		//add nodes to graph
		Set<String> keys = crawlResults.getStates().keySet();
		for(String key: keys){
			State state = crawlResults.getStates().get(key);
			graph.addVertex(state.getName());
		}
		//add edges to graph
		List<Edge> edges = crawlResults.getEdges();
		int i = 0;
		for(Edge edge: edges){
			String from = edge.getFrom();
			String to = edge.getTo();
			String name = edge.getElement() + "-" + i;
			graph.addEdge(from, to, name);
			i++;
		}
		return graph;
	}
}

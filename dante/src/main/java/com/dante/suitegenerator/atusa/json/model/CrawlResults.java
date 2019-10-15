package com.dante.suitegenerator.atusa.json.model;

import java.util.List;
import java.util.Map;

public class CrawlResults {
	
	public Map<String, State> states;
	public List<Edge> edges;
	public Statistics statistics;
	public String exitStatus;
	
	public Map<String, State> getStates() {
		return states;
	}
	public void setStates(Map<String, State> states) {
		this.states = states;
	}
	public List<Edge> getEdges() {
		return edges;
	}
	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}
	public Statistics getStatistics() {
		return statistics;
	}
	public void setStatistics(Statistics statistics) {
		this.statistics = statistics;
	}
	public String getExitStatus() {
		return exitStatus;
	}
	public void setExitStatus(String exitStatus) {
		this.exitStatus = exitStatus;
	}
}

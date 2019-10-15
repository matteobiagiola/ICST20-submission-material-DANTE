package com.dante.suitegenerator.atusa.json.model;

import java.util.List;
import java.util.Map;

public class StateStats {
	
	public Fan leastFanOut;
	public Fan leastFanIn;
	public Fan mostFanOut;
	public Fan mostFanIn;
	public int totalNumberOfStates;
	public Map<String, List<String>> urls;
	
	public Fan getLeastFanOut() {
		return leastFanOut;
	}
	public void setLeastFanOut(Fan leastFanOut) {
		this.leastFanOut = leastFanOut;
	}
	public Fan getLeastFanIn() {
		return leastFanIn;
	}
	public void setLeastFanIn(Fan leastFanIn) {
		this.leastFanIn = leastFanIn;
	}
	public Fan getMostFanOut() {
		return mostFanOut;
	}
	public void setMostFanOut(Fan mostFanOut) {
		this.mostFanOut = mostFanOut;
	}
	public Fan getMostFanIn() {
		return mostFanIn;
	}
	public void setMostFanIn(Fan mostFanIn) {
		this.mostFanIn = mostFanIn;
	}
	public int getTotalNumberOfStates() {
		return totalNumberOfStates;
	}
	public void setTotalNumberOfStates(int totalNumberOfStates) {
		this.totalNumberOfStates = totalNumberOfStates;
	}
	public Map<String, List<String>> getUrls() {
		return urls;
	}
	public void setUrls(Map<String, List<String>> urls) {
		this.urls = urls;
	}
}

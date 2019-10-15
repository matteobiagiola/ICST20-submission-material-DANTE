package com.dante.suitegenerator.atusa.json.model;

public class Statistics {
	
    public String duration;
    public int crawlPaths;
    public String averageDomSize;
    public int edges;
    public String startDate;
    public StateStats stateStats;
    public int failedEvents;
    
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getCrawlPaths() {
		return crawlPaths;
	}
	public void setCrawlPaths(int crawlPaths) {
		this.crawlPaths = crawlPaths;
	}
	public String getAverageDomSize() {
		return averageDomSize;
	}
	public void setAverageDomSize(String averageDomSize) {
		this.averageDomSize = averageDomSize;
	}
	public int getEdges() {
		return edges;
	}
	public void setEdges(int edges) {
		this.edges = edges;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public StateStats getStateStats() {
		return stateStats;
	}
	public void setStateStats(StateStats stateStats) {
		this.stateStats = stateStats;
	}
	public int getFailedEvents() {
		return failedEvents;
	}
	public void setFailedEvents(int failedEvents) {
		this.failedEvents = failedEvents;
	}
}

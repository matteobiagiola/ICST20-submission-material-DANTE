package com.dante.suitegenerator.atusa.json.model;

import java.util.List;

public class State {

//	"state93" : {
//		"name" : "state93",
//				"url" : "http://localhost:3000/wallets",
//				"candidateElements" : [ {
//			"top" : 1501,
//					"left" : 46,
//					"xpath" : "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[34]/BUTTON[1]",
//					"width" : 718,
//					"height" : 30
//		}, {
//			"top" : 1501,
//					"left" : 46,
//					"xpath" : "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[34]/BUTTON[1]",
//					"width" : 718,
//					"height" : 30
//		} ],
//		"fanIn" : 1,
//				"fanOut" : 1,
//				"id" : 93,
//				"failedEvents" : [ ],
//		"hasNearDuplicate" : false,
//				"distToNearestState" : -1.0,
//				"cluster" : -1,
//				"timeAdded" : 1557419058749,
//				"nearestState" : "state85"
//	},
	
	public String name;
	public String url;
	public List<CandidateElement> candidateElements;
	public int fanIn;
	public int fanOut;
	public int id;
	public List<String> failedEvents;
	public boolean hasNearDuplicate;
	public int distToNearestState;
	public int cluster;
	public long timeAdded;
	public String nearestState;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<CandidateElement> getCandidateElements() {
		return candidateElements;
	}
	public void setCandidateElements(List<CandidateElement> candidateElements) {
		this.candidateElements = candidateElements;
	}
	public int getFanIn() {
		return fanIn;
	}
	public void setFanIn(int fanIn) {
		this.fanIn = fanIn;
	}
	public int getFanOut() {
		return fanOut;
	}
	public void setFanOut(int fanOut) {
		this.fanOut = fanOut;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getFailedEvents() {
		return failedEvents;
	}
	public void setFailedEvents(List<String> failedEvents) {
		this.failedEvents = failedEvents;
	}

	public boolean isHasNearDuplicate() {
		return hasNearDuplicate;
	}

	public void setHasNearDuplicate(boolean hasNearDuplicate) {
		this.hasNearDuplicate = hasNearDuplicate;
	}

	public int getDistToNearestState() {
		return distToNearestState;
	}

	public void setDistToNearestState(int distToNearestState) {
		this.distToNearestState = distToNearestState;
	}

	public int getCluster() {
		return cluster;
	}

	public void setCluster(int cluster) {
		this.cluster = cluster;
	}

	public long getTimeAdded() {
		return timeAdded;
	}

	public void setTimeAdded(long timeAdded) {
		this.timeAdded = timeAdded;
	}

	public String getNearestState() {
		return nearestState;
	}

	public void setNearestState(String nearestState) {
		this.nearestState = nearestState;
	}

	@Override
	public String toString(){
		return this.getName();
	}
}

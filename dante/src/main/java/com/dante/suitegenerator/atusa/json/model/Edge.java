package com.dante.suitegenerator.atusa.json.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Edge {
	
	public String from;
    public String to;
    public String text;
    public String id;
    public String element;
    public String eventType;
	public String inputValues;
//	public String transitionName;
    
    public String getFrom() {
  		return from;
  	}
  	public void setFrom(String from) {
  		this.from = from;
  	}
  	public String getTo() {
  		return to;
  	}
  	public void setTo(String to) {
  		this.to = to;
  	}
  	public String getText() {
  		return text;
  	}
  	public void setText(String text) {
  		this.text = text;
  	}
  	public String getId() {
  		return id;
  	}
  	public void setId(String id) {
  		this.id = id;
  	}
  	public String getElement() {
  		return element;
  	}
  	public void setElement(String element) {
  		this.element = element;
  	}
  	public String getEventType() {
  		return eventType;
  	}
  	public void setEventType(String eventType) {
  		this.eventType = eventType;
  	}
	public String getInputValues() { return inputValues; }
	public void setInputValues(String inputValues) { this.inputValues = inputValues; }
//	public String getTransitionName() { return transitionName; }
//	public void setTransitionName(String transitionName) { this.transitionName = transitionName; }

	@Override
	public String toString(){
    	StringBuilder stringBuilder = new StringBuilder();
    	//stringBuilder.append("From: " + this.getFrom() + " To: " + this.getTo() + " Text: " + this.text + " Id: " + this.id + " Element: " + this.element + " EventType: " + this.eventType + " Input values: " + inputValues);
		stringBuilder.append("From: " + this.getFrom() + " To: " + this.getTo() + " Text: " + this.text + " Id: " + this.id + " Element: " + this.element + " EventType: " + this.eventType + " Input values: " + inputValues);
		return stringBuilder.toString();
	}

//	@Override
//	public boolean equals(Object obj) {
//		// checking if both the object references are
//		// referring to the same object.
//		if(this == obj)
//			return true;
//
//		// it checks if the argument is of the
//		// type Edge by comparing the classes
//		// of the passed argument and this object.
//		// if(!(obj instanceof Edge)) return false; ---> avoid.
//		if(obj == null || obj.getClass()!= this.getClass())
//			return false;
//
//		// type casting of the argument.
//		Edge edge = (Edge) obj;
//
//		// comparing the state of argument with
//		// the state of 'this' Object.
//		return (edge.getFrom().equals(this.from) && edge.getTo().equals(this.to));
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(this.to, this.from);
//	}
}

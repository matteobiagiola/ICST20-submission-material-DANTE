package com.crawljax.plugins.crawloverview.model;

import javax.annotation.concurrent.Immutable;

import com.crawljax.core.CrawljaxException;
import com.crawljax.core.state.Element;
import com.crawljax.core.state.Eventable;
import com.crawljax.forms.InputValue;
import com.crawljax.plugins.crawloverview.CrawlOverviewException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.crawljax.forms.FormInput;
import com.google.common.base.Objects;

import java.util.stream.Collectors;

/**
 * An {@link Edge} between two {@link State}s.
 */
@Immutable
public class Edge {

	private final String from;
	private final String to;
	private final int hash;
	private final String text;
	private final String id;
	private final String element;
	private final String eventType;
	private final String inputValues;

	public Edge(Eventable eventable) {
		try {
			this.from = eventable.getSourceStateVertex().getName();
			this.to = eventable.getTargetStateVertex().getName();
		} catch (CrawljaxException e) {
			throw new CrawlOverviewException("Could not get state vertex", e);
		}
		this.text = eventable.getElement().getText();
		this.hash = buildHash();
		this.id = eventable.getIdentification().toString();
		Element el = eventable.getElement();
		if (el == null) {
			element = "unkown";
		} else {
			element = eventable.getElement().toString();
		}
		eventType = eventable.getEventType().toString();
		//build input values string
		if(eventable.getRelatedFormInputs().size() > 0){
			StringBuilder inputBuilder = new StringBuilder();
			for (int i = 0; i < eventable.getRelatedFormInputs().size(); i++) {
				FormInput formInput = eventable.getRelatedFormInputs().get(i);
				String formInputValues = formInput.getInputValues().stream().map(InputValue::getValue)
						.collect(Collectors.joining(","));
				String howInputValues = formInput.getIdentification().getHow().name();
				String idInputValues = formInput.getIdentification().getValue();
				if(i != eventable.getRelatedFormInputs().size() - 1) {
					inputBuilder.append(howInputValues).append("##").append(idInputValues).append("##")
							.append(formInputValues).append(":");
				}
				else {
					inputBuilder.append(howInputValues).append("##").append(idInputValues).append("##")
							.append(formInputValues);
				}
			}
			this.inputValues = inputBuilder.toString();
		}else{
			this.inputValues = "none";
		}
	}



	@JsonCreator
	public Edge(@JsonProperty("from") String from, @JsonProperty("to") String to,
	        @JsonProperty("hash") int hash, @JsonProperty("text") String text,
	        @JsonProperty("id") String id, @JsonProperty("element") String element,
	        @JsonProperty("eventType") String eventType,
			@JsonProperty("inputValues") String inputValues) {
		this.from = from;
		this.to = to;
		this.hash = hash;
		this.text = text;
		this.id = id;
		this.element = element;
		this.eventType = eventType;
		this.inputValues = inputValues;
	}

	/**
	 * @return The pre-computed hashcode.
	 */
	private final int buildHash() {
		return Objects.hashCode(from, to, text, id, element, eventType, inputValues);
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public String getText() {
		return text;
	}

	@Override
	public String toString() {
		return "Edge [from=" + from + ", to=" + to + ", text=" + text + "]";
	}

	public String getId() {
		return id;
	}

	public String getEventType() {
		return eventType;
	}

	public String getInputValues() {
		return inputValues;
	}

	public String getElement() {
		return element;
	}

	@Override
	public int hashCode() {
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof Edge) {
			Edge that = (Edge) object;
			return Objects.equal(this.from, that.from)
			        && Objects.equal(this.to, that.to)
			        && Objects.equal(this.text, that.text)
			        && Objects.equal(this.id, that.id)
			        && Objects.equal(this.element, that.element)
			        && Objects.equal(this.eventType, that.eventType)
					&& Objects.equal(this.inputValues, that.inputValues);
		}
		return false;
	}

}

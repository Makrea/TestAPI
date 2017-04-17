package pt.airc.bpm.carmo.tiago.pojos;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 *
 * @author Tiago Carmo
 *
 */
@JsonPropertyOrder({ "id", "activities", "transitions" })
public class FlowElementContainer {
	/**
	 *
	 */
	@JsonProperty("id")
	private String id;
	/**
	 *
	 */
	@JsonProperty("ativities")
	private Activity[] activities;

	/**
	 *
	 */
	@JsonProperty("transitions")
	private Transition[] transitions;

	/**
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 *
	 * @param id1
	 *            to be set
	 */
	public void setId(final String id1) {
		this.id = id1;
	}

	/**
	 *
	 * @return the activities
	 */
	public Activity[] getActivities() {
		return activities;
	}

	/**
	 *
	 * @param activities1
	 *            to be set
	 */
	public void setActivities(final Activity[] activities1) {
		this.activities = activities1;
	}

	/**
	 *
	 * @return the transitions
	 */
	public Transition[] getTransitions() {
		return transitions;
	}

	/**
	 *
	 * @param transitions to be set
	 */
	public void setTransitions(Transition[] transitions) {
		this.transitions = transitions;
	}

}

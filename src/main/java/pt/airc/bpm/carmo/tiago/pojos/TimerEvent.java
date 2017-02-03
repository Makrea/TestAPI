package pt.airc.bpm.carmo.tiago.pojos;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 *
 * @author Tiago Carmo
 *
 */
@JsonPropertyOrder({ "id", "executionDate", "id_string", "eventInstanceId", "eventInstanceName",
		"eventIntanceId_string" })
public class TimerEvent {
	/**
	 *
	 */
	@JsonProperty("id")
	private String id;
	/**
	 *
	 */
	@JsonProperty("executionDate")
	private String executionDate;
	/**
	 *
	 */
	@JsonProperty("id_string")
	private String id_string;
	/**
	 *
	 */
	@JsonProperty("eventInstanceId")
	private String eventInstanceId;
	/**
	 *
	 */
	@JsonProperty("eventInstanceName")
	private String eventInstanceName;
	/**
	 *
	 */
	@JsonProperty("eventIsntanceId_string")
	private String eventInstanceId_string;

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
	 * @return the execution date
	 */
	public String getExecutionDate() {
		return executionDate;
	}

	/**
	 *
	 * @param executionDate1
	 *            to be set
	 */
	public void setExecutionDate(final String executionDate1) {
		this.executionDate = executionDate1;
	}

	/**
	 *
	 * @return the id as string
	 */
	public String getId_string() {
		return id_string;
	}

	/**
	 *
	 * @param id_string1
	 *            to be set
	 */
	public void setId_string(final String id_string1) {
		this.id_string = id_string1;
	}

	/**
	 *
	 * @return the event instance id
	 */
	public String getEventInstanceId() {
		return eventInstanceId;
	}

	/**
	 *
	 * @param eventInstanceId1
	 *            to be set
	 */
	public void setEventInstanceId(final String eventInstanceId1) {
		this.eventInstanceId = eventInstanceId1;
	}

	/**
	 *
	 * @return the event instance name
	 */
	public String getEventInstanceName() {
		return eventInstanceName;
	}

	/**
	 *
	 * @param eventInstanceName1
	 *            to be set
	 */
	public void setEventInstanceName(final String eventInstanceName1) {
		this.eventInstanceName = eventInstanceName1;
	}

	/**
	 *
	 * @return the event instance id
	 */
	public String getEventInstanceId_string() {
		return eventInstanceId_string;
	}

	/**
	 *
	 * @param eventInstanceId_string1
	 *            to be set
	 */
	public void setEventInstanceId_string(final String eventInstanceId_string1) {
		this.eventInstanceId_string = eventInstanceId_string1;
	}

}
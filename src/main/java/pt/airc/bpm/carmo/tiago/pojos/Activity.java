package pt.airc.bpm.carmo.tiago.pojos;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 *
 * @author Tiago Carmo
 *
 */
@JsonPropertyOrder({ "id", "displayDescription", "description", "name", "displayName", "businessDataDefinitions" })
public class Activity {
	/**
	 *
	 */
	@JsonProperty("id")
	private String id;
	/**
	 *
	 */
	@JsonProperty("displayDescription")
	private String displayDescription;
	/**
	 *
	 */
	@JsonProperty("description")
	private String description;
	/**
	 *
	 */
	@JsonProperty("name")
	private String name;
	/**
	 *
	 */
	@JsonProperty("displayName")
	private String displayName;
	/**
	 *
	 */
	@JsonProperty("businessDataDefinitions")
	private String[] businessDataDefinitions;

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
	 * @return the display description
	 */
	public String getDisplayDescription() {
		return displayDescription;
	}

	/**
	 *
	 * @param displayDescription1
	 *            to be set
	 */
	public void setDisplayDescription(final String displayDescription1) {
		this.displayDescription = displayDescription1;
	}

	/**
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 *
	 * @param description1
	 *            to be set
	 */
	public void setDescription(final String description1) {
		this.description = description1;
	}

	/**
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 *
	 * @param name1
	 *            to be set
	 */
	public void setName(final String name1) {
		this.name = name1;
	}

	/**
	 *
	 * @return the display name
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 *
	 * @param displayName1
	 *            to be set
	 */
	public void setDisplayName(final String displayName1) {
		this.displayName = displayName1;
	}

	/**
	 *
	 * @return the business data definitions
	 */
	public String[] getBusinessDataDefinitions() {
		return businessDataDefinitions;
	}

	/**
	 *
	 * @param businessDataDefinitions1
	 *            to be set
	 */
	public void setBusinessDataDefinitions(final String[] businessDataDefinitions1) {
		this.businessDataDefinitions = businessDataDefinitions1;
	}

}

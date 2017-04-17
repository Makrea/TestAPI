package pt.airc.bpm.carmo.tiago.pojos;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 *
 * @author Tiago Carmo
 *
 */
@JsonPropertyOrder({ "id", "source", "condition", "name", "target" })
public class Transition {

	/**
	 *
	 */
	@JsonProperty("id")
	private String id;

	/**
	 *
	 */
	@JsonProperty("source")
	private String source;

	/**
	 *
	 */
	@JsonProperty("condition")
	private Condition condition;

	/**
	 *
	 */
	@JsonProperty("name")
	private String name;

	/**
	 *
	 */
	@JsonProperty("target")
	private String target;

	/**
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 *
	 * @param id2
	 *            to be set
	 */
	public void setId(String id2) {
		this.id = id2;
	}

	/**
	 *
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 *
	 * @param source2
	 *            to be set
	 */
	public void setSource(String source2) {
		this.source = source2;
	}

	/**
	 *
	 * @return the condition
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 *
	 * @param condition2
	 *            to be set
	 */
	public void setCondition(Condition condition2) {
		this.condition = condition2;
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
	 * @param name2
	 *            to be set
	 */
	public void setName(String name2) {
		this.name = name2;
	}

	/**
	 *
	 * @return the target
	 */
	public String getTarget() {
		return target;
	}

	/**
	 *
	 * @param target2
	 *            to be set
	 */
	public void setTarget(String target2) {
		this.target = target2;
	}

}

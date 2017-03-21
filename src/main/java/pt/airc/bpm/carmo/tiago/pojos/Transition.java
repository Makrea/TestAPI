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
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 *
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 *
	 * @return
	 */
	public String getSource() {
		return source;
	}

	/**
	 *
	 * @param source
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 *
	 * @return
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 *
	 * @param condition
	 */
	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	/**
	 *
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 *
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 *
	 * @return
	 */
	public String getTarget() {
		return target;
	}

	/**
	 *
	 * @param target
	 */
	public void setTarget(String target) {
		this.target = target;
	}

}

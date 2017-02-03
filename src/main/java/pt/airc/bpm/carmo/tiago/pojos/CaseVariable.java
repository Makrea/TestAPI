package pt.airc.bpm.carmo.tiago.pojos;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 *
 * @author Tiago Carmo
 *
 */
@JsonPropertyOrder({ "description", "name", "value", "case_id", "type" })
public class CaseVariable {
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
    @JsonProperty("value")
    private String value;
    /**
     *
     */
    @JsonProperty("case_id")
    private String case_id;
    /**
     *
     */
    @JsonProperty("type")
    private String type;

    /**
     *
     * @return the variable description
     */
    public final String getDescription() {
        return description;
    }

    /**
     *
     * @param description1
     *            to be set
     */
    public final void setDescription(final String description1) {
        this.description = description1;
    }

    /**
     *
     * @return the variable name
     */
    public final String getName() {
        return name;
    }

    /**
     *
     * @param name1
     *            to be set
     */
    public final void setName(final String name1) {
        this.name = name1;
    }

    /**
     *
     * @return the variable value
     */
    public final String getValue() {
        return value;
    }

    /**
     *
     * @param value1
     *            to be set
     */
    public final void setValue(final String value1) {
        this.value = value1;
    }

    /**
     *
     * @return the variable case id
     */
    public final String getCaseid() {
        return case_id;
    }

    /**
     *
     * @param case_id
     *            to be set
     */
    public final void setCaseid(final String case_id) {
        this.case_id = case_id;
    }

    /**
     *
     * @return the variable type
     */
    public final String getType() {
        return type;
    }

    /**
     *
     * @param type1
     *            to be set
     */
    public final void setType(final String type1) {
        this.type = type1;
    }

}

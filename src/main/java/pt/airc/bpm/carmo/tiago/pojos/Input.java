package pt.airc.bpm.carmo.tiago.pojos;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
/**
 *
 * @author Tiago Carmo
 *
 */
@JsonPropertyOrder({ "inputs", "description", "name", "type", "multiple" })
public class Input {
    /**
     *
     */
    @JsonProperty("inputs")
    private Input[] inputs;
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
    @JsonProperty("type")
    private String type;
    /**
     *
     */
    @JsonProperty("multiple")
    private String multiple;
    /**
     *
     * @return the inputs
     */
    public final Input[] getInputs() {
        return inputs;
    }
    /**
     *
     * @param inputs1 to be set
     */
    public final void setInputs(final Input[] inputs1) {
        this.inputs = inputs1;
    }
    /**
     *
     * @return the description
     */
    public final String getDescription() {
        return description;
    }
    /**
     *
     * @param description1 to be set
     */
    public final void setDescription(final String description1) {
        this.description = description1;
    }
    /**
     *
     * @return the name
     */
    public final String getName() {
        return name;
    }
    /**
     *
     * @param name1 to be set
     */
    public final void setName(final String name1) {
        this.name = name1;
    }
    /**
     *
     * @return the type
     */
    public final String getType() {
        return type;
    }
    /**
     *
     * @param type1 to be set
     */
    public final void setType(final String type1) {
        this.type = type1;
    }
    /**
     *
     * @return multiple
     */
    public final String getMultiple() {
        return multiple;
    }
    /**
     *
     * @param multiple1 to be set
     */
    public final void setMultiple(final String multiple1) {
        this.multiple = multiple1;
    }

}

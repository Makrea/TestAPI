package pt.airc.bpm.carmo.tiago.pojos;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 *
 * @author Tiago Carmo
 *
 */
@JsonPropertyOrder({ "inputs"})
public class Contract {
    /**
     *
     */
    @JsonProperty("inputs")
    private Input[] inputs;

    /**
     *
     * @return the inputs
     */
    public final Input[] getInputs() {
        return inputs;
    }

    /**
     *
     * @param inputs1
     *            the inputs to be set
     */
    public final void setInputs(final Input[] inputs1) {
        this.inputs = inputs1;
    }

}

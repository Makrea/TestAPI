package pt.airc.bpm.carmo.tiago.pojos;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 *
 * @author Tiago Carmo
 *
 */
@JsonPropertyOrder({ "inputs", "constraints" })
public class Contract {
    /**
     *
     */
    @JsonProperty("inputs")
    private Input[] inputs;
    /**
     *
     */
    @JsonProperty("constraints")
    private Constraint[] constraints;

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

    /**
     *
     * @return the constraints
     */
    public final Constraint[] getConstraints() {
        return constraints;
    }

    /**
     *
     * @param constraints1
     *            the constraints to be set
     */
    public final void setConstraints(final Constraint[] constraints1) {
        this.constraints = constraints1;
    }

}

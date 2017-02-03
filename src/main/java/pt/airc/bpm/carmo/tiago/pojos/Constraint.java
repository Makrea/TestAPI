package pt.airc.bpm.carmo.tiago.pojos;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 *
 * @author Tiago Carmo
 *
 */
@JsonPropertyOrder({ "expression", "explanation", "name", "inputNames",
        "constraintType" })
public class Constraint {
    /**
     *
     */
    @JsonProperty("expression")
    private String expression;
    /**
     *
     */
    @JsonProperty("explanation")
    private String explanation;
    /**
     *
     */
    @JsonProperty("name")
    private String name;
    /**
     *
     */
    @JsonProperty("inputNames")
    private String[] inputNames;
    /**
     *
     */
    @JsonProperty("constraintType")
    private String constraintType;

    /**
     *
     * @return the expression
     */
    public final String getExpression() {
        return expression;
    }

    /**
     *
     * @param expression1
     *            the expression to be set
     */
    public final void setExpression(final String expression1) {
        this.expression = expression1;
    }

    /**
     *
     * @return the explanation
     */
    public final String getExplanation() {
        return explanation;
    }

    /**
     *
     * @param explanation1
     *            the explanation to be set
     */
    public final void setExplanation(final String explanation1) {
        this.explanation = explanation1;
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
     * @param name1
     *            the name
     */
    public final void setName(final String name1) {
        this.name = name1;
    }

    /**
     *
     * @return the input names
     */
    public final String[] getInputNames() {
        return inputNames;
    }

    /**
     *
     * @param inputNames1
     *            the input names to be set
     */
    public final void setInputNames(final String[] inputNames1) {
        this.inputNames = inputNames1;
    }

    /**
     *
     * @return the constraint type
     */
    public String getConstraintType() {
        return constraintType;
    }

    /**
     *
     * @param constraintType1
     *            to be set
     */
    public void setConstraintType(String constraintType1) {
        this.constraintType = constraintType1;
    }

}

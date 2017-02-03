package pt.airc.bpm.carmo.tiago.pojos;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 *
 * @author Tiago Carmo
 *
 */
@JsonPropertyOrder({ "id", "end_date", "failedFlowNodes", "startedBySubstitute",
        "start", "activeFlowNodes", "state", "rootCaseId", "started_by",
        "processDefinitionId", "last_update_date" })
public class Case {
    /**
     *
     */
    @JsonProperty("id")
    private String id;
    /**
     *
     */
    @JsonProperty("end_date")
    private String end_date;
    /**
     *
     */
    @JsonProperty("failedFlowNodes")
    private String failedFlowNodes;

    /**
     *
     */
    @JsonProperty("startedBySubstitute")
    private String startedBySubstitute;
    /**
     *
     */
    @JsonProperty("start")
    private String start;
    /**
     *
     */
    @JsonProperty("activeFlowNodes")
    private String activeFlowNodes;
    /**
     *
     */
    @JsonProperty("state")
    private String state;
    /**
     *
     */
    @JsonProperty("rootCaseId")
    private String rootCaseId;
    /**
     *
     */
    @JsonProperty("started_by")
    private String started_by;
    /**
     *
     */
    @JsonProperty("processDefinitionId")
    private String processDefinitionId;
    /**
     *
     */
    @JsonProperty("last_update_date")
    private String last_update_date;

    /**
     *
     * @return the case id
     */
    public final String getId() {
        return id;
    }

    /**
     *
     * @param id1
     *            to be set
     */
    public final void setId(final String id1) {
        this.id = id1;
    }

    /**
     *
     * @return the case end date
     */
    public final String getEnddate() {
        return end_date;
    }

    /**
     *
     * @param end_date1
     *            set the end date
     */
    public final void setEnddate(final String end_date1) {
        this.end_date = end_date1;
    }

    /**
     *
     * @return failed flow nodes
     */
    public String getFailedFlowNodes() {
        return failedFlowNodes;
    }

    /**
     *
     * @param failedFlowNodes1
     *            to be set
     */
    public void setFailedFlowNodes(final String failedFlowNodes1) {
        this.failedFlowNodes = failedFlowNodes1;
    }

    /**
     *
     * @return the started by substitute
     */
    public final String getStartedBySubstitute() {
        return startedBySubstitute;
    }

    /**
     *
     * @param startedBySubstitute1
     *            to be set
     */
    public final void setStartedBySubstitute(
            final String startedBySubstitute1) {
        this.startedBySubstitute = startedBySubstitute1;
    }

    /**
     *
     * @return the start
     */
    public final String getStart() {
        return start;
    }

    /**
     *
     * @param start1
     *            to be set
     */
    public final void setStart(final String start1) {
        this.start = start1;
    }

    /**
     *
     * @return the active flow nodes
     */
    public String getActiveFlowNodes() {
        return activeFlowNodes;
    }

    /**
     *
     * @param activeFlowNodes1
     *            to be set
     */
    public void setActiveFlowNodes(final String activeFlowNodes1) {
        this.activeFlowNodes = activeFlowNodes1;
    }

    /**
     *
     * @return the case state
     */
    public final String getState() {
        return state;
    }

    /**
     *
     * @param state1
     *            to be set
     */
    public final void setState(final String state1) {
        this.state = state1;
    }

    /**
     *
     * @return the root case id
     */
    public final String getRootCaseId() {
        return rootCaseId;
    }

    /**
     *
     * @param rootCaseId1
     *            to be set
     */
    public final void setRootCaseId(final String rootCaseId1) {
        this.rootCaseId = rootCaseId1;
    }

    /**
     *
     * @return the person who started the case
     */
    public final String getStartedby() {
        return started_by;
    }

    /**
     *
     * @param started_by1
     *            to be set
     */
    public final void setStartedby(final String started_by1) {
        this.started_by = started_by1;
    }

    /**
     *
     * @return the process definition id
     */
    public final String getProcessDefinitionId() {
        return processDefinitionId;
    }

    /**
     *
     * @param processDefinitionId1
     *            to be set
     */
    public final void setProcessDefinitionId(
            final String processDefinitionId1) {
        this.processDefinitionId = processDefinitionId1;
    }

    /**
     *
     * @return the last time the case was updated
     */
    public final String getLastupdatedate() {
        return last_update_date;
    }

    /**
     *
     * @param last_update_date1
     *            to be set
     */
    public final void setLastupdatedate(final String last_update_date1) {
        this.last_update_date = last_update_date1;
    }

}

package pt.airc.bpm.carmo.tiago.pojos;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
/**
 *
 * @author Tiago Carmo
 *
 */
@JsonPropertyOrder({ "displayDescription", "executedBySubstitute", "processId",
        "parentCaseId", "state", "rootContainerId", "type", "assigned_id",
        "assigned_date", "id", "executedBy", "caseId", "description", "actorId",
        "priority", "name", "reached_state_date", "rootCaseId", "displayName",
        "dueDate", "last_update_date" })
public class Task {
    /**
     *
     */
    @JsonProperty("displayDescription")
    private String displayDescription;
    /**
     *
     */
    @JsonProperty("executedBySubstitute")
    private String executedBySubstitute;
    /**
     *
     */
    @JsonProperty("processId")
    private String processId;
    /**
     *
     */
    @JsonProperty("parentCaseId")
    private String parentCaseId;
    /**
     *
     */
    @JsonProperty("state")
    private String state;
    /**
     *
     */
    @JsonProperty("rootContainerId")
    private String rootContainerId;
    /**
     *
     */
    @JsonProperty("type")
    private String type;
    /**
     *
     */
    @JsonProperty("assigned_id")
    private String assigned_id;
    /**
     *
     */
    @JsonProperty("assigned_date")
    private String assigned_date;
    /**
     *
     */
    @JsonProperty("id")
    private String id;
    /**
     *
     */
    @JsonProperty("executedBy")
    private String executedBy;
    /**
     *
     */
    @JsonProperty("caseId")
    private String caseId;
    /**
     *
     */
    @JsonProperty("description")
    private String description;
    /**
     *
     */
    @JsonProperty("actorId")
    private String actorId;
    /**
     *
     */
    @JsonProperty("priority")
    private String priority;
    /**
     *
     */
    @JsonProperty("name")
    private String name;
    /**
     *
     */
    @JsonProperty("reached_state_date")
    private String reached_state_date;
    /**
     *
     */
    @JsonProperty("rootCaseId")
    private String rootCaseId;
    /**
     *
     */
    @JsonProperty("displayName")
    private String displayName;
    /**
     *
     */
    @JsonProperty("dueDate")
    private String dueDate;
    /**
     *
     */
    @JsonProperty("last_update_date")
    private String last_update_date;
    /**
     *
     * @return the display description
     */
    public String getDisplayDescription() {
        return displayDescription;
    }
    /**
     *
     * @param displayDescription1 to be set
     */
    public void setDisplayDescription(final String displayDescription1) {
        this.displayDescription = displayDescription1;
    }
    /**
     *
     * @return the executed by substitute
     */
    public String getExecutedBySubstitute() {
        return executedBySubstitute;
    }
    /**
     *
     * @param executedBySubstitute1 to be set
     */
    public void setExecutedBySubstitute(final String executedBySubstitute1) {
        this.executedBySubstitute = executedBySubstitute1;
    }
    /**
     *
     * @return the process id
     */
    public String getProcessId() {
        return processId;
    }
    /**
     *
     * @param processId1 to be set
     */
    public void setProcessId(final String processId1) {
        this.processId = processId1;
    }
    /**
     *
     * @return the parent case id
     */
    public String getParentCaseId() {
        return parentCaseId;
    }
    /**
     *
     * @param parentCaseId1 to be set
     */
    public void setParentCaseId(final String parentCaseId1) {
        this.parentCaseId = parentCaseId1;
    }
    /**
     *
     * @return the state
     */
    public String getState() {
        return state;
    }
    /**
     *
     * @param state1 to be set
     */
    public void setState(final String state1) {
        this.state = state1;
    }
    /**
     *
     * @return the root container id
     */
    public String getRootContainerId() {
        return rootContainerId;
    }
    /**
     *
     * @param rootContainerId1 to be set
     */
    public void setRootContainerId(final String rootContainerId1) {
        this.rootContainerId = rootContainerId1;
    }
    /**
     *
     * @return the type
     */
    public String getType() {
        return type;
    }
    /**
     *
     * @param type1 to be set
     */
    public void setType(final String type1) {
        this.type = type1;
    }
    /**
     *
     * @return the assigned id
     */
    public String getAssigned_id() {
        return assigned_id;
    }
    /**
     *
     * @param assigned_id1 to be set
     */
    public void setAssigned_id(final String assigned_id1) {
        this.assigned_id = assigned_id1;
    }
    /**
     *
     * @return the assigned date
     */
    public String getAssigned_date() {
        return assigned_date;
    }
    /**
     *
     * @param assigned_date1 to be set
     */
    public void setAssigned_date(final String assigned_date1) {
        this.assigned_date = assigned_date1;
    }
    /**
     *
     * @return the task id
     */
    public String getId() {
        return id;
    }
    /**
     *
     * @param id1 to be set
     */
    public void setId(final String id1) {
        this.id = id1;
    }
    /**
     *
     * @return who executed the task
     */
    public String getExecutedBy() {
        return executedBy;
    }
    /**
     *
     * @param executedBy1 to be set
     */
    public void setExecutedBy(final String executedBy1) {
        this.executedBy = executedBy1;
    }
    /**
     *
     * @return the case id
     */
    public String getCaseId() {
        return caseId;
    }
    /**
     *
     * @param caseId1 to be set
     */
    public void setCaseId(final String caseId1) {
        this.caseId = caseId1;
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
     * @param description1 to be set
     */
    public void setDescription(final String description1) {
        this.description = description1;
    }
    /**
     *
     * @return the actor id
     */
    public String getActorId() {
        return actorId;
    }
    /**
     *
     * @param actorId1 to be set
     */
    public void setActorId(final String actorId1) {
        this.actorId = actorId1;
    }
    /**
     *
     * @return the priority
     */
    public String getPriority() {
        return priority;
    }
    /**
     *
     * @param priority1 to be set
     */
    public void setPriority(final String priority1) {
        this.priority = priority1;
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
     * @param name1 to be set
     */
    public void setName(final String name1) {
        this.name = name1;
    }
    /**
     *
     * @return the reached state date
     */
    public String getReached_state_date() {
        return reached_state_date;
    }
    /**
     *
     * @param reached_state_date1 to be set
     */
    public void setReached_state_date(final String reached_state_date1) {
        this.reached_state_date = reached_state_date1;
    }
    /**
     *
     * @return the root case id
     */
    public String getRootCaseId() {
        return rootCaseId;
    }
    /**
     *
     * @param rootCaseId1 to be set
     */
    public void setRootCaseId(final String rootCaseId1) {
        this.rootCaseId = rootCaseId1;
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
     * @param displayName1 to be set
     */
    public void setDisplayName(final String displayName1) {
        this.displayName = displayName1;
    }
    /**
     *
     * @return de due date
     */
    public String getDueDate() {
        return dueDate;
    }
    /**
     *
     * @param dueDate1 date to finish
     */
    public void setDueDate(final String dueDate1) {
        this.dueDate = dueDate1;
    }
    /**
     *
     * @return last update date
     */
    public String getLast_update_date() {
        return last_update_date;
    }
    /**
     *
     * @param last_update_date1 to be set
     */
    public void setLast_update_date(final String last_update_date1) {
        this.last_update_date = last_update_date1;
    }

}

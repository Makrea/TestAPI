package pt.airc.bpm.carmo.tiago.pojos;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 *
 * @author Tiago Carmo
 *
 */
@JsonPropertyOrder({ "displayDescription", "deploymentDate", "displayName",
        "name", "description", "deployedBy", "id", "activationState", "version",
        "configurationState", "last_update_date", "actorinitiatorid" })
public class Process {
    /**
     *
     */
    @JsonProperty("displayDescription")
    private String displayDescription;
    /**
     *
     */
    @JsonProperty("deploymentDate")
    private String deploymentDate;
    /**
     *
     */
    @JsonProperty("displayName")
    private String displayName;
    /**
     *
     */
    @JsonProperty("name")
    private String name;
    /**
     *
     */
    @JsonProperty("description")
    private String description;
    /**
     *
     */
    @JsonProperty("deployedBy")
    private String deployedBy;
    /**
     *
     */
    @JsonProperty("id")
    private String id;
    /**
     *
     */
    @JsonProperty("activationState")
    private String activationState;
    /**
     *
     */
    @JsonProperty("version")
    private String version;
    /**
     *
     */
    @JsonProperty("configurationState")
    private String configurationState;
    /**
     *
     */
    @JsonProperty("last_update_date")
    private String lastUpdateDate;
    /**
     *
     */
    @JsonProperty("actorinitiatorid")
    private String actorinitiatorid;

    /**
     *
     * @return the process displayed description
     */
    public final String getDisplayDescription() {
        return displayDescription;
    }

    /**
     *
     * @param displayDescription1
     *            to be set
     */
    public final void setDisplayDescription(final String displayDescription1) {
        this.displayDescription = displayDescription1;
    }

    /**
     *
     * @return the deployment date
     */
    public final String getDeploymentDate() {
        return deploymentDate;
    }

    /**
     *
     * @param deploymentDate1
     *            to be set
     */
    public final void setDeploymentDate(final String deploymentDate1) {
        this.deploymentDate = deploymentDate1;
    }

    /**
     *
     * @return the displayed name
     */
    public final String getDisplayName() {
        return displayName;
    }

    /**
     *
     * @param displayName1
     *            to be set
     */
    public final void setDisplayName(final String displayName1) {
        this.displayName = displayName1;
    }

    /**
     *
     * @return the process name
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
     * @return the process description
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
     * @return who deployed the process
     */
    public final String getDeployedBy() {
        return deployedBy;
    }

    /**
     *
     * @param deployedBy1
     *            to be set
     */
    public final void setDeployedBy(final String deployedBy1) {
        this.deployedBy = deployedBy1;
    }

    /**
     *
     * @return the process id
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
     * @return the activation state
     */
    public final String getActivationState() {
        return activationState;
    }

    /**
     *
     * @param activationState1
     *            to be set
     */
    public final void setActivationState(final String activationState1) {
        this.activationState = activationState1;
    }

    /**
     *
     * @return the process version
     */
    public final String getVersion() {
        return version;
    }

    /**
     *
     * @param version1
     *            to be set
     */
    public final void setVersion(final String version1) {
        this.version = version1;
    }

    /**
     *
     * @return the configuration state
     */
    public final String getConfigurationState() {
        return configurationState;
    }

    /**
     *
     * @param configurationState1
     *            to be set
     */
    public final void setConfigurationState(final String configurationState1) {
        this.configurationState = configurationState1;
    }

    /**
     *
     * @return the last time the process was updated
     */
    public final String getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     *
     * @param lastUpdateDate1
     *            to be set
     */
    public final void setLastUpdateDate(final String lastUpdateDate1) {
        this.lastUpdateDate = lastUpdateDate1;
    }

    /**
     *
     * @return the id of the person who initiated the process
     */
    public final String getActorinitiatorid() {
        return actorinitiatorid;
    }

    /**
     *
     * @param actorinitiatorid1
     *            to be set
     */
    public final void setActorinitiatorid(final String actorinitiatorid1) {
        this.actorinitiatorid = actorinitiatorid1;
    }

}

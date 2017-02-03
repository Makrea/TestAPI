package pt.airc.bpm.carmo.tiago.pojos;

import org.codehaus.jackson.annotate.JsonProperty;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 *
 * @author Tiago Carmo
 *
 */
@JsonPropertyOrder({ "containerType", "id", "tenantId", "id_string",
        "transientData", "description", "name", "value", "className",
        "containerId_string", "containerId", "tenantId_string" })
public class ActivityVariable {
    /**
     *
     */
    @JsonProperty("containerType")
    private String containerType;
    /**
     *
     */
    @JsonProperty("id")
    private String id;
    /**
     *
     */
    @JsonProperty("tenantId")
    private String tenantId;
    /**
     *
     */
    @JsonProperty("id_string")
    private String id_string;
    /**
     *
     */
    @JsonProperty("transientData")
    private String transientData;
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
    @JsonProperty("className")
    private String className;
    /**
     *
     */
    @JsonProperty("containerId_string")
    private String containerId_string;
    /**
     *
     */
    @JsonProperty("containerId")
    private String containerId;
    /**
     *
     */
    @JsonProperty("tenantId_string")
    private String tenantId_string;

    /**
     *
     * @return the container Type
     */
    public String getContainerType() {
        return containerType;
    }

    /**
     *
     * @param containerType1
     *            to be set
     */
    public void setContainerType(final String containerType1) {
        this.containerType = containerType1;
    }

    /**
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id1
     *            to be set
     */
    public void setId(final String id1) {
        this.id = id1;
    }

    /**
     *
     * @return the tentantID
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     *
     * @param tenantId1
     *            to be set
     */
    public void setTenantId(final String tenantId1) {
        this.tenantId = tenantId1;
    }

    /**
     *
     * @return the id as string
     */
    public String getId_string() {
        return id_string;
    }

    /**
     *
     * @param id_string1
     *            to be set
     */
    public void setId_string(final String id_string1) {
        this.id_string = id_string1;
    }

    /**
     *
     * @return the transient data
     */
    public String getTransientData() {
        return transientData;
    }

    /**
     *
     * @param transientData1
     *            to be set
     */
    public void setTransientData(final String transientData1) {
        this.transientData = transientData1;
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
     * @param description1
     *            to be set
     */
    public void setDescription(final String description1) {
        this.description = description1;
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
     * @param name1
     *            to be set
     */
    public void setName(final String name1) {
        this.name = name1;
    }

    /**
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     *
     * @param value1
     *            to be set
     */
    public void setValue(final String value1) {
        this.value = value1;
    }

    /**
     *
     * @return the class name
     */
    public String getClassName() {
        return className;
    }

    /**
     *
     * @param className1
     *            to be set
     */
    public void setClassName(final String className1) {
        this.className = className1;
    }

    /**
     *
     * @return the container id as a string
     */
    public String getContainerId_string() {
        return containerId_string;
    }

    /**
     *
     * @param containerId_string1
     *            to be set
     */
    public void setContainerId_string(final String containerId_string1) {
        this.containerId_string = containerId_string1;
    }

    /**
     *
     * @return the container id
     */
    public String getContainerId() {
        return containerId;
    }

    /**
     *
     * @param containerId1
     *            to be set
     */
    public void setContainerId(final String containerId1) {
        this.containerId = containerId1;
    }

    /**
     *
     * @return the tenant id as a string
     */
    public String getTenantId_string() {
        return tenantId_string;
    }

    /**
     *
     * @param tenantId_string1
     *            to be set
     */
    public void setTenantId_string(final String tenantId_string1) {
        this.tenantId_string = tenantId_string1;
    }

}

package pt.airc.bpm.carmo.tiago.pojos;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 *
 * @author Tiago Carmo
 *
 */
@JsonPropertyOrder({ "storageId_string", "name", "type", "storageId" })
public class BusinessData {
    /**
     *
     */
    @JsonProperty("storageId_string")
    private String storageId_string;
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
    @JsonProperty("storageId")
    private String storageId;

    /**
     *
     * @return the storage id
     */
    public final String getStorageIdstring() {
        return storageId_string;
    }

    /**
     *
     * @param storageId_string the storage id
     */
    public final void setStorageIdstring(final String storageId_string) {
        this.storageId_string = storageId_string;
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
     *            name to set
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
     * @param type1
     *            the type to be set
     */
    public final void setType(final String type1) {
        this.type = type1;
    }

    /**
     *
     * @return the storage id
     */
    public final String getStorageId() {
        return storageId;
    }

    /**
     *
     * @param storageId1
     *            the storage id to be set
     */
    public final void setStorageId(final String storageId1) {
        this.storageId = storageId1;
    }

}

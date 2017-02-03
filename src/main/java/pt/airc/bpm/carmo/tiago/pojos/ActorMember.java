package pt.airc.bpm.carmo.tiago.pojos;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 *
 * @author Tiago Carmo
 *
 */
@JsonPropertyOrder({ "id", "actor_id", "role_id", "group_id", "user_id" })
public class ActorMember {
    /**
     *
     */
    @JsonProperty("id")
    private String id;
    /**
     * 
     */
    @JsonProperty("actor_id")
    private String actor_id;
    /**
     *
     */
    @JsonProperty("role_id")
    private String role_id;
    /**
     *
     */
    @JsonProperty("group_id")
    private String group_id;
    /**
     *
     */
    @JsonProperty("user_id")
    private String user_id;

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
     * @return the actor id
     */
    public String getActor_id() {
        return actor_id;
    }

    /**
     *
     * @param actor_id1
     *            to be set
     */
    public void setActor_id(final String actor_id1) {
        this.actor_id = actor_id1;
    }

    /**
     *
     * @return the role id
     */
    public String getRole_id() {
        return role_id;
    }

    /**
     *
     * @param role_id1
     *            to be set
     */
    public void setRole_id(final String role_id1) {
        this.role_id = role_id1;
    }

    /**
     *
     * @return the group id
     */
    public String getGroup_id() {
        return group_id;
    }

    /**
     *
     * @param group_id1
     *            to be set
     */
    public void setGroup_id(final String group_id1) {
        this.group_id = group_id1;
    }

    /**
     *
     * @return the user id
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     *
     * @param user_id1
     *            to be set
     */
    public void setUser_id(final String user_id1) {
        this.user_id = user_id1;
    }

}

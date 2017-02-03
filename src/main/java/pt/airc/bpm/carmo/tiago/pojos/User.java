package pt.airc.bpm.carmo.tiago.pojos;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 *
 * @author Tiago Carmo
 *
 */
@JsonPropertyOrder({ "id", "last_connection", "created_by_user_id",
        "creation_date", "enabled", "icon", "title", "manager_id", "job_title",
        "lastname", "userName", "firstname", "password", "last_update_date" })
public class User {
    /**
     *
     */
    @JsonProperty("id")
    private String id;
    /**
     *
     */
    @JsonProperty("last_connection")
    private String last_connection;
    /**
     *
     */
    @JsonProperty("created_by_user_id")
    private String created_by_user_id;
    /**
     *
     */
    @JsonProperty("creation_date")
    private String creation_date;
    /**
     *
     */
    @JsonProperty("enabled")
    private boolean enabled;
    /**
     *
     */
    @JsonProperty("icon")
    private String icon;
    /**
     *
     */
    @JsonProperty("title")
    private String title;
    /**
     *
     */
    @JsonProperty("manager_id")
    private String manager_id;
    /**
     *
     */
    @JsonProperty("job_title")
    private String job_title;
    /**
     *
     */
    @JsonProperty("lastname")
    private String lastname;
    /**
     *
     */
    @JsonProperty("userName")
    private String userName;
    /**
     *
     */
    @JsonProperty("firstname")
    private String firstname;
    /**
     *
     */
    @JsonProperty("password")
    private String password;
    /**
     *
     */
    @JsonProperty("last_update_date")
    private String last_update_date;

    /**
     *
     * @return the user id
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
     * @return the last time the user connected
     */
    public final String getLastconnection() {
        return last_connection;
    }

    /**
     *
     * @param last_connection1
     *            to be set
     */
    public final void setLastconnection(final String last_connection1) {
        this.last_connection = last_connection1;
    }

    /**
     *
     * @return the id of the user that created the current user
     */
    public final String getCreatedbyuserid() {
        return created_by_user_id;
    }

    /**
     *
     * @param created_by_user_id1
     *            to be set
     */
    public final void setCreatedbyuserid(final String created_by_user_id1) {
        this.created_by_user_id = created_by_user_id1;
    }

    /**
     *
     * @return the date the user was created
     */
    public final String getCreationdate() {
        return creation_date;
    }

    /**
     *
     * @param creation_date1
     *            to be set
     */
    public final void setCreationdate(final String creation_date1) {
        this.creation_date = creation_date1;
    }

    /**
     *
     * @return if the user is enabled or not
     */
    public final boolean isEnabled() {
        return enabled;
    }

    /**
     *
     * @param enabled1
     *            to be set
     */
    public final void setEnabled(final boolean enabled1) {
        this.enabled = enabled1;
    }

    /**
     *
     * @return the icon location
     */
    public final String getIcon() {
        return icon;
    }

    /**
     *
     * @param icon1
     *            to be set
     */
    public final void setIcon(final String icon1) {
        this.icon = icon1;
    }

    /**
     *
     * @return the user title (Mr., Ms.,...)
     */
    public final String getTitle() {
        return title;
    }

    /**
     *
     * @param title1
     *            to be set
     */
    public final void setTitle(final String title1) {
        this.title = title1;
    }

    /**
     *
     * @return the manager id
     */
    public final String getManagerid() {
        return manager_id;
    }

    /**
     *
     * @param manager_id1
     *            to be set
     */
    public final void setManagerid(final String manager_id1) {
        this.manager_id = manager_id1;
    }

    /**
     *
     * @return the user job title
     */
    public final String getJobtitle() {
        return job_title;
    }

    /**
     *
     * @param job_title1
     *            to be set
     */
    public final void setJobtitle(final String job_title1) {
        this.job_title = job_title1;
    }

    /**
     *
     * @return the user's last name
     */
    public final String getLastname() {
        return lastname;
    }

    /**
     *
     * @param lastname1
     *            to be set
     */
    public final void setLastname(final String lastname1) {
        this.lastname = lastname1;
    }

    /**
     *
     * @return the user's username
     */
    public final String getUserName() {
        return userName;
    }

    /**
     *
     * @param userName1
     *            to be set
     */
    public final void setUserName(final String userName1) {
        this.userName = userName1;
    }

    /**
     *
     * @return the user's first name
     */
    public final String getFirstname() {
        return firstname;
    }

    /**
     *
     * @param firstname1
     *            to be set
     */
    public final void setFirstname(final String firstname1) {
        this.firstname = firstname1;
    }

    /**
     *
     * @return the user's password
     */
    public final String getPassword() {
        return password;
    }

    /**
     *
     * @param password1
     *            to be set
     */
    public final void setPassword(final String password1) {
        this.password = password1;
    }

    /**
     *
     * @return the date the user was last updated
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

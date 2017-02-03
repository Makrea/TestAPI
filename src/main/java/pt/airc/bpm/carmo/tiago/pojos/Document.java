package pt.airc.bpm.carmo.tiago.pojos;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 *
 * @author Tiago Carmo
 *
 */
@JsonPropertyOrder({ "id", "creationDate", "author", "index", "contentMimetype", "caseId", "description", "name",
		"fileName", "isInternal", "submittedBy", "url", "version", "contentStorageId" })
public class Document {
	/**
	 *
	 */
	@JsonProperty("id")
	private String id;
	/**
	 *
	 */
	@JsonProperty("creationDate")
	private String creationDate;
	/**
	 *
	 */
	@JsonProperty("author")
	private String author;
	/**
	 *
	 */
	@JsonProperty("index")
	private String index;
	/**
	 *
	 */
	@JsonProperty("contentMimetype")
	private String contentMimetype;
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
	@JsonProperty("name")
	private String name;
	/**
	 *
	 */
	@JsonProperty("fileName")
	private String fileName;
	/**
	 *
	 */
	@JsonProperty("isInternal")
	private String isInternal;
	/**
	 *
	 */
	@JsonProperty("submittedBy")
	private String submittedBy;
	/**
	 *
	 */
	@JsonProperty("url")
	private String url;
	/**
	 *
	 */
	@JsonProperty("version")
	private String version;
	/**
	 *
	 */
	@JsonProperty("contentStorageId")
	private String contentStorageId;

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
	 * @return the creation date
	 */
	public String getCreationDate() {
		return creationDate;
	}

	/**
	 *
	 * @param creationDate1
	 *            to be set
	 */
	public void setCreationDate(final String creationDate1) {
		this.creationDate = creationDate1;
	}

	/**
	 *
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 *
	 * @param author1
	 *            to be set
	 */
	public void setAuthor(final String author1) {
		this.author = author1;
	}

	/**
	 *
	 * @return the index
	 */
	public String getIndex() {
		return index;
	}

	/**
	 *
	 * @param index1 to be set
	 */
	public void setIndex(final String index1) {
		this.index = index1;
	}

	/**
	 *
	 * @return the content mime type
	 */
	public String getContentMimetype() {
		return contentMimetype;
	}

	/**
	 *
	 * @param contentMimetype1
	 *            to be set
	 */
	public void setContentMimetype(final String contentMimetype1) {
		this.contentMimetype = contentMimetype1;
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
	 * @param caseId1
	 *            to be set
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
	 * @return the file name
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 *
	 * @param fileName1
	 *            to be set
	 */
	public void setFileName(final String fileName1) {
		this.fileName = fileName1;
	}

	/**
	 *
	 * @return if the doc is internal or not
	 */
	public String getIsInternal() {
		return isInternal;
	}

	/**
	 *
	 * @param isInternal1
	 *            to be set
	 */
	public void setIsInternal(final String isInternal1) {
		this.isInternal = isInternal1;
	}

	/**
	 *
	 * @return who submitted the doc
	 */
	public String getSubmittedBy() {
		return submittedBy;
	}

	/**
	 *
	 * @param submittedBy1
	 *            to be set
	 */
	public void setSubmittedBy(final String submittedBy1) {
		this.submittedBy = submittedBy1;
	}

	/**
	 *
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 *
	 * @param url1
	 *            to be set
	 */
	public void setUrl(final String url1) {
		this.url = url1;
	}

	/**
	 *
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 *
	 * @param version1
	 *            to be set
	 */
	public void setVersion(final String version1) {
		this.version = version1;
	}

	/**
	 *
	 * @return the content storage id
	 */
	public String getContentStorageId() {
		return contentStorageId;
	}

	/**
	 *
	 * @param contentStorageId1
	 *            to be set
	 */
	public void setContentStorageId(final String contentStorageId1) {
		this.contentStorageId = contentStorageId1;
	}

}
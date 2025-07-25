/*
 * Aurinko.io API
 * ## Introduction The Aurinko API is a unified API platform allowing developers to quickly build integrations with many mailbox providers and services like Google, Office 365, Outlook.com, MS Exchange, IMAP. The unified API abstracts away differences between many email, calendar, contact, task APIs to make it easy to connect and sync the mailbox data.  The Aurinko API's focus is convenient and reliable data synchronization for all supported data categories (email, calendar, contacts, tasks) so the API provides methods to receive changes/deltas and be notified of the changes (through webhooks) in a unified manner. The API's sync/deltas model should allow developers to build reliable event based solutions easily.  The Aurinko API is built on HTTP. Our API is RESTful. It has predictable resource URLs. It returns HTTP response codes to indicate errors. It also accepts and returns JSON in the HTTP body.  ## API Authentication When you [sign up for an account](https://app.aurinko.io/#/signUp), you are given a Client Id and Secret for every application that you create. You use those to go through OAuth flows that allow you to start syncing remote account data through Aurinko. An account OAuth flow can be started with just the Client Id and the Client Secret will be required to obtain an account access token in the \"authorization code\" flow (\"implicit grant\" flow does is secured by the \"trusted domains\" setting).  Aurinko offers two forms of authentication:  - `Basic <Client Id, Client Secret>` - used for authentication flows and administrative requests made from the server side. - `Bearer <Account Access Token>` - used for working with an account data. - `Api Key in Cookie` - for in-browser apps that use Aurinko as their backend API with user sessions. - `Api Key in Header (X-Aurinko-Session)` - for server side apps that need user sessions  Never share your client secret or access token. Keep them guarded and secure.  ## Getting Started Guide If you have a use case you would like to implement, please consult us for feedback on the best API operations for the task.  [Click here to visit our API Guides](https://docs.aurinko.io/ctg-getting-started/getting-started). 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@aurinko.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.aurinko.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.aurinko.client.model.TaskImportance;
import io.aurinko.client.model.TaskLink;
import io.aurinko.client.model.TaskStatus;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import io.aurinko.client.ApiClient;
/**
 * Task
 */
@JsonPropertyOrder({
  Task.JSON_PROPERTY_ID,
  Task.JSON_PROPERTY_ETAG,
  Task.JSON_PROPERTY_TITLE,
  Task.JSON_PROPERTY_LAST_MODIFIED_TIME,
  Task.JSON_PROPERTY_PARENT_ID,
  Task.JSON_PROPERTY_POSITION,
  Task.JSON_PROPERTY_NOTES,
  Task.JSON_PROPERTY_STATUS,
  Task.JSON_PROPERTY_IMPORTANCE,
  Task.JSON_PROPERTY_DUE,
  Task.JSON_PROPERTY_COMPLETED,
  Task.JSON_PROPERTY_LINKS,
  Task.JSON_PROPERTY_START_DATE_TIME,
  Task.JSON_PROPERTY_CATEGORIES,
  Task.JSON_PROPERTY_OWNER,
  Task.JSON_PROPERTY_OMITTED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class Task {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_ETAG = "etag";
  @javax.annotation.Nullable
  private String etag;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private String title;

  public static final String JSON_PROPERTY_LAST_MODIFIED_TIME = "lastModifiedTime";
  @javax.annotation.Nullable
  private OffsetDateTime lastModifiedTime;

  public static final String JSON_PROPERTY_PARENT_ID = "parentId";
  @javax.annotation.Nullable
  private String parentId;

  public static final String JSON_PROPERTY_POSITION = "position";
  @javax.annotation.Nullable
  private String position;

  public static final String JSON_PROPERTY_NOTES = "notes";
  @javax.annotation.Nullable
  private String notes;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable
  private TaskStatus status;

  public static final String JSON_PROPERTY_IMPORTANCE = "importance";
  @javax.annotation.Nullable
  private TaskImportance importance;

  public static final String JSON_PROPERTY_DUE = "due";
  @javax.annotation.Nullable
  private OffsetDateTime due;

  public static final String JSON_PROPERTY_COMPLETED = "completed";
  @javax.annotation.Nullable
  private OffsetDateTime completed;

  public static final String JSON_PROPERTY_LINKS = "links";
  @javax.annotation.Nullable
  private List<TaskLink> links = new ArrayList<>();

  public static final String JSON_PROPERTY_START_DATE_TIME = "startDateTime";
  @javax.annotation.Nullable
  private OffsetDateTime startDateTime;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  @javax.annotation.Nullable
  private List<String> categories = new ArrayList<>();

  public static final String JSON_PROPERTY_OWNER = "owner";
  @javax.annotation.Nullable
  private String owner;

  /**
   * Gets or Sets omitted
   */
  public enum OmittedEnum {
    NOTES(String.valueOf("notes")),
    
    UNKNOWN_DEFAULT_OPEN_API(String.valueOf("unknown_default_open_api"));

    private String value;

    OmittedEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OmittedEnum fromValue(String value) {
      for (OmittedEnum b : OmittedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_OMITTED = "omitted";
  @javax.annotation.Nullable
  private List<OmittedEnum> omitted = new ArrayList<>();

  public Task() { 
  }

  @JsonCreator
  public Task(
    @JsonProperty(JSON_PROPERTY_OMITTED) List<OmittedEnum> omitted
  ) {
  this();
    this.omitted = omitted;
  }

  public Task id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public Task etag(@javax.annotation.Nullable String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Get etag
   * @return etag
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ETAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEtag() {
    return etag;
  }


  @JsonProperty(JSON_PROPERTY_ETAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEtag(@javax.annotation.Nullable String etag) {
    this.etag = etag;
  }


  public Task title(@javax.annotation.Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }


  public Task lastModifiedTime(@javax.annotation.Nullable OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   * @return lastModifiedTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getLastModifiedTime() {
    return lastModifiedTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastModifiedTime(@javax.annotation.Nullable OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }


  public Task parentId(@javax.annotation.Nullable String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getParentId() {
    return parentId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentId(@javax.annotation.Nullable String parentId) {
    this.parentId = parentId;
  }


  public Task position(@javax.annotation.Nullable String position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPosition() {
    return position;
  }


  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPosition(@javax.annotation.Nullable String position) {
    this.position = position;
  }


  public Task notes(@javax.annotation.Nullable String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNotes() {
    return notes;
  }


  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotes(@javax.annotation.Nullable String notes) {
    this.notes = notes;
  }


  public Task status(@javax.annotation.Nullable TaskStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TaskStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@javax.annotation.Nullable TaskStatus status) {
    this.status = status;
  }


  public Task importance(@javax.annotation.Nullable TaskImportance importance) {
    this.importance = importance;
    return this;
  }

  /**
   * Get importance
   * @return importance
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMPORTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TaskImportance getImportance() {
    return importance;
  }


  @JsonProperty(JSON_PROPERTY_IMPORTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImportance(@javax.annotation.Nullable TaskImportance importance) {
    this.importance = importance;
  }


  public Task due(@javax.annotation.Nullable OffsetDateTime due) {
    this.due = due;
    return this;
  }

  /**
   * Get due
   * @return due
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getDue() {
    return due;
  }


  @JsonProperty(JSON_PROPERTY_DUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDue(@javax.annotation.Nullable OffsetDateTime due) {
    this.due = due;
  }


  public Task completed(@javax.annotation.Nullable OffsetDateTime completed) {
    this.completed = completed;
    return this;
  }

  /**
   * Get completed
   * @return completed
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCompleted() {
    return completed;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompleted(@javax.annotation.Nullable OffsetDateTime completed) {
    this.completed = completed;
  }


  public Task links(@javax.annotation.Nullable List<TaskLink> links) {
    this.links = links;
    return this;
  }

  public Task addLinksItem(TaskLink linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TaskLink> getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(@javax.annotation.Nullable List<TaskLink> links) {
    this.links = links;
  }


  public Task startDateTime(@javax.annotation.Nullable OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * Get startDateTime
   * @return startDateTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDateTime(@javax.annotation.Nullable OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }


  public Task categories(@javax.annotation.Nullable List<String> categories) {
    this.categories = categories;
    return this;
  }

  public Task addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(@javax.annotation.Nullable List<String> categories) {
    this.categories = categories;
  }


  public Task owner(@javax.annotation.Nullable String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOwner() {
    return owner;
  }


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwner(@javax.annotation.Nullable String owner) {
    this.owner = owner;
  }


  /**
   * Get omitted
   * @return omitted
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OMITTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<OmittedEnum> getOmitted() {
    return omitted;
  }




  /**
   * Return true if this Task object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.id, task.id) &&
        Objects.equals(this.etag, task.etag) &&
        Objects.equals(this.title, task.title) &&
        Objects.equals(this.lastModifiedTime, task.lastModifiedTime) &&
        Objects.equals(this.parentId, task.parentId) &&
        Objects.equals(this.position, task.position) &&
        Objects.equals(this.notes, task.notes) &&
        Objects.equals(this.status, task.status) &&
        Objects.equals(this.importance, task.importance) &&
        Objects.equals(this.due, task.due) &&
        Objects.equals(this.completed, task.completed) &&
        Objects.equals(this.links, task.links) &&
        Objects.equals(this.startDateTime, task.startDateTime) &&
        Objects.equals(this.categories, task.categories) &&
        Objects.equals(this.owner, task.owner) &&
        Objects.equals(this.omitted, task.omitted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, etag, title, lastModifiedTime, parentId, position, notes, status, importance, due, completed, links, startDateTime, categories, owner, omitted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    importance: ").append(toIndentedString(importance)).append("\n");
    sb.append("    due: ").append(toIndentedString(due)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    omitted: ").append(toIndentedString(omitted)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getId()))));
    }

    // add `etag` to the URL query string
    if (getEtag() != null) {
      joiner.add(String.format("%setag%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEtag()))));
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format("%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `lastModifiedTime` to the URL query string
    if (getLastModifiedTime() != null) {
      joiner.add(String.format("%slastModifiedTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLastModifiedTime()))));
    }

    // add `parentId` to the URL query string
    if (getParentId() != null) {
      joiner.add(String.format("%sparentId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getParentId()))));
    }

    // add `position` to the URL query string
    if (getPosition() != null) {
      joiner.add(String.format("%sposition%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPosition()))));
    }

    // add `notes` to the URL query string
    if (getNotes() != null) {
      joiner.add(String.format("%snotes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNotes()))));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    // add `importance` to the URL query string
    if (getImportance() != null) {
      joiner.add(String.format("%simportance%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getImportance()))));
    }

    // add `due` to the URL query string
    if (getDue() != null) {
      joiner.add(String.format("%sdue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDue()))));
    }

    // add `completed` to the URL query string
    if (getCompleted() != null) {
      joiner.add(String.format("%scompleted%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCompleted()))));
    }

    // add `links` to the URL query string
    if (getLinks() != null) {
      for (int i = 0; i < getLinks().size(); i++) {
        if (getLinks().get(i) != null) {
          joiner.add(getLinks().get(i).toUrlQueryString(String.format("%slinks%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `startDateTime` to the URL query string
    if (getStartDateTime() != null) {
      joiner.add(String.format("%sstartDateTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStartDateTime()))));
    }

    // add `categories` to the URL query string
    if (getCategories() != null) {
      for (int i = 0; i < getCategories().size(); i++) {
        joiner.add(String.format("%scategories%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getCategories().get(i)))));
      }
    }

    // add `owner` to the URL query string
    if (getOwner() != null) {
      joiner.add(String.format("%sowner%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOwner()))));
    }

    // add `omitted` to the URL query string
    if (getOmitted() != null) {
      for (int i = 0; i < getOmitted().size(); i++) {
        joiner.add(String.format("%somitted%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getOmitted().get(i)))));
      }
    }

    return joiner.toString();
  }
}


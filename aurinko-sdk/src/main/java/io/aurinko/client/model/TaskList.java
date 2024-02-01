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
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TaskList
 */
@JsonPropertyOrder({
  TaskList.JSON_PROPERTY_ID,
  TaskList.JSON_PROPERTY_ETAG,
  TaskList.JSON_PROPERTY_TITLE,
  TaskList.JSON_PROPERTY_OWNER,
  TaskList.JSON_PROPERTY_SHARED,
  TaskList.JSON_PROPERTY_DEFAULT_LIST,
  TaskList.JSON_PROPERTY_EMAILS_LIST,
  TaskList.JSON_PROPERTY_LAST_MODIFIED_TIME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-01T09:20:22.278375Z[Africa/Bamako]")
public class TaskList {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ETAG = "etag";
  private String etag;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private Boolean owner;

  public static final String JSON_PROPERTY_SHARED = "shared";
  private Boolean shared;

  public static final String JSON_PROPERTY_DEFAULT_LIST = "defaultList";
  private Boolean defaultList;

  public static final String JSON_PROPERTY_EMAILS_LIST = "emailsList";
  private Boolean emailsList;

  public static final String JSON_PROPERTY_LAST_MODIFIED_TIME = "lastModifiedTime";
  private OffsetDateTime lastModifiedTime;

  public TaskList() { 
  }

  public TaskList id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public TaskList etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * Get etag
   * @return etag
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ETAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEtag() {
    return etag;
  }


  @JsonProperty(JSON_PROPERTY_ETAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEtag(String etag) {
    this.etag = etag;
  }


  public TaskList title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public TaskList owner(Boolean owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOwner() {
    return owner;
  }


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwner(Boolean owner) {
    this.owner = owner;
  }


  public TaskList shared(Boolean shared) {
    this.shared = shared;
    return this;
  }

   /**
   * Get shared
   * @return shared
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShared() {
    return shared;
  }


  @JsonProperty(JSON_PROPERTY_SHARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShared(Boolean shared) {
    this.shared = shared;
  }


  public TaskList defaultList(Boolean defaultList) {
    this.defaultList = defaultList;
    return this;
  }

   /**
   * Get defaultList
   * @return defaultList
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefaultList() {
    return defaultList;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultList(Boolean defaultList) {
    this.defaultList = defaultList;
  }


  public TaskList emailsList(Boolean emailsList) {
    this.emailsList = emailsList;
    return this;
  }

   /**
   * Get emailsList
   * @return emailsList
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAILS_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEmailsList() {
    return emailsList;
  }


  @JsonProperty(JSON_PROPERTY_EMAILS_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailsList(Boolean emailsList) {
    this.emailsList = emailsList;
  }


  public TaskList lastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

   /**
   * Get lastModifiedTime
   * @return lastModifiedTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModifiedTime() {
    return lastModifiedTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }


  /**
   * Return true if this TaskList object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskList taskList = (TaskList) o;
    return Objects.equals(this.id, taskList.id) &&
        Objects.equals(this.etag, taskList.etag) &&
        Objects.equals(this.title, taskList.title) &&
        Objects.equals(this.owner, taskList.owner) &&
        Objects.equals(this.shared, taskList.shared) &&
        Objects.equals(this.defaultList, taskList.defaultList) &&
        Objects.equals(this.emailsList, taskList.emailsList) &&
        Objects.equals(this.lastModifiedTime, taskList.lastModifiedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, etag, title, owner, shared, defaultList, emailsList, lastModifiedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskList {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    defaultList: ").append(toIndentedString(defaultList)).append("\n");
    sb.append("    emailsList: ").append(toIndentedString(emailsList)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
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
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `etag` to the URL query string
    if (getEtag() != null) {
      joiner.add(String.format("%setag%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEtag()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `owner` to the URL query string
    if (getOwner() != null) {
      joiner.add(String.format("%sowner%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOwner()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `shared` to the URL query string
    if (getShared() != null) {
      joiner.add(String.format("%sshared%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShared()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `defaultList` to the URL query string
    if (getDefaultList() != null) {
      joiner.add(String.format("%sdefaultList%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDefaultList()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `emailsList` to the URL query string
    if (getEmailsList() != null) {
      joiner.add(String.format("%semailsList%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmailsList()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `lastModifiedTime` to the URL query string
    if (getLastModifiedTime() != null) {
      joiner.add(String.format("%slastModifiedTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastModifiedTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


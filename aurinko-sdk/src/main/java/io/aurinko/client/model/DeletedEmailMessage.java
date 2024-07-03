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


import io.aurinko.client.ApiClient;
/**
 * DeletedEmailMessage
 */
@JsonPropertyOrder({
  DeletedEmailMessage.JSON_PROPERTY_ID,
  DeletedEmailMessage.JSON_PROPERTY_FOLDER_ID,
  DeletedEmailMessage.JSON_PROPERTY_INTERNET_MESSAGE_ID,
  DeletedEmailMessage.JSON_PROPERTY_TIMESTAMP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class DeletedEmailMessage {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_FOLDER_ID = "folderId";
  private String folderId;

  public static final String JSON_PROPERTY_INTERNET_MESSAGE_ID = "internetMessageId";
  private String internetMessageId;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public DeletedEmailMessage() { 
  }

  @JsonCreator
  public DeletedEmailMessage(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_FOLDER_ID) String folderId, 
    @JsonProperty(JSON_PROPERTY_INTERNET_MESSAGE_ID) String internetMessageId
  ) {
  this();
    this.id = id;
    this.folderId = folderId;
    this.internetMessageId = internetMessageId;
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




  /**
   * Get folderId
   * @return folderId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFolderId() {
    return folderId;
  }




  /**
   * Get internetMessageId
   * @return internetMessageId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERNET_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInternetMessageId() {
    return internetMessageId;
  }




  public DeletedEmailMessage timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  /**
   * Return true if this DeletedEmailMessage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletedEmailMessage deletedEmailMessage = (DeletedEmailMessage) o;
    return Objects.equals(this.id, deletedEmailMessage.id) &&
        Objects.equals(this.folderId, deletedEmailMessage.folderId) &&
        Objects.equals(this.internetMessageId, deletedEmailMessage.internetMessageId) &&
        Objects.equals(this.timestamp, deletedEmailMessage.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, folderId, internetMessageId, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletedEmailMessage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    internetMessageId: ").append(toIndentedString(internetMessageId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `folderId` to the URL query string
    if (getFolderId() != null) {
      joiner.add(String.format("%sfolderId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFolderId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `internetMessageId` to the URL query string
    if (getInternetMessageId() != null) {
      joiner.add(String.format("%sinternetMessageId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getInternetMessageId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `timestamp` to the URL query string
    if (getTimestamp() != null) {
      joiner.add(String.format("%stimestamp%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTimestamp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


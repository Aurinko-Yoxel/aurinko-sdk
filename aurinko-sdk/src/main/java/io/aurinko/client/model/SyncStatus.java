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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SyncStatus
 */
@JsonPropertyOrder({
  SyncStatus.JSON_PROPERTY_SYNC_UPDATED_TOKEN,
  SyncStatus.JSON_PROPERTY_SYNC_DELETED_TOKEN,
  SyncStatus.JSON_PROPERTY_READY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class SyncStatus {
  public static final String JSON_PROPERTY_SYNC_UPDATED_TOKEN = "syncUpdatedToken";
  private String syncUpdatedToken;

  public static final String JSON_PROPERTY_SYNC_DELETED_TOKEN = "syncDeletedToken";
  private String syncDeletedToken;

  public static final String JSON_PROPERTY_READY = "ready";
  private Boolean ready;

  public SyncStatus() { 
  }

  public SyncStatus syncUpdatedToken(String syncUpdatedToken) {
    this.syncUpdatedToken = syncUpdatedToken;
    return this;
  }

   /**
   * Get syncUpdatedToken
   * @return syncUpdatedToken
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNC_UPDATED_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSyncUpdatedToken() {
    return syncUpdatedToken;
  }


  @JsonProperty(JSON_PROPERTY_SYNC_UPDATED_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSyncUpdatedToken(String syncUpdatedToken) {
    this.syncUpdatedToken = syncUpdatedToken;
  }


  public SyncStatus syncDeletedToken(String syncDeletedToken) {
    this.syncDeletedToken = syncDeletedToken;
    return this;
  }

   /**
   * Get syncDeletedToken
   * @return syncDeletedToken
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNC_DELETED_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSyncDeletedToken() {
    return syncDeletedToken;
  }


  @JsonProperty(JSON_PROPERTY_SYNC_DELETED_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSyncDeletedToken(String syncDeletedToken) {
    this.syncDeletedToken = syncDeletedToken;
  }


  public SyncStatus ready(Boolean ready) {
    this.ready = ready;
    return this;
  }

   /**
   * Get ready
   * @return ready
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_READY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReady() {
    return ready;
  }


  @JsonProperty(JSON_PROPERTY_READY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReady(Boolean ready) {
    this.ready = ready;
  }


  /**
   * Return true if this SyncStatus object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncStatus syncStatus = (SyncStatus) o;
    return Objects.equals(this.syncUpdatedToken, syncStatus.syncUpdatedToken) &&
        Objects.equals(this.syncDeletedToken, syncStatus.syncDeletedToken) &&
        Objects.equals(this.ready, syncStatus.ready);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncUpdatedToken, syncDeletedToken, ready);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncStatus {\n");
    sb.append("    syncUpdatedToken: ").append(toIndentedString(syncUpdatedToken)).append("\n");
    sb.append("    syncDeletedToken: ").append(toIndentedString(syncDeletedToken)).append("\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
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

    // add `syncUpdatedToken` to the URL query string
    if (getSyncUpdatedToken() != null) {
      joiner.add(String.format("%ssyncUpdatedToken%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSyncUpdatedToken()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `syncDeletedToken` to the URL query string
    if (getSyncDeletedToken() != null) {
      joiner.add(String.format("%ssyncDeletedToken%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSyncDeletedToken()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ready` to the URL query string
    if (getReady() != null) {
      joiner.add(String.format("%sready%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReady()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


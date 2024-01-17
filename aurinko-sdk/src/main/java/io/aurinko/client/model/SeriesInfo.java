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
import io.aurinko.client.model.OccurrenceInfo;
import io.aurinko.client.model.Recurrence;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SeriesInfo
 */
@JsonPropertyOrder({
  SeriesInfo.JSON_PROPERTY_ID,
  SeriesInfo.JSON_PROPERTY_GLOBAL_ID,
  SeriesInfo.JSON_PROPERTY_RECURRENCE,
  SeriesInfo.JSON_PROPERTY_MODIFIED_OCCURRENCES,
  SeriesInfo.JSON_PROPERTY_DELETED_OCCURRENCES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T11:18:51.511282Z[Africa/Bamako]")
public class SeriesInfo {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_GLOBAL_ID = "globalId";
  private String globalId;

  public static final String JSON_PROPERTY_RECURRENCE = "recurrence";
  private Recurrence recurrence;

  public static final String JSON_PROPERTY_MODIFIED_OCCURRENCES = "modifiedOccurrences";
  private List<OccurrenceInfo> modifiedOccurrences;

  public static final String JSON_PROPERTY_DELETED_OCCURRENCES = "deletedOccurrences";
  private List<OccurrenceInfo> deletedOccurrences;

  public SeriesInfo() { 
  }

  @JsonCreator
  public SeriesInfo(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_GLOBAL_ID) String globalId, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_OCCURRENCES) List<OccurrenceInfo> modifiedOccurrences, 
    @JsonProperty(JSON_PROPERTY_DELETED_OCCURRENCES) List<OccurrenceInfo> deletedOccurrences
  ) {
  this();
    this.id = id;
    this.globalId = globalId;
    this.modifiedOccurrences = modifiedOccurrences;
    this.deletedOccurrences = deletedOccurrences;
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




   /**
   * Get globalId
   * @return globalId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGlobalId() {
    return globalId;
  }




  public SeriesInfo recurrence(Recurrence recurrence) {
    this.recurrence = recurrence;
    return this;
  }

   /**
   * Get recurrence
   * @return recurrence
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECURRENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Recurrence getRecurrence() {
    return recurrence;
  }


  @JsonProperty(JSON_PROPERTY_RECURRENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurrence(Recurrence recurrence) {
    this.recurrence = recurrence;
  }


   /**
   * Get modifiedOccurrences
   * @return modifiedOccurrences
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_OCCURRENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OccurrenceInfo> getModifiedOccurrences() {
    return modifiedOccurrences;
  }




   /**
   * Get deletedOccurrences
   * @return deletedOccurrences
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED_OCCURRENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OccurrenceInfo> getDeletedOccurrences() {
    return deletedOccurrences;
  }




  /**
   * Return true if this SeriesInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeriesInfo seriesInfo = (SeriesInfo) o;
    return Objects.equals(this.id, seriesInfo.id) &&
        Objects.equals(this.globalId, seriesInfo.globalId) &&
        Objects.equals(this.recurrence, seriesInfo.recurrence) &&
        Objects.equals(this.modifiedOccurrences, seriesInfo.modifiedOccurrences) &&
        Objects.equals(this.deletedOccurrences, seriesInfo.deletedOccurrences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, globalId, recurrence, modifiedOccurrences, deletedOccurrences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeriesInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
    sb.append("    modifiedOccurrences: ").append(toIndentedString(modifiedOccurrences)).append("\n");
    sb.append("    deletedOccurrences: ").append(toIndentedString(deletedOccurrences)).append("\n");
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

    // add `globalId` to the URL query string
    if (getGlobalId() != null) {
      joiner.add(String.format("%sglobalId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGlobalId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `recurrence` to the URL query string
    if (getRecurrence() != null) {
      joiner.add(getRecurrence().toUrlQueryString(prefix + "recurrence" + suffix));
    }

    // add `modifiedOccurrences` to the URL query string
    if (getModifiedOccurrences() != null) {
      for (int i = 0; i < getModifiedOccurrences().size(); i++) {
        if (getModifiedOccurrences().get(i) != null) {
          joiner.add(getModifiedOccurrences().get(i).toUrlQueryString(String.format("%smodifiedOccurrences%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `deletedOccurrences` to the URL query string
    if (getDeletedOccurrences() != null) {
      for (int i = 0; i < getDeletedOccurrences().size(); i++) {
        if (getDeletedOccurrences().get(i) != null) {
          joiner.add(getDeletedOccurrences().get(i).toUrlQueryString(String.format("%sdeletedOccurrences%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}


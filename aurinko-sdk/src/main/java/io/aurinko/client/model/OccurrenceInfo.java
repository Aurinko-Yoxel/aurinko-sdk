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
import io.aurinko.client.model.EventDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OccurrenceInfo
 */
@JsonPropertyOrder({
  OccurrenceInfo.JSON_PROPERTY_ID,
  OccurrenceInfo.JSON_PROPERTY_TYPE,
  OccurrenceInfo.JSON_PROPERTY_ORIGINAL_START,
  OccurrenceInfo.JSON_PROPERTY_START,
  OccurrenceInfo.JSON_PROPERTY_MASTER_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-08T10:31:33.594723Z[Africa/Bamako]")
public class OccurrenceInfo {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    REGULAR("regular"),
    
    MODIFIED("modified"),
    
    DELETED("deleted");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_ORIGINAL_START = "originalStart";
  private EventDateTime originalStart;

  public static final String JSON_PROPERTY_START = "start";
  private EventDateTime start;

  public static final String JSON_PROPERTY_MASTER_ID = "masterId";
  private String masterId;

  public OccurrenceInfo() { 
  }

  public OccurrenceInfo id(String id) {
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


  public OccurrenceInfo type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public OccurrenceInfo originalStart(EventDateTime originalStart) {
    this.originalStart = originalStart;
    return this;
  }

   /**
   * Get originalStart
   * @return originalStart
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGINAL_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventDateTime getOriginalStart() {
    return originalStart;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalStart(EventDateTime originalStart) {
    this.originalStart = originalStart;
  }


  public OccurrenceInfo start(EventDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventDateTime getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(EventDateTime start) {
    this.start = start;
  }


  public OccurrenceInfo masterId(String masterId) {
    this.masterId = masterId;
    return this;
  }

   /**
   * Get masterId
   * @return masterId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MASTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMasterId() {
    return masterId;
  }


  @JsonProperty(JSON_PROPERTY_MASTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMasterId(String masterId) {
    this.masterId = masterId;
  }


  /**
   * Return true if this OccurrenceInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OccurrenceInfo occurrenceInfo = (OccurrenceInfo) o;
    return Objects.equals(this.id, occurrenceInfo.id) &&
        Objects.equals(this.type, occurrenceInfo.type) &&
        Objects.equals(this.originalStart, occurrenceInfo.originalStart) &&
        Objects.equals(this.start, occurrenceInfo.start) &&
        Objects.equals(this.masterId, occurrenceInfo.masterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, originalStart, start, masterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OccurrenceInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    originalStart: ").append(toIndentedString(originalStart)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    masterId: ").append(toIndentedString(masterId)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `originalStart` to the URL query string
    if (getOriginalStart() != null) {
      joiner.add(getOriginalStart().toUrlQueryString(prefix + "originalStart" + suffix));
    }

    // add `start` to the URL query string
    if (getStart() != null) {
      joiner.add(getStart().toUrlQueryString(prefix + "start" + suffix));
    }

    // add `masterId` to the URL query string
    if (getMasterId() != null) {
      joiner.add(String.format("%smasterId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMasterId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


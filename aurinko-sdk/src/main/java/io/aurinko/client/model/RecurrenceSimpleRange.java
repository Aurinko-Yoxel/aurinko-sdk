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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RecurrenceSimpleRange
 */
@JsonPropertyOrder({
  RecurrenceSimpleRange.JSON_PROPERTY_TYPE,
  RecurrenceSimpleRange.JSON_PROPERTY_RECURRENCE_START,
  RecurrenceSimpleRange.JSON_PROPERTY_RECURRENCE_END,
  RecurrenceSimpleRange.JSON_PROPERTY_COUNT,
  RecurrenceSimpleRange.JSON_PROPERTY_PATTERN_EXCLUSIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-15T08:54:57.780675Z[Africa/Bamako]")
public class RecurrenceSimpleRange {
  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    BYDATE("byDate"),
    
    BYCOUNT("byCount"),
    
    UNBOUNDED("unbounded");

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

  public static final String JSON_PROPERTY_RECURRENCE_START = "recurrenceStart";
  private EventDateTime recurrenceStart;

  public static final String JSON_PROPERTY_RECURRENCE_END = "recurrenceEnd";
  private LocalDate recurrenceEnd;

  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public static final String JSON_PROPERTY_PATTERN_EXCLUSIONS = "patternExclusions";
  private List<EventDateTime> patternExclusions;

  public RecurrenceSimpleRange() { 
  }

  @JsonCreator
  public RecurrenceSimpleRange(
    @JsonProperty(JSON_PROPERTY_PATTERN_EXCLUSIONS) List<EventDateTime> patternExclusions
  ) {
  this();
    this.patternExclusions = patternExclusions;
  }

  public RecurrenceSimpleRange type(TypeEnum type) {
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


  public RecurrenceSimpleRange recurrenceStart(EventDateTime recurrenceStart) {
    this.recurrenceStart = recurrenceStart;
    return this;
  }

   /**
   * Get recurrenceStart
   * @return recurrenceStart
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECURRENCE_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventDateTime getRecurrenceStart() {
    return recurrenceStart;
  }


  @JsonProperty(JSON_PROPERTY_RECURRENCE_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurrenceStart(EventDateTime recurrenceStart) {
    this.recurrenceStart = recurrenceStart;
  }


  public RecurrenceSimpleRange recurrenceEnd(LocalDate recurrenceEnd) {
    this.recurrenceEnd = recurrenceEnd;
    return this;
  }

   /**
   * Get recurrenceEnd
   * @return recurrenceEnd
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECURRENCE_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getRecurrenceEnd() {
    return recurrenceEnd;
  }


  @JsonProperty(JSON_PROPERTY_RECURRENCE_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurrenceEnd(LocalDate recurrenceEnd) {
    this.recurrenceEnd = recurrenceEnd;
  }


  public RecurrenceSimpleRange count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * minimum: 1
   * @return count
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(Integer count) {
    this.count = count;
  }


   /**
   * Get patternExclusions
   * @return patternExclusions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATTERN_EXCLUSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EventDateTime> getPatternExclusions() {
    return patternExclusions;
  }




  /**
   * Return true if this Recurrence_simple_range object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurrenceSimpleRange recurrenceSimpleRange = (RecurrenceSimpleRange) o;
    return Objects.equals(this.type, recurrenceSimpleRange.type) &&
        Objects.equals(this.recurrenceStart, recurrenceSimpleRange.recurrenceStart) &&
        Objects.equals(this.recurrenceEnd, recurrenceSimpleRange.recurrenceEnd) &&
        Objects.equals(this.count, recurrenceSimpleRange.count) &&
        Objects.equals(this.patternExclusions, recurrenceSimpleRange.patternExclusions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, recurrenceStart, recurrenceEnd, count, patternExclusions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurrenceSimpleRange {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    recurrenceStart: ").append(toIndentedString(recurrenceStart)).append("\n");
    sb.append("    recurrenceEnd: ").append(toIndentedString(recurrenceEnd)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    patternExclusions: ").append(toIndentedString(patternExclusions)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `recurrenceStart` to the URL query string
    if (getRecurrenceStart() != null) {
      joiner.add(getRecurrenceStart().toUrlQueryString(prefix + "recurrenceStart" + suffix));
    }

    // add `recurrenceEnd` to the URL query string
    if (getRecurrenceEnd() != null) {
      joiner.add(String.format("%srecurrenceEnd%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecurrenceEnd()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `count` to the URL query string
    if (getCount() != null) {
      joiner.add(String.format("%scount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `patternExclusions` to the URL query string
    if (getPatternExclusions() != null) {
      for (int i = 0; i < getPatternExclusions().size(); i++) {
        if (getPatternExclusions().get(i) != null) {
          joiner.add(getPatternExclusions().get(i).toUrlQueryString(String.format("%spatternExclusions%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}


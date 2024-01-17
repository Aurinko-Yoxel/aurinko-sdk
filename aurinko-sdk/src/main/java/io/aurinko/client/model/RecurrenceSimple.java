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
import io.aurinko.client.model.RecurrenceSimplePattern;
import io.aurinko.client.model.RecurrenceSimpleRange;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RecurrenceSimple
 */
@JsonPropertyOrder({
  RecurrenceSimple.JSON_PROPERTY_PATTERN,
  RecurrenceSimple.JSON_PROPERTY_RANGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-09T14:13:35.152987Z[Africa/Bamako]")
public class RecurrenceSimple {
  public static final String JSON_PROPERTY_PATTERN = "pattern";
  private RecurrenceSimplePattern pattern;

  public static final String JSON_PROPERTY_RANGE = "range";
  private RecurrenceSimpleRange range;

  public RecurrenceSimple() { 
  }

  public RecurrenceSimple pattern(RecurrenceSimplePattern pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * Get pattern
   * @return pattern
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecurrenceSimplePattern getPattern() {
    return pattern;
  }


  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPattern(RecurrenceSimplePattern pattern) {
    this.pattern = pattern;
  }


  public RecurrenceSimple range(RecurrenceSimpleRange range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecurrenceSimpleRange getRange() {
    return range;
  }


  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange(RecurrenceSimpleRange range) {
    this.range = range;
  }


  /**
   * Return true if this Recurrence_simple object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurrenceSimple recurrenceSimple = (RecurrenceSimple) o;
    return Objects.equals(this.pattern, recurrenceSimple.pattern) &&
        Objects.equals(this.range, recurrenceSimple.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pattern, range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurrenceSimple {\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

    // add `pattern` to the URL query string
    if (getPattern() != null) {
      joiner.add(getPattern().toUrlQueryString(prefix + "pattern" + suffix));
    }

    // add `range` to the URL query string
    if (getRange() != null) {
      joiner.add(getRange().toUrlQueryString(prefix + "range" + suffix));
    }

    return joiner.toString();
  }
}


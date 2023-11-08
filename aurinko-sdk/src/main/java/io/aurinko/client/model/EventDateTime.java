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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EventDateTime
 */
@JsonPropertyOrder({
  EventDateTime.JSON_PROPERTY_DATE_ONLY,
  EventDateTime.JSON_PROPERTY_DATE_TIME,
  EventDateTime.JSON_PROPERTY_TIMEZONE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-08T10:31:33.594723Z[Africa/Bamako]")
public class EventDateTime {
  public static final String JSON_PROPERTY_DATE_ONLY = "dateOnly";
  private LocalDate dateOnly;

  public static final String JSON_PROPERTY_DATE_TIME = "dateTime";
  private OffsetDateTime dateTime;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public EventDateTime() { 
  }

  public EventDateTime dateOnly(LocalDate dateOnly) {
    this.dateOnly = dateOnly;
    return this;
  }

   /**
   * Get dateOnly
   * @return dateOnly
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDateOnly() {
    return dateOnly;
  }


  @JsonProperty(JSON_PROPERTY_DATE_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateOnly(LocalDate dateOnly) {
    this.dateOnly = dateOnly;
  }


  public EventDateTime dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * Get dateTime
   * @return dateTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateTime() {
    return dateTime;
  }


  @JsonProperty(JSON_PROPERTY_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }


  public EventDateTime timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  /**
   * Return true if this EventDateTime object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDateTime eventDateTime = (EventDateTime) o;
    return Objects.equals(this.dateOnly, eventDateTime.dateOnly) &&
        Objects.equals(this.dateTime, eventDateTime.dateTime) &&
        Objects.equals(this.timezone, eventDateTime.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOnly, dateTime, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDateTime {\n");
    sb.append("    dateOnly: ").append(toIndentedString(dateOnly)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

    // add `dateOnly` to the URL query string
    if (getDateOnly() != null) {
      joiner.add(String.format("%sdateOnly%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDateOnly()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dateTime` to the URL query string
    if (getDateTime() != null) {
      joiner.add(String.format("%sdateTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDateTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `timezone` to the URL query string
    if (getTimezone() != null) {
      joiner.add(String.format("%stimezone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimezone()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


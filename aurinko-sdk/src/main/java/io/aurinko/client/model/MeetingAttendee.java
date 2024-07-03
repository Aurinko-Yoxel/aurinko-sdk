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
import io.aurinko.client.model.TimeInterval;
import io.aurinko.client.model.WeekWorkSchedule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MeetingAttendee
 */
@JsonPropertyOrder({
  MeetingAttendee.JSON_PROPERTY_EMAIL,
  MeetingAttendee.JSON_PROPERTY_TIMEZONE,
  MeetingAttendee.JSON_PROPERTY_WORK_HOURS,
  MeetingAttendee.JSON_PROPERTY_ERROR,
  MeetingAttendee.JSON_PROPERTY_BUSY_INTERVALS,
  MeetingAttendee.JSON_PROPERTY_FREE_INTERVALS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class MeetingAttendee {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_WORK_HOURS = "workHours";
  private WeekWorkSchedule workHours;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_BUSY_INTERVALS = "busyIntervals";
  private List<TimeInterval> busyIntervals = new ArrayList<>();

  public static final String JSON_PROPERTY_FREE_INTERVALS = "freeIntervals";
  private List<TimeInterval> freeIntervals = new ArrayList<>();

  public MeetingAttendee() { 
  }

  @JsonCreator
  public MeetingAttendee(
    @JsonProperty(JSON_PROPERTY_ERROR) String error
  ) {
  this();
    this.error = error;
  }

  public MeetingAttendee email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public MeetingAttendee timezone(String timezone) {
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


  public MeetingAttendee workHours(WeekWorkSchedule workHours) {
    this.workHours = workHours;
    return this;
  }

   /**
   * Get workHours
   * @return workHours
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORK_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WeekWorkSchedule getWorkHours() {
    return workHours;
  }


  @JsonProperty(JSON_PROPERTY_WORK_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkHours(WeekWorkSchedule workHours) {
    this.workHours = workHours;
  }


   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getError() {
    return error;
  }




  public MeetingAttendee busyIntervals(List<TimeInterval> busyIntervals) {
    this.busyIntervals = busyIntervals;
    return this;
  }

  public MeetingAttendee addBusyIntervalsItem(TimeInterval busyIntervalsItem) {
    if (this.busyIntervals == null) {
      this.busyIntervals = new ArrayList<>();
    }
    this.busyIntervals.add(busyIntervalsItem);
    return this;
  }

   /**
   * Busy intervals for the attendee. If set, these intervals will be excluded when searching for available meeting times. Can be combined with &#x60;freeIntervals&#x60;.
   * @return busyIntervals
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSY_INTERVALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TimeInterval> getBusyIntervals() {
    return busyIntervals;
  }


  @JsonProperty(JSON_PROPERTY_BUSY_INTERVALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusyIntervals(List<TimeInterval> busyIntervals) {
    this.busyIntervals = busyIntervals;
  }


  public MeetingAttendee freeIntervals(List<TimeInterval> freeIntervals) {
    this.freeIntervals = freeIntervals;
    return this;
  }

  public MeetingAttendee addFreeIntervalsItem(TimeInterval freeIntervalsItem) {
    if (this.freeIntervals == null) {
      this.freeIntervals = new ArrayList<>();
    }
    this.freeIntervals.add(freeIntervalsItem);
    return this;
  }

   /**
   * Free time intervals for the attendee. If set, this parameter will limit the search for available meeting times. Can be combined with &#x60;busyIntervals&#x60;.
   * @return freeIntervals
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FREE_INTERVALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TimeInterval> getFreeIntervals() {
    return freeIntervals;
  }


  @JsonProperty(JSON_PROPERTY_FREE_INTERVALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFreeIntervals(List<TimeInterval> freeIntervals) {
    this.freeIntervals = freeIntervals;
  }


  /**
   * Return true if this MeetingAttendee object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeetingAttendee meetingAttendee = (MeetingAttendee) o;
    return Objects.equals(this.email, meetingAttendee.email) &&
        Objects.equals(this.timezone, meetingAttendee.timezone) &&
        Objects.equals(this.workHours, meetingAttendee.workHours) &&
        Objects.equals(this.error, meetingAttendee.error) &&
        Objects.equals(this.busyIntervals, meetingAttendee.busyIntervals) &&
        Objects.equals(this.freeIntervals, meetingAttendee.freeIntervals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, timezone, workHours, error, busyIntervals, freeIntervals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeetingAttendee {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    workHours: ").append(toIndentedString(workHours)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    busyIntervals: ").append(toIndentedString(busyIntervals)).append("\n");
    sb.append("    freeIntervals: ").append(toIndentedString(freeIntervals)).append("\n");
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

    // add `email` to the URL query string
    if (getEmail() != null) {
      joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `timezone` to the URL query string
    if (getTimezone() != null) {
      joiner.add(String.format("%stimezone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimezone()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `workHours` to the URL query string
    if (getWorkHours() != null) {
      joiner.add(getWorkHours().toUrlQueryString(prefix + "workHours" + suffix));
    }

    // add `error` to the URL query string
    if (getError() != null) {
      joiner.add(String.format("%serror%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getError()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `busyIntervals` to the URL query string
    if (getBusyIntervals() != null) {
      for (int i = 0; i < getBusyIntervals().size(); i++) {
        if (getBusyIntervals().get(i) != null) {
          joiner.add(getBusyIntervals().get(i).toUrlQueryString(String.format("%sbusyIntervals%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `freeIntervals` to the URL query string
    if (getFreeIntervals() != null) {
      for (int i = 0; i < getFreeIntervals().size(); i++) {
        if (getFreeIntervals().get(i) != null) {
          joiner.add(getFreeIntervals().get(i).toUrlQueryString(String.format("%sfreeIntervals%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}


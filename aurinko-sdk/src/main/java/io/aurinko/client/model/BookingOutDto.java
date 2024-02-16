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
import io.aurinko.client.model.WeekWorkSchedule;
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BookingOutDto
 */
@JsonPropertyOrder({
  BookingOutDto.JSON_PROPERTY_ID,
  BookingOutDto.JSON_PROPERTY_NAME,
  BookingOutDto.JSON_PROPERTY_DURATION_MINUTES,
  BookingOutDto.JSON_PROPERTY_AVAILABILITY_STEP,
  BookingOutDto.JSON_PROPERTY_START_TIME,
  BookingOutDto.JSON_PROPERTY_TIME_AVAILABLE_FOR,
  BookingOutDto.JSON_PROPERTY_SUBJECT,
  BookingOutDto.JSON_PROPERTY_DESCRIPTION,
  BookingOutDto.JSON_PROPERTY_LOCATION,
  BookingOutDto.JSON_PROPERTY_WORK_HOURS,
  BookingOutDto.JSON_PROPERTY_CONTEXT,
  BookingOutDto.JSON_PROPERTY_START_CONFERENCE,
  BookingOutDto.JSON_PROPERTY_OPEN_MEETING_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BookingOutDto {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DURATION_MINUTES = "durationMinutes";
  private Integer durationMinutes;

  public static final String JSON_PROPERTY_AVAILABILITY_STEP = "availabilityStep";
  private Integer availabilityStep;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private OffsetDateTime startTime;

  public static final String JSON_PROPERTY_TIME_AVAILABLE_FOR = "timeAvailableFor";
  private String timeAvailableFor;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_WORK_HOURS = "workHours";
  private WeekWorkSchedule workHours;

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private String context;

  public static final String JSON_PROPERTY_START_CONFERENCE = "startConference";
  private Boolean startConference;

  public static final String JSON_PROPERTY_OPEN_MEETING_URL = "openMeetingUrl";
  private String openMeetingUrl;

  public BookingOutDto() { 
  }

  public BookingOutDto id(Long id) {
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

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Long id) {
    this.id = id;
  }


  public BookingOutDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Profile name used in calendar links to identify a profile.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public BookingOutDto durationMinutes(Integer durationMinutes) {
    this.durationMinutes = durationMinutes;
    return this;
  }

   /**
   * Duration of the meeting in minutes.
   * @return durationMinutes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDurationMinutes() {
    return durationMinutes;
  }


  @JsonProperty(JSON_PROPERTY_DURATION_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDurationMinutes(Integer durationMinutes) {
    this.durationMinutes = durationMinutes;
  }


  public BookingOutDto availabilityStep(Integer availabilityStep) {
    this.availabilityStep = availabilityStep;
    return this;
  }

   /**
   * Determines the interval at which new meeting slots are made available throughout the working hours.
   * @return availabilityStep
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAvailabilityStep() {
    return availabilityStep;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityStep(Integer availabilityStep) {
    this.availabilityStep = availabilityStep;
  }


  public BookingOutDto startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The beginning of the formation of intervals. Must be in the future, otherwise the current time will be used.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public BookingOutDto timeAvailableFor(String timeAvailableFor) {
    this.timeAvailableFor = timeAvailableFor;
    return this;
  }

   /**
   * Time period (in ISO-8601 format) the profile is covering. For example, P3M (3 months), P4W (4 weeks), P5D (5 days).
   * @return timeAvailableFor
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_AVAILABLE_FOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeAvailableFor() {
    return timeAvailableFor;
  }


  @JsonProperty(JSON_PROPERTY_TIME_AVAILABLE_FOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeAvailableFor(String timeAvailableFor) {
    this.timeAvailableFor = timeAvailableFor;
  }


  public BookingOutDto subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Subject for events booked using this profile.
   * @return subject
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubject(String subject) {
    this.subject = subject;
  }


  public BookingOutDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description for events booked using this profile.
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public BookingOutDto location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Location for events booked using this profile.
   * @return location
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(String location) {
    this.location = location;
  }


  public BookingOutDto workHours(WeekWorkSchedule workHours) {
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


  public BookingOutDto context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Custom client data stored for the profile.
   * @return context
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContext() {
    return context;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContext(String context) {
    this.context = context;
  }


  public BookingOutDto startConference(Boolean startConference) {
    this.startConference = startConference;
    return this;
  }

   /**
   * Whether to create an online conference (hangoutsMeet, teamsForBusiness, etc.) for the event. Note, not all providers support creating conferences.
   * @return startConference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_CONFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStartConference() {
    return startConference;
  }


  @JsonProperty(JSON_PROPERTY_START_CONFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartConference(Boolean startConference) {
    this.startConference = startConference;
  }


  public BookingOutDto openMeetingUrl(String openMeetingUrl) {
    this.openMeetingUrl = openMeetingUrl;
    return this;
  }

   /**
   * The value of the {{}openMeetingUrl}} variable that can be used in the event description or subject.
   * @return openMeetingUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPEN_MEETING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOpenMeetingUrl() {
    return openMeetingUrl;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_MEETING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenMeetingUrl(String openMeetingUrl) {
    this.openMeetingUrl = openMeetingUrl;
  }


  /**
   * Return true if this BookingOutDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingOutDto bookingOutDto = (BookingOutDto) o;
    return Objects.equals(this.id, bookingOutDto.id) &&
        Objects.equals(this.name, bookingOutDto.name) &&
        Objects.equals(this.durationMinutes, bookingOutDto.durationMinutes) &&
        Objects.equals(this.availabilityStep, bookingOutDto.availabilityStep) &&
        Objects.equals(this.startTime, bookingOutDto.startTime) &&
        Objects.equals(this.timeAvailableFor, bookingOutDto.timeAvailableFor) &&
        Objects.equals(this.subject, bookingOutDto.subject) &&
        Objects.equals(this.description, bookingOutDto.description) &&
        Objects.equals(this.location, bookingOutDto.location) &&
        Objects.equals(this.workHours, bookingOutDto.workHours) &&
        Objects.equals(this.context, bookingOutDto.context) &&
        Objects.equals(this.startConference, bookingOutDto.startConference) &&
        Objects.equals(this.openMeetingUrl, bookingOutDto.openMeetingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, durationMinutes, availabilityStep, startTime, timeAvailableFor, subject, description, location, workHours, context, startConference, openMeetingUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingOutDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    durationMinutes: ").append(toIndentedString(durationMinutes)).append("\n");
    sb.append("    availabilityStep: ").append(toIndentedString(availabilityStep)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    timeAvailableFor: ").append(toIndentedString(timeAvailableFor)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    workHours: ").append(toIndentedString(workHours)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    startConference: ").append(toIndentedString(startConference)).append("\n");
    sb.append("    openMeetingUrl: ").append(toIndentedString(openMeetingUrl)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `durationMinutes` to the URL query string
    if (getDurationMinutes() != null) {
      joiner.add(String.format("%sdurationMinutes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDurationMinutes()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `availabilityStep` to the URL query string
    if (getAvailabilityStep() != null) {
      joiner.add(String.format("%savailabilityStep%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAvailabilityStep()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `startTime` to the URL query string
    if (getStartTime() != null) {
      joiner.add(String.format("%sstartTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `timeAvailableFor` to the URL query string
    if (getTimeAvailableFor() != null) {
      joiner.add(String.format("%stimeAvailableFor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeAvailableFor()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `subject` to the URL query string
    if (getSubject() != null) {
      joiner.add(String.format("%ssubject%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubject()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `location` to the URL query string
    if (getLocation() != null) {
      joiner.add(String.format("%slocation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLocation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `workHours` to the URL query string
    if (getWorkHours() != null) {
      joiner.add(getWorkHours().toUrlQueryString(prefix + "workHours" + suffix));
    }

    // add `context` to the URL query string
    if (getContext() != null) {
      joiner.add(String.format("%scontext%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContext()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `startConference` to the URL query string
    if (getStartConference() != null) {
      joiner.add(String.format("%sstartConference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartConference()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `openMeetingUrl` to the URL query string
    if (getOpenMeetingUrl() != null) {
      joiner.add(String.format("%sopenMeetingUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOpenMeetingUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


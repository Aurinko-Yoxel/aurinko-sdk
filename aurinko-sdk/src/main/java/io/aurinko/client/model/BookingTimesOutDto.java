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
import io.aurinko.client.model.AdditionalField;
import io.aurinko.client.model.BookingMeetingInterval;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import io.aurinko.client.ApiClient;
/**
 * BookingTimesOutDto
 */
@JsonPropertyOrder({
  BookingTimesOutDto.JSON_PROPERTY_ITEMS,
  BookingTimesOutDto.JSON_PROPERTY_START_TIME,
  BookingTimesOutDto.JSON_PROPERTY_END_TIME,
  BookingTimesOutDto.JSON_PROPERTY_TIME_AVAILABLE_FOR,
  BookingTimesOutDto.JSON_PROPERTY_DURATION_MINUTES,
  BookingTimesOutDto.JSON_PROPERTY_AVAILABILITY_STEP,
  BookingTimesOutDto.JSON_PROPERTY_SUBJECT,
  BookingTimesOutDto.JSON_PROPERTY_PRIMARY_COLOR,
  BookingTimesOutDto.JSON_PROPERTY_SECONDARY_COLOR,
  BookingTimesOutDto.JSON_PROPERTY_ADDITIONAL_FIELDS,
  BookingTimesOutDto.JSON_PROPERTY_NEXT_PAGE_TOKEN,
  BookingTimesOutDto.JSON_PROPERTY_NEXT_FROM_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class BookingTimesOutDto {
  public static final String JSON_PROPERTY_ITEMS = "items";
  @javax.annotation.Nullable
  private List<BookingMeetingInterval> items = new ArrayList<>();

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  @javax.annotation.Nullable
  private OffsetDateTime startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  @javax.annotation.Nullable
  private OffsetDateTime endTime;

  public static final String JSON_PROPERTY_TIME_AVAILABLE_FOR = "timeAvailableFor";
  @javax.annotation.Nullable
  private String timeAvailableFor;

  public static final String JSON_PROPERTY_DURATION_MINUTES = "durationMinutes";
  @javax.annotation.Nullable
  private Integer durationMinutes;

  public static final String JSON_PROPERTY_AVAILABILITY_STEP = "availabilityStep";
  @javax.annotation.Nullable
  private Integer availabilityStep;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  @javax.annotation.Nullable
  private String subject;

  public static final String JSON_PROPERTY_PRIMARY_COLOR = "primaryColor";
  @javax.annotation.Nullable
  private String primaryColor;

  public static final String JSON_PROPERTY_SECONDARY_COLOR = "secondaryColor";
  @javax.annotation.Nullable
  private String secondaryColor;

  public static final String JSON_PROPERTY_ADDITIONAL_FIELDS = "additionalFields";
  @javax.annotation.Nullable
  private List<AdditionalField> additionalFields = new ArrayList<>();

  public static final String JSON_PROPERTY_NEXT_PAGE_TOKEN = "nextPageToken";
  @javax.annotation.Nullable
  private String nextPageToken;

  public static final String JSON_PROPERTY_NEXT_FROM_DATE = "nextFromDate";
  @javax.annotation.Nullable
  private LocalDate nextFromDate;

  public BookingTimesOutDto() { 
  }

  public BookingTimesOutDto items(@javax.annotation.Nullable List<BookingMeetingInterval> items) {
    this.items = items;
    return this;
  }

  public BookingTimesOutDto addItemsItem(BookingMeetingInterval itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * List of available meeting slots.
   * @return items
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<BookingMeetingInterval> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(@javax.annotation.Nullable List<BookingMeetingInterval> items) {
    this.items = items;
  }


  public BookingTimesOutDto startTime(@javax.annotation.Nullable OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Start time of available meeting slots.
   * @return startTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(@javax.annotation.Nullable OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public BookingTimesOutDto endTime(@javax.annotation.Nullable OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * End time of available meeting slots.
   * @return endTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTime(@javax.annotation.Nullable OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public BookingTimesOutDto timeAvailableFor(@javax.annotation.Nullable String timeAvailableFor) {
    this.timeAvailableFor = timeAvailableFor;
    return this;
  }

  /**
   * Time period (in ISO-8601 format) the profile is covering. For example, P3M (3 months), P4W (4 weeks), P5D (5 days).
   * @return timeAvailableFor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_AVAILABLE_FOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimeAvailableFor() {
    return timeAvailableFor;
  }


  @JsonProperty(JSON_PROPERTY_TIME_AVAILABLE_FOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeAvailableFor(@javax.annotation.Nullable String timeAvailableFor) {
    this.timeAvailableFor = timeAvailableFor;
  }


  public BookingTimesOutDto durationMinutes(@javax.annotation.Nullable Integer durationMinutes) {
    this.durationMinutes = durationMinutes;
    return this;
  }

  /**
   * Length of meeting in minutes
   * @return durationMinutes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getDurationMinutes() {
    return durationMinutes;
  }


  @JsonProperty(JSON_PROPERTY_DURATION_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDurationMinutes(@javax.annotation.Nullable Integer durationMinutes) {
    this.durationMinutes = durationMinutes;
  }


  public BookingTimesOutDto availabilityStep(@javax.annotation.Nullable Integer availabilityStep) {
    this.availabilityStep = availabilityStep;
    return this;
  }

  /**
   * Determines the interval at which new meeting slots are made available throughout the working hours. Allowed values are 5, 10, 15, 20, 30, 60.
   * @return availabilityStep
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getAvailabilityStep() {
    return availabilityStep;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityStep(@javax.annotation.Nullable Integer availabilityStep) {
    this.availabilityStep = availabilityStep;
  }


  public BookingTimesOutDto subject(@javax.annotation.Nullable String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Subject for events booked using this profile.
   * @return subject
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubject(@javax.annotation.Nullable String subject) {
    this.subject = subject;
  }


  public BookingTimesOutDto primaryColor(@javax.annotation.Nullable String primaryColor) {
    this.primaryColor = primaryColor;
    return this;
  }

  /**
   * Primary Color, taken from the application settings.
   * @return primaryColor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrimaryColor() {
    return primaryColor;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryColor(@javax.annotation.Nullable String primaryColor) {
    this.primaryColor = primaryColor;
  }


  public BookingTimesOutDto secondaryColor(@javax.annotation.Nullable String secondaryColor) {
    this.secondaryColor = secondaryColor;
    return this;
  }

  /**
   * The second Color, taken from the application settings.
   * @return secondaryColor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECONDARY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSecondaryColor() {
    return secondaryColor;
  }


  @JsonProperty(JSON_PROPERTY_SECONDARY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondaryColor(@javax.annotation.Nullable String secondaryColor) {
    this.secondaryColor = secondaryColor;
  }


  public BookingTimesOutDto additionalFields(@javax.annotation.Nullable List<AdditionalField> additionalFields) {
    this.additionalFields = additionalFields;
    return this;
  }

  public BookingTimesOutDto addAdditionalFieldsItem(AdditionalField additionalFieldsItem) {
    if (this.additionalFields == null) {
      this.additionalFields = new ArrayList<>();
    }
    this.additionalFields.add(additionalFieldsItem);
    return this;
  }

  /**
   * List of substitution variables like {{name}}, {{openMeetingUrl}},...
   * @return additionalFields
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AdditionalField> getAdditionalFields() {
    return additionalFields;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalFields(@javax.annotation.Nullable List<AdditionalField> additionalFields) {
    this.additionalFields = additionalFields;
  }


  public BookingTimesOutDto nextPageToken(@javax.annotation.Nullable String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Next page token
   * @return nextPageToken
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNextPageToken() {
    return nextPageToken;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextPageToken(@javax.annotation.Nullable String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  public BookingTimesOutDto nextFromDate(@javax.annotation.Nullable LocalDate nextFromDate) {
    this.nextFromDate = nextFromDate;
    return this;
  }

  /**
   * Next fromDate to iterate a big time intervals
   * @return nextFromDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_FROM_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LocalDate getNextFromDate() {
    return nextFromDate;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_FROM_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextFromDate(@javax.annotation.Nullable LocalDate nextFromDate) {
    this.nextFromDate = nextFromDate;
  }


  /**
   * Return true if this BookingTimesOutDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingTimesOutDto bookingTimesOutDto = (BookingTimesOutDto) o;
    return Objects.equals(this.items, bookingTimesOutDto.items) &&
        Objects.equals(this.startTime, bookingTimesOutDto.startTime) &&
        Objects.equals(this.endTime, bookingTimesOutDto.endTime) &&
        Objects.equals(this.timeAvailableFor, bookingTimesOutDto.timeAvailableFor) &&
        Objects.equals(this.durationMinutes, bookingTimesOutDto.durationMinutes) &&
        Objects.equals(this.availabilityStep, bookingTimesOutDto.availabilityStep) &&
        Objects.equals(this.subject, bookingTimesOutDto.subject) &&
        Objects.equals(this.primaryColor, bookingTimesOutDto.primaryColor) &&
        Objects.equals(this.secondaryColor, bookingTimesOutDto.secondaryColor) &&
        Objects.equals(this.additionalFields, bookingTimesOutDto.additionalFields) &&
        Objects.equals(this.nextPageToken, bookingTimesOutDto.nextPageToken) &&
        Objects.equals(this.nextFromDate, bookingTimesOutDto.nextFromDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, startTime, endTime, timeAvailableFor, durationMinutes, availabilityStep, subject, primaryColor, secondaryColor, additionalFields, nextPageToken, nextFromDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingTimesOutDto {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    timeAvailableFor: ").append(toIndentedString(timeAvailableFor)).append("\n");
    sb.append("    durationMinutes: ").append(toIndentedString(durationMinutes)).append("\n");
    sb.append("    availabilityStep: ").append(toIndentedString(availabilityStep)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    primaryColor: ").append(toIndentedString(primaryColor)).append("\n");
    sb.append("    secondaryColor: ").append(toIndentedString(secondaryColor)).append("\n");
    sb.append("    additionalFields: ").append(toIndentedString(additionalFields)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    nextFromDate: ").append(toIndentedString(nextFromDate)).append("\n");
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

    // add `items` to the URL query string
    if (getItems() != null) {
      for (int i = 0; i < getItems().size(); i++) {
        if (getItems().get(i) != null) {
          joiner.add(getItems().get(i).toUrlQueryString(String.format("%sitems%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `startTime` to the URL query string
    if (getStartTime() != null) {
      joiner.add(String.format("%sstartTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStartTime()))));
    }

    // add `endTime` to the URL query string
    if (getEndTime() != null) {
      joiner.add(String.format("%sendTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEndTime()))));
    }

    // add `timeAvailableFor` to the URL query string
    if (getTimeAvailableFor() != null) {
      joiner.add(String.format("%stimeAvailableFor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimeAvailableFor()))));
    }

    // add `durationMinutes` to the URL query string
    if (getDurationMinutes() != null) {
      joiner.add(String.format("%sdurationMinutes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDurationMinutes()))));
    }

    // add `availabilityStep` to the URL query string
    if (getAvailabilityStep() != null) {
      joiner.add(String.format("%savailabilityStep%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAvailabilityStep()))));
    }

    // add `subject` to the URL query string
    if (getSubject() != null) {
      joiner.add(String.format("%ssubject%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSubject()))));
    }

    // add `primaryColor` to the URL query string
    if (getPrimaryColor() != null) {
      joiner.add(String.format("%sprimaryColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPrimaryColor()))));
    }

    // add `secondaryColor` to the URL query string
    if (getSecondaryColor() != null) {
      joiner.add(String.format("%ssecondaryColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSecondaryColor()))));
    }

    // add `additionalFields` to the URL query string
    if (getAdditionalFields() != null) {
      for (int i = 0; i < getAdditionalFields().size(); i++) {
        if (getAdditionalFields().get(i) != null) {
          joiner.add(getAdditionalFields().get(i).toUrlQueryString(String.format("%sadditionalFields%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `nextPageToken` to the URL query string
    if (getNextPageToken() != null) {
      joiner.add(String.format("%snextPageToken%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNextPageToken()))));
    }

    // add `nextFromDate` to the URL query string
    if (getNextFromDate() != null) {
      joiner.add(String.format("%snextFromDate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNextFromDate()))));
    }

    return joiner.toString();
  }
}


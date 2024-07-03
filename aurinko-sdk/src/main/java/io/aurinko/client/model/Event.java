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
import io.aurinko.client.model.EmailAttachment;
import io.aurinko.client.model.EventDateTime;
import io.aurinko.client.model.MeetingInfo;
import io.aurinko.client.model.OccurrenceInfo;
import io.aurinko.client.model.Organizer;
import io.aurinko.client.model.Recurrence;
import io.aurinko.client.model.Sensitivity;
import io.aurinko.client.model.ShowAs;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import io.aurinko.client.ApiClient;
/**
 * Event
 */
@JsonPropertyOrder({
  Event.JSON_PROPERTY_ID,
  Event.JSON_PROPERTY_ETAG,
  Event.JSON_PROPERTY_CALENDAR_ID,
  Event.JSON_PROPERTY_CREATED_TIME,
  Event.JSON_PROPERTY_LAST_MODIFIED_TIME,
  Event.JSON_PROPERTY_SUBJECT,
  Event.JSON_PROPERTY_DESCRIPTION,
  Event.JSON_PROPERTY_LOCATION,
  Event.JSON_PROPERTY_START,
  Event.JSON_PROPERTY_END,
  Event.JSON_PROPERTY_ORGANIZER,
  Event.JSON_PROPERTY_MEETING_INFO,
  Event.JSON_PROPERTY_RECURRENCE_TYPE,
  Event.JSON_PROPERTY_RECURRENCE,
  Event.JSON_PROPERTY_OCCURRENCE_INFO,
  Event.JSON_PROPERTY_I_CAL_UID,
  Event.JSON_PROPERTY_GLOBAL_ID,
  Event.JSON_PROPERTY_SHOW_AS,
  Event.JSON_PROPERTY_SENSITIVITY,
  Event.JSON_PROPERTY_CATEGORIES,
  Event.JSON_PROPERTY_HTML_LINK,
  Event.JSON_PROPERTY_HAS_ATTACHMENTS,
  Event.JSON_PROPERTY_ATTACHMENTS,
  Event.JSON_PROPERTY_OMITTED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Event {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ETAG = "etag";
  private String etag;

  public static final String JSON_PROPERTY_CALENDAR_ID = "calendarId";
  private String calendarId;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  private OffsetDateTime createdTime;

  public static final String JSON_PROPERTY_LAST_MODIFIED_TIME = "lastModifiedTime";
  private OffsetDateTime lastModifiedTime;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_START = "start";
  private EventDateTime start;

  public static final String JSON_PROPERTY_END = "end";
  private EventDateTime end;

  public static final String JSON_PROPERTY_ORGANIZER = "organizer";
  private Organizer organizer;

  public static final String JSON_PROPERTY_MEETING_INFO = "meetingInfo";
  private MeetingInfo meetingInfo;

  /**
   * Gets or Sets recurrenceType
   */
  public enum RecurrenceTypeEnum {
    SINGLE("single"),
    
    MASTER("master"),
    
    OCCURRENCE("occurrence"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    RecurrenceTypeEnum(String value) {
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
    public static RecurrenceTypeEnum fromValue(String value) {
      for (RecurrenceTypeEnum b : RecurrenceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_RECURRENCE_TYPE = "recurrenceType";
  private RecurrenceTypeEnum recurrenceType;

  public static final String JSON_PROPERTY_RECURRENCE = "recurrence";
  private Recurrence recurrence;

  public static final String JSON_PROPERTY_OCCURRENCE_INFO = "occurrenceInfo";
  private OccurrenceInfo occurrenceInfo;

  public static final String JSON_PROPERTY_I_CAL_UID = "iCalUid";
  private String iCalUid;

  public static final String JSON_PROPERTY_GLOBAL_ID = "globalId";
  private String globalId;

  public static final String JSON_PROPERTY_SHOW_AS = "showAs";
  private ShowAs showAs;

  public static final String JSON_PROPERTY_SENSITIVITY = "sensitivity";
  private Sensitivity sensitivity;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private List<String> categories = new ArrayList<>();

  public static final String JSON_PROPERTY_HTML_LINK = "htmlLink";
  private String htmlLink;

  public static final String JSON_PROPERTY_HAS_ATTACHMENTS = "hasAttachments";
  private Boolean hasAttachments;

  public static final String JSON_PROPERTY_ATTACHMENTS = "attachments";
  private List<EmailAttachment> attachments = new ArrayList<>();

  /**
   * Gets or Sets omitted
   */
  public enum OmittedEnum {
    DESCRIPTION("description"),
    
    ATTENDEES("attendees"),
    
    ATTACHMENTS("attachments"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    OmittedEnum(String value) {
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
    public static OmittedEnum fromValue(String value) {
      for (OmittedEnum b : OmittedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_OMITTED = "omitted";
  private List<OmittedEnum> omitted = new ArrayList<>();

  public Event() { 
  }

  @JsonCreator
  public Event(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_ETAG) String etag, 
    @JsonProperty(JSON_PROPERTY_CALENDAR_ID) String calendarId, 
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) OffsetDateTime createdTime, 
    @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_TIME) OffsetDateTime lastModifiedTime, 
    @JsonProperty(JSON_PROPERTY_RECURRENCE_TYPE) RecurrenceTypeEnum recurrenceType, 
    @JsonProperty(JSON_PROPERTY_I_CAL_UID) String iCalUid, 
    @JsonProperty(JSON_PROPERTY_GLOBAL_ID) String globalId, 
    @JsonProperty(JSON_PROPERTY_CATEGORIES) List<String> categories, 
    @JsonProperty(JSON_PROPERTY_HAS_ATTACHMENTS) Boolean hasAttachments, 
    @JsonProperty(JSON_PROPERTY_OMITTED) List<OmittedEnum> omitted
  ) {
  this();
    this.id = id;
    this.etag = etag;
    this.calendarId = calendarId;
    this.createdTime = createdTime;
    this.lastModifiedTime = lastModifiedTime;
    this.recurrenceType = recurrenceType;
    this.iCalUid = iCalUid;
    this.globalId = globalId;
    this.categories = categories;
    this.hasAttachments = hasAttachments;
    this.omitted = omitted;
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
   * Get etag
   * @return etag
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ETAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEtag() {
    return etag;
  }




  /**
   * Get calendarId
   * @return calendarId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CALENDAR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCalendarId() {
    return calendarId;
  }




  /**
   * Get createdTime
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }




  /**
   * Get lastModifiedTime
   * @return lastModifiedTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getLastModifiedTime() {
    return lastModifiedTime;
  }




  public Event subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
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
  public void setSubject(String subject) {
    this.subject = subject;
  }


  public Event description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
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


  public Event location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
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


  public Event start(EventDateTime start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
   */
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


  public Event end(EventDateTime end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EventDateTime getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnd(EventDateTime end) {
    this.end = end;
  }


  public Event organizer(Organizer organizer) {
    this.organizer = organizer;
    return this;
  }

  /**
   * Get organizer
   * @return organizer
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORGANIZER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Organizer getOrganizer() {
    return organizer;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganizer(Organizer organizer) {
    this.organizer = organizer;
  }


  public Event meetingInfo(MeetingInfo meetingInfo) {
    this.meetingInfo = meetingInfo;
    return this;
  }

  /**
   * Get meetingInfo
   * @return meetingInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEETING_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MeetingInfo getMeetingInfo() {
    return meetingInfo;
  }


  @JsonProperty(JSON_PROPERTY_MEETING_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeetingInfo(MeetingInfo meetingInfo) {
    this.meetingInfo = meetingInfo;
  }


  /**
   * Get recurrenceType
   * @return recurrenceType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECURRENCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RecurrenceTypeEnum getRecurrenceType() {
    return recurrenceType;
  }




  public Event recurrence(Recurrence recurrence) {
    this.recurrence = recurrence;
    return this;
  }

  /**
   * Get recurrence
   * @return recurrence
   */
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


  public Event occurrenceInfo(OccurrenceInfo occurrenceInfo) {
    this.occurrenceInfo = occurrenceInfo;
    return this;
  }

  /**
   * Get occurrenceInfo
   * @return occurrenceInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OCCURRENCE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OccurrenceInfo getOccurrenceInfo() {
    return occurrenceInfo;
  }


  @JsonProperty(JSON_PROPERTY_OCCURRENCE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOccurrenceInfo(OccurrenceInfo occurrenceInfo) {
    this.occurrenceInfo = occurrenceInfo;
  }


  /**
   * Get iCalUid
   * @return iCalUid
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_I_CAL_UID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getiCalUid() {
    return iCalUid;
  }




  /**
   * Get globalId
   * @return globalId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGlobalId() {
    return globalId;
  }




  public Event showAs(ShowAs showAs) {
    this.showAs = showAs;
    return this;
  }

  /**
   * Get showAs
   * @return showAs
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_AS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ShowAs getShowAs() {
    return showAs;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_AS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowAs(ShowAs showAs) {
    this.showAs = showAs;
  }


  public Event sensitivity(Sensitivity sensitivity) {
    this.sensitivity = sensitivity;
    return this;
  }

  /**
   * Get sensitivity
   * @return sensitivity
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENSITIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Sensitivity getSensitivity() {
    return sensitivity;
  }


  @JsonProperty(JSON_PROPERTY_SENSITIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSensitivity(Sensitivity sensitivity) {
    this.sensitivity = sensitivity;
  }


  /**
   * Get categories
   * @return categories
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCategories() {
    return categories;
  }




  public Event htmlLink(String htmlLink) {
    this.htmlLink = htmlLink;
    return this;
  }

  /**
   * Get htmlLink
   * @return htmlLink
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTML_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHtmlLink() {
    return htmlLink;
  }


  @JsonProperty(JSON_PROPERTY_HTML_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHtmlLink(String htmlLink) {
    this.htmlLink = htmlLink;
  }


  /**
   * Get hasAttachments
   * @return hasAttachments
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasAttachments() {
    return hasAttachments;
  }




  public Event attachments(List<EmailAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public Event addAttachmentsItem(EmailAttachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * Get attachments
   * @return attachments
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EmailAttachment> getAttachments() {
    return attachments;
  }


  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttachments(List<EmailAttachment> attachments) {
    this.attachments = attachments;
  }


  /**
   * Get omitted
   * @return omitted
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OMITTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<OmittedEnum> getOmitted() {
    return omitted;
  }




  /**
   * Return true if this Event object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.id, event.id) &&
        Objects.equals(this.etag, event.etag) &&
        Objects.equals(this.calendarId, event.calendarId) &&
        Objects.equals(this.createdTime, event.createdTime) &&
        Objects.equals(this.lastModifiedTime, event.lastModifiedTime) &&
        Objects.equals(this.subject, event.subject) &&
        Objects.equals(this.description, event.description) &&
        Objects.equals(this.location, event.location) &&
        Objects.equals(this.start, event.start) &&
        Objects.equals(this.end, event.end) &&
        Objects.equals(this.organizer, event.organizer) &&
        Objects.equals(this.meetingInfo, event.meetingInfo) &&
        Objects.equals(this.recurrenceType, event.recurrenceType) &&
        Objects.equals(this.recurrence, event.recurrence) &&
        Objects.equals(this.occurrenceInfo, event.occurrenceInfo) &&
        Objects.equals(this.iCalUid, event.iCalUid) &&
        Objects.equals(this.globalId, event.globalId) &&
        Objects.equals(this.showAs, event.showAs) &&
        Objects.equals(this.sensitivity, event.sensitivity) &&
        Objects.equals(this.categories, event.categories) &&
        Objects.equals(this.htmlLink, event.htmlLink) &&
        Objects.equals(this.hasAttachments, event.hasAttachments) &&
        Objects.equals(this.attachments, event.attachments) &&
        Objects.equals(this.omitted, event.omitted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, etag, calendarId, createdTime, lastModifiedTime, subject, description, location, start, end, organizer, meetingInfo, recurrenceType, recurrence, occurrenceInfo, iCalUid, globalId, showAs, sensitivity, categories, htmlLink, hasAttachments, attachments, omitted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    calendarId: ").append(toIndentedString(calendarId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    organizer: ").append(toIndentedString(organizer)).append("\n");
    sb.append("    meetingInfo: ").append(toIndentedString(meetingInfo)).append("\n");
    sb.append("    recurrenceType: ").append(toIndentedString(recurrenceType)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
    sb.append("    occurrenceInfo: ").append(toIndentedString(occurrenceInfo)).append("\n");
    sb.append("    iCalUid: ").append(toIndentedString(iCalUid)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    showAs: ").append(toIndentedString(showAs)).append("\n");
    sb.append("    sensitivity: ").append(toIndentedString(sensitivity)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    htmlLink: ").append(toIndentedString(htmlLink)).append("\n");
    sb.append("    hasAttachments: ").append(toIndentedString(hasAttachments)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    omitted: ").append(toIndentedString(omitted)).append("\n");
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

    // add `etag` to the URL query string
    if (getEtag() != null) {
      joiner.add(String.format("%setag%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEtag()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `calendarId` to the URL query string
    if (getCalendarId() != null) {
      joiner.add(String.format("%scalendarId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCalendarId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `createdTime` to the URL query string
    if (getCreatedTime() != null) {
      joiner.add(String.format("%screatedTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCreatedTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `lastModifiedTime` to the URL query string
    if (getLastModifiedTime() != null) {
      joiner.add(String.format("%slastModifiedTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLastModifiedTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `subject` to the URL query string
    if (getSubject() != null) {
      joiner.add(String.format("%ssubject%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSubject()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `location` to the URL query string
    if (getLocation() != null) {
      joiner.add(String.format("%slocation%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLocation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `start` to the URL query string
    if (getStart() != null) {
      joiner.add(getStart().toUrlQueryString(prefix + "start" + suffix));
    }

    // add `end` to the URL query string
    if (getEnd() != null) {
      joiner.add(getEnd().toUrlQueryString(prefix + "end" + suffix));
    }

    // add `organizer` to the URL query string
    if (getOrganizer() != null) {
      joiner.add(getOrganizer().toUrlQueryString(prefix + "organizer" + suffix));
    }

    // add `meetingInfo` to the URL query string
    if (getMeetingInfo() != null) {
      joiner.add(getMeetingInfo().toUrlQueryString(prefix + "meetingInfo" + suffix));
    }

    // add `recurrenceType` to the URL query string
    if (getRecurrenceType() != null) {
      joiner.add(String.format("%srecurrenceType%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRecurrenceType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `recurrence` to the URL query string
    if (getRecurrence() != null) {
      joiner.add(getRecurrence().toUrlQueryString(prefix + "recurrence" + suffix));
    }

    // add `occurrenceInfo` to the URL query string
    if (getOccurrenceInfo() != null) {
      joiner.add(getOccurrenceInfo().toUrlQueryString(prefix + "occurrenceInfo" + suffix));
    }

    // add `iCalUid` to the URL query string
    if (getiCalUid() != null) {
      joiner.add(String.format("%siCalUid%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getiCalUid()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `globalId` to the URL query string
    if (getGlobalId() != null) {
      joiner.add(String.format("%sglobalId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getGlobalId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `showAs` to the URL query string
    if (getShowAs() != null) {
      joiner.add(String.format("%sshowAs%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getShowAs()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sensitivity` to the URL query string
    if (getSensitivity() != null) {
      joiner.add(String.format("%ssensitivity%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSensitivity()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `categories` to the URL query string
    if (getCategories() != null) {
      for (int i = 0; i < getCategories().size(); i++) {
        joiner.add(String.format("%scategories%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getCategories().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `htmlLink` to the URL query string
    if (getHtmlLink() != null) {
      joiner.add(String.format("%shtmlLink%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getHtmlLink()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `hasAttachments` to the URL query string
    if (getHasAttachments() != null) {
      joiner.add(String.format("%shasAttachments%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getHasAttachments()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `attachments` to the URL query string
    if (getAttachments() != null) {
      for (int i = 0; i < getAttachments().size(); i++) {
        if (getAttachments().get(i) != null) {
          joiner.add(getAttachments().get(i).toUrlQueryString(String.format("%sattachments%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `omitted` to the URL query string
    if (getOmitted() != null) {
      for (int i = 0; i < getOmitted().size(); i++) {
        joiner.add(String.format("%somitted%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getOmitted().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}


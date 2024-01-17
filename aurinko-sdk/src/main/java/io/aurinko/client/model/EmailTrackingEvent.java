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
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EmailTrackingEvent
 */
@JsonPropertyOrder({
  EmailTrackingEvent.JSON_PROPERTY_ID,
  EmailTrackingEvent.JSON_PROPERTY_CREATED_AT,
  EmailTrackingEvent.JSON_PROPERTY_EVENT_TYPE,
  EmailTrackingEvent.JSON_PROPERTY_LOCATION,
  EmailTrackingEvent.JSON_PROPERTY_USER_AGENT,
  EmailTrackingEvent.JSON_PROPERTY_REFERRER,
  EmailTrackingEvent.JSON_PROPERTY_REMOTE_ADDR,
  EmailTrackingEvent.JSON_PROPERTY_THREAD_ID,
  EmailTrackingEvent.JSON_PROPERTY_MESSAGE_ID,
  EmailTrackingEvent.JSON_PROPERTY_INTERNET_MESSAGE_ID,
  EmailTrackingEvent.JSON_PROPERTY_TRACKING_ID,
  EmailTrackingEvent.JSON_PROPERTY_CONTEXT,
  EmailTrackingEvent.JSON_PROPERTY_TRACKING_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-09T14:13:35.152987Z[Africa/Bamako]")
public class EmailTrackingEvent {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  /**
   * Gets or Sets eventType
   */
  public enum EventTypeEnum {
    OPEN("open"),
    
    CLICK("click"),
    
    REPLY("reply"),
    
    REPLYBOUNCE("replyBounce");

    private String value;

    EventTypeEnum(String value) {
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
    public static EventTypeEnum fromValue(String value) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
  private EventTypeEnum eventType;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_USER_AGENT = "userAgent";
  private String userAgent;

  public static final String JSON_PROPERTY_REFERRER = "referrer";
  private String referrer;

  public static final String JSON_PROPERTY_REMOTE_ADDR = "remoteAddr";
  private String remoteAddr;

  public static final String JSON_PROPERTY_THREAD_ID = "threadId";
  private String threadId;

  public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
  private String messageId;

  public static final String JSON_PROPERTY_INTERNET_MESSAGE_ID = "internetMessageId";
  private String internetMessageId;

  public static final String JSON_PROPERTY_TRACKING_ID = "trackingId";
  private Long trackingId;

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private String context;

  public static final String JSON_PROPERTY_TRACKING_CODE = "trackingCode";
  private String trackingCode;

  public EmailTrackingEvent() { 
  }

  public EmailTrackingEvent id(Long id) {
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


  public EmailTrackingEvent createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public EmailTrackingEvent eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventTypeEnum getEventType() {
    return eventType;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }


  public EmailTrackingEvent location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
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


  public EmailTrackingEvent userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Get userAgent
   * @return userAgent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserAgent() {
    return userAgent;
  }


  @JsonProperty(JSON_PROPERTY_USER_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  public EmailTrackingEvent referrer(String referrer) {
    this.referrer = referrer;
    return this;
  }

   /**
   * Get referrer
   * @return referrer
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERRER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferrer() {
    return referrer;
  }


  @JsonProperty(JSON_PROPERTY_REFERRER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferrer(String referrer) {
    this.referrer = referrer;
  }


  public EmailTrackingEvent remoteAddr(String remoteAddr) {
    this.remoteAddr = remoteAddr;
    return this;
  }

   /**
   * Get remoteAddr
   * @return remoteAddr
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMOTE_ADDR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRemoteAddr() {
    return remoteAddr;
  }


  @JsonProperty(JSON_PROPERTY_REMOTE_ADDR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemoteAddr(String remoteAddr) {
    this.remoteAddr = remoteAddr;
  }


  public EmailTrackingEvent threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

   /**
   * Get threadId
   * @return threadId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreadId() {
    return threadId;
  }


  @JsonProperty(JSON_PROPERTY_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }


  public EmailTrackingEvent messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessageId() {
    return messageId;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  public EmailTrackingEvent internetMessageId(String internetMessageId) {
    this.internetMessageId = internetMessageId;
    return this;
  }

   /**
   * Get internetMessageId
   * @return internetMessageId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERNET_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInternetMessageId() {
    return internetMessageId;
  }


  @JsonProperty(JSON_PROPERTY_INTERNET_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternetMessageId(String internetMessageId) {
    this.internetMessageId = internetMessageId;
  }


  public EmailTrackingEvent trackingId(Long trackingId) {
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Get trackingId
   * @return trackingId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACKING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTrackingId() {
    return trackingId;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackingId(Long trackingId) {
    this.trackingId = trackingId;
  }


  public EmailTrackingEvent context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
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


  public EmailTrackingEvent trackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
    return this;
  }

   /**
   * Get trackingCode
   * @return trackingCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACKING_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrackingCode() {
    return trackingCode;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
  }


  /**
   * Return true if this EmailTrackingEvent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailTrackingEvent emailTrackingEvent = (EmailTrackingEvent) o;
    return Objects.equals(this.id, emailTrackingEvent.id) &&
        Objects.equals(this.createdAt, emailTrackingEvent.createdAt) &&
        Objects.equals(this.eventType, emailTrackingEvent.eventType) &&
        Objects.equals(this.location, emailTrackingEvent.location) &&
        Objects.equals(this.userAgent, emailTrackingEvent.userAgent) &&
        Objects.equals(this.referrer, emailTrackingEvent.referrer) &&
        Objects.equals(this.remoteAddr, emailTrackingEvent.remoteAddr) &&
        Objects.equals(this.threadId, emailTrackingEvent.threadId) &&
        Objects.equals(this.messageId, emailTrackingEvent.messageId) &&
        Objects.equals(this.internetMessageId, emailTrackingEvent.internetMessageId) &&
        Objects.equals(this.trackingId, emailTrackingEvent.trackingId) &&
        Objects.equals(this.context, emailTrackingEvent.context) &&
        Objects.equals(this.trackingCode, emailTrackingEvent.trackingCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, eventType, location, userAgent, referrer, remoteAddr, threadId, messageId, internetMessageId, trackingId, context, trackingCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailTrackingEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    remoteAddr: ").append(toIndentedString(remoteAddr)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    internetMessageId: ").append(toIndentedString(internetMessageId)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    trackingCode: ").append(toIndentedString(trackingCode)).append("\n");
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

    // add `createdAt` to the URL query string
    if (getCreatedAt() != null) {
      joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `eventType` to the URL query string
    if (getEventType() != null) {
      joiner.add(String.format("%seventType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEventType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `location` to the URL query string
    if (getLocation() != null) {
      joiner.add(String.format("%slocation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLocation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `userAgent` to the URL query string
    if (getUserAgent() != null) {
      joiner.add(String.format("%suserAgent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserAgent()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `referrer` to the URL query string
    if (getReferrer() != null) {
      joiner.add(String.format("%sreferrer%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReferrer()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `remoteAddr` to the URL query string
    if (getRemoteAddr() != null) {
      joiner.add(String.format("%sremoteAddr%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRemoteAddr()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `threadId` to the URL query string
    if (getThreadId() != null) {
      joiner.add(String.format("%sthreadId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getThreadId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `messageId` to the URL query string
    if (getMessageId() != null) {
      joiner.add(String.format("%smessageId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessageId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `internetMessageId` to the URL query string
    if (getInternetMessageId() != null) {
      joiner.add(String.format("%sinternetMessageId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInternetMessageId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `trackingId` to the URL query string
    if (getTrackingId() != null) {
      joiner.add(String.format("%strackingId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrackingId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `context` to the URL query string
    if (getContext() != null) {
      joiner.add(String.format("%scontext%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContext()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `trackingCode` to the URL query string
    if (getTrackingCode() != null) {
      joiner.add(String.format("%strackingCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrackingCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

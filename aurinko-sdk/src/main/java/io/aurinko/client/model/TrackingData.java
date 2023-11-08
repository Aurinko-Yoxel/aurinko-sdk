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
 * TrackingData
 */
@JsonPropertyOrder({
  TrackingData.JSON_PROPERTY_ID,
  TrackingData.JSON_PROPERTY_MESSAGE_ID,
  TrackingData.JSON_PROPERTY_INET_MESSAGE_ID,
  TrackingData.JSON_PROPERTY_THREAD_ID,
  TrackingData.JSON_PROPERTY_SEND_DATE,
  TrackingData.JSON_PROPERTY_LAST_ACTIVITY_TIME,
  TrackingData.JSON_PROPERTY_LAST_RESPONDED_TIME,
  TrackingData.JSON_PROPERTY_TRACK_REPLIES,
  TrackingData.JSON_PROPERTY_TRACK_OPENS,
  TrackingData.JSON_PROPERTY_TRACK_LINKS,
  TrackingData.JSON_PROPERTY_TRACKING_CODE,
  TrackingData.JSON_PROPERTY_CONTEXT,
  TrackingData.JSON_PROPERTY_LOCATION,
  TrackingData.JSON_PROPERTY_USER_AGENT,
  TrackingData.JSON_PROPERTY_REMOTE_ADDR,
  TrackingData.JSON_PROPERTY_IGNORE_OPEN_CLICKS,
  TrackingData.JSON_PROPERTY_HAS_BOUNCED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-08T10:31:33.594723Z[Africa/Bamako]")
public class TrackingData {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
  private String messageId;

  public static final String JSON_PROPERTY_INET_MESSAGE_ID = "inetMessageId";
  private String inetMessageId;

  public static final String JSON_PROPERTY_THREAD_ID = "threadId";
  private String threadId;

  public static final String JSON_PROPERTY_SEND_DATE = "sendDate";
  private OffsetDateTime sendDate;

  public static final String JSON_PROPERTY_LAST_ACTIVITY_TIME = "lastActivityTime";
  private OffsetDateTime lastActivityTime;

  public static final String JSON_PROPERTY_LAST_RESPONDED_TIME = "lastRespondedTime";
  private OffsetDateTime lastRespondedTime;

  public static final String JSON_PROPERTY_TRACK_REPLIES = "trackReplies";
  private Boolean trackReplies;

  public static final String JSON_PROPERTY_TRACK_OPENS = "trackOpens";
  private Boolean trackOpens;

  public static final String JSON_PROPERTY_TRACK_LINKS = "trackLinks";
  private Boolean trackLinks;

  public static final String JSON_PROPERTY_TRACKING_CODE = "trackingCode";
  private String trackingCode;

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private String context;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_USER_AGENT = "userAgent";
  private String userAgent;

  public static final String JSON_PROPERTY_REMOTE_ADDR = "remoteAddr";
  private String remoteAddr;

  public static final String JSON_PROPERTY_IGNORE_OPEN_CLICKS = "ignoreOpenClicks";
  private Boolean ignoreOpenClicks;

  public static final String JSON_PROPERTY_HAS_BOUNCED = "hasBounced";
  private Boolean hasBounced;

  public TrackingData() { 
  }

  public TrackingData id(Long id) {
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


  public TrackingData messageId(String messageId) {
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


  public TrackingData inetMessageId(String inetMessageId) {
    this.inetMessageId = inetMessageId;
    return this;
  }

   /**
   * Get inetMessageId
   * @return inetMessageId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INET_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInetMessageId() {
    return inetMessageId;
  }


  @JsonProperty(JSON_PROPERTY_INET_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInetMessageId(String inetMessageId) {
    this.inetMessageId = inetMessageId;
  }


  public TrackingData threadId(String threadId) {
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


  public TrackingData sendDate(OffsetDateTime sendDate) {
    this.sendDate = sendDate;
    return this;
  }

   /**
   * Get sendDate
   * @return sendDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEND_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSendDate() {
    return sendDate;
  }


  @JsonProperty(JSON_PROPERTY_SEND_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSendDate(OffsetDateTime sendDate) {
    this.sendDate = sendDate;
  }


  public TrackingData lastActivityTime(OffsetDateTime lastActivityTime) {
    this.lastActivityTime = lastActivityTime;
    return this;
  }

   /**
   * Get lastActivityTime
   * @return lastActivityTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_ACTIVITY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastActivityTime() {
    return lastActivityTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_ACTIVITY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastActivityTime(OffsetDateTime lastActivityTime) {
    this.lastActivityTime = lastActivityTime;
  }


  public TrackingData lastRespondedTime(OffsetDateTime lastRespondedTime) {
    this.lastRespondedTime = lastRespondedTime;
    return this;
  }

   /**
   * Get lastRespondedTime
   * @return lastRespondedTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_RESPONDED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastRespondedTime() {
    return lastRespondedTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_RESPONDED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastRespondedTime(OffsetDateTime lastRespondedTime) {
    this.lastRespondedTime = lastRespondedTime;
  }


  public TrackingData trackReplies(Boolean trackReplies) {
    this.trackReplies = trackReplies;
    return this;
  }

   /**
   * Get trackReplies
   * @return trackReplies
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACK_REPLIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTrackReplies() {
    return trackReplies;
  }


  @JsonProperty(JSON_PROPERTY_TRACK_REPLIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackReplies(Boolean trackReplies) {
    this.trackReplies = trackReplies;
  }


  public TrackingData trackOpens(Boolean trackOpens) {
    this.trackOpens = trackOpens;
    return this;
  }

   /**
   * Get trackOpens
   * @return trackOpens
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACK_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTrackOpens() {
    return trackOpens;
  }


  @JsonProperty(JSON_PROPERTY_TRACK_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackOpens(Boolean trackOpens) {
    this.trackOpens = trackOpens;
  }


  public TrackingData trackLinks(Boolean trackLinks) {
    this.trackLinks = trackLinks;
    return this;
  }

   /**
   * Get trackLinks
   * @return trackLinks
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACK_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTrackLinks() {
    return trackLinks;
  }


  @JsonProperty(JSON_PROPERTY_TRACK_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackLinks(Boolean trackLinks) {
    this.trackLinks = trackLinks;
  }


  public TrackingData trackingCode(String trackingCode) {
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


  public TrackingData context(String context) {
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


  public TrackingData location(String location) {
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


  public TrackingData userAgent(String userAgent) {
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


  public TrackingData remoteAddr(String remoteAddr) {
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


  public TrackingData ignoreOpenClicks(Boolean ignoreOpenClicks) {
    this.ignoreOpenClicks = ignoreOpenClicks;
    return this;
  }

   /**
   * Get ignoreOpenClicks
   * @return ignoreOpenClicks
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IGNORE_OPEN_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIgnoreOpenClicks() {
    return ignoreOpenClicks;
  }


  @JsonProperty(JSON_PROPERTY_IGNORE_OPEN_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIgnoreOpenClicks(Boolean ignoreOpenClicks) {
    this.ignoreOpenClicks = ignoreOpenClicks;
  }


  public TrackingData hasBounced(Boolean hasBounced) {
    this.hasBounced = hasBounced;
    return this;
  }

   /**
   * Get hasBounced
   * @return hasBounced
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_BOUNCED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasBounced() {
    return hasBounced;
  }


  @JsonProperty(JSON_PROPERTY_HAS_BOUNCED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasBounced(Boolean hasBounced) {
    this.hasBounced = hasBounced;
  }


  /**
   * Return true if this TrackingData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingData trackingData = (TrackingData) o;
    return Objects.equals(this.id, trackingData.id) &&
        Objects.equals(this.messageId, trackingData.messageId) &&
        Objects.equals(this.inetMessageId, trackingData.inetMessageId) &&
        Objects.equals(this.threadId, trackingData.threadId) &&
        Objects.equals(this.sendDate, trackingData.sendDate) &&
        Objects.equals(this.lastActivityTime, trackingData.lastActivityTime) &&
        Objects.equals(this.lastRespondedTime, trackingData.lastRespondedTime) &&
        Objects.equals(this.trackReplies, trackingData.trackReplies) &&
        Objects.equals(this.trackOpens, trackingData.trackOpens) &&
        Objects.equals(this.trackLinks, trackingData.trackLinks) &&
        Objects.equals(this.trackingCode, trackingData.trackingCode) &&
        Objects.equals(this.context, trackingData.context) &&
        Objects.equals(this.location, trackingData.location) &&
        Objects.equals(this.userAgent, trackingData.userAgent) &&
        Objects.equals(this.remoteAddr, trackingData.remoteAddr) &&
        Objects.equals(this.ignoreOpenClicks, trackingData.ignoreOpenClicks) &&
        Objects.equals(this.hasBounced, trackingData.hasBounced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, messageId, inetMessageId, threadId, sendDate, lastActivityTime, lastRespondedTime, trackReplies, trackOpens, trackLinks, trackingCode, context, location, userAgent, remoteAddr, ignoreOpenClicks, hasBounced);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    inetMessageId: ").append(toIndentedString(inetMessageId)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
    sb.append("    lastActivityTime: ").append(toIndentedString(lastActivityTime)).append("\n");
    sb.append("    lastRespondedTime: ").append(toIndentedString(lastRespondedTime)).append("\n");
    sb.append("    trackReplies: ").append(toIndentedString(trackReplies)).append("\n");
    sb.append("    trackOpens: ").append(toIndentedString(trackOpens)).append("\n");
    sb.append("    trackLinks: ").append(toIndentedString(trackLinks)).append("\n");
    sb.append("    trackingCode: ").append(toIndentedString(trackingCode)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    remoteAddr: ").append(toIndentedString(remoteAddr)).append("\n");
    sb.append("    ignoreOpenClicks: ").append(toIndentedString(ignoreOpenClicks)).append("\n");
    sb.append("    hasBounced: ").append(toIndentedString(hasBounced)).append("\n");
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

    // add `messageId` to the URL query string
    if (getMessageId() != null) {
      joiner.add(String.format("%smessageId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessageId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `inetMessageId` to the URL query string
    if (getInetMessageId() != null) {
      joiner.add(String.format("%sinetMessageId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInetMessageId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `threadId` to the URL query string
    if (getThreadId() != null) {
      joiner.add(String.format("%sthreadId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getThreadId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sendDate` to the URL query string
    if (getSendDate() != null) {
      joiner.add(String.format("%ssendDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSendDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `lastActivityTime` to the URL query string
    if (getLastActivityTime() != null) {
      joiner.add(String.format("%slastActivityTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastActivityTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `lastRespondedTime` to the URL query string
    if (getLastRespondedTime() != null) {
      joiner.add(String.format("%slastRespondedTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastRespondedTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `trackReplies` to the URL query string
    if (getTrackReplies() != null) {
      joiner.add(String.format("%strackReplies%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrackReplies()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `trackOpens` to the URL query string
    if (getTrackOpens() != null) {
      joiner.add(String.format("%strackOpens%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrackOpens()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `trackLinks` to the URL query string
    if (getTrackLinks() != null) {
      joiner.add(String.format("%strackLinks%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrackLinks()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `trackingCode` to the URL query string
    if (getTrackingCode() != null) {
      joiner.add(String.format("%strackingCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrackingCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `context` to the URL query string
    if (getContext() != null) {
      joiner.add(String.format("%scontext%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContext()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `location` to the URL query string
    if (getLocation() != null) {
      joiner.add(String.format("%slocation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLocation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `userAgent` to the URL query string
    if (getUserAgent() != null) {
      joiner.add(String.format("%suserAgent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserAgent()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `remoteAddr` to the URL query string
    if (getRemoteAddr() != null) {
      joiner.add(String.format("%sremoteAddr%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRemoteAddr()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ignoreOpenClicks` to the URL query string
    if (getIgnoreOpenClicks() != null) {
      joiner.add(String.format("%signoreOpenClicks%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIgnoreOpenClicks()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `hasBounced` to the URL query string
    if (getHasBounced() != null) {
      joiner.add(String.format("%shasBounced%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHasBounced()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


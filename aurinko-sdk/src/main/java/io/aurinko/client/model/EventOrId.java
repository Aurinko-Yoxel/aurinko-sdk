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
import io.aurinko.client.model.Event;
import io.aurinko.client.model.OnlineMeetingDetails;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import io.aurinko.client.ApiClient;
/**
 * EventOrId
 */
@JsonPropertyOrder({
  EventOrId.JSON_PROPERTY_ID,
  EventOrId.JSON_PROPERTY_ETAG,
  EventOrId.JSON_PROPERTY_I_CAL_U_ID,
  EventOrId.JSON_PROPERTY_GLOBAL_ID,
  EventOrId.JSON_PROPERTY_RECORD,
  EventOrId.JSON_PROPERTY_ONLINE_MEETING_PROVIDER,
  EventOrId.JSON_PROPERTY_ONLINE_MEETING_DETAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class EventOrId {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ETAG = "etag";
  private String etag;

  public static final String JSON_PROPERTY_I_CAL_U_ID = "iCalUId";
  private String iCalUId;

  public static final String JSON_PROPERTY_GLOBAL_ID = "globalId";
  private String globalId;

  public static final String JSON_PROPERTY_RECORD = "record";
  private Event record;

  public static final String JSON_PROPERTY_ONLINE_MEETING_PROVIDER = "onlineMeetingProvider";
  private String onlineMeetingProvider;

  public static final String JSON_PROPERTY_ONLINE_MEETING_DETAILS = "onlineMeetingDetails";
  private OnlineMeetingDetails onlineMeetingDetails;

  public EventOrId() { 
  }

  @JsonCreator
  public EventOrId(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_ETAG) String etag, 
    @JsonProperty(JSON_PROPERTY_I_CAL_U_ID) String iCalUId, 
    @JsonProperty(JSON_PROPERTY_GLOBAL_ID) String globalId
  ) {
  this();
    this.id = id;
    this.etag = etag;
    this.iCalUId = iCalUId;
    this.globalId = globalId;
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
   * Get iCalUId
   * @return iCalUId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_I_CAL_U_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getiCalUId() {
    return iCalUId;
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




  public EventOrId record(Event record) {
    this.record = record;
    return this;
  }

  /**
   * Get record
   * @return record
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Event getRecord() {
    return record;
  }


  @JsonProperty(JSON_PROPERTY_RECORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecord(Event record) {
    this.record = record;
  }


  public EventOrId onlineMeetingProvider(String onlineMeetingProvider) {
    this.onlineMeetingProvider = onlineMeetingProvider;
    return this;
  }

  /**
   * Value of provider, for example hangoutsMeet, teamsForBusiness, skypeForBusiness, skypeForConsumer
   * @return onlineMeetingProvider
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ONLINE_MEETING_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOnlineMeetingProvider() {
    return onlineMeetingProvider;
  }


  @JsonProperty(JSON_PROPERTY_ONLINE_MEETING_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnlineMeetingProvider(String onlineMeetingProvider) {
    this.onlineMeetingProvider = onlineMeetingProvider;
  }


  public EventOrId onlineMeetingDetails(OnlineMeetingDetails onlineMeetingDetails) {
    this.onlineMeetingDetails = onlineMeetingDetails;
    return this;
  }

  /**
   * Get onlineMeetingDetails
   * @return onlineMeetingDetails
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ONLINE_MEETING_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OnlineMeetingDetails getOnlineMeetingDetails() {
    return onlineMeetingDetails;
  }


  @JsonProperty(JSON_PROPERTY_ONLINE_MEETING_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnlineMeetingDetails(OnlineMeetingDetails onlineMeetingDetails) {
    this.onlineMeetingDetails = onlineMeetingDetails;
  }


  /**
   * Return true if this EventOrId object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventOrId eventOrId = (EventOrId) o;
    return Objects.equals(this.id, eventOrId.id) &&
        Objects.equals(this.etag, eventOrId.etag) &&
        Objects.equals(this.iCalUId, eventOrId.iCalUId) &&
        Objects.equals(this.globalId, eventOrId.globalId) &&
        Objects.equals(this.record, eventOrId.record) &&
        Objects.equals(this.onlineMeetingProvider, eventOrId.onlineMeetingProvider) &&
        Objects.equals(this.onlineMeetingDetails, eventOrId.onlineMeetingDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, etag, iCalUId, globalId, record, onlineMeetingProvider, onlineMeetingDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventOrId {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    iCalUId: ").append(toIndentedString(iCalUId)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
    sb.append("    onlineMeetingProvider: ").append(toIndentedString(onlineMeetingProvider)).append("\n");
    sb.append("    onlineMeetingDetails: ").append(toIndentedString(onlineMeetingDetails)).append("\n");
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

    // add `iCalUId` to the URL query string
    if (getiCalUId() != null) {
      joiner.add(String.format("%siCalUId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getiCalUId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `globalId` to the URL query string
    if (getGlobalId() != null) {
      joiner.add(String.format("%sglobalId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getGlobalId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `record` to the URL query string
    if (getRecord() != null) {
      joiner.add(getRecord().toUrlQueryString(prefix + "record" + suffix));
    }

    // add `onlineMeetingProvider` to the URL query string
    if (getOnlineMeetingProvider() != null) {
      joiner.add(String.format("%sonlineMeetingProvider%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getOnlineMeetingProvider()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `onlineMeetingDetails` to the URL query string
    if (getOnlineMeetingDetails() != null) {
      joiner.add(getOnlineMeetingDetails().toUrlQueryString(prefix + "onlineMeetingDetails" + suffix));
    }

    return joiner.toString();
  }
}


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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import io.aurinko.client.ApiClient;
/**
 * EmailTrackingData
 */
@JsonPropertyOrder({
  EmailTrackingData.JSON_PROPERTY_TRACK_REPLIES,
  EmailTrackingData.JSON_PROPERTY_HTML_BODY,
  EmailTrackingData.JSON_PROPERTY_TRACKING_CODE,
  EmailTrackingData.JSON_PROPERTY_CONTEXT,
  EmailTrackingData.JSON_PROPERTY_LINK_CODES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class EmailTrackingData {
  public static final String JSON_PROPERTY_TRACK_REPLIES = "trackReplies";
  private Boolean trackReplies;

  public static final String JSON_PROPERTY_HTML_BODY = "htmlBody";
  private String htmlBody;

  public static final String JSON_PROPERTY_TRACKING_CODE = "trackingCode";
  private String trackingCode;

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private String context;

  public static final String JSON_PROPERTY_LINK_CODES = "linkCodes";
  private List<Object> linkCodes = new ArrayList<>();

  public EmailTrackingData() { 
  }

  public EmailTrackingData trackReplies(Boolean trackReplies) {
    this.trackReplies = trackReplies;
    return this;
  }

  /**
   * Get trackReplies
   * @return trackReplies
   */
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


  public EmailTrackingData htmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
    return this;
  }

  /**
   * Get htmlBody
   * @return htmlBody
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTML_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHtmlBody() {
    return htmlBody;
  }


  @JsonProperty(JSON_PROPERTY_HTML_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHtmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
  }


  public EmailTrackingData trackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
    return this;
  }

  /**
   * Get trackingCode
   * @return trackingCode
   */
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


  public EmailTrackingData context(String context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
   */
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


  public EmailTrackingData linkCodes(List<Object> linkCodes) {
    this.linkCodes = linkCodes;
    return this;
  }

  public EmailTrackingData addLinkCodesItem(Object linkCodesItem) {
    if (this.linkCodes == null) {
      this.linkCodes = new ArrayList<>();
    }
    this.linkCodes.add(linkCodesItem);
    return this;
  }

  /**
   * Get linkCodes
   * @return linkCodes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Object> getLinkCodes() {
    return linkCodes;
  }


  @JsonProperty(JSON_PROPERTY_LINK_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkCodes(List<Object> linkCodes) {
    this.linkCodes = linkCodes;
  }


  /**
   * Return true if this EmailTrackingData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailTrackingData emailTrackingData = (EmailTrackingData) o;
    return Objects.equals(this.trackReplies, emailTrackingData.trackReplies) &&
        Objects.equals(this.htmlBody, emailTrackingData.htmlBody) &&
        Objects.equals(this.trackingCode, emailTrackingData.trackingCode) &&
        Objects.equals(this.context, emailTrackingData.context) &&
        Objects.equals(this.linkCodes, emailTrackingData.linkCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackReplies, htmlBody, trackingCode, context, linkCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailTrackingData {\n");
    sb.append("    trackReplies: ").append(toIndentedString(trackReplies)).append("\n");
    sb.append("    htmlBody: ").append(toIndentedString(htmlBody)).append("\n");
    sb.append("    trackingCode: ").append(toIndentedString(trackingCode)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    linkCodes: ").append(toIndentedString(linkCodes)).append("\n");
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

    // add `trackReplies` to the URL query string
    if (getTrackReplies() != null) {
      joiner.add(String.format("%strackReplies%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTrackReplies()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `htmlBody` to the URL query string
    if (getHtmlBody() != null) {
      joiner.add(String.format("%shtmlBody%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getHtmlBody()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `trackingCode` to the URL query string
    if (getTrackingCode() != null) {
      joiner.add(String.format("%strackingCode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTrackingCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `context` to the URL query string
    if (getContext() != null) {
      joiner.add(String.format("%scontext%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getContext()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `linkCodes` to the URL query string
    if (getLinkCodes() != null) {
      for (int i = 0; i < getLinkCodes().size(); i++) {
        joiner.add(String.format("%slinkCodes%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getLinkCodes().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}


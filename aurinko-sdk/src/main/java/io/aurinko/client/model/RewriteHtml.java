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
import io.aurinko.client.model.OutEmailTrack;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RewriteHtml
 */
@JsonPropertyOrder({
  RewriteHtml.JSON_PROPERTY_HTML_TEXT,
  RewriteHtml.JSON_PROPERTY_TRACKING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RewriteHtml {
  public static final String JSON_PROPERTY_HTML_TEXT = "htmlText";
  private String htmlText;

  public static final String JSON_PROPERTY_TRACKING = "tracking";
  private OutEmailTrack tracking;

  public RewriteHtml() { 
  }

  public RewriteHtml htmlText(String htmlText) {
    this.htmlText = htmlText;
    return this;
  }

   /**
   * Get htmlText
   * @return htmlText
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTML_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHtmlText() {
    return htmlText;
  }


  @JsonProperty(JSON_PROPERTY_HTML_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHtmlText(String htmlText) {
    this.htmlText = htmlText;
  }


  public RewriteHtml tracking(OutEmailTrack tracking) {
    this.tracking = tracking;
    return this;
  }

   /**
   * Get tracking
   * @return tracking
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OutEmailTrack getTracking() {
    return tracking;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTracking(OutEmailTrack tracking) {
    this.tracking = tracking;
  }


  /**
   * Return true if this RewriteHtml object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewriteHtml rewriteHtml = (RewriteHtml) o;
    return Objects.equals(this.htmlText, rewriteHtml.htmlText) &&
        Objects.equals(this.tracking, rewriteHtml.tracking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlText, tracking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewriteHtml {\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
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

    // add `htmlText` to the URL query string
    if (getHtmlText() != null) {
      joiner.add(String.format("%shtmlText%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHtmlText()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tracking` to the URL query string
    if (getTracking() != null) {
      joiner.add(getTracking().toUrlQueryString(prefix + "tracking" + suffix));
    }

    return joiner.toString();
  }
}


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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FreeBusyRequest
 */
@JsonPropertyOrder({
  FreeBusyRequest.JSON_PROPERTY_TIME_MIN,
  FreeBusyRequest.JSON_PROPERTY_TIME_MAX,
  FreeBusyRequest.JSON_PROPERTY_EMAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-15T08:54:57.780675Z[Africa/Bamako]")
public class FreeBusyRequest {
  public static final String JSON_PROPERTY_TIME_MIN = "timeMin";
  private OffsetDateTime timeMin;

  public static final String JSON_PROPERTY_TIME_MAX = "timeMax";
  private OffsetDateTime timeMax;

  public static final String JSON_PROPERTY_EMAILS = "emails";
  private List<String> emails;

  public FreeBusyRequest() { 
  }

  public FreeBusyRequest timeMin(OffsetDateTime timeMin) {
    this.timeMin = timeMin;
    return this;
  }

   /**
   * Get timeMin
   * @return timeMin
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimeMin() {
    return timeMin;
  }


  @JsonProperty(JSON_PROPERTY_TIME_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeMin(OffsetDateTime timeMin) {
    this.timeMin = timeMin;
  }


  public FreeBusyRequest timeMax(OffsetDateTime timeMax) {
    this.timeMax = timeMax;
    return this;
  }

   /**
   * Get timeMax
   * @return timeMax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimeMax() {
    return timeMax;
  }


  @JsonProperty(JSON_PROPERTY_TIME_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeMax(OffsetDateTime timeMax) {
    this.timeMax = timeMax;
  }


  public FreeBusyRequest emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  public FreeBusyRequest addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Get emails
   * @return emails
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEmails() {
    return emails;
  }


  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmails(List<String> emails) {
    this.emails = emails;
  }


  /**
   * Return true if this FreeBusyRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeBusyRequest freeBusyRequest = (FreeBusyRequest) o;
    return Objects.equals(this.timeMin, freeBusyRequest.timeMin) &&
        Objects.equals(this.timeMax, freeBusyRequest.timeMax) &&
        Objects.equals(this.emails, freeBusyRequest.emails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeMin, timeMax, emails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeBusyRequest {\n");
    sb.append("    timeMin: ").append(toIndentedString(timeMin)).append("\n");
    sb.append("    timeMax: ").append(toIndentedString(timeMax)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
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

    // add `timeMin` to the URL query string
    if (getTimeMin() != null) {
      joiner.add(String.format("%stimeMin%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeMin()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `timeMax` to the URL query string
    if (getTimeMax() != null) {
      joiner.add(String.format("%stimeMax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeMax()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `emails` to the URL query string
    if (getEmails() != null) {
      for (int i = 0; i < getEmails().size(); i++) {
        joiner.add(String.format("%semails%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getEmails().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}


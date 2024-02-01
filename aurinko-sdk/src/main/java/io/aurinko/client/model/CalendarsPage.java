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
import io.aurinko.client.model.Calendar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CalendarsPage
 */
@JsonPropertyOrder({
  CalendarsPage.JSON_PROPERTY_NEXT_PAGE_TOKEN,
  CalendarsPage.JSON_PROPERTY_LENGTH,
  CalendarsPage.JSON_PROPERTY_RECORDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-01T09:20:22.278375Z[Africa/Bamako]")
public class CalendarsPage {
  public static final String JSON_PROPERTY_NEXT_PAGE_TOKEN = "nextPageToken";
  private String nextPageToken;

  public static final String JSON_PROPERTY_LENGTH = "length";
  private Integer length;

  public static final String JSON_PROPERTY_RECORDS = "records";
  private List<Calendar> records;

  public CalendarsPage() { 
  }

  public CalendarsPage nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * Get nextPageToken
   * @return nextPageToken
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextPageToken() {
    return nextPageToken;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  public CalendarsPage length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLength() {
    return length;
  }


  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLength(Integer length) {
    this.length = length;
  }


  public CalendarsPage records(List<Calendar> records) {
    this.records = records;
    return this;
  }

  public CalendarsPage addRecordsItem(Calendar recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<>();
    }
    this.records.add(recordsItem);
    return this;
  }

   /**
   * Get records
   * @return records
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Calendar> getRecords() {
    return records;
  }


  @JsonProperty(JSON_PROPERTY_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecords(List<Calendar> records) {
    this.records = records;
  }


  /**
   * Return true if this CalendarsPage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarsPage calendarsPage = (CalendarsPage) o;
    return Objects.equals(this.nextPageToken, calendarsPage.nextPageToken) &&
        Objects.equals(this.length, calendarsPage.length) &&
        Objects.equals(this.records, calendarsPage.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, length, records);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarsPage {\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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

    // add `nextPageToken` to the URL query string
    if (getNextPageToken() != null) {
      joiner.add(String.format("%snextPageToken%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNextPageToken()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `length` to the URL query string
    if (getLength() != null) {
      joiner.add(String.format("%slength%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLength()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `records` to the URL query string
    if (getRecords() != null) {
      for (int i = 0; i < getRecords().size(); i++) {
        if (getRecords().get(i) != null) {
          joiner.add(getRecords().get(i).toUrlQueryString(String.format("%srecords%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}


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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OnlineMeetingDetails
 */
@JsonPropertyOrder({
  OnlineMeetingDetails.JSON_PROPERTY_URL,
  OnlineMeetingDetails.JSON_PROPERTY_PHONE,
  OnlineMeetingDetails.JSON_PROPERTY_PIN,
  OnlineMeetingDetails.JSON_PROPERTY_REGION_CODE,
  OnlineMeetingDetails.JSON_PROPERTY_SIP,
  OnlineMeetingDetails.JSON_PROPERTY_INFO_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class OnlineMeetingDetails {
  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;

  public static final String JSON_PROPERTY_PIN = "pin";
  private String pin;

  public static final String JSON_PROPERTY_REGION_CODE = "regionCode";
  private String regionCode;

  public static final String JSON_PROPERTY_SIP = "sip";
  private String sip;

  public static final String JSON_PROPERTY_INFO_URL = "infoUrl";
  private String infoUrl;

  public OnlineMeetingDetails() { 
  }

  @JsonCreator
  public OnlineMeetingDetails(
    @JsonProperty(JSON_PROPERTY_PHONE) String phone, 
    @JsonProperty(JSON_PROPERTY_PIN) String pin, 
    @JsonProperty(JSON_PROPERTY_REGION_CODE) String regionCode, 
    @JsonProperty(JSON_PROPERTY_SIP) String sip, 
    @JsonProperty(JSON_PROPERTY_INFO_URL) String infoUrl
  ) {
  this();
    this.phone = phone;
    this.pin = pin;
    this.regionCode = regionCode;
    this.sip = sip;
    this.infoUrl = infoUrl;
  }

  public OnlineMeetingDetails url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhone() {
    return phone;
  }




   /**
   * Get pin
   * @return pin
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPin() {
    return pin;
  }




   /**
   * Get regionCode
   * @return regionCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegionCode() {
    return regionCode;
  }




   /**
   * Get sip
   * @return sip
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSip() {
    return sip;
  }




   /**
   * Get infoUrl
   * @return infoUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInfoUrl() {
    return infoUrl;
  }




  /**
   * Return true if this OnlineMeetingDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnlineMeetingDetails onlineMeetingDetails = (OnlineMeetingDetails) o;
    return Objects.equals(this.url, onlineMeetingDetails.url) &&
        Objects.equals(this.phone, onlineMeetingDetails.phone) &&
        Objects.equals(this.pin, onlineMeetingDetails.pin) &&
        Objects.equals(this.regionCode, onlineMeetingDetails.regionCode) &&
        Objects.equals(this.sip, onlineMeetingDetails.sip) &&
        Objects.equals(this.infoUrl, onlineMeetingDetails.infoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, phone, pin, regionCode, sip, infoUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnlineMeetingDetails {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    sip: ").append(toIndentedString(sip)).append("\n");
    sb.append("    infoUrl: ").append(toIndentedString(infoUrl)).append("\n");
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

    // add `url` to the URL query string
    if (getUrl() != null) {
      joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `phone` to the URL query string
    if (getPhone() != null) {
      joiner.add(String.format("%sphone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPhone()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `pin` to the URL query string
    if (getPin() != null) {
      joiner.add(String.format("%spin%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPin()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `regionCode` to the URL query string
    if (getRegionCode() != null) {
      joiner.add(String.format("%sregionCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRegionCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sip` to the URL query string
    if (getSip() != null) {
      joiner.add(String.format("%ssip%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSip()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `infoUrl` to the URL query string
    if (getInfoUrl() != null) {
      joiner.add(String.format("%sinfoUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInfoUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


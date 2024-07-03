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


import io.aurinko.client.ApiClient;
/**
 * ContactName
 */
@JsonPropertyOrder({
  ContactName.JSON_PROPERTY_DISPLAY_NAME,
  ContactName.JSON_PROPERTY_PREFIX,
  ContactName.JSON_PROPERTY_GIVEN_NAME,
  ContactName.JSON_PROPERTY_MIDDLE_NAME,
  ContactName.JSON_PROPERTY_FAMILY_NAME,
  ContactName.JSON_PROPERTY_SUFFIX,
  ContactName.JSON_PROPERTY_YOMI_GIVEN_NAME,
  ContactName.JSON_PROPERTY_YOMI_FAMILY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class ContactName {
  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public static final String JSON_PROPERTY_GIVEN_NAME = "givenName";
  private String givenName;

  public static final String JSON_PROPERTY_MIDDLE_NAME = "middleName";
  private String middleName;

  public static final String JSON_PROPERTY_FAMILY_NAME = "familyName";
  private String familyName;

  public static final String JSON_PROPERTY_SUFFIX = "suffix";
  private String suffix;

  public static final String JSON_PROPERTY_YOMI_GIVEN_NAME = "yomiGivenName";
  private String yomiGivenName;

  public static final String JSON_PROPERTY_YOMI_FAMILY_NAME = "yomiFamilyName";
  private String yomiFamilyName;

  public ContactName() { 
  }

  public ContactName displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public ContactName prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Get prefix
   * @return prefix
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrefix() {
    return prefix;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public ContactName givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Get givenName
   * @return givenName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGivenName() {
    return givenName;
  }


  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  public ContactName middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Get middleName
   * @return middleName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIDDLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMiddleName() {
    return middleName;
  }


  @JsonProperty(JSON_PROPERTY_MIDDLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public ContactName familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * Get familyName
   * @return familyName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFamilyName() {
    return familyName;
  }


  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  public ContactName suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

  /**
   * Get suffix
   * @return suffix
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSuffix() {
    return suffix;
  }


  @JsonProperty(JSON_PROPERTY_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }


  public ContactName yomiGivenName(String yomiGivenName) {
    this.yomiGivenName = yomiGivenName;
    return this;
  }

  /**
   * Get yomiGivenName
   * @return yomiGivenName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_YOMI_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getYomiGivenName() {
    return yomiGivenName;
  }


  @JsonProperty(JSON_PROPERTY_YOMI_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYomiGivenName(String yomiGivenName) {
    this.yomiGivenName = yomiGivenName;
  }


  public ContactName yomiFamilyName(String yomiFamilyName) {
    this.yomiFamilyName = yomiFamilyName;
    return this;
  }

  /**
   * Get yomiFamilyName
   * @return yomiFamilyName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_YOMI_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getYomiFamilyName() {
    return yomiFamilyName;
  }


  @JsonProperty(JSON_PROPERTY_YOMI_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYomiFamilyName(String yomiFamilyName) {
    this.yomiFamilyName = yomiFamilyName;
  }


  /**
   * Return true if this ContactName object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactName contactName = (ContactName) o;
    return Objects.equals(this.displayName, contactName.displayName) &&
        Objects.equals(this.prefix, contactName.prefix) &&
        Objects.equals(this.givenName, contactName.givenName) &&
        Objects.equals(this.middleName, contactName.middleName) &&
        Objects.equals(this.familyName, contactName.familyName) &&
        Objects.equals(this.suffix, contactName.suffix) &&
        Objects.equals(this.yomiGivenName, contactName.yomiGivenName) &&
        Objects.equals(this.yomiFamilyName, contactName.yomiFamilyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, prefix, givenName, middleName, familyName, suffix, yomiGivenName, yomiFamilyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactName {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    yomiGivenName: ").append(toIndentedString(yomiGivenName)).append("\n");
    sb.append("    yomiFamilyName: ").append(toIndentedString(yomiFamilyName)).append("\n");
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

    // add `displayName` to the URL query string
    if (getDisplayName() != null) {
      joiner.add(String.format("%sdisplayName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDisplayName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `prefix` to the URL query string
    if (getPrefix() != null) {
      joiner.add(String.format("%sprefix%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPrefix()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `givenName` to the URL query string
    if (getGivenName() != null) {
      joiner.add(String.format("%sgivenName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getGivenName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `middleName` to the URL query string
    if (getMiddleName() != null) {
      joiner.add(String.format("%smiddleName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMiddleName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `familyName` to the URL query string
    if (getFamilyName() != null) {
      joiner.add(String.format("%sfamilyName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFamilyName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `suffix` to the URL query string
    if (getSuffix() != null) {
      joiner.add(String.format("%ssuffix%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSuffix()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `yomiGivenName` to the URL query string
    if (getYomiGivenName() != null) {
      joiner.add(String.format("%syomiGivenName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getYomiGivenName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `yomiFamilyName` to the URL query string
    if (getYomiFamilyName() != null) {
      joiner.add(String.format("%syomiFamilyName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getYomiFamilyName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


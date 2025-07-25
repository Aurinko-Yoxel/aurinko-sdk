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
import io.aurinko.client.model.RecurrenceIcal;
import io.aurinko.client.model.RecurrenceSimple;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import io.aurinko.client.ApiClient;
/**
 * Recurrence
 */
@JsonPropertyOrder({
  Recurrence.JSON_PROPERTY_ORIGINAL,
  Recurrence.JSON_PROPERTY_ICAL,
  Recurrence.JSON_PROPERTY_SIMPLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class Recurrence {
  /**
   * Gets or Sets original
   */
  public enum OriginalEnum {
    SIMPLE(String.valueOf("simple")),
    
    ICAL(String.valueOf("ical")),
    
    UNKNOWN_DEFAULT_OPEN_API(String.valueOf("unknown_default_open_api"));

    private String value;

    OriginalEnum(String value) {
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
    public static OriginalEnum fromValue(String value) {
      for (OriginalEnum b : OriginalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_ORIGINAL = "original";
  @javax.annotation.Nullable
  private OriginalEnum original;

  public static final String JSON_PROPERTY_ICAL = "ical";
  @javax.annotation.Nullable
  private RecurrenceIcal ical;

  public static final String JSON_PROPERTY_SIMPLE = "simple";
  @javax.annotation.Nullable
  private RecurrenceSimple simple;

  public Recurrence() { 
  }

  @JsonCreator
  public Recurrence(
    @JsonProperty(JSON_PROPERTY_ORIGINAL) OriginalEnum original
  ) {
  this();
    this.original = original;
  }

  /**
   * Get original
   * @return original
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OriginalEnum getOriginal() {
    return original;
  }




  public Recurrence ical(@javax.annotation.Nullable RecurrenceIcal ical) {
    this.ical = ical;
    return this;
  }

  /**
   * Get ical
   * @return ical
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ICAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RecurrenceIcal getIcal() {
    return ical;
  }


  @JsonProperty(JSON_PROPERTY_ICAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIcal(@javax.annotation.Nullable RecurrenceIcal ical) {
    this.ical = ical;
  }


  public Recurrence simple(@javax.annotation.Nullable RecurrenceSimple simple) {
    this.simple = simple;
    return this;
  }

  /**
   * Get simple
   * @return simple
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIMPLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RecurrenceSimple getSimple() {
    return simple;
  }


  @JsonProperty(JSON_PROPERTY_SIMPLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSimple(@javax.annotation.Nullable RecurrenceSimple simple) {
    this.simple = simple;
  }


  /**
   * Return true if this Recurrence object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recurrence recurrence = (Recurrence) o;
    return Objects.equals(this.original, recurrence.original) &&
        Objects.equals(this.ical, recurrence.ical) &&
        Objects.equals(this.simple, recurrence.simple);
  }

  @Override
  public int hashCode() {
    return Objects.hash(original, ical, simple);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recurrence {\n");
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
    sb.append("    ical: ").append(toIndentedString(ical)).append("\n");
    sb.append("    simple: ").append(toIndentedString(simple)).append("\n");
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

    // add `original` to the URL query string
    if (getOriginal() != null) {
      joiner.add(String.format("%soriginal%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOriginal()))));
    }

    // add `ical` to the URL query string
    if (getIcal() != null) {
      joiner.add(getIcal().toUrlQueryString(prefix + "ical" + suffix));
    }

    // add `simple` to the URL query string
    if (getSimple() != null) {
      joiner.add(getSimple().toUrlQueryString(prefix + "simple" + suffix));
    }

    return joiner.toString();
  }
}


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
 * ContactPhoneNumber
 */
@JsonPropertyOrder({
  ContactPhoneNumber.JSON_PROPERTY_NUMBER,
  ContactPhoneNumber.JSON_PROPERTY_TYPE,
  ContactPhoneNumber.JSON_PROPERTY_CANONICAL_FORM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-08T10:31:33.594723Z[Africa/Bamako]")
public class ContactPhoneNumber {
  public static final String JSON_PROPERTY_NUMBER = "number";
  private String number;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    WORK("work"),
    
    HOME("home"),
    
    OTHER("other"),
    
    MOBILE("mobile"),
    
    WORKMOBILE("workMobile"),
    
    MAIN("main"),
    
    COMPANYMAIN("companyMain"),
    
    ASSISTANT("assistant"),
    
    WORKFAX("workFax"),
    
    HOMEFAX("homeFax"),
    
    OTHERFAX("otherFax"),
    
    CALLBACK("callback"),
    
    PAGER("pager"),
    
    WORKPAGER("workPager"),
    
    RADIO("radio"),
    
    TELEX("telex"),
    
    TTY("tty");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_CANONICAL_FORM = "canonicalForm";
  private String canonicalForm;

  public ContactPhoneNumber() { 
  }

  @JsonCreator
  public ContactPhoneNumber(
    @JsonProperty(JSON_PROPERTY_CANONICAL_FORM) String canonicalForm
  ) {
  this();
    this.canonicalForm = canonicalForm;
  }

  public ContactPhoneNumber number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumber(String number) {
    this.number = number;
  }


  public ContactPhoneNumber type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


   /**
   * Get canonicalForm
   * @return canonicalForm
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CANONICAL_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCanonicalForm() {
    return canonicalForm;
  }




  /**
   * Return true if this ContactPhoneNumber object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactPhoneNumber contactPhoneNumber = (ContactPhoneNumber) o;
    return Objects.equals(this.number, contactPhoneNumber.number) &&
        Objects.equals(this.type, contactPhoneNumber.type) &&
        Objects.equals(this.canonicalForm, contactPhoneNumber.canonicalForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, type, canonicalForm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactPhoneNumber {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    canonicalForm: ").append(toIndentedString(canonicalForm)).append("\n");
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

    // add `number` to the URL query string
    if (getNumber() != null) {
      joiner.add(String.format("%snumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `canonicalForm` to the URL query string
    if (getCanonicalForm() != null) {
      joiner.add(String.format("%scanonicalForm%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCanonicalForm()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


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
 * SubscriptionResponse
 */
@JsonPropertyOrder({
  SubscriptionResponse.JSON_PROPERTY_ID,
  SubscriptionResponse.JSON_PROPERTY_RESOURCE,
  SubscriptionResponse.JSON_PROPERTY_NOTIFICATION_URL,
  SubscriptionResponse.JSON_PROPERTY_ACTIVE,
  SubscriptionResponse.JSON_PROPERTY_FAIL_SINCE,
  SubscriptionResponse.JSON_PROPERTY_FAIL_DESCRIPTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class SubscriptionResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_RESOURCE = "resource";
  private String resource;

  public static final String JSON_PROPERTY_NOTIFICATION_URL = "notificationUrl";
  private String notificationUrl;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_FAIL_SINCE = "failSince";
  private OffsetDateTime failSince;

  public static final String JSON_PROPERTY_FAIL_DESCRIPTION = "failDescription";
  private String failDescription;

  public SubscriptionResponse() { 
  }

  public SubscriptionResponse id(Long id) {
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


  public SubscriptionResponse resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResource() {
    return resource;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResource(String resource) {
    this.resource = resource;
  }


  public SubscriptionResponse notificationUrl(String notificationUrl) {
    this.notificationUrl = notificationUrl;
    return this;
  }

   /**
   * Get notificationUrl
   * @return notificationUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotificationUrl() {
    return notificationUrl;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotificationUrl(String notificationUrl) {
    this.notificationUrl = notificationUrl;
  }


  public SubscriptionResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public SubscriptionResponse failSince(OffsetDateTime failSince) {
    this.failSince = failSince;
    return this;
  }

   /**
   * Get failSince
   * @return failSince
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAIL_SINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getFailSince() {
    return failSince;
  }


  @JsonProperty(JSON_PROPERTY_FAIL_SINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailSince(OffsetDateTime failSince) {
    this.failSince = failSince;
  }


  public SubscriptionResponse failDescription(String failDescription) {
    this.failDescription = failDescription;
    return this;
  }

   /**
   * Get failDescription
   * @return failDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAIL_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailDescription() {
    return failDescription;
  }


  @JsonProperty(JSON_PROPERTY_FAIL_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailDescription(String failDescription) {
    this.failDescription = failDescription;
  }


  /**
   * Return true if this SubscriptionResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionResponse subscriptionResponse = (SubscriptionResponse) o;
    return Objects.equals(this.id, subscriptionResponse.id) &&
        Objects.equals(this.resource, subscriptionResponse.resource) &&
        Objects.equals(this.notificationUrl, subscriptionResponse.notificationUrl) &&
        Objects.equals(this.active, subscriptionResponse.active) &&
        Objects.equals(this.failSince, subscriptionResponse.failSince) &&
        Objects.equals(this.failDescription, subscriptionResponse.failDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, resource, notificationUrl, active, failSince, failDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    notificationUrl: ").append(toIndentedString(notificationUrl)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    failSince: ").append(toIndentedString(failSince)).append("\n");
    sb.append("    failDescription: ").append(toIndentedString(failDescription)).append("\n");
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

    // add `resource` to the URL query string
    if (getResource() != null) {
      joiner.add(String.format("%sresource%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResource()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `notificationUrl` to the URL query string
    if (getNotificationUrl() != null) {
      joiner.add(String.format("%snotificationUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNotificationUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `active` to the URL query string
    if (getActive() != null) {
      joiner.add(String.format("%sactive%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActive()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `failSince` to the URL query string
    if (getFailSince() != null) {
      joiner.add(String.format("%sfailSince%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFailSince()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `failDescription` to the URL query string
    if (getFailDescription() != null) {
      joiner.add(String.format("%sfailDescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFailDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


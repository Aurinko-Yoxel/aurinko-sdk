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
 * EmailAttachment
 */
@JsonPropertyOrder({
  EmailAttachment.JSON_PROPERTY_ID,
  EmailAttachment.JSON_PROPERTY_NAME,
  EmailAttachment.JSON_PROPERTY_MIME_TYPE,
  EmailAttachment.JSON_PROPERTY_SIZE,
  EmailAttachment.JSON_PROPERTY_INLINE,
  EmailAttachment.JSON_PROPERTY_CONTENT_ID,
  EmailAttachment.JSON_PROPERTY_CONTENT,
  EmailAttachment.JSON_PROPERTY_CONTENT_LOCATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T11:18:51.511282Z[Africa/Bamako]")
public class EmailAttachment {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_MIME_TYPE = "mimeType";
  private String mimeType;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Integer size;

  public static final String JSON_PROPERTY_INLINE = "inline";
  private Boolean inline;

  public static final String JSON_PROPERTY_CONTENT_ID = "contentId";
  private String contentId;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_CONTENT_LOCATION = "contentLocation";
  private String contentLocation;

  public EmailAttachment() { 
  }

  @JsonCreator
  public EmailAttachment(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_MIME_TYPE) String mimeType, 
    @JsonProperty(JSON_PROPERTY_SIZE) Integer size, 
    @JsonProperty(JSON_PROPERTY_INLINE) Boolean inline, 
    @JsonProperty(JSON_PROPERTY_CONTENT_ID) String contentId, 
    @JsonProperty(JSON_PROPERTY_CONTENT) String content, 
    @JsonProperty(JSON_PROPERTY_CONTENT_LOCATION) String contentLocation
  ) {
  this();
    this.id = id;
    this.name = name;
    this.mimeType = mimeType;
    this.size = size;
    this.inline = inline;
    this.contentId = contentId;
    this.content = content;
    this.contentLocation = contentLocation;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }




   /**
   * Get mimeType
   * @return mimeType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMimeType() {
    return mimeType;
  }




   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSize() {
    return size;
  }




   /**
   * Get inline
   * @return inline
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInline() {
    return inline;
  }




   /**
   * Get contentId
   * @return contentId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentId() {
    return contentId;
  }




   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContent() {
    return content;
  }




   /**
   * Get contentLocation
   * @return contentLocation
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentLocation() {
    return contentLocation;
  }




  /**
   * Return true if this EmailAttachment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailAttachment emailAttachment = (EmailAttachment) o;
    return Objects.equals(this.id, emailAttachment.id) &&
        Objects.equals(this.name, emailAttachment.name) &&
        Objects.equals(this.mimeType, emailAttachment.mimeType) &&
        Objects.equals(this.size, emailAttachment.size) &&
        Objects.equals(this.inline, emailAttachment.inline) &&
        Objects.equals(this.contentId, emailAttachment.contentId) &&
        Objects.equals(this.content, emailAttachment.content) &&
        Objects.equals(this.contentLocation, emailAttachment.contentLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, mimeType, size, inline, contentId, content, contentLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailAttachment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    inline: ").append(toIndentedString(inline)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentLocation: ").append(toIndentedString(contentLocation)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `mimeType` to the URL query string
    if (getMimeType() != null) {
      joiner.add(String.format("%smimeType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMimeType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `size` to the URL query string
    if (getSize() != null) {
      joiner.add(String.format("%ssize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `inline` to the URL query string
    if (getInline() != null) {
      joiner.add(String.format("%sinline%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInline()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `contentId` to the URL query string
    if (getContentId() != null) {
      joiner.add(String.format("%scontentId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContentId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `content` to the URL query string
    if (getContent() != null) {
      joiner.add(String.format("%scontent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContent()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `contentLocation` to the URL query string
    if (getContentLocation() != null) {
      joiner.add(String.format("%scontentLocation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContentLocation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


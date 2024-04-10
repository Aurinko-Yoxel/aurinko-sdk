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
import io.aurinko.client.model.SelectedMeetingTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateMeetingDto
 */
@JsonPropertyOrder({
  CreateMeetingDto.JSON_PROPERTY_TIME,
  CreateMeetingDto.JSON_PROPERTY_USER_IDS,
  CreateMeetingDto.JSON_PROPERTY_NAME,
  CreateMeetingDto.JSON_PROPERTY_EMAIL,
  CreateMeetingDto.JSON_PROPERTY_SUBSTITUTION_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CreateMeetingDto {
  public static final String JSON_PROPERTY_TIME = "time";
  private SelectedMeetingTime time;

  public static final String JSON_PROPERTY_USER_IDS = "userIds";
  private List<String> userIds;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_SUBSTITUTION_DATA = "substitutionData";
  private Map<String, String> substitutionData = new HashMap<>();

  public CreateMeetingDto() { 
  }

  public CreateMeetingDto time(SelectedMeetingTime time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SelectedMeetingTime getTime() {
    return time;
  }


  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTime(SelectedMeetingTime time) {
    this.time = time;
  }


  public CreateMeetingDto userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }

  public CreateMeetingDto addUserIdsItem(String userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Get userIds
   * @return userIds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUserIds() {
    return userIds;
  }


  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  public CreateMeetingDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Username of the person requesting the meeting
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public CreateMeetingDto email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the person requesting the meeting
   * @return email
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public CreateMeetingDto substitutionData(Map<String, String> substitutionData) {
    this.substitutionData = substitutionData;
    return this;
  }

  public CreateMeetingDto putSubstitutionDataItem(String key, String substitutionDataItem) {
    if (this.substitutionData == null) {
      this.substitutionData = new HashMap<>();
    }
    this.substitutionData.put(key, substitutionDataItem);
    return this;
  }

   /**
   * Data for substitution instead of templates, key - value
   * @return substitutionData
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSTITUTION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getSubstitutionData() {
    return substitutionData;
  }


  @JsonProperty(JSON_PROPERTY_SUBSTITUTION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubstitutionData(Map<String, String> substitutionData) {
    this.substitutionData = substitutionData;
  }


  /**
   * Return true if this CreateMeetingDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMeetingDto createMeetingDto = (CreateMeetingDto) o;
    return Objects.equals(this.time, createMeetingDto.time) &&
        Objects.equals(this.userIds, createMeetingDto.userIds) &&
        Objects.equals(this.name, createMeetingDto.name) &&
        Objects.equals(this.email, createMeetingDto.email) &&
        Objects.equals(this.substitutionData, createMeetingDto.substitutionData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, userIds, name, email, substitutionData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMeetingDto {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    substitutionData: ").append(toIndentedString(substitutionData)).append("\n");
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

    // add `time` to the URL query string
    if (getTime() != null) {
      joiner.add(getTime().toUrlQueryString(prefix + "time" + suffix));
    }

    // add `userIds` to the URL query string
    if (getUserIds() != null) {
      for (int i = 0; i < getUserIds().size(); i++) {
        joiner.add(String.format("%suserIds%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getUserIds().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `substitutionData` to the URL query string
    if (getSubstitutionData() != null) {
      for (String _key : getSubstitutionData().keySet()) {
        joiner.add(String.format("%ssubstitutionData%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getSubstitutionData().get(_key), URLEncoder.encode(String.valueOf(getSubstitutionData().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}


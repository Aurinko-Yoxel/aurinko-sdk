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
import io.aurinko.client.model.Scope;
import io.aurinko.client.model.ServiceType;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiAccountInDto
 */
@JsonPropertyOrder({
  ApiAccountInDto.JSON_PROPERTY_SERVICE_TYPE,
  ApiAccountInDto.JSON_PROPERTY_AUTH_SCOPES,
  ApiAccountInDto.JSON_PROPERTY_AUTH_ORG_ID,
  ApiAccountInDto.JSON_PROPERTY_AUTH_USER_ID,
  ApiAccountInDto.JSON_PROPERTY_CLIENT_ORG_ID,
  ApiAccountInDto.JSON_PROPERTY_SERVER_URL,
  ApiAccountInDto.JSON_PROPERTY_LOGIN_STRING,
  ApiAccountInDto.JSON_PROPERTY_OAUTH_CLIENT_ID,
  ApiAccountInDto.JSON_PROPERTY_ACTIVE,
  ApiAccountInDto.JSON_PROPERTY_AUTH_STRING1,
  ApiAccountInDto.JSON_PROPERTY_AUTH_STRING2,
  ApiAccountInDto.JSON_PROPERTY_AUTH_OBTAINED_AT,
  ApiAccountInDto.JSON_PROPERTY_AUTH_EXPIRES_AT,
  ApiAccountInDto.JSON_PROPERTY_EMAIL,
  ApiAccountInDto.JSON_PROPERTY_NAME,
  ApiAccountInDto.JSON_PROPERTY_SERVER_INFO,
  ApiAccountInDto.JSON_PROPERTY_TIMEZONE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiAccountInDto {
  public static final String JSON_PROPERTY_SERVICE_TYPE = "serviceType";
  private ServiceType serviceType;

  public static final String JSON_PROPERTY_AUTH_SCOPES = "authScopes";
  private List<Scope> authScopes;

  public static final String JSON_PROPERTY_AUTH_ORG_ID = "authOrgId";
  private String authOrgId;

  public static final String JSON_PROPERTY_AUTH_USER_ID = "authUserId";
  private String authUserId;

  public static final String JSON_PROPERTY_CLIENT_ORG_ID = "clientOrgId";
  private String clientOrgId;

  public static final String JSON_PROPERTY_SERVER_URL = "serverUrl";
  private String serverUrl;

  public static final String JSON_PROPERTY_LOGIN_STRING = "loginString";
  private String loginString;

  public static final String JSON_PROPERTY_OAUTH_CLIENT_ID = "oauthClientId";
  private String oauthClientId;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_AUTH_STRING1 = "authString1";
  private String authString1;

  public static final String JSON_PROPERTY_AUTH_STRING2 = "authString2";
  private String authString2;

  public static final String JSON_PROPERTY_AUTH_OBTAINED_AT = "authObtainedAt";
  private OffsetDateTime authObtainedAt;

  public static final String JSON_PROPERTY_AUTH_EXPIRES_AT = "authExpiresAt";
  private OffsetDateTime authExpiresAt;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SERVER_INFO = "serverInfo";
  private String serverInfo;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public ApiAccountInDto() { 
  }

  public ApiAccountInDto serviceType(ServiceType serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Get serviceType
   * @return serviceType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServiceType getServiceType() {
    return serviceType;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceType(ServiceType serviceType) {
    this.serviceType = serviceType;
  }


  public ApiAccountInDto authScopes(List<Scope> authScopes) {
    this.authScopes = authScopes;
    return this;
  }

  public ApiAccountInDto addAuthScopesItem(Scope authScopesItem) {
    if (this.authScopes == null) {
      this.authScopes = new ArrayList<>();
    }
    this.authScopes.add(authScopesItem);
    return this;
  }

   /**
   * Get authScopes
   * @return authScopes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_SCOPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Scope> getAuthScopes() {
    return authScopes;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_SCOPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthScopes(List<Scope> authScopes) {
    this.authScopes = authScopes;
  }


  public ApiAccountInDto authOrgId(String authOrgId) {
    this.authOrgId = authOrgId;
    return this;
  }

   /**
   * Get authOrgId
   * @return authOrgId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthOrgId() {
    return authOrgId;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthOrgId(String authOrgId) {
    this.authOrgId = authOrgId;
  }


  public ApiAccountInDto authUserId(String authUserId) {
    this.authUserId = authUserId;
    return this;
  }

   /**
   * Get authUserId
   * @return authUserId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthUserId() {
    return authUserId;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthUserId(String authUserId) {
    this.authUserId = authUserId;
  }


  public ApiAccountInDto clientOrgId(String clientOrgId) {
    this.clientOrgId = clientOrgId;
    return this;
  }

   /**
   * Get clientOrgId
   * @return clientOrgId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientOrgId() {
    return clientOrgId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientOrgId(String clientOrgId) {
    this.clientOrgId = clientOrgId;
  }


  public ApiAccountInDto serverUrl(String serverUrl) {
    this.serverUrl = serverUrl;
    return this;
  }

   /**
   * Get serverUrl
   * @return serverUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServerUrl() {
    return serverUrl;
  }


  @JsonProperty(JSON_PROPERTY_SERVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServerUrl(String serverUrl) {
    this.serverUrl = serverUrl;
  }


  public ApiAccountInDto loginString(String loginString) {
    this.loginString = loginString;
    return this;
  }

   /**
   * Get loginString
   * @return loginString
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGIN_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLoginString() {
    return loginString;
  }


  @JsonProperty(JSON_PROPERTY_LOGIN_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoginString(String loginString) {
    this.loginString = loginString;
  }


  public ApiAccountInDto oauthClientId(String oauthClientId) {
    this.oauthClientId = oauthClientId;
    return this;
  }

   /**
   * Get oauthClientId
   * @return oauthClientId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OAUTH_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOauthClientId() {
    return oauthClientId;
  }


  @JsonProperty(JSON_PROPERTY_OAUTH_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOauthClientId(String oauthClientId) {
    this.oauthClientId = oauthClientId;
  }


  public ApiAccountInDto active(Boolean active) {
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


  public ApiAccountInDto authString1(String authString1) {
    this.authString1 = authString1;
    return this;
  }

   /**
   * Get authString1
   * @return authString1
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_STRING1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthString1() {
    return authString1;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_STRING1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthString1(String authString1) {
    this.authString1 = authString1;
  }


  public ApiAccountInDto authString2(String authString2) {
    this.authString2 = authString2;
    return this;
  }

   /**
   * Get authString2
   * @return authString2
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_STRING2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthString2() {
    return authString2;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_STRING2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthString2(String authString2) {
    this.authString2 = authString2;
  }


  public ApiAccountInDto authObtainedAt(OffsetDateTime authObtainedAt) {
    this.authObtainedAt = authObtainedAt;
    return this;
  }

   /**
   * Get authObtainedAt
   * @return authObtainedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_OBTAINED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getAuthObtainedAt() {
    return authObtainedAt;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_OBTAINED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthObtainedAt(OffsetDateTime authObtainedAt) {
    this.authObtainedAt = authObtainedAt;
  }


  public ApiAccountInDto authExpiresAt(OffsetDateTime authExpiresAt) {
    this.authExpiresAt = authExpiresAt;
    return this;
  }

   /**
   * Get authExpiresAt
   * @return authExpiresAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getAuthExpiresAt() {
    return authExpiresAt;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthExpiresAt(OffsetDateTime authExpiresAt) {
    this.authExpiresAt = authExpiresAt;
  }


  public ApiAccountInDto email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
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


  public ApiAccountInDto name(String name) {
    this.name = name;
    return this;
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


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ApiAccountInDto serverInfo(String serverInfo) {
    this.serverInfo = serverInfo;
    return this;
  }

   /**
   * Get serverInfo
   * @return serverInfo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServerInfo() {
    return serverInfo;
  }


  @JsonProperty(JSON_PROPERTY_SERVER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServerInfo(String serverInfo) {
    this.serverInfo = serverInfo;
  }


  public ApiAccountInDto timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  /**
   * Return true if this ApiAccountInDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAccountInDto apiAccountInDto = (ApiAccountInDto) o;
    return Objects.equals(this.serviceType, apiAccountInDto.serviceType) &&
        Objects.equals(this.authScopes, apiAccountInDto.authScopes) &&
        Objects.equals(this.authOrgId, apiAccountInDto.authOrgId) &&
        Objects.equals(this.authUserId, apiAccountInDto.authUserId) &&
        Objects.equals(this.clientOrgId, apiAccountInDto.clientOrgId) &&
        Objects.equals(this.serverUrl, apiAccountInDto.serverUrl) &&
        Objects.equals(this.loginString, apiAccountInDto.loginString) &&
        Objects.equals(this.oauthClientId, apiAccountInDto.oauthClientId) &&
        Objects.equals(this.active, apiAccountInDto.active) &&
        Objects.equals(this.authString1, apiAccountInDto.authString1) &&
        Objects.equals(this.authString2, apiAccountInDto.authString2) &&
        Objects.equals(this.authObtainedAt, apiAccountInDto.authObtainedAt) &&
        Objects.equals(this.authExpiresAt, apiAccountInDto.authExpiresAt) &&
        Objects.equals(this.email, apiAccountInDto.email) &&
        Objects.equals(this.name, apiAccountInDto.name) &&
        Objects.equals(this.serverInfo, apiAccountInDto.serverInfo) &&
        Objects.equals(this.timezone, apiAccountInDto.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceType, authScopes, authOrgId, authUserId, clientOrgId, serverUrl, loginString, oauthClientId, active, authString1, authString2, authObtainedAt, authExpiresAt, email, name, serverInfo, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAccountInDto {\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    authScopes: ").append(toIndentedString(authScopes)).append("\n");
    sb.append("    authOrgId: ").append(toIndentedString(authOrgId)).append("\n");
    sb.append("    authUserId: ").append(toIndentedString(authUserId)).append("\n");
    sb.append("    clientOrgId: ").append(toIndentedString(clientOrgId)).append("\n");
    sb.append("    serverUrl: ").append(toIndentedString(serverUrl)).append("\n");
    sb.append("    loginString: ").append(toIndentedString(loginString)).append("\n");
    sb.append("    oauthClientId: ").append(toIndentedString(oauthClientId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    authString1: ").append(toIndentedString(authString1)).append("\n");
    sb.append("    authString2: ").append(toIndentedString(authString2)).append("\n");
    sb.append("    authObtainedAt: ").append(toIndentedString(authObtainedAt)).append("\n");
    sb.append("    authExpiresAt: ").append(toIndentedString(authExpiresAt)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serverInfo: ").append(toIndentedString(serverInfo)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

    // add `serviceType` to the URL query string
    if (getServiceType() != null) {
      joiner.add(String.format("%sserviceType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServiceType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `authScopes` to the URL query string
    if (getAuthScopes() != null) {
      for (int i = 0; i < getAuthScopes().size(); i++) {
        if (getAuthScopes().get(i) != null) {
          joiner.add(String.format("%sauthScopes%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getAuthScopes().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }
      }
    }

    // add `authOrgId` to the URL query string
    if (getAuthOrgId() != null) {
      joiner.add(String.format("%sauthOrgId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthOrgId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `authUserId` to the URL query string
    if (getAuthUserId() != null) {
      joiner.add(String.format("%sauthUserId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthUserId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `clientOrgId` to the URL query string
    if (getClientOrgId() != null) {
      joiner.add(String.format("%sclientOrgId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientOrgId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `serverUrl` to the URL query string
    if (getServerUrl() != null) {
      joiner.add(String.format("%sserverUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServerUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `loginString` to the URL query string
    if (getLoginString() != null) {
      joiner.add(String.format("%sloginString%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLoginString()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `oauthClientId` to the URL query string
    if (getOauthClientId() != null) {
      joiner.add(String.format("%soauthClientId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOauthClientId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `active` to the URL query string
    if (getActive() != null) {
      joiner.add(String.format("%sactive%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActive()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `authString1` to the URL query string
    if (getAuthString1() != null) {
      joiner.add(String.format("%sauthString1%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthString1()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `authString2` to the URL query string
    if (getAuthString2() != null) {
      joiner.add(String.format("%sauthString2%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthString2()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `authObtainedAt` to the URL query string
    if (getAuthObtainedAt() != null) {
      joiner.add(String.format("%sauthObtainedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthObtainedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `authExpiresAt` to the URL query string
    if (getAuthExpiresAt() != null) {
      joiner.add(String.format("%sauthExpiresAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthExpiresAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `serverInfo` to the URL query string
    if (getServerInfo() != null) {
      joiner.add(String.format("%sserverInfo%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServerInfo()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `timezone` to the URL query string
    if (getTimezone() != null) {
      joiner.add(String.format("%stimezone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimezone()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


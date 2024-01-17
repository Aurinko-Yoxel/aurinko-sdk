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
import io.aurinko.client.model.AccountType;
import io.aurinko.client.model.Scope;
import io.aurinko.client.model.ServiceType;
import io.aurinko.client.model.TokenStatus;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiAccountOutDto
 */
@JsonPropertyOrder({
  ApiAccountOutDto.JSON_PROPERTY_ID,
  ApiAccountOutDto.JSON_PROPERTY_PARENT_ID,
  ApiAccountOutDto.JSON_PROPERTY_SERVICE_TYPE,
  ApiAccountOutDto.JSON_PROPERTY_ACTIVE,
  ApiAccountOutDto.JSON_PROPERTY_TOKEN_STATUS,
  ApiAccountOutDto.JSON_PROPERTY_TOKEN_ERROR,
  ApiAccountOutDto.JSON_PROPERTY_TYPE,
  ApiAccountOutDto.JSON_PROPERTY_DAEMON,
  ApiAccountOutDto.JSON_PROPERTY_LOGIN_STRING,
  ApiAccountOutDto.JSON_PROPERTY_EMAIL,
  ApiAccountOutDto.JSON_PROPERTY_MAILBOX_ADDRESS,
  ApiAccountOutDto.JSON_PROPERTY_NAME,
  ApiAccountOutDto.JSON_PROPERTY_NAME2,
  ApiAccountOutDto.JSON_PROPERTY_SERVER_URL,
  ApiAccountOutDto.JSON_PROPERTY_SERVER_URL2,
  ApiAccountOutDto.JSON_PROPERTY_CLIENT_ORG_ID,
  ApiAccountOutDto.JSON_PROPERTY_AUTH_USER_ID,
  ApiAccountOutDto.JSON_PROPERTY_AUTH_ORG_ID,
  ApiAccountOutDto.JSON_PROPERTY_TIMEZONE,
  ApiAccountOutDto.JSON_PROPERTY_TOKEN_ISSUED_AT,
  ApiAccountOutDto.JSON_PROPERTY_AUTH_SCOPES,
  ApiAccountOutDto.JSON_PROPERTY_AUTH_NATIVE_SCOPES,
  ApiAccountOutDto.JSON_PROPERTY_AUTH_OBTAINED_AT,
  ApiAccountOutDto.JSON_PROPERTY_AUTH_EXPIRES_AT,
  ApiAccountOutDto.JSON_PROPERTY_USER_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T11:18:51.511282Z[Africa/Bamako]")
public class ApiAccountOutDto {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_PARENT_ID = "parentId";
  private Long parentId;

  public static final String JSON_PROPERTY_SERVICE_TYPE = "serviceType";
  private ServiceType serviceType;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_TOKEN_STATUS = "tokenStatus";
  private TokenStatus tokenStatus;

  public static final String JSON_PROPERTY_TOKEN_ERROR = "tokenError";
  private String tokenError;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AccountType type;

  public static final String JSON_PROPERTY_DAEMON = "daemon";
  private Boolean daemon;

  public static final String JSON_PROPERTY_LOGIN_STRING = "loginString";
  private String loginString;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_MAILBOX_ADDRESS = "mailboxAddress";
  private String mailboxAddress;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NAME2 = "name2";
  private String name2;

  public static final String JSON_PROPERTY_SERVER_URL = "serverUrl";
  private String serverUrl;

  public static final String JSON_PROPERTY_SERVER_URL2 = "serverUrl2";
  private String serverUrl2;

  public static final String JSON_PROPERTY_CLIENT_ORG_ID = "clientOrgId";
  private String clientOrgId;

  public static final String JSON_PROPERTY_AUTH_USER_ID = "authUserId";
  private String authUserId;

  public static final String JSON_PROPERTY_AUTH_ORG_ID = "authOrgId";
  private String authOrgId;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_TOKEN_ISSUED_AT = "tokenIssuedAt";
  private OffsetDateTime tokenIssuedAt;

  public static final String JSON_PROPERTY_AUTH_SCOPES = "authScopes";
  private List<Scope> authScopes;

  public static final String JSON_PROPERTY_AUTH_NATIVE_SCOPES = "authNativeScopes";
  private List<String> authNativeScopes;

  public static final String JSON_PROPERTY_AUTH_OBTAINED_AT = "authObtainedAt";
  private OffsetDateTime authObtainedAt;

  public static final String JSON_PROPERTY_AUTH_EXPIRES_AT = "authExpiresAt";
  private OffsetDateTime authExpiresAt;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private String userId;

  public ApiAccountOutDto() { 
  }

  public ApiAccountOutDto id(Long id) {
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


  public ApiAccountOutDto parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getParentId() {
    return parentId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }


  public ApiAccountOutDto serviceType(ServiceType serviceType) {
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


  public ApiAccountOutDto active(Boolean active) {
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


  public ApiAccountOutDto tokenStatus(TokenStatus tokenStatus) {
    this.tokenStatus = tokenStatus;
    return this;
  }

   /**
   * Get tokenStatus
   * @return tokenStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TokenStatus getTokenStatus() {
    return tokenStatus;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenStatus(TokenStatus tokenStatus) {
    this.tokenStatus = tokenStatus;
  }


  public ApiAccountOutDto tokenError(String tokenError) {
    this.tokenError = tokenError;
    return this;
  }

   /**
   * Get tokenError
   * @return tokenError
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTokenError() {
    return tokenError;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenError(String tokenError) {
    this.tokenError = tokenError;
  }


  public ApiAccountOutDto type(AccountType type) {
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

  public AccountType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(AccountType type) {
    this.type = type;
  }


  public ApiAccountOutDto daemon(Boolean daemon) {
    this.daemon = daemon;
    return this;
  }

   /**
   * Get daemon
   * @return daemon
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAEMON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDaemon() {
    return daemon;
  }


  @JsonProperty(JSON_PROPERTY_DAEMON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDaemon(Boolean daemon) {
    this.daemon = daemon;
  }


  public ApiAccountOutDto loginString(String loginString) {
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


  public ApiAccountOutDto email(String email) {
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


  public ApiAccountOutDto mailboxAddress(String mailboxAddress) {
    this.mailboxAddress = mailboxAddress;
    return this;
  }

   /**
   * Get mailboxAddress
   * @return mailboxAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAILBOX_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMailboxAddress() {
    return mailboxAddress;
  }


  @JsonProperty(JSON_PROPERTY_MAILBOX_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMailboxAddress(String mailboxAddress) {
    this.mailboxAddress = mailboxAddress;
  }


  public ApiAccountOutDto name(String name) {
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


  public ApiAccountOutDto name2(String name2) {
    this.name2 = name2;
    return this;
  }

   /**
   * Get name2
   * @return name2
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName2() {
    return name2;
  }


  @JsonProperty(JSON_PROPERTY_NAME2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName2(String name2) {
    this.name2 = name2;
  }


  public ApiAccountOutDto serverUrl(String serverUrl) {
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


  public ApiAccountOutDto serverUrl2(String serverUrl2) {
    this.serverUrl2 = serverUrl2;
    return this;
  }

   /**
   * Get serverUrl2
   * @return serverUrl2
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER_URL2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServerUrl2() {
    return serverUrl2;
  }


  @JsonProperty(JSON_PROPERTY_SERVER_URL2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServerUrl2(String serverUrl2) {
    this.serverUrl2 = serverUrl2;
  }


  public ApiAccountOutDto clientOrgId(String clientOrgId) {
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


  public ApiAccountOutDto authUserId(String authUserId) {
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


  public ApiAccountOutDto authOrgId(String authOrgId) {
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


  public ApiAccountOutDto timezone(String timezone) {
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


  public ApiAccountOutDto tokenIssuedAt(OffsetDateTime tokenIssuedAt) {
    this.tokenIssuedAt = tokenIssuedAt;
    return this;
  }

   /**
   * Get tokenIssuedAt
   * @return tokenIssuedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_ISSUED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTokenIssuedAt() {
    return tokenIssuedAt;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_ISSUED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenIssuedAt(OffsetDateTime tokenIssuedAt) {
    this.tokenIssuedAt = tokenIssuedAt;
  }


  public ApiAccountOutDto authScopes(List<Scope> authScopes) {
    this.authScopes = authScopes;
    return this;
  }

  public ApiAccountOutDto addAuthScopesItem(Scope authScopesItem) {
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


  public ApiAccountOutDto authNativeScopes(List<String> authNativeScopes) {
    this.authNativeScopes = authNativeScopes;
    return this;
  }

  public ApiAccountOutDto addAuthNativeScopesItem(String authNativeScopesItem) {
    if (this.authNativeScopes == null) {
      this.authNativeScopes = new ArrayList<>();
    }
    this.authNativeScopes.add(authNativeScopesItem);
    return this;
  }

   /**
   * Get authNativeScopes
   * @return authNativeScopes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_NATIVE_SCOPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAuthNativeScopes() {
    return authNativeScopes;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_NATIVE_SCOPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthNativeScopes(List<String> authNativeScopes) {
    this.authNativeScopes = authNativeScopes;
  }


  public ApiAccountOutDto authObtainedAt(OffsetDateTime authObtainedAt) {
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


  public ApiAccountOutDto authExpiresAt(OffsetDateTime authExpiresAt) {
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


  public ApiAccountOutDto userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * Return true if this ApiAccountOutDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAccountOutDto apiAccountOutDto = (ApiAccountOutDto) o;
    return Objects.equals(this.id, apiAccountOutDto.id) &&
        Objects.equals(this.parentId, apiAccountOutDto.parentId) &&
        Objects.equals(this.serviceType, apiAccountOutDto.serviceType) &&
        Objects.equals(this.active, apiAccountOutDto.active) &&
        Objects.equals(this.tokenStatus, apiAccountOutDto.tokenStatus) &&
        Objects.equals(this.tokenError, apiAccountOutDto.tokenError) &&
        Objects.equals(this.type, apiAccountOutDto.type) &&
        Objects.equals(this.daemon, apiAccountOutDto.daemon) &&
        Objects.equals(this.loginString, apiAccountOutDto.loginString) &&
        Objects.equals(this.email, apiAccountOutDto.email) &&
        Objects.equals(this.mailboxAddress, apiAccountOutDto.mailboxAddress) &&
        Objects.equals(this.name, apiAccountOutDto.name) &&
        Objects.equals(this.name2, apiAccountOutDto.name2) &&
        Objects.equals(this.serverUrl, apiAccountOutDto.serverUrl) &&
        Objects.equals(this.serverUrl2, apiAccountOutDto.serverUrl2) &&
        Objects.equals(this.clientOrgId, apiAccountOutDto.clientOrgId) &&
        Objects.equals(this.authUserId, apiAccountOutDto.authUserId) &&
        Objects.equals(this.authOrgId, apiAccountOutDto.authOrgId) &&
        Objects.equals(this.timezone, apiAccountOutDto.timezone) &&
        Objects.equals(this.tokenIssuedAt, apiAccountOutDto.tokenIssuedAt) &&
        Objects.equals(this.authScopes, apiAccountOutDto.authScopes) &&
        Objects.equals(this.authNativeScopes, apiAccountOutDto.authNativeScopes) &&
        Objects.equals(this.authObtainedAt, apiAccountOutDto.authObtainedAt) &&
        Objects.equals(this.authExpiresAt, apiAccountOutDto.authExpiresAt) &&
        Objects.equals(this.userId, apiAccountOutDto.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, serviceType, active, tokenStatus, tokenError, type, daemon, loginString, email, mailboxAddress, name, name2, serverUrl, serverUrl2, clientOrgId, authUserId, authOrgId, timezone, tokenIssuedAt, authScopes, authNativeScopes, authObtainedAt, authExpiresAt, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAccountOutDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    tokenStatus: ").append(toIndentedString(tokenStatus)).append("\n");
    sb.append("    tokenError: ").append(toIndentedString(tokenError)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    daemon: ").append(toIndentedString(daemon)).append("\n");
    sb.append("    loginString: ").append(toIndentedString(loginString)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    mailboxAddress: ").append(toIndentedString(mailboxAddress)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    name2: ").append(toIndentedString(name2)).append("\n");
    sb.append("    serverUrl: ").append(toIndentedString(serverUrl)).append("\n");
    sb.append("    serverUrl2: ").append(toIndentedString(serverUrl2)).append("\n");
    sb.append("    clientOrgId: ").append(toIndentedString(clientOrgId)).append("\n");
    sb.append("    authUserId: ").append(toIndentedString(authUserId)).append("\n");
    sb.append("    authOrgId: ").append(toIndentedString(authOrgId)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    tokenIssuedAt: ").append(toIndentedString(tokenIssuedAt)).append("\n");
    sb.append("    authScopes: ").append(toIndentedString(authScopes)).append("\n");
    sb.append("    authNativeScopes: ").append(toIndentedString(authNativeScopes)).append("\n");
    sb.append("    authObtainedAt: ").append(toIndentedString(authObtainedAt)).append("\n");
    sb.append("    authExpiresAt: ").append(toIndentedString(authExpiresAt)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

    // add `parentId` to the URL query string
    if (getParentId() != null) {
      joiner.add(String.format("%sparentId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getParentId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `serviceType` to the URL query string
    if (getServiceType() != null) {
      joiner.add(String.format("%sserviceType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServiceType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `active` to the URL query string
    if (getActive() != null) {
      joiner.add(String.format("%sactive%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActive()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tokenStatus` to the URL query string
    if (getTokenStatus() != null) {
      joiner.add(String.format("%stokenStatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTokenStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tokenError` to the URL query string
    if (getTokenError() != null) {
      joiner.add(String.format("%stokenError%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTokenError()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `daemon` to the URL query string
    if (getDaemon() != null) {
      joiner.add(String.format("%sdaemon%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDaemon()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `loginString` to the URL query string
    if (getLoginString() != null) {
      joiner.add(String.format("%sloginString%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLoginString()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `mailboxAddress` to the URL query string
    if (getMailboxAddress() != null) {
      joiner.add(String.format("%smailboxAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMailboxAddress()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name2` to the URL query string
    if (getName2() != null) {
      joiner.add(String.format("%sname2%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName2()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `serverUrl` to the URL query string
    if (getServerUrl() != null) {
      joiner.add(String.format("%sserverUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServerUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `serverUrl2` to the URL query string
    if (getServerUrl2() != null) {
      joiner.add(String.format("%sserverUrl2%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServerUrl2()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `clientOrgId` to the URL query string
    if (getClientOrgId() != null) {
      joiner.add(String.format("%sclientOrgId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientOrgId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `authUserId` to the URL query string
    if (getAuthUserId() != null) {
      joiner.add(String.format("%sauthUserId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthUserId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `authOrgId` to the URL query string
    if (getAuthOrgId() != null) {
      joiner.add(String.format("%sauthOrgId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthOrgId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `timezone` to the URL query string
    if (getTimezone() != null) {
      joiner.add(String.format("%stimezone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimezone()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tokenIssuedAt` to the URL query string
    if (getTokenIssuedAt() != null) {
      joiner.add(String.format("%stokenIssuedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTokenIssuedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    // add `authNativeScopes` to the URL query string
    if (getAuthNativeScopes() != null) {
      for (int i = 0; i < getAuthNativeScopes().size(); i++) {
        joiner.add(String.format("%sauthNativeScopes%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getAuthNativeScopes().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `authObtainedAt` to the URL query string
    if (getAuthObtainedAt() != null) {
      joiner.add(String.format("%sauthObtainedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthObtainedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `authExpiresAt` to the URL query string
    if (getAuthExpiresAt() != null) {
      joiner.add(String.format("%sauthExpiresAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthExpiresAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `userId` to the URL query string
    if (getUserId() != null) {
      joiner.add(String.format("%suserId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


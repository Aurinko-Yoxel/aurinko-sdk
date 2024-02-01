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
import io.aurinko.client.model.EndUserAccountDto;
import io.aurinko.client.model.EndUserExtIdType;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndUserDto
 */
@JsonPropertyOrder({
  EndUserDto.JSON_PROPERTY_ID,
  EndUserDto.JSON_PROPERTY_APP_ID,
  EndUserDto.JSON_PROPERTY_EMAIL,
  EndUserDto.JSON_PROPERTY_NAME,
  EndUserDto.JSON_PROPERTY_AUTH_ORG_ID,
  EndUserDto.JSON_PROPERTY_CREATED_AT,
  EndUserDto.JSON_PROPERTY_LAST_ACTIVITY,
  EndUserDto.JSON_PROPERTY_TRUSTED_IDENTITY,
  EndUserDto.JSON_PROPERTY_EXTERNAL_ID_TYPE,
  EndUserDto.JSON_PROPERTY_ACCOUNTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-01T09:20:22.278375Z[Africa/Bamako]")
public class EndUserDto {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_APP_ID = "appId";
  private Long appId;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_AUTH_ORG_ID = "authOrgId";
  private String authOrgId;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_LAST_ACTIVITY = "lastActivity";
  private OffsetDateTime lastActivity;

  public static final String JSON_PROPERTY_TRUSTED_IDENTITY = "trustedIdentity";
  private Boolean trustedIdentity;

  public static final String JSON_PROPERTY_EXTERNAL_ID_TYPE = "externalIdType";
  private EndUserExtIdType externalIdType;

  public static final String JSON_PROPERTY_ACCOUNTS = "accounts";
  private List<EndUserAccountDto> accounts;

  public EndUserDto() { 
  }

  public EndUserDto id(String id) {
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

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public EndUserDto appId(Long appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAppId() {
    return appId;
  }


  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppId(Long appId) {
    this.appId = appId;
  }


  public EndUserDto email(String email) {
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


  public EndUserDto name(String name) {
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


  public EndUserDto authOrgId(String authOrgId) {
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


  public EndUserDto createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public EndUserDto lastActivity(OffsetDateTime lastActivity) {
    this.lastActivity = lastActivity;
    return this;
  }

   /**
   * Get lastActivity
   * @return lastActivity
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_ACTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastActivity() {
    return lastActivity;
  }


  @JsonProperty(JSON_PROPERTY_LAST_ACTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastActivity(OffsetDateTime lastActivity) {
    this.lastActivity = lastActivity;
  }


  public EndUserDto trustedIdentity(Boolean trustedIdentity) {
    this.trustedIdentity = trustedIdentity;
    return this;
  }

   /**
   * Get trustedIdentity
   * @return trustedIdentity
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRUSTED_IDENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTrustedIdentity() {
    return trustedIdentity;
  }


  @JsonProperty(JSON_PROPERTY_TRUSTED_IDENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrustedIdentity(Boolean trustedIdentity) {
    this.trustedIdentity = trustedIdentity;
  }


  public EndUserDto externalIdType(EndUserExtIdType externalIdType) {
    this.externalIdType = externalIdType;
    return this;
  }

   /**
   * Get externalIdType
   * @return externalIdType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndUserExtIdType getExternalIdType() {
    return externalIdType;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalIdType(EndUserExtIdType externalIdType) {
    this.externalIdType = externalIdType;
  }


  public EndUserDto accounts(List<EndUserAccountDto> accounts) {
    this.accounts = accounts;
    return this;
  }

  public EndUserDto addAccountsItem(EndUserAccountDto accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EndUserAccountDto> getAccounts() {
    return accounts;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccounts(List<EndUserAccountDto> accounts) {
    this.accounts = accounts;
  }


  /**
   * Return true if this EndUserDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndUserDto endUserDto = (EndUserDto) o;
    return Objects.equals(this.id, endUserDto.id) &&
        Objects.equals(this.appId, endUserDto.appId) &&
        Objects.equals(this.email, endUserDto.email) &&
        Objects.equals(this.name, endUserDto.name) &&
        Objects.equals(this.authOrgId, endUserDto.authOrgId) &&
        Objects.equals(this.createdAt, endUserDto.createdAt) &&
        Objects.equals(this.lastActivity, endUserDto.lastActivity) &&
        Objects.equals(this.trustedIdentity, endUserDto.trustedIdentity) &&
        Objects.equals(this.externalIdType, endUserDto.externalIdType) &&
        Objects.equals(this.accounts, endUserDto.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, appId, email, name, authOrgId, createdAt, lastActivity, trustedIdentity, externalIdType, accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndUserDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    authOrgId: ").append(toIndentedString(authOrgId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastActivity: ").append(toIndentedString(lastActivity)).append("\n");
    sb.append("    trustedIdentity: ").append(toIndentedString(trustedIdentity)).append("\n");
    sb.append("    externalIdType: ").append(toIndentedString(externalIdType)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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

    // add `appId` to the URL query string
    if (getAppId() != null) {
      joiner.add(String.format("%sappId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAppId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `authOrgId` to the URL query string
    if (getAuthOrgId() != null) {
      joiner.add(String.format("%sauthOrgId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthOrgId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `createdAt` to the URL query string
    if (getCreatedAt() != null) {
      joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `lastActivity` to the URL query string
    if (getLastActivity() != null) {
      joiner.add(String.format("%slastActivity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastActivity()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `trustedIdentity` to the URL query string
    if (getTrustedIdentity() != null) {
      joiner.add(String.format("%strustedIdentity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrustedIdentity()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `externalIdType` to the URL query string
    if (getExternalIdType() != null) {
      joiner.add(String.format("%sexternalIdType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalIdType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `accounts` to the URL query string
    if (getAccounts() != null) {
      for (int i = 0; i < getAccounts().size(); i++) {
        if (getAccounts().get(i) != null) {
          joiner.add(getAccounts().get(i).toUrlQueryString(String.format("%saccounts%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}


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
import io.aurinko.client.model.FollowupRuleAggregateOut;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import io.aurinko.client.ApiClient;
/**
 * ConversationDripStatus
 */
@JsonPropertyOrder({
  ConversationDripStatus.JSON_PROPERTY_CONVO_ID,
  ConversationDripStatus.JSON_PROPERTY_SUBJECT,
  ConversationDripStatus.JSON_PROPERTY_STATUS,
  ConversationDripStatus.JSON_PROPERTY_RULE,
  ConversationDripStatus.JSON_PROPERTY_DRIP_STARTED_AT,
  ConversationDripStatus.JSON_PROPERTY_DRIP_LAST_NUM,
  ConversationDripStatus.JSON_PROPERTY_DRIP_ERROR,
  ConversationDripStatus.JSON_PROPERTY_DRIP_ENDED_AT,
  ConversationDripStatus.JSON_PROPERTY_ACTION_VARS,
  ConversationDripStatus.JSON_PROPERTY_TARGETS,
  ConversationDripStatus.JSON_PROPERTY_DRIP_RESPONDER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class ConversationDripStatus {
  public static final String JSON_PROPERTY_CONVO_ID = "convoId";
  @javax.annotation.Nullable
  private String convoId;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  @javax.annotation.Nullable
  private String subject;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    DISABLED(String.valueOf("disabled")),
    
    ACTIVE(String.valueOf("active")),
    
    FAILED(String.valueOf("failed")),
    
    FINISHED(String.valueOf("finished")),
    
    RULE_INCOMPLETE(String.valueOf("ruleIncomplete")),
    
    UNKNOWN_DEFAULT_OPEN_API(String.valueOf("unknown_default_open_api"));

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable
  private StatusEnum status;

  public static final String JSON_PROPERTY_RULE = "rule";
  @javax.annotation.Nullable
  private List<FollowupRuleAggregateOut> rule = new ArrayList<>();

  public static final String JSON_PROPERTY_DRIP_STARTED_AT = "dripStartedAt";
  @javax.annotation.Nullable
  private OffsetDateTime dripStartedAt;

  public static final String JSON_PROPERTY_DRIP_LAST_NUM = "dripLastNum";
  @javax.annotation.Nullable
  private Integer dripLastNum;

  public static final String JSON_PROPERTY_DRIP_ERROR = "dripError";
  @javax.annotation.Nullable
  private String dripError;

  public static final String JSON_PROPERTY_DRIP_ENDED_AT = "dripEndedAt";
  @javax.annotation.Nullable
  private OffsetDateTime dripEndedAt;

  public static final String JSON_PROPERTY_ACTION_VARS = "actionVars";
  @javax.annotation.Nullable
  private Map<String, String> actionVars = new HashMap<>();

  public static final String JSON_PROPERTY_TARGETS = "targets";
  @javax.annotation.Nullable
  private List<String> targets = new ArrayList<>();

  public static final String JSON_PROPERTY_DRIP_RESPONDER = "dripResponder";
  @javax.annotation.Nullable
  private String dripResponder;

  public ConversationDripStatus() { 
  }

  public ConversationDripStatus convoId(@javax.annotation.Nullable String convoId) {
    this.convoId = convoId;
    return this;
  }

  /**
   * Get convoId
   * @return convoId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getConvoId() {
    return convoId;
  }


  @JsonProperty(JSON_PROPERTY_CONVO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvoId(@javax.annotation.Nullable String convoId) {
    this.convoId = convoId;
  }


  public ConversationDripStatus subject(@javax.annotation.Nullable String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubject(@javax.annotation.Nullable String subject) {
    this.subject = subject;
  }


  public ConversationDripStatus status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public ConversationDripStatus rule(@javax.annotation.Nullable List<FollowupRuleAggregateOut> rule) {
    this.rule = rule;
    return this;
  }

  public ConversationDripStatus addRuleItem(FollowupRuleAggregateOut ruleItem) {
    if (this.rule == null) {
      this.rule = new ArrayList<>();
    }
    this.rule.add(ruleItem);
    return this;
  }

  /**
   * Get rule
   * @return rule
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FollowupRuleAggregateOut> getRule() {
    return rule;
  }


  @JsonProperty(JSON_PROPERTY_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRule(@javax.annotation.Nullable List<FollowupRuleAggregateOut> rule) {
    this.rule = rule;
  }


  public ConversationDripStatus dripStartedAt(@javax.annotation.Nullable OffsetDateTime dripStartedAt) {
    this.dripStartedAt = dripStartedAt;
    return this;
  }

  /**
   * Get dripStartedAt
   * @return dripStartedAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRIP_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getDripStartedAt() {
    return dripStartedAt;
  }


  @JsonProperty(JSON_PROPERTY_DRIP_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDripStartedAt(@javax.annotation.Nullable OffsetDateTime dripStartedAt) {
    this.dripStartedAt = dripStartedAt;
  }


  public ConversationDripStatus dripLastNum(@javax.annotation.Nullable Integer dripLastNum) {
    this.dripLastNum = dripLastNum;
    return this;
  }

  /**
   * Get dripLastNum
   * @return dripLastNum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRIP_LAST_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getDripLastNum() {
    return dripLastNum;
  }


  @JsonProperty(JSON_PROPERTY_DRIP_LAST_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDripLastNum(@javax.annotation.Nullable Integer dripLastNum) {
    this.dripLastNum = dripLastNum;
  }


  public ConversationDripStatus dripError(@javax.annotation.Nullable String dripError) {
    this.dripError = dripError;
    return this;
  }

  /**
   * Get dripError
   * @return dripError
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRIP_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDripError() {
    return dripError;
  }


  @JsonProperty(JSON_PROPERTY_DRIP_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDripError(@javax.annotation.Nullable String dripError) {
    this.dripError = dripError;
  }


  public ConversationDripStatus dripEndedAt(@javax.annotation.Nullable OffsetDateTime dripEndedAt) {
    this.dripEndedAt = dripEndedAt;
    return this;
  }

  /**
   * Get dripEndedAt
   * @return dripEndedAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRIP_ENDED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getDripEndedAt() {
    return dripEndedAt;
  }


  @JsonProperty(JSON_PROPERTY_DRIP_ENDED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDripEndedAt(@javax.annotation.Nullable OffsetDateTime dripEndedAt) {
    this.dripEndedAt = dripEndedAt;
  }


  public ConversationDripStatus actionVars(@javax.annotation.Nullable Map<String, String> actionVars) {
    this.actionVars = actionVars;
    return this;
  }

  public ConversationDripStatus putActionVarsItem(String key, String actionVarsItem) {
    if (this.actionVars == null) {
      this.actionVars = new HashMap<>();
    }
    this.actionVars.put(key, actionVarsItem);
    return this;
  }

  /**
   * Get actionVars
   * @return actionVars
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION_VARS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getActionVars() {
    return actionVars;
  }


  @JsonProperty(JSON_PROPERTY_ACTION_VARS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionVars(@javax.annotation.Nullable Map<String, String> actionVars) {
    this.actionVars = actionVars;
  }


  public ConversationDripStatus targets(@javax.annotation.Nullable List<String> targets) {
    this.targets = targets;
    return this;
  }

  public ConversationDripStatus addTargetsItem(String targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<>();
    }
    this.targets.add(targetsItem);
    return this;
  }

  /**
   * Get targets
   * @return targets
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTargets() {
    return targets;
  }


  @JsonProperty(JSON_PROPERTY_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargets(@javax.annotation.Nullable List<String> targets) {
    this.targets = targets;
  }


  public ConversationDripStatus dripResponder(@javax.annotation.Nullable String dripResponder) {
    this.dripResponder = dripResponder;
    return this;
  }

  /**
   * Get dripResponder
   * @return dripResponder
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRIP_RESPONDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDripResponder() {
    return dripResponder;
  }


  @JsonProperty(JSON_PROPERTY_DRIP_RESPONDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDripResponder(@javax.annotation.Nullable String dripResponder) {
    this.dripResponder = dripResponder;
  }


  /**
   * Return true if this ConversationDripStatus object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationDripStatus conversationDripStatus = (ConversationDripStatus) o;
    return Objects.equals(this.convoId, conversationDripStatus.convoId) &&
        Objects.equals(this.subject, conversationDripStatus.subject) &&
        Objects.equals(this.status, conversationDripStatus.status) &&
        Objects.equals(this.rule, conversationDripStatus.rule) &&
        Objects.equals(this.dripStartedAt, conversationDripStatus.dripStartedAt) &&
        Objects.equals(this.dripLastNum, conversationDripStatus.dripLastNum) &&
        Objects.equals(this.dripError, conversationDripStatus.dripError) &&
        Objects.equals(this.dripEndedAt, conversationDripStatus.dripEndedAt) &&
        Objects.equals(this.actionVars, conversationDripStatus.actionVars) &&
        Objects.equals(this.targets, conversationDripStatus.targets) &&
        Objects.equals(this.dripResponder, conversationDripStatus.dripResponder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(convoId, subject, status, rule, dripStartedAt, dripLastNum, dripError, dripEndedAt, actionVars, targets, dripResponder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationDripStatus {\n");
    sb.append("    convoId: ").append(toIndentedString(convoId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    dripStartedAt: ").append(toIndentedString(dripStartedAt)).append("\n");
    sb.append("    dripLastNum: ").append(toIndentedString(dripLastNum)).append("\n");
    sb.append("    dripError: ").append(toIndentedString(dripError)).append("\n");
    sb.append("    dripEndedAt: ").append(toIndentedString(dripEndedAt)).append("\n");
    sb.append("    actionVars: ").append(toIndentedString(actionVars)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    dripResponder: ").append(toIndentedString(dripResponder)).append("\n");
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

    // add `convoId` to the URL query string
    if (getConvoId() != null) {
      joiner.add(String.format("%sconvoId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getConvoId()))));
    }

    // add `subject` to the URL query string
    if (getSubject() != null) {
      joiner.add(String.format("%ssubject%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSubject()))));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    // add `rule` to the URL query string
    if (getRule() != null) {
      for (int i = 0; i < getRule().size(); i++) {
        if (getRule().get(i) != null) {
          joiner.add(getRule().get(i).toUrlQueryString(String.format("%srule%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `dripStartedAt` to the URL query string
    if (getDripStartedAt() != null) {
      joiner.add(String.format("%sdripStartedAt%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDripStartedAt()))));
    }

    // add `dripLastNum` to the URL query string
    if (getDripLastNum() != null) {
      joiner.add(String.format("%sdripLastNum%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDripLastNum()))));
    }

    // add `dripError` to the URL query string
    if (getDripError() != null) {
      joiner.add(String.format("%sdripError%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDripError()))));
    }

    // add `dripEndedAt` to the URL query string
    if (getDripEndedAt() != null) {
      joiner.add(String.format("%sdripEndedAt%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDripEndedAt()))));
    }

    // add `actionVars` to the URL query string
    if (getActionVars() != null) {
      for (String _key : getActionVars().keySet()) {
        joiner.add(String.format("%sactionVars%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getActionVars().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getActionVars().get(_key)))));
      }
    }

    // add `targets` to the URL query string
    if (getTargets() != null) {
      for (int i = 0; i < getTargets().size(); i++) {
        joiner.add(String.format("%stargets%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getTargets().get(i)))));
      }
    }

    // add `dripResponder` to the URL query string
    if (getDripResponder() != null) {
      joiner.add(String.format("%sdripResponder%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDripResponder()))));
    }

    return joiner.toString();
  }
}


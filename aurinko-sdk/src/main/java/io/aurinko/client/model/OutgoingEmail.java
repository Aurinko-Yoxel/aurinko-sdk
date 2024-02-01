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
import io.aurinko.client.model.EmailAddress;
import io.aurinko.client.model.EmailHeader;
import io.aurinko.client.model.FollowUpOutgoing;
import io.aurinko.client.model.OutEmailTrack;
import io.aurinko.client.model.OutgoingEmailAttachment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OutgoingEmail
 */
@JsonPropertyOrder({
  OutgoingEmail.JSON_PROPERTY_FROM,
  OutgoingEmail.JSON_PROPERTY_SUBJECT,
  OutgoingEmail.JSON_PROPERTY_BODY,
  OutgoingEmail.JSON_PROPERTY_IN_REPLY_TO,
  OutgoingEmail.JSON_PROPERTY_REFERENCES,
  OutgoingEmail.JSON_PROPERTY_THREAD_ID,
  OutgoingEmail.JSON_PROPERTY_TO,
  OutgoingEmail.JSON_PROPERTY_CC,
  OutgoingEmail.JSON_PROPERTY_BCC,
  OutgoingEmail.JSON_PROPERTY_REPLY_TO,
  OutgoingEmail.JSON_PROPERTY_X_HEADERS,
  OutgoingEmail.JSON_PROPERTY_ATTACHMENTS,
  OutgoingEmail.JSON_PROPERTY_TRACKING,
  OutgoingEmail.JSON_PROPERTY_FOLLOW_UP,
  OutgoingEmail.JSON_PROPERTY_KEYWORDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-01T09:20:22.278375Z[Africa/Bamako]")
public class OutgoingEmail {
  public static final String JSON_PROPERTY_FROM = "from";
  private EmailAddress from;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public static final String JSON_PROPERTY_BODY = "body";
  private String body;

  public static final String JSON_PROPERTY_IN_REPLY_TO = "inReplyTo";
  private String inReplyTo;

  public static final String JSON_PROPERTY_REFERENCES = "references";
  private String references;

  public static final String JSON_PROPERTY_THREAD_ID = "threadId";
  private String threadId;

  public static final String JSON_PROPERTY_TO = "to";
  private List<EmailAddress> to;

  public static final String JSON_PROPERTY_CC = "cc";
  private List<EmailAddress> cc;

  public static final String JSON_PROPERTY_BCC = "bcc";
  private List<EmailAddress> bcc;

  public static final String JSON_PROPERTY_REPLY_TO = "replyTo";
  private List<EmailAddress> replyTo;

  public static final String JSON_PROPERTY_X_HEADERS = "xHeaders";
  private List<EmailHeader> xHeaders;

  public static final String JSON_PROPERTY_ATTACHMENTS = "attachments";
  private List<OutgoingEmailAttachment> attachments;

  public static final String JSON_PROPERTY_TRACKING = "tracking";
  private OutEmailTrack tracking;

  public static final String JSON_PROPERTY_FOLLOW_UP = "followUp";
  private FollowUpOutgoing followUp;

  public static final String JSON_PROPERTY_KEYWORDS = "keywords";
  private List<String> keywords;

  public OutgoingEmail() { 
  }

  public OutgoingEmail from(EmailAddress from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmailAddress getFrom() {
    return from;
  }


  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrom(EmailAddress from) {
    this.from = from;
  }


  public OutgoingEmail subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubject(String subject) {
    this.subject = subject;
  }


  public OutgoingEmail body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBody() {
    return body;
  }


  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBody(String body) {
    this.body = body;
  }


  public OutgoingEmail inReplyTo(String inReplyTo) {
    this.inReplyTo = inReplyTo;
    return this;
  }

   /**
   * Get inReplyTo
   * @return inReplyTo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IN_REPLY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInReplyTo() {
    return inReplyTo;
  }


  @JsonProperty(JSON_PROPERTY_IN_REPLY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInReplyTo(String inReplyTo) {
    this.inReplyTo = inReplyTo;
  }


  public OutgoingEmail references(String references) {
    this.references = references;
    return this;
  }

   /**
   * Get references
   * @return references
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferences() {
    return references;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferences(String references) {
    this.references = references;
  }


  public OutgoingEmail threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

   /**
   * Get threadId
   * @return threadId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreadId() {
    return threadId;
  }


  @JsonProperty(JSON_PROPERTY_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }


  public OutgoingEmail to(List<EmailAddress> to) {
    this.to = to;
    return this;
  }

  public OutgoingEmail addToItem(EmailAddress toItem) {
    if (this.to == null) {
      this.to = new ArrayList<>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EmailAddress> getTo() {
    return to;
  }


  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTo(List<EmailAddress> to) {
    this.to = to;
  }


  public OutgoingEmail cc(List<EmailAddress> cc) {
    this.cc = cc;
    return this;
  }

  public OutgoingEmail addCcItem(EmailAddress ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * Get cc
   * @return cc
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EmailAddress> getCc() {
    return cc;
  }


  @JsonProperty(JSON_PROPERTY_CC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCc(List<EmailAddress> cc) {
    this.cc = cc;
  }


  public OutgoingEmail bcc(List<EmailAddress> bcc) {
    this.bcc = bcc;
    return this;
  }

  public OutgoingEmail addBccItem(EmailAddress bccItem) {
    if (this.bcc == null) {
      this.bcc = new ArrayList<>();
    }
    this.bcc.add(bccItem);
    return this;
  }

   /**
   * Get bcc
   * @return bcc
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BCC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EmailAddress> getBcc() {
    return bcc;
  }


  @JsonProperty(JSON_PROPERTY_BCC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBcc(List<EmailAddress> bcc) {
    this.bcc = bcc;
  }


  public OutgoingEmail replyTo(List<EmailAddress> replyTo) {
    this.replyTo = replyTo;
    return this;
  }

  public OutgoingEmail addReplyToItem(EmailAddress replyToItem) {
    if (this.replyTo == null) {
      this.replyTo = new ArrayList<>();
    }
    this.replyTo.add(replyToItem);
    return this;
  }

   /**
   * Get replyTo
   * @return replyTo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPLY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EmailAddress> getReplyTo() {
    return replyTo;
  }


  @JsonProperty(JSON_PROPERTY_REPLY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplyTo(List<EmailAddress> replyTo) {
    this.replyTo = replyTo;
  }


  public OutgoingEmail xHeaders(List<EmailHeader> xHeaders) {
    this.xHeaders = xHeaders;
    return this;
  }

  public OutgoingEmail addXHeadersItem(EmailHeader xHeadersItem) {
    if (this.xHeaders == null) {
      this.xHeaders = new ArrayList<>();
    }
    this.xHeaders.add(xHeadersItem);
    return this;
  }

   /**
   * Get xHeaders
   * @return xHeaders
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_X_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EmailHeader> getxHeaders() {
    return xHeaders;
  }


  @JsonProperty(JSON_PROPERTY_X_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setxHeaders(List<EmailHeader> xHeaders) {
    this.xHeaders = xHeaders;
  }


  public OutgoingEmail attachments(List<OutgoingEmailAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public OutgoingEmail addAttachmentsItem(OutgoingEmailAttachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OutgoingEmailAttachment> getAttachments() {
    return attachments;
  }


  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttachments(List<OutgoingEmailAttachment> attachments) {
    this.attachments = attachments;
  }


  public OutgoingEmail tracking(OutEmailTrack tracking) {
    this.tracking = tracking;
    return this;
  }

   /**
   * Get tracking
   * @return tracking
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OutEmailTrack getTracking() {
    return tracking;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTracking(OutEmailTrack tracking) {
    this.tracking = tracking;
  }


  public OutgoingEmail followUp(FollowUpOutgoing followUp) {
    this.followUp = followUp;
    return this;
  }

   /**
   * Get followUp
   * @return followUp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOLLOW_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FollowUpOutgoing getFollowUp() {
    return followUp;
  }


  @JsonProperty(JSON_PROPERTY_FOLLOW_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFollowUp(FollowUpOutgoing followUp) {
    this.followUp = followUp;
  }


  public OutgoingEmail keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public OutgoingEmail addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getKeywords() {
    return keywords;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  /**
   * Return true if this OutgoingEmail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutgoingEmail outgoingEmail = (OutgoingEmail) o;
    return Objects.equals(this.from, outgoingEmail.from) &&
        Objects.equals(this.subject, outgoingEmail.subject) &&
        Objects.equals(this.body, outgoingEmail.body) &&
        Objects.equals(this.inReplyTo, outgoingEmail.inReplyTo) &&
        Objects.equals(this.references, outgoingEmail.references) &&
        Objects.equals(this.threadId, outgoingEmail.threadId) &&
        Objects.equals(this.to, outgoingEmail.to) &&
        Objects.equals(this.cc, outgoingEmail.cc) &&
        Objects.equals(this.bcc, outgoingEmail.bcc) &&
        Objects.equals(this.replyTo, outgoingEmail.replyTo) &&
        Objects.equals(this.xHeaders, outgoingEmail.xHeaders) &&
        Objects.equals(this.attachments, outgoingEmail.attachments) &&
        Objects.equals(this.tracking, outgoingEmail.tracking) &&
        Objects.equals(this.followUp, outgoingEmail.followUp) &&
        Objects.equals(this.keywords, outgoingEmail.keywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, subject, body, inReplyTo, references, threadId, to, cc, bcc, replyTo, xHeaders, attachments, tracking, followUp, keywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutgoingEmail {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    inReplyTo: ").append(toIndentedString(inReplyTo)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    xHeaders: ").append(toIndentedString(xHeaders)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
    sb.append("    followUp: ").append(toIndentedString(followUp)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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

    // add `from` to the URL query string
    if (getFrom() != null) {
      joiner.add(getFrom().toUrlQueryString(prefix + "from" + suffix));
    }

    // add `subject` to the URL query string
    if (getSubject() != null) {
      joiner.add(String.format("%ssubject%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubject()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `body` to the URL query string
    if (getBody() != null) {
      joiner.add(String.format("%sbody%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBody()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `inReplyTo` to the URL query string
    if (getInReplyTo() != null) {
      joiner.add(String.format("%sinReplyTo%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInReplyTo()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `references` to the URL query string
    if (getReferences() != null) {
      joiner.add(String.format("%sreferences%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReferences()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `threadId` to the URL query string
    if (getThreadId() != null) {
      joiner.add(String.format("%sthreadId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getThreadId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `to` to the URL query string
    if (getTo() != null) {
      for (int i = 0; i < getTo().size(); i++) {
        if (getTo().get(i) != null) {
          joiner.add(getTo().get(i).toUrlQueryString(String.format("%sto%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `cc` to the URL query string
    if (getCc() != null) {
      for (int i = 0; i < getCc().size(); i++) {
        if (getCc().get(i) != null) {
          joiner.add(getCc().get(i).toUrlQueryString(String.format("%scc%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `bcc` to the URL query string
    if (getBcc() != null) {
      for (int i = 0; i < getBcc().size(); i++) {
        if (getBcc().get(i) != null) {
          joiner.add(getBcc().get(i).toUrlQueryString(String.format("%sbcc%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `replyTo` to the URL query string
    if (getReplyTo() != null) {
      for (int i = 0; i < getReplyTo().size(); i++) {
        if (getReplyTo().get(i) != null) {
          joiner.add(getReplyTo().get(i).toUrlQueryString(String.format("%sreplyTo%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `xHeaders` to the URL query string
    if (getxHeaders() != null) {
      for (int i = 0; i < getxHeaders().size(); i++) {
        if (getxHeaders().get(i) != null) {
          joiner.add(getxHeaders().get(i).toUrlQueryString(String.format("%sxHeaders%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `attachments` to the URL query string
    if (getAttachments() != null) {
      for (int i = 0; i < getAttachments().size(); i++) {
        if (getAttachments().get(i) != null) {
          joiner.add(getAttachments().get(i).toUrlQueryString(String.format("%sattachments%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `tracking` to the URL query string
    if (getTracking() != null) {
      joiner.add(getTracking().toUrlQueryString(prefix + "tracking" + suffix));
    }

    // add `followUp` to the URL query string
    if (getFollowUp() != null) {
      joiner.add(getFollowUp().toUrlQueryString(prefix + "followUp" + suffix));
    }

    // add `keywords` to the URL query string
    if (getKeywords() != null) {
      for (int i = 0; i < getKeywords().size(); i++) {
        joiner.add(String.format("%skeywords%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getKeywords().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}


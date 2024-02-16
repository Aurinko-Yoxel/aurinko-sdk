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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ServiceType
 */
public enum ServiceType {
  
  GOOGLE("Google"),
  
  GOOGLEBOT("GoogleBot"),
  
  OFFICE365("Office365"),
  
  EWS("EWS"),
  
  IMAP("IMAP"),
  
  SALESFORCE("Salesforce"),
  
  SALESFLARE("Salesflare"),
  
  REPFABRIC("Repfabric"),
  
  MSTEAMSBOT("MsTeamsBot"),
  
  SLACK("Slack"),
  
  SLACKBOT("SlackBot"),
  
  SUGARCRM("SugarCRM"),
  
  HIGHLEVEL("HighLevel"),
  
  HUBSPOT("Hubspot"),
  
  ZOOM("Zoom"),
  
  ZOOMBOT("ZoomBot"),
  
  WEBEX("Webex"),
  
  WEBEXBOT("WebexBot"),
  
  PIPEDRIVE("Pipedrive"),
  
  ECLIPSEERP("EclipseERP"),
  
  AUTOQUOTES("AutoQuotes"),
  
  TEAMWORK("Teamwork"),
  
  NETSUITE("NetSuite"),
  
  MCTRADE("MCTrade"),
  
  SPECPATH("SpecPath"),
  
  ZOHO("Zoho"),
  
  CLIENTIFY("Clientify"),
  
  QUICKBOOKS("QuickBooks"),
  
  ACTIVECAMPAIGN("ActiveCampaign"),
  
  CREATIO("Creatio"),
  
  CONSTANTCONTACT("ConstantContact"),
  
  FISHBOWL("Fishbowl"),
  
  ICLOUD("iCloud"),
  
  UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

  private String value;

  ServiceType(String value) {
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
  public static ServiceType fromValue(String value) {
    for (ServiceType b : ServiceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN_DEFAULT_OPEN_API;
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    if (prefix == null) {
      prefix = "";
    }

    return String.format("%s=%s", prefix, this.toString());
  }

}


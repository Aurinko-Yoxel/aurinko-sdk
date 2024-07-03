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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for ApiAccountOutDto
 */
class ApiAccountOutDtoTest {
    private final ApiAccountOutDto model = new ApiAccountOutDto();

    /**
     * Model tests for ApiAccountOutDto
     */
    @Test
    void testApiAccountOutDto() {
        // TODO: test ApiAccountOutDto
    }

    /**
     * Test the property 'id'
     */
    @Test
    void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'parentId'
     */
    @Test
    void parentIdTest() {
        // TODO: test parentId
    }

    /**
     * Test the property 'serviceType'
     */
    @Test
    void serviceTypeTest() {
        // TODO: test serviceType
    }

    /**
     * Test the property 'active'
     */
    @Test
    void activeTest() {
        // TODO: test active
    }

    /**
     * Test the property 'tokenStatus'
     */
    @Test
    void tokenStatusTest() {
        // TODO: test tokenStatus
    }

    /**
     * Test the property 'tokenError'
     */
    @Test
    void tokenErrorTest() {
        // TODO: test tokenError
    }

    /**
     * Test the property 'type'
     */
    @Test
    void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'daemon'
     */
    @Test
    void daemonTest() {
        // TODO: test daemon
    }

    /**
     * Test the property 'loginString'
     */
    @Test
    void loginStringTest() {
        // TODO: test loginString
    }

    /**
     * Test the property 'email'
     */
    @Test
    void emailTest() {
        // TODO: test email
    }

    /**
     * Test the property 'mailboxAddress'
     */
    @Test
    void mailboxAddressTest() {
        // TODO: test mailboxAddress
    }

    /**
     * Test the property 'name'
     */
    @Test
    void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'name2'
     */
    @Test
    void name2Test() {
        // TODO: test name2
    }

    /**
     * Test the property 'serverUrl'
     */
    @Test
    void serverUrlTest() {
        // TODO: test serverUrl
    }

    /**
     * Test the property 'serverUrl2'
     */
    @Test
    void serverUrl2Test() {
        // TODO: test serverUrl2
    }

    /**
     * Test the property 'clientOrgId'
     */
    @Test
    void clientOrgIdTest() {
        // TODO: test clientOrgId
    }

    /**
     * Test the property 'authUserId'
     */
    @Test
    void authUserIdTest() {
        // TODO: test authUserId
    }

    /**
     * Test the property 'authOrgId'
     */
    @Test
    void authOrgIdTest() {
        // TODO: test authOrgId
    }

    /**
     * Test the property 'timezone'
     */
    @Test
    void timezoneTest() {
        // TODO: test timezone
    }

    /**
     * Test the property 'tokenIssuedAt'
     */
    @Test
    void tokenIssuedAtTest() {
        // TODO: test tokenIssuedAt
    }

    /**
     * Test the property 'authScopes'
     */
    @Test
    void authScopesTest() {
        // TODO: test authScopes
    }

    /**
     * Test the property 'authNativeScopes'
     */
    @Test
    void authNativeScopesTest() {
        // TODO: test authNativeScopes
    }

    /**
     * Test the property 'authObtainedAt'
     */
    @Test
    void authObtainedAtTest() {
        // TODO: test authObtainedAt
    }

    /**
     * Test the property 'authExpiresAt'
     */
    @Test
    void authExpiresAtTest() {
        // TODO: test authExpiresAt
    }

    /**
     * Test the property 'userId'
     */
    @Test
    void userIdTest() {
        // TODO: test userId
    }

}

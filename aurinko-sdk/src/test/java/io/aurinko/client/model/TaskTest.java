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
import io.aurinko.client.model.TaskImportance;
import io.aurinko.client.model.TaskLink;
import io.aurinko.client.model.TaskStatus;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for Task
 */
class TaskTest {
    private final Task model = new Task();

    /**
     * Model tests for Task
     */
    @Test
    void testTask() {
        // TODO: test Task
    }

    /**
     * Test the property 'id'
     */
    @Test
    void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'etag'
     */
    @Test
    void etagTest() {
        // TODO: test etag
    }

    /**
     * Test the property 'title'
     */
    @Test
    void titleTest() {
        // TODO: test title
    }

    /**
     * Test the property 'lastModifiedTime'
     */
    @Test
    void lastModifiedTimeTest() {
        // TODO: test lastModifiedTime
    }

    /**
     * Test the property 'parentId'
     */
    @Test
    void parentIdTest() {
        // TODO: test parentId
    }

    /**
     * Test the property 'position'
     */
    @Test
    void positionTest() {
        // TODO: test position
    }

    /**
     * Test the property 'notes'
     */
    @Test
    void notesTest() {
        // TODO: test notes
    }

    /**
     * Test the property 'status'
     */
    @Test
    void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'importance'
     */
    @Test
    void importanceTest() {
        // TODO: test importance
    }

    /**
     * Test the property 'due'
     */
    @Test
    void dueTest() {
        // TODO: test due
    }

    /**
     * Test the property 'completed'
     */
    @Test
    void completedTest() {
        // TODO: test completed
    }

    /**
     * Test the property 'links'
     */
    @Test
    void linksTest() {
        // TODO: test links
    }

    /**
     * Test the property 'startDateTime'
     */
    @Test
    void startDateTimeTest() {
        // TODO: test startDateTime
    }

    /**
     * Test the property 'categories'
     */
    @Test
    void categoriesTest() {
        // TODO: test categories
    }

    /**
     * Test the property 'owner'
     */
    @Test
    void ownerTest() {
        // TODO: test owner
    }

    /**
     * Test the property 'omitted'
     */
    @Test
    void omittedTest() {
        // TODO: test omitted
    }

}

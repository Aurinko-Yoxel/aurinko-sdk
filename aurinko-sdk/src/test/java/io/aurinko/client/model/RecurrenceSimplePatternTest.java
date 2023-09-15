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
import io.aurinko.client.model.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Model tests for RecurrenceSimplePattern
 */
public class RecurrenceSimplePatternTest {
    private final RecurrenceSimplePattern model = new RecurrenceSimplePattern();

    /**
     * Model tests for RecurrenceSimplePattern
     */
    @Test
    public void testRecurrenceSimplePattern() {
        // TODO: test RecurrenceSimplePattern
    }

    /**
     * Test the property 'frequency'
     */
    @Test
    public void frequencyTest() {
        // TODO: test frequency
    }

    /**
     * Test the property 'interval'
     */
    @Test
    public void intervalTest() {
        // TODO: test interval
    }

    /**
     * Test the property 'daysOfWeek'
     */
    @Test
    public void daysOfWeekTest() {
        // TODO: test daysOfWeek
    }

    /**
     * Test the property 'weekStart'
     */
    @Test
    public void weekStartTest() {
        // TODO: test weekStart
    }

    /**
     * Test the property 'dayOfMonth'
     */
    @Test
    public void dayOfMonthTest() {
        // TODO: test dayOfMonth
    }

    /**
     * Test the property 'monthOfYear'
     */
    @Test
    public void monthOfYearTest() {
        // TODO: test monthOfYear
    }

    /**
     * Test the property 'instance'
     */
    @Test
    public void instanceTest() {
        // TODO: test instance
    }

}
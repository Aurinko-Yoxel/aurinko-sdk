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


package io.aurinko.api;

import io.aurinko.client.ApiException;
import io.aurinko.client.model.Calendar;
import io.aurinko.client.model.CalendarCreate;
import io.aurinko.client.model.CalendarUpdate;
import io.aurinko.client.model.CalendarsPage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for CalendarsApi
 */
@Disabled
public class CalendarsApiTest {

    private final CalendarsApi api = new CalendarsApi();

    
    /**
     * Get a calendar
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void calendarByIdTest() throws ApiException {
        String id = null;
        CompletableFuture<Calendar> response = 
        api.calendarById(id);
        
        // TODO: test validations
    }
    
    /**
     * Request list of calendars
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void calendarsTest() throws ApiException {
        String pageToken = null;
        Boolean withShared = null;
        CompletableFuture<CalendarsPage> response = 
        api.calendars(pageToken, withShared);
        
        // TODO: test validations
    }
    
    /**
     * Create new calendar
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCalendarTest() throws ApiException {
        CalendarCreate calendarCreate = null;
        CompletableFuture<Calendar> response = 
        api.createCalendar(calendarCreate);
        
        // TODO: test validations
    }
    
    /**
     * Update a calendar
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCalendarTest() throws ApiException {
        String id = null;
        CalendarUpdate calendarUpdate = null;
        CompletableFuture<Calendar> response = 
        api.updateCalendar(id, calendarUpdate);
        
        // TODO: test validations
    }
    
}

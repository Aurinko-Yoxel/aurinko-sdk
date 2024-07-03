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
import io.aurinko.client.model.DeletedPage;
import io.aurinko.client.model.EventsPage;
import java.time.OffsetDateTime;
import io.aurinko.client.model.SyncStatus;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for CalSyncApi
 */
@Disabled
public class CalSyncApiTest {

    private final CalSyncApi api = new CalSyncApi();

    
    /**
     * Request deleted events (deltas)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void calSyncDeletedTest() throws ApiException {
        String calendarId = null;
        String deltaToken = null;
        String pageToken = null;
        CompletableFuture<DeletedPage> response = 
        api.calSyncDeleted(calendarId, deltaToken, pageToken);
        
        // TODO: test validations
    }
    
    /**
     * Start a new calendar sync
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void calSyncStartTest() throws ApiException {
        String calendarId = null;
        OffsetDateTime timeMin = null;
        OffsetDateTime timeMax = null;
        CompletableFuture<SyncStatus> response = 
        api.calSyncStart(calendarId, timeMin, timeMax);
        
        // TODO: test validations
    }
    
    /**
     * Request changed events (deltas)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void calSyncUpdatedTest() throws ApiException {
        String calendarId = null;
        String deltaToken = null;
        String pageToken = null;
        CompletableFuture<EventsPage> response = 
        api.calSyncUpdated(calendarId, deltaToken, pageToken);
        
        // TODO: test validations
    }
    
}

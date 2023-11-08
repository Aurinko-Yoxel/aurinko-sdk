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
import io.aurinko.client.model.ConvertDraft;
import io.aurinko.client.model.EmailTrackingData;
import io.aurinko.client.model.EmailTrackingEvent;
import io.aurinko.client.model.EmailTrackingEventPageNext;
import io.aurinko.client.model.EmailTrackingPageNext;
import io.aurinko.client.model.OkResponse;
import io.aurinko.client.model.RewriteHtml;
import io.aurinko.client.model.TrackingData;
import io.aurinko.client.model.UpdateDraftTrackingIn;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for EmailTrackingApi
 */
@Ignore
public class EmailTrackingApiTest {

    private final EmailTrackingApi api = new EmailTrackingApi();

    
    /**
     * Mark draft&#39;s tracking as sent
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDraftTrackingTest() throws ApiException {
        String draftId = null;
        ConvertDraft convertDraft = null;
        CompletableFuture<OkResponse> response = 
        api.convertDraftTracking(draftId, convertDraft);
        
        // TODO: test validations
    }
    
    /**
     * Modify tracking data
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDraftTrackingTest() throws ApiException {
        String draftId = null;
        String ignoreNotFound = null;
        RewriteHtml rewriteHtml = null;
        CompletableFuture<EmailTrackingData> response = 
        api.createDraftTracking(draftId, ignoreNotFound, rewriteHtml);
        
        // TODO: test validations
    }
    
    /**
     * List tracking data
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackingTest() throws ApiException {
        Boolean withActivityOnly = null;
        Integer limit = null;
        Integer offset = null;
        String contextContains = null;
        String threadId = null;
        CompletableFuture<EmailTrackingPageNext> response = 
        api.getTracking(withActivityOnly, limit, offset, contextContains, threadId);
        
        // TODO: test validations
    }
    
    /**
     * Purge recent activity for a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void purgeMyTrackingTest() throws ApiException {
        String userAgent = null;
        String threadId = null;
        CompletableFuture<OkResponse> response = 
        api.purgeMyTracking(userAgent, threadId);
        
        // TODO: test validations
    }
    
    /**
     * Set ignore open/click tracking for а message
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void switchOpenClicksTest() throws ApiException {
        Boolean isIgnored = null;
        String messageId = null;
        String inetMessageId = null;
        CompletableFuture<OkResponse> response = 
        api.switchOpenClicks(isIgnored, messageId, inetMessageId);
        
        // TODO: test validations
    }
    
    /**
     * Get tracking data by Id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void trackingByIdTest() throws ApiException {
        Long id = null;
        CompletableFuture<TrackingData> response = 
        api.trackingById(id);
        
        // TODO: test validations
    }
    
    /**
     * Get tracking event by Id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void trackingEventByIdTest() throws ApiException {
        Long trackingId = null;
        Long id = null;
        CompletableFuture<EmailTrackingEvent> response = 
        api.trackingEventById(trackingId, id);
        
        // TODO: test validations
    }
    
    /**
     * List tracking events
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void trackingEventsTest() throws ApiException {
        Long id = null;
        Integer limit = null;
        Integer offset = null;
        CompletableFuture<EmailTrackingEventPageNext> response = 
        api.trackingEvents(id, limit, offset);
        
        // TODO: test validations
    }
    
    /**
     * Modify draft&#39;s tracking
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDraftTrackingTest() throws ApiException {
        String draftId = null;
        UpdateDraftTrackingIn updateDraftTrackingIn = null;
        CompletableFuture<OkResponse> response = 
        api.updateDraftTracking(draftId, updateDraftTrackingIn);
        
        // TODO: test validations
    }
    
}

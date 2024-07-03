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
import io.aurinko.client.model.BodyType;
import io.aurinko.client.model.EmailAttachmentContent;
import io.aurinko.client.model.Event;
import io.aurinko.client.model.EventOrId;
import io.aurinko.client.model.EventsPageNext;
import io.aurinko.client.model.MeetingResponse;
import java.time.OffsetDateTime;
import io.aurinko.client.model.OkResponse;
import io.aurinko.client.model.SeriesInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for EventsApi
 */
@Disabled
public class EventsApiTest {

    private final EventsApi api = new EventsApi();

    
    /**
     * Get an event attachment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void attachmentTest() throws ApiException {
        String calendarId = null;
        String eventId = null;
        String attachmentId = null;
        CompletableFuture<EmailAttachmentContent> response = 
        api.attachment(calendarId, eventId, attachmentId);
        
        // TODO: test validations
    }
    
    /**
     * Create a new event
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEventTest() throws ApiException {
        String calendarId = null;
        Boolean notifyAttendees = null;
        BodyType bodyType = null;
        Boolean returnRecord = null;
        Event event = null;
        CompletableFuture<EventOrId> response = 
        api.createEvent(calendarId, notifyAttendees, bodyType, returnRecord, event);
        
        // TODO: test validations
    }
    
    /**
     * Delete an event
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEventTest() throws ApiException {
        String calendarId = null;
        String eventId = null;
        Boolean notifyAttendees = null;
        
        CompletableFuture<Void> response = api.deleteEvent(calendarId, eventId, notifyAttendees);
        
        // TODO: test validations
    }
    
    /**
     * Get an event
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventTest() throws ApiException {
        String calendarId = null;
        String eventId = null;
        List<String> nativeProperties = null;
        CompletableFuture<Event> response = 
        api.event(calendarId, eventId, nativeProperties);
        
        // TODO: test validations
    }
    
    /**
     * Request events by ICalUid&#39;s
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventsByICalUIdsTest() throws ApiException {
        String calendarId = null;
        List<String> iCalUId = null;
        String pageToken = null;
        CompletableFuture<EventsPageNext> response = 
        api.eventsByICalUIds(calendarId, iCalUId, pageToken);
        
        // TODO: test validations
    }
    
    /**
     * Request an occurrence by original start time
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void occurrenceByOrigStartTest() throws ApiException {
        String calendarId = null;
        String masterId = null;
        String ost = null;
        CompletableFuture<Event> response = 
        api.occurrenceByOrigStart(calendarId, masterId, ost);
        
        // TODO: test validations
    }
    
    /**
     * Request events in a range
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rangeTest() throws ApiException {
        String calendarId = null;
        OffsetDateTime timeMin = null;
        OffsetDateTime timeMax = null;
        String pageToken = null;
        CompletableFuture<EventsPageNext> response = 
        api.range(calendarId, timeMin, timeMax, pageToken);
        
        // TODO: test validations
    }
    
    /**
     * Request a series description
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void seriesInfoTest() throws ApiException {
        String calendarId = null;
        String masterId = null;
        CompletableFuture<SeriesInfo> response = 
        api.seriesInfo(calendarId, masterId);
        
        // TODO: test validations
    }
    
    /**
     * Update an event
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateEventTest() throws ApiException {
        String calendarId = null;
        String eventId = null;
        String ifMatch = null;
        Boolean notifyAttendees = null;
        Boolean returnRecord = null;
        Event event = null;
        CompletableFuture<EventOrId> response = 
        api.updateEvent(calendarId, eventId, ifMatch, notifyAttendees, returnRecord, event);
        
        // TODO: test validations
    }
    
    /**
     * Update meeting response
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMeetingResponseTest() throws ApiException {
        String calendarId = null;
        String eventId = null;
        Boolean notifyAttendees = null;
        MeetingResponse meetingResponse = null;
        CompletableFuture<OkResponse> response = 
        api.updateMeetingResponse(calendarId, eventId, notifyAttendees, meetingResponse);
        
        // TODO: test validations
    }
    
}

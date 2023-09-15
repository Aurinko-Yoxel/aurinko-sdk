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
import io.aurinko.client.model.BookingInDto;
import io.aurinko.client.model.BookingOutDto;
import io.aurinko.client.model.BookingSuccessOutDto;
import io.aurinko.client.model.BookingTimesOutDto;
import io.aurinko.client.model.BookingUpdateDto;
import io.aurinko.client.model.CreateMeetingDto;
import io.aurinko.client.model.WeekWorkSchedule;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for BookingApi
 */
@Ignore
public class BookingApiTest {

    private final BookingApi api = new BookingApi();

    
    /**
     * Create a booking profile
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        BookingInDto bookingInDto = null;
        CompletableFuture<BookingOutDto> response = 
        api.create(bookingInDto);
        
        // TODO: test validations
    }
    
    /**
     * Create a meeting
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMeetingTest() throws ApiException {
        String aurinkoClientId = null;
        String name = null;
        CreateMeetingDto createMeetingDto = null;
        CompletableFuture<BookingSuccessOutDto> response = 
        api.createMeeting(aurinkoClientId, name, createMeetingDto);
        
        // TODO: test validations
    }
    
    /**
     * Delete a booking profile by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBookingTest() throws ApiException {
        Long id = null;
        CompletableFuture<BookingSuccessOutDto> response = 
        api.deleteBooking(id);
        
        // TODO: test validations
    }
    
    /**
     * Get booking profiles
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccBookingsTest() throws ApiException {
        CompletableFuture<List<BookingOutDto>> response = 
        api.getAccBookings();
        
        // TODO: test validations
    }
    
    /**
     * Get a booking profile by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBookingTest() throws ApiException {
        Long id = null;
        CompletableFuture<BookingOutDto> response = 
        api.getBooking(id);
        
        // TODO: test validations
    }
    
    /**
     * Get available meeting times
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMeetingTimesTest() throws ApiException {
        String aurinkoClientId = null;
        String name = null;
        CompletableFuture<BookingTimesOutDto> response = 
        api.getMeetingTimes(aurinkoClientId, name);
        
        // TODO: test validations
    }
    
    /**
     * Update a booking profile
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBookingTest() throws ApiException {
        Long id = null;
        BookingUpdateDto bookingUpdateDto = null;
        CompletableFuture<BookingSuccessOutDto> response = 
        api.updateBooking(id, bookingUpdateDto);
        
        // TODO: test validations
    }
    
    /**
     * Get user work hours
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workHoursTest() throws ApiException {
        CompletableFuture<WeekWorkSchedule> response = 
        api.workHours();
        
        // TODO: test validations
    }
    
}
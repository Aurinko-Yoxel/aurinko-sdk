# AvailabilityApi

All URIs are relative to *https://api.aurinko.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bookingAccountCreateMeeting**](AvailabilityApi.md#bookingAccountCreateMeeting) | **POST** /v1/book/account/profiles/{id}/meeting | Create a meeting |
| [**bookingAccountCreateMeetingWithHttpInfo**](AvailabilityApi.md#bookingAccountCreateMeetingWithHttpInfo) | **POST** /v1/book/account/profiles/{id}/meeting | Create a meeting |
| [**bookingAccountMeetingTimes**](AvailabilityApi.md#bookingAccountMeetingTimes) | **GET** /v1/book/account/profiles/{id}/meeting | Get available meeting times |
| [**bookingAccountMeetingTimesWithHttpInfo**](AvailabilityApi.md#bookingAccountMeetingTimesWithHttpInfo) | **GET** /v1/book/account/profiles/{id}/meeting | Get available meeting times |
| [**bookingGroupAvailability**](AvailabilityApi.md#bookingGroupAvailability) | **POST** /v1/book/group/profiles/dynamic/availability | Get available bookings for а time range |
| [**bookingGroupAvailabilityWithHttpInfo**](AvailabilityApi.md#bookingGroupAvailabilityWithHttpInfo) | **POST** /v1/book/group/profiles/dynamic/availability | Get available bookings for а time range |
| [**bookingGroupCreateMeeting**](AvailabilityApi.md#bookingGroupCreateMeeting) | **POST** /v1/book/group/profiles/{id}/meeting | Create a meeting |
| [**bookingGroupCreateMeetingWithHttpInfo**](AvailabilityApi.md#bookingGroupCreateMeetingWithHttpInfo) | **POST** /v1/book/group/profiles/{id}/meeting | Create a meeting |
| [**bookingGroupMeetingTimes**](AvailabilityApi.md#bookingGroupMeetingTimes) | **GET** /v1/book/group/profiles/{id}/meeting | Get available meeting times |
| [**bookingGroupMeetingTimesWithHttpInfo**](AvailabilityApi.md#bookingGroupMeetingTimesWithHttpInfo) | **GET** /v1/book/group/profiles/{id}/meeting | Get available meeting times |
| [**createMeeting**](AvailabilityApi.md#createMeeting) | **POST** /v1/book/{aurinkoClientId}/{name}/meeting | Create a meeting |
| [**createMeetingWithHttpInfo**](AvailabilityApi.md#createMeetingWithHttpInfo) | **POST** /v1/book/{aurinkoClientId}/{name}/meeting | Create a meeting |
| [**getMeetingTimes**](AvailabilityApi.md#getMeetingTimes) | **GET** /v1/book/{aurinkoClientId}/{name}/meeting | Get available meeting times |
| [**getMeetingTimesWithHttpInfo**](AvailabilityApi.md#getMeetingTimesWithHttpInfo) | **GET** /v1/book/{aurinkoClientId}/{name}/meeting | Get available meeting times |



## bookingAccountCreateMeeting

> CompletableFuture<CreateMeetingResponse> bookingAccountCreateMeeting(id, required, reserveForMinutes, createMeetingDto)

Create a meeting

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AvailabilityApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure API key authorization: UserSessionHeader
        ApiKeyAuth UserSessionHeader = (ApiKeyAuth) defaultClient.getAuthentication("UserSessionHeader");
        UserSessionHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //UserSessionHeader.setApiKeyPrefix("Token");

        // Configure API key authorization: AuthTypeHeader
        ApiKeyAuth AuthTypeHeader = (ApiKeyAuth) defaultClient.getAuthentication("AuthTypeHeader");
        AuthTypeHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //AuthTypeHeader.setApiKeyPrefix("Token");

        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: AccountToken
        HttpBearerAuth AccountToken = (HttpBearerAuth) defaultClient.getAuthentication("AccountToken");
        AccountToken.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: AccountIdHeader
        ApiKeyAuth AccountIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("AccountIdHeader");
        AccountIdHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //AccountIdHeader.setApiKeyPrefix("Token");

        // Configure API key authorization: ClientIdHeader
        ApiKeyAuth ClientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("ClientIdHeader");
        ClientIdHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ClientIdHeader.setApiKeyPrefix("Token");

        // Configure API key authorization: UserSessionCookie
        ApiKeyAuth UserSessionCookie = (ApiKeyAuth) defaultClient.getAuthentication("UserSessionCookie");
        UserSessionCookie.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //UserSessionCookie.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: ExchangeIdToken
        HttpBearerAuth ExchangeIdToken = (HttpBearerAuth) defaultClient.getAuthentication("ExchangeIdToken");
        ExchangeIdToken.setBearerToken("BEARER TOKEN");

        AvailabilityApi apiInstance = new AvailabilityApi(defaultClient);
        Long id = 56L; // Long | A booking id
        BookingRequiredMode required = BookingRequiredMode.fromValue("one"); // BookingRequiredMode | a way to select times
        Long reserveForMinutes = 56L; // Long | Time in minutes, blocks the interval for a time (creates an unconfirmed reservation), the meeting is not created
        CreateMeetingDto createMeetingDto = new CreateMeetingDto(); // CreateMeetingDto | 
        try {
            CompletableFuture<CreateMeetingResponse> result = apiInstance.bookingAccountCreateMeeting(id, required, reserveForMinutes, createMeetingDto);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling AvailabilityApi#bookingAccountCreateMeeting");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| A booking id | |
| **required** | [**BookingRequiredMode**](.md)| a way to select times | [optional] [enum: one, all] |
| **reserveForMinutes** | **Long**| Time in minutes, blocks the interval for a time (creates an unconfirmed reservation), the meeting is not created | [optional] |
| **createMeetingDto** | [**CreateMeetingDto**](CreateMeetingDto.md)|  | [optional] |

### Return type

CompletableFuture<[**CreateMeetingResponse**](CreateMeetingResponse.md)>


### Authorization

[UserSessionHeader](../README.md#UserSessionHeader), [AuthTypeHeader](../README.md#AuthTypeHeader), [AppAuth](../README.md#AppAuth), [AccountToken](../README.md#AccountToken), [AccountIdHeader](../README.md#AccountIdHeader), [ClientIdHeader](../README.md#ClientIdHeader), [UserSessionCookie](../README.md#UserSessionCookie), [ExchangeIdToken](../README.md#ExchangeIdToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |
| **0** | See \&quot;Handling errors\&quot; section for details |  -  |

## bookingAccountCreateMeetingWithHttpInfo

> CompletableFuture<ApiResponse<CreateMeetingResponse>> bookingAccountCreateMeeting bookingAccountCreateMeetingWithHttpInfo(id, required, reserveForMinutes, createMeetingDto)

Create a meeting

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AvailabilityApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure API key authorization: UserSessionHeader
        ApiKeyAuth UserSessionHeader = (ApiKeyAuth) defaultClient.getAuthentication("UserSessionHeader");
        UserSessionHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //UserSessionHeader.setApiKeyPrefix("Token");

        // Configure API key authorization: AuthTypeHeader
        ApiKeyAuth AuthTypeHeader = (ApiKeyAuth) defaultClient.getAuthentication("AuthTypeHeader");
        AuthTypeHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //AuthTypeHeader.setApiKeyPrefix("Token");

        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: AccountToken
        HttpBearerAuth AccountToken = (HttpBearerAuth) defaultClient.getAuthentication("AccountToken");
        AccountToken.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: AccountIdHeader
        ApiKeyAuth AccountIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("AccountIdHeader");
        AccountIdHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //AccountIdHeader.setApiKeyPrefix("Token");

        // Configure API key authorization: ClientIdHeader
        ApiKeyAuth ClientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("ClientIdHeader");
        ClientIdHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ClientIdHeader.setApiKeyPrefix("Token");

        // Configure API key authorization: UserSessionCookie
        ApiKeyAuth UserSessionCookie = (ApiKeyAuth) defaultClient.getAuthentication("UserSessionCookie");
        UserSessionCookie.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //UserSessionCookie.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: ExchangeIdToken
        HttpBearerAuth ExchangeIdToken = (HttpBearerAuth) defaultClient.getAuthentication("ExchangeIdToken");
        ExchangeIdToken.setBearerToken("BEARER TOKEN");

        AvailabilityApi apiInstance = new AvailabilityApi(defaultClient);
        Long id = 56L; // Long | A booking id
        BookingRequiredMode required = BookingRequiredMode.fromValue("one"); // BookingRequiredMode | a way to select times
        Long reserveForMinutes = 56L; // Long | Time in minutes, blocks the interval for a time (creates an unconfirmed reservation), the meeting is not created
        CreateMeetingDto createMeetingDto = new CreateMeetingDto(); // CreateMeetingDto | 
        try {
            CompletableFuture<ApiResponse<CreateMeetingResponse>> response = apiInstance.bookingAccountCreateMeetingWithHttpInfo(id, required, reserveForMinutes, createMeetingDto);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AvailabilityApi#bookingAccountCreateMeeting");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AvailabilityApi#bookingAccountCreateMeeting");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| A booking id | |
| **required** | [**BookingRequiredMode**](.md)| a way to select times | [optional] [enum: one, all] |
| **reserveForMinutes** | **Long**| Time in minutes, blocks the interval for a time (creates an unconfirmed reservation), the meeting is not created | [optional] |
| **createMeetingDto** | [**CreateMeetingDto**](CreateMeetingDto.md)|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CreateMeetingResponse**](CreateMeetingResponse.md)>>


### Authorization

[UserSessionHeader](../README.md#UserSessionHeader), [AuthTypeHeader](../README.md#AuthTypeHeader), [AppAuth](../README.md#AppAuth), [AccountToken](../README.md#AccountToken), [AccountIdHeader](../README.md#AccountIdHeader), [ClientIdHeader](../README.md#ClientIdHeader), [UserSessionCookie](../README.md#UserSessionCookie), [ExchangeIdToken](../README.md#ExchangeIdToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |
| **0** | See \&quot;Handling errors\&quot; section for details |  -  |


## bookingAccountMeetingTimes

> CompletableFuture<BookingTimesOutDto> bookingAccountMeetingTimes(id, required, fromDate, intervalLength, pageToken, limit, offset)

Get available meeting times

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AvailabilityApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure API key authorization: UserSessionHeader
        ApiKeyAuth UserSessionHeader = (ApiKeyAuth) defaultClient.getAuthentication("UserSessionHeader");
        UserSessionHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //UserSessionHeader.setApiKeyPrefix("Token");

        // Configure API key authorization: AuthTypeHeader
        ApiKeyAuth AuthTypeHeader = (ApiKeyAuth) defaultClient.getAuthentication("AuthTypeHeader");
        AuthTypeHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //AuthTypeHeader.setApiKeyPrefix("Token");

        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: AccountToken
        HttpBearerAuth AccountToken = (HttpBearerAuth) defaultClient.getAuthentication("AccountToken");
        AccountToken.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: AccountIdHeader
        ApiKeyAuth AccountIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("AccountIdHeader");
        AccountIdHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //AccountIdHeader.setApiKeyPrefix("Token");

        // Configure API key authorization: ClientIdHeader
        ApiKeyAuth ClientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("ClientIdHeader");
        ClientIdHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ClientIdHeader.setApiKeyPrefix("Token");

        // Configure API key authorization: UserSessionCookie
        ApiKeyAuth UserSessionCookie = (ApiKeyAuth) defaultClient.getAuthentication("UserSessionCookie");
        UserSessionCookie.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //UserSessionCookie.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: ExchangeIdToken
        HttpBearerAuth ExchangeIdToken = (HttpBearerAuth) defaultClient.getAuthentication("ExchangeIdToken");
        ExchangeIdToken.setBearerToken("BEARER TOKEN");

        AvailabilityApi apiInstance = new AvailabilityApi(defaultClient);
        Long id = 56L; // Long | A booking id
        BookingRequiredMode required = BookingRequiredMode.fromValue("one"); // BookingRequiredMode | a way to select times
        LocalDate fromDate = LocalDate.now(); // LocalDate | date to iterate a big time intervals
        String intervalLength = "intervalLength_example"; // String | Time period (in ISO-8601 format) to iterate a big time intervals
        String pageToken = "pageToken_example"; // String | token to request all pages, if booking has many accounts
        Integer limit = 56; // Integer | 
        Integer offset = 56; // Integer | 
        try {
            CompletableFuture<BookingTimesOutDto> result = apiInstance.bookingAccountMeetingTimes(id, required, fromDate, intervalLength, pageToken, limit, offset);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling AvailabilityApi#bookingAccountMeetingTimes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| A booking id | |
| **required** | [**BookingRequiredMode**](.md)| a way to select times | [optional] [enum: one, all] |
| **fromDate** | **LocalDate**| date to iterate a big time intervals | [optional] |
| **intervalLength** | **String**| Time period (in ISO-8601 format) to iterate a big time intervals | [optional] |
| **pageToken** | **String**| token to request all pages, if booking has many accounts | [optional] |
| **limit** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |

### Return type

CompletableFuture<[**BookingTimesOutDto**](BookingTimesOutDto.md)>


### Authorization

[UserSessionHeader](../README.md#UserSessionHeader), [AuthTypeHeader](../README.md#AuthTypeHeader), [AppAuth](../README.md#AppAuth), [AccountToken](../README.md#AccountToken), [AccountIdHeader](../README.md#AccountIdHeader), [ClientIdHeader](../README.md#ClientIdHeader), [UserSessionCookie](../README.md#UserSessionCookie), [ExchangeIdToken](../README.md#ExchangeIdToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |
| **0** | See \&quot;Handling errors\&quot; section for details |  -  |

## bookingAccountMeetingTimesWithHttpInfo

> CompletableFuture<ApiResponse<BookingTimesOutDto>> bookingAccountMeetingTimes bookingAccountMeetingTimesWithHttpInfo(id, required, fromDate, intervalLength, pageToken, limit, offset)

Get available meeting times

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AvailabilityApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure API key authorization: UserSessionHeader
        ApiKeyAuth UserSessionHeader = (ApiKeyAuth) defaultClient.getAuthentication("UserSessionHeader");
        UserSessionHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //UserSessionHeader.setApiKeyPrefix("Token");

        // Configure API key authorization: AuthTypeHeader
        ApiKeyAuth AuthTypeHeader = (ApiKeyAuth) defaultClient.getAuthentication("AuthTypeHeader");
        AuthTypeHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //AuthTypeHeader.setApiKeyPrefix("Token");

        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: AccountToken
        HttpBearerAuth AccountToken = (HttpBearerAuth) defaultClient.getAuthentication("AccountToken");
        AccountToken.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: AccountIdHeader
        ApiKeyAuth AccountIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("AccountIdHeader");
        AccountIdHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //AccountIdHeader.setApiKeyPrefix("Token");

        // Configure API key authorization: ClientIdHeader
        ApiKeyAuth ClientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("ClientIdHeader");
        ClientIdHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ClientIdHeader.setApiKeyPrefix("Token");

        // Configure API key authorization: UserSessionCookie
        ApiKeyAuth UserSessionCookie = (ApiKeyAuth) defaultClient.getAuthentication("UserSessionCookie");
        UserSessionCookie.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //UserSessionCookie.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: ExchangeIdToken
        HttpBearerAuth ExchangeIdToken = (HttpBearerAuth) defaultClient.getAuthentication("ExchangeIdToken");
        ExchangeIdToken.setBearerToken("BEARER TOKEN");

        AvailabilityApi apiInstance = new AvailabilityApi(defaultClient);
        Long id = 56L; // Long | A booking id
        BookingRequiredMode required = BookingRequiredMode.fromValue("one"); // BookingRequiredMode | a way to select times
        LocalDate fromDate = LocalDate.now(); // LocalDate | date to iterate a big time intervals
        String intervalLength = "intervalLength_example"; // String | Time period (in ISO-8601 format) to iterate a big time intervals
        String pageToken = "pageToken_example"; // String | token to request all pages, if booking has many accounts
        Integer limit = 56; // Integer | 
        Integer offset = 56; // Integer | 
        try {
            CompletableFuture<ApiResponse<BookingTimesOutDto>> response = apiInstance.bookingAccountMeetingTimesWithHttpInfo(id, required, fromDate, intervalLength, pageToken, limit, offset);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AvailabilityApi#bookingAccountMeetingTimes");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AvailabilityApi#bookingAccountMeetingTimes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| A booking id | |
| **required** | [**BookingRequiredMode**](.md)| a way to select times | [optional] [enum: one, all] |
| **fromDate** | **LocalDate**| date to iterate a big time intervals | [optional] |
| **intervalLength** | **String**| Time period (in ISO-8601 format) to iterate a big time intervals | [optional] |
| **pageToken** | **String**| token to request all pages, if booking has many accounts | [optional] |
| **limit** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**BookingTimesOutDto**](BookingTimesOutDto.md)>>


### Authorization

[UserSessionHeader](../README.md#UserSessionHeader), [AuthTypeHeader](../README.md#AuthTypeHeader), [AppAuth](../README.md#AppAuth), [AccountToken](../README.md#AccountToken), [AccountIdHeader](../README.md#AccountIdHeader), [ClientIdHeader](../README.md#ClientIdHeader), [UserSessionCookie](../README.md#UserSessionCookie), [ExchangeIdToken](../README.md#ExchangeIdToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |
| **0** | See \&quot;Handling errors\&quot; section for details |  -  |


## bookingGroupAvailability

> CompletableFuture<BookingAvailableProfilesOutDto> bookingGroupAvailability(bookingAvailableProfilesInDto)

Get available bookings for а time range

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AvailabilityApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        AvailabilityApi apiInstance = new AvailabilityApi(defaultClient);
        BookingAvailableProfilesInDto bookingAvailableProfilesInDto = new BookingAvailableProfilesInDto(); // BookingAvailableProfilesInDto | 
        try {
            CompletableFuture<BookingAvailableProfilesOutDto> result = apiInstance.bookingGroupAvailability(bookingAvailableProfilesInDto);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling AvailabilityApi#bookingGroupAvailability");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookingAvailableProfilesInDto** | [**BookingAvailableProfilesInDto**](BookingAvailableProfilesInDto.md)|  | [optional] |

### Return type

CompletableFuture<[**BookingAvailableProfilesOutDto**](BookingAvailableProfilesOutDto.md)>


### Authorization

[AppAuth](../README.md#AppAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |
| **0** | See \&quot;Handling errors\&quot; section for details |  -  |

## bookingGroupAvailabilityWithHttpInfo

> CompletableFuture<ApiResponse<BookingAvailableProfilesOutDto>> bookingGroupAvailability bookingGroupAvailabilityWithHttpInfo(bookingAvailableProfilesInDto)

Get available bookings for а time range

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AvailabilityApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        AvailabilityApi apiInstance = new AvailabilityApi(defaultClient);
        BookingAvailableProfilesInDto bookingAvailableProfilesInDto = new BookingAvailableProfilesInDto(); // BookingAvailableProfilesInDto | 
        try {
            CompletableFuture<ApiResponse<BookingAvailableProfilesOutDto>> response = apiInstance.bookingGroupAvailabilityWithHttpInfo(bookingAvailableProfilesInDto);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AvailabilityApi#bookingGroupAvailability");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AvailabilityApi#bookingGroupAvailability");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookingAvailableProfilesInDto** | [**BookingAvailableProfilesInDto**](BookingAvailableProfilesInDto.md)|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**BookingAvailableProfilesOutDto**](BookingAvailableProfilesOutDto.md)>>


### Authorization

[AppAuth](../README.md#AppAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |
| **0** | See \&quot;Handling errors\&quot; section for details |  -  |


## bookingGroupCreateMeeting

> CompletableFuture<CreateMeetingResponse> bookingGroupCreateMeeting(id, required, reserveForMinutes, createMeetingDto)

Create a meeting

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AvailabilityApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        AvailabilityApi apiInstance = new AvailabilityApi(defaultClient);
        Long id = 56L; // Long | A booking id
        BookingRequiredMode required = BookingRequiredMode.fromValue("one"); // BookingRequiredMode | a way to select times
        Long reserveForMinutes = 56L; // Long | Time in minutes, blocks the interval for a time (creates an unconfirmed reservation), the meeting is not created
        CreateMeetingDto createMeetingDto = new CreateMeetingDto(); // CreateMeetingDto | 
        try {
            CompletableFuture<CreateMeetingResponse> result = apiInstance.bookingGroupCreateMeeting(id, required, reserveForMinutes, createMeetingDto);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling AvailabilityApi#bookingGroupCreateMeeting");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| A booking id | |
| **required** | [**BookingRequiredMode**](.md)| a way to select times | [optional] [enum: one, all] |
| **reserveForMinutes** | **Long**| Time in minutes, blocks the interval for a time (creates an unconfirmed reservation), the meeting is not created | [optional] |
| **createMeetingDto** | [**CreateMeetingDto**](CreateMeetingDto.md)|  | [optional] |

### Return type

CompletableFuture<[**CreateMeetingResponse**](CreateMeetingResponse.md)>


### Authorization

[AppAuth](../README.md#AppAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |
| **0** | See \&quot;Handling errors\&quot; section for details |  -  |

## bookingGroupCreateMeetingWithHttpInfo

> CompletableFuture<ApiResponse<CreateMeetingResponse>> bookingGroupCreateMeeting bookingGroupCreateMeetingWithHttpInfo(id, required, reserveForMinutes, createMeetingDto)

Create a meeting

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AvailabilityApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        AvailabilityApi apiInstance = new AvailabilityApi(defaultClient);
        Long id = 56L; // Long | A booking id
        BookingRequiredMode required = BookingRequiredMode.fromValue("one"); // BookingRequiredMode | a way to select times
        Long reserveForMinutes = 56L; // Long | Time in minutes, blocks the interval for a time (creates an unconfirmed reservation), the meeting is not created
        CreateMeetingDto createMeetingDto = new CreateMeetingDto(); // CreateMeetingDto | 
        try {
            CompletableFuture<ApiResponse<CreateMeetingResponse>> response = apiInstance.bookingGroupCreateMeetingWithHttpInfo(id, required, reserveForMinutes, createMeetingDto);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AvailabilityApi#bookingGroupCreateMeeting");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AvailabilityApi#bookingGroupCreateMeeting");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| A booking id | |
| **required** | [**BookingRequiredMode**](.md)| a way to select times | [optional] [enum: one, all] |
| **reserveForMinutes** | **Long**| Time in minutes, blocks the interval for a time (creates an unconfirmed reservation), the meeting is not created | [optional] |
| **createMeetingDto** | [**CreateMeetingDto**](CreateMeetingDto.md)|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CreateMeetingResponse**](CreateMeetingResponse.md)>>


### Authorization

[AppAuth](../README.md#AppAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |
| **0** | See \&quot;Handling errors\&quot; section for details |  -  |


## bookingGroupMeetingTimes

> CompletableFuture<BookingTimesOutDto> bookingGroupMeetingTimes(id, required, fromDate, intervalLength, pageToken, limit, offset)

Get available meeting times

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AvailabilityApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        AvailabilityApi apiInstance = new AvailabilityApi(defaultClient);
        Long id = 56L; // Long | A booking id
        BookingRequiredMode required = BookingRequiredMode.fromValue("one"); // BookingRequiredMode | a way to select times
        LocalDate fromDate = LocalDate.now(); // LocalDate | date to iterate a big time intervals
        String intervalLength = "intervalLength_example"; // String | Time period (in ISO-8601 format) to iterate a big time intervals
        String pageToken = "pageToken_example"; // String | token to request all pages, if booking has many accounts
        Integer limit = 56; // Integer | 
        Integer offset = 56; // Integer | 
        try {
            CompletableFuture<BookingTimesOutDto> result = apiInstance.bookingGroupMeetingTimes(id, required, fromDate, intervalLength, pageToken, limit, offset);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling AvailabilityApi#bookingGroupMeetingTimes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| A booking id | |
| **required** | [**BookingRequiredMode**](.md)| a way to select times | [optional] [enum: one, all] |
| **fromDate** | **LocalDate**| date to iterate a big time intervals | [optional] |
| **intervalLength** | **String**| Time period (in ISO-8601 format) to iterate a big time intervals | [optional] |
| **pageToken** | **String**| token to request all pages, if booking has many accounts | [optional] |
| **limit** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |

### Return type

CompletableFuture<[**BookingTimesOutDto**](BookingTimesOutDto.md)>


### Authorization

[AppAuth](../README.md#AppAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |
| **0** | See \&quot;Handling errors\&quot; section for details |  -  |

## bookingGroupMeetingTimesWithHttpInfo

> CompletableFuture<ApiResponse<BookingTimesOutDto>> bookingGroupMeetingTimes bookingGroupMeetingTimesWithHttpInfo(id, required, fromDate, intervalLength, pageToken, limit, offset)

Get available meeting times

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AvailabilityApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        AvailabilityApi apiInstance = new AvailabilityApi(defaultClient);
        Long id = 56L; // Long | A booking id
        BookingRequiredMode required = BookingRequiredMode.fromValue("one"); // BookingRequiredMode | a way to select times
        LocalDate fromDate = LocalDate.now(); // LocalDate | date to iterate a big time intervals
        String intervalLength = "intervalLength_example"; // String | Time period (in ISO-8601 format) to iterate a big time intervals
        String pageToken = "pageToken_example"; // String | token to request all pages, if booking has many accounts
        Integer limit = 56; // Integer | 
        Integer offset = 56; // Integer | 
        try {
            CompletableFuture<ApiResponse<BookingTimesOutDto>> response = apiInstance.bookingGroupMeetingTimesWithHttpInfo(id, required, fromDate, intervalLength, pageToken, limit, offset);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AvailabilityApi#bookingGroupMeetingTimes");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AvailabilityApi#bookingGroupMeetingTimes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| A booking id | |
| **required** | [**BookingRequiredMode**](.md)| a way to select times | [optional] [enum: one, all] |
| **fromDate** | **LocalDate**| date to iterate a big time intervals | [optional] |
| **intervalLength** | **String**| Time period (in ISO-8601 format) to iterate a big time intervals | [optional] |
| **pageToken** | **String**| token to request all pages, if booking has many accounts | [optional] |
| **limit** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**BookingTimesOutDto**](BookingTimesOutDto.md)>>


### Authorization

[AppAuth](../README.md#AppAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |
| **0** | See \&quot;Handling errors\&quot; section for details |  -  |


## createMeeting

> CompletableFuture<CreateMeetingResponse> createMeeting(aurinkoClientId, name, required, reserveForMinutes, createMeetingDto)

Create a meeting

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.models.*;
import io.aurinko.api.AvailabilityApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");

        AvailabilityApi apiInstance = new AvailabilityApi(defaultClient);
        String aurinkoClientId = "aurinkoClientId_example"; // String | Application client Id
        String name = "name_example"; // String | Booking profile name
        BookingRequiredMode required = BookingRequiredMode.fromValue("one"); // BookingRequiredMode | a way to select times
        Long reserveForMinutes = 56L; // Long | Time in minutes, blocks the interval for a time (creates an unconfirmed reservation), the meeting is not created
        CreateMeetingDto createMeetingDto = new CreateMeetingDto(); // CreateMeetingDto | 
        try {
            CompletableFuture<CreateMeetingResponse> result = apiInstance.createMeeting(aurinkoClientId, name, required, reserveForMinutes, createMeetingDto);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling AvailabilityApi#createMeeting");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aurinkoClientId** | **String**| Application client Id | |
| **name** | **String**| Booking profile name | |
| **required** | [**BookingRequiredMode**](.md)| a way to select times | [optional] [enum: one, all] |
| **reserveForMinutes** | **Long**| Time in minutes, blocks the interval for a time (creates an unconfirmed reservation), the meeting is not created | [optional] |
| **createMeetingDto** | [**CreateMeetingDto**](CreateMeetingDto.md)|  | [optional] |

### Return type

CompletableFuture<[**CreateMeetingResponse**](CreateMeetingResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | See \&quot;Handling errors\&quot; section for details |  -  |

## createMeetingWithHttpInfo

> CompletableFuture<ApiResponse<CreateMeetingResponse>> createMeeting createMeetingWithHttpInfo(aurinkoClientId, name, required, reserveForMinutes, createMeetingDto)

Create a meeting

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.models.*;
import io.aurinko.api.AvailabilityApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");

        AvailabilityApi apiInstance = new AvailabilityApi(defaultClient);
        String aurinkoClientId = "aurinkoClientId_example"; // String | Application client Id
        String name = "name_example"; // String | Booking profile name
        BookingRequiredMode required = BookingRequiredMode.fromValue("one"); // BookingRequiredMode | a way to select times
        Long reserveForMinutes = 56L; // Long | Time in minutes, blocks the interval for a time (creates an unconfirmed reservation), the meeting is not created
        CreateMeetingDto createMeetingDto = new CreateMeetingDto(); // CreateMeetingDto | 
        try {
            CompletableFuture<ApiResponse<CreateMeetingResponse>> response = apiInstance.createMeetingWithHttpInfo(aurinkoClientId, name, required, reserveForMinutes, createMeetingDto);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AvailabilityApi#createMeeting");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AvailabilityApi#createMeeting");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aurinkoClientId** | **String**| Application client Id | |
| **name** | **String**| Booking profile name | |
| **required** | [**BookingRequiredMode**](.md)| a way to select times | [optional] [enum: one, all] |
| **reserveForMinutes** | **Long**| Time in minutes, blocks the interval for a time (creates an unconfirmed reservation), the meeting is not created | [optional] |
| **createMeetingDto** | [**CreateMeetingDto**](CreateMeetingDto.md)|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CreateMeetingResponse**](CreateMeetingResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | See \&quot;Handling errors\&quot; section for details |  -  |


## getMeetingTimes

> CompletableFuture<BookingTimesOutDto> getMeetingTimes(aurinkoClientId, name, required, fromDate, intervalLength, pageToken, limit, offset)

Get available meeting times

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.models.*;
import io.aurinko.api.AvailabilityApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");

        AvailabilityApi apiInstance = new AvailabilityApi(defaultClient);
        String aurinkoClientId = "aurinkoClientId_example"; // String | Application client Id
        String name = "name_example"; // String | Booking profile name
        BookingRequiredMode required = BookingRequiredMode.fromValue("one"); // BookingRequiredMode | a way to select times
        LocalDate fromDate = LocalDate.now(); // LocalDate | date to iterate a big time intervals
        String intervalLength = "intervalLength_example"; // String | Time period (in ISO-8601 format) to iterate a big time intervals
        String pageToken = "pageToken_example"; // String | token to request all pages, if booking has many accounts
        Integer limit = 56; // Integer | 
        Integer offset = 56; // Integer | 
        try {
            CompletableFuture<BookingTimesOutDto> result = apiInstance.getMeetingTimes(aurinkoClientId, name, required, fromDate, intervalLength, pageToken, limit, offset);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling AvailabilityApi#getMeetingTimes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aurinkoClientId** | **String**| Application client Id | |
| **name** | **String**| Booking profile name | |
| **required** | [**BookingRequiredMode**](.md)| a way to select times | [optional] [enum: one, all] |
| **fromDate** | **LocalDate**| date to iterate a big time intervals | [optional] |
| **intervalLength** | **String**| Time period (in ISO-8601 format) to iterate a big time intervals | [optional] |
| **pageToken** | **String**| token to request all pages, if booking has many accounts | [optional] |
| **limit** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |

### Return type

CompletableFuture<[**BookingTimesOutDto**](BookingTimesOutDto.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | See \&quot;Handling errors\&quot; section for details |  -  |

## getMeetingTimesWithHttpInfo

> CompletableFuture<ApiResponse<BookingTimesOutDto>> getMeetingTimes getMeetingTimesWithHttpInfo(aurinkoClientId, name, required, fromDate, intervalLength, pageToken, limit, offset)

Get available meeting times

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.models.*;
import io.aurinko.api.AvailabilityApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");

        AvailabilityApi apiInstance = new AvailabilityApi(defaultClient);
        String aurinkoClientId = "aurinkoClientId_example"; // String | Application client Id
        String name = "name_example"; // String | Booking profile name
        BookingRequiredMode required = BookingRequiredMode.fromValue("one"); // BookingRequiredMode | a way to select times
        LocalDate fromDate = LocalDate.now(); // LocalDate | date to iterate a big time intervals
        String intervalLength = "intervalLength_example"; // String | Time period (in ISO-8601 format) to iterate a big time intervals
        String pageToken = "pageToken_example"; // String | token to request all pages, if booking has many accounts
        Integer limit = 56; // Integer | 
        Integer offset = 56; // Integer | 
        try {
            CompletableFuture<ApiResponse<BookingTimesOutDto>> response = apiInstance.getMeetingTimesWithHttpInfo(aurinkoClientId, name, required, fromDate, intervalLength, pageToken, limit, offset);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AvailabilityApi#getMeetingTimes");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AvailabilityApi#getMeetingTimes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aurinkoClientId** | **String**| Application client Id | |
| **name** | **String**| Booking profile name | |
| **required** | [**BookingRequiredMode**](.md)| a way to select times | [optional] [enum: one, all] |
| **fromDate** | **LocalDate**| date to iterate a big time intervals | [optional] |
| **intervalLength** | **String**| Time period (in ISO-8601 format) to iterate a big time intervals | [optional] |
| **pageToken** | **String**| token to request all pages, if booking has many accounts | [optional] |
| **limit** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**BookingTimesOutDto**](BookingTimesOutDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | See \&quot;Handling errors\&quot; section for details |  -  |


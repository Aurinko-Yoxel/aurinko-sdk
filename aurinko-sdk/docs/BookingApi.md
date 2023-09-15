# BookingApi

All URIs are relative to *https://api.aurinko.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](BookingApi.md#create) | **POST** /v1/book/profiles | Create a booking profile |
| [**createWithHttpInfo**](BookingApi.md#createWithHttpInfo) | **POST** /v1/book/profiles | Create a booking profile |
| [**createMeeting**](BookingApi.md#createMeeting) | **POST** /v1/book/{aurinkoClientId}/{name}/meeting | Create a meeting |
| [**createMeetingWithHttpInfo**](BookingApi.md#createMeetingWithHttpInfo) | **POST** /v1/book/{aurinkoClientId}/{name}/meeting | Create a meeting |
| [**deleteBooking**](BookingApi.md#deleteBooking) | **DELETE** /v1/book/profiles/{id} | Delete a booking profile by id |
| [**deleteBookingWithHttpInfo**](BookingApi.md#deleteBookingWithHttpInfo) | **DELETE** /v1/book/profiles/{id} | Delete a booking profile by id |
| [**getAccBookings**](BookingApi.md#getAccBookings) | **GET** /v1/book/profiles | Get booking profiles |
| [**getAccBookingsWithHttpInfo**](BookingApi.md#getAccBookingsWithHttpInfo) | **GET** /v1/book/profiles | Get booking profiles |
| [**getBooking**](BookingApi.md#getBooking) | **GET** /v1/book/profiles/{id} | Get a booking profile by id |
| [**getBookingWithHttpInfo**](BookingApi.md#getBookingWithHttpInfo) | **GET** /v1/book/profiles/{id} | Get a booking profile by id |
| [**getMeetingTimes**](BookingApi.md#getMeetingTimes) | **GET** /v1/book/{aurinkoClientId}/{name}/meeting | Get available meeting times |
| [**getMeetingTimesWithHttpInfo**](BookingApi.md#getMeetingTimesWithHttpInfo) | **GET** /v1/book/{aurinkoClientId}/{name}/meeting | Get available meeting times |
| [**updateBooking**](BookingApi.md#updateBooking) | **PATCH** /v1/book/profiles/{id} | Update a booking profile |
| [**updateBookingWithHttpInfo**](BookingApi.md#updateBookingWithHttpInfo) | **PATCH** /v1/book/profiles/{id} | Update a booking profile |
| [**workHours**](BookingApi.md#workHours) | **GET** /v1/book/workHours | Get user work hours |
| [**workHoursWithHttpInfo**](BookingApi.md#workHoursWithHttpInfo) | **GET** /v1/book/workHours | Get user work hours |



## create

> CompletableFuture<BookingOutDto> create(bookingInDto)

Create a booking profile

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.BookingApi;
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

        BookingApi apiInstance = new BookingApi(defaultClient);
        BookingInDto bookingInDto = new BookingInDto(); // BookingInDto | 
        try {
            CompletableFuture<BookingOutDto> result = apiInstance.create(bookingInDto);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingApi#create");
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
| **bookingInDto** | [**BookingInDto**](BookingInDto.md)|  | [optional] |

### Return type

CompletableFuture<[**BookingOutDto**](BookingOutDto.md)>


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

## createWithHttpInfo

> CompletableFuture<ApiResponse<BookingOutDto>> create createWithHttpInfo(bookingInDto)

Create a booking profile

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.BookingApi;
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

        BookingApi apiInstance = new BookingApi(defaultClient);
        BookingInDto bookingInDto = new BookingInDto(); // BookingInDto | 
        try {
            CompletableFuture<ApiResponse<BookingOutDto>> response = apiInstance.createWithHttpInfo(bookingInDto);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BookingApi#create");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingApi#create");
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
| **bookingInDto** | [**BookingInDto**](BookingInDto.md)|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**BookingOutDto**](BookingOutDto.md)>>


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


## createMeeting

> CompletableFuture<BookingSuccessOutDto> createMeeting(aurinkoClientId, name, createMeetingDto)

Create a meeting

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.models.*;
import io.aurinko.api.BookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");

        BookingApi apiInstance = new BookingApi(defaultClient);
        String aurinkoClientId = "aurinkoClientId_example"; // String | Application client Id
        String name = "name_example"; // String | Booking profile name
        CreateMeetingDto createMeetingDto = new CreateMeetingDto(); // CreateMeetingDto | 
        try {
            CompletableFuture<BookingSuccessOutDto> result = apiInstance.createMeeting(aurinkoClientId, name, createMeetingDto);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingApi#createMeeting");
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
| **createMeetingDto** | [**CreateMeetingDto**](CreateMeetingDto.md)|  | [optional] |

### Return type

CompletableFuture<[**BookingSuccessOutDto**](BookingSuccessOutDto.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |

## createMeetingWithHttpInfo

> CompletableFuture<ApiResponse<BookingSuccessOutDto>> createMeeting createMeetingWithHttpInfo(aurinkoClientId, name, createMeetingDto)

Create a meeting

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.models.*;
import io.aurinko.api.BookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");

        BookingApi apiInstance = new BookingApi(defaultClient);
        String aurinkoClientId = "aurinkoClientId_example"; // String | Application client Id
        String name = "name_example"; // String | Booking profile name
        CreateMeetingDto createMeetingDto = new CreateMeetingDto(); // CreateMeetingDto | 
        try {
            CompletableFuture<ApiResponse<BookingSuccessOutDto>> response = apiInstance.createMeetingWithHttpInfo(aurinkoClientId, name, createMeetingDto);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BookingApi#createMeeting");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingApi#createMeeting");
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
| **createMeetingDto** | [**CreateMeetingDto**](CreateMeetingDto.md)|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**BookingSuccessOutDto**](BookingSuccessOutDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |


## deleteBooking

> CompletableFuture<BookingSuccessOutDto> deleteBooking(id)

Delete a booking profile by id

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.BookingApi;
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

        BookingApi apiInstance = new BookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        try {
            CompletableFuture<BookingSuccessOutDto> result = apiInstance.deleteBooking(id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingApi#deleteBooking");
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

### Return type

CompletableFuture<[**BookingSuccessOutDto**](BookingSuccessOutDto.md)>


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

## deleteBookingWithHttpInfo

> CompletableFuture<ApiResponse<BookingSuccessOutDto>> deleteBooking deleteBookingWithHttpInfo(id)

Delete a booking profile by id

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.BookingApi;
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

        BookingApi apiInstance = new BookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        try {
            CompletableFuture<ApiResponse<BookingSuccessOutDto>> response = apiInstance.deleteBookingWithHttpInfo(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BookingApi#deleteBooking");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingApi#deleteBooking");
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

### Return type

CompletableFuture<ApiResponse<[**BookingSuccessOutDto**](BookingSuccessOutDto.md)>>


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


## getAccBookings

> CompletableFuture<List<BookingOutDto>> getAccBookings()

Get booking profiles

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.BookingApi;
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

        BookingApi apiInstance = new BookingApi(defaultClient);
        try {
            CompletableFuture<List<BookingOutDto>> result = apiInstance.getAccBookings();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingApi#getAccBookings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<[**List&lt;BookingOutDto&gt;**](BookingOutDto.md)>


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

## getAccBookingsWithHttpInfo

> CompletableFuture<ApiResponse<List<BookingOutDto>>> getAccBookings getAccBookingsWithHttpInfo()

Get booking profiles

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.BookingApi;
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

        BookingApi apiInstance = new BookingApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<List<BookingOutDto>>> response = apiInstance.getAccBookingsWithHttpInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BookingApi#getAccBookings");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingApi#getAccBookings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<ApiResponse<[**List&lt;BookingOutDto&gt;**](BookingOutDto.md)>>


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


## getBooking

> CompletableFuture<BookingOutDto> getBooking(id)

Get a booking profile by id

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.BookingApi;
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

        BookingApi apiInstance = new BookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        try {
            CompletableFuture<BookingOutDto> result = apiInstance.getBooking(id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingApi#getBooking");
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

### Return type

CompletableFuture<[**BookingOutDto**](BookingOutDto.md)>


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

## getBookingWithHttpInfo

> CompletableFuture<ApiResponse<BookingOutDto>> getBooking getBookingWithHttpInfo(id)

Get a booking profile by id

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.BookingApi;
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

        BookingApi apiInstance = new BookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        try {
            CompletableFuture<ApiResponse<BookingOutDto>> response = apiInstance.getBookingWithHttpInfo(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BookingApi#getBooking");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingApi#getBooking");
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

### Return type

CompletableFuture<ApiResponse<[**BookingOutDto**](BookingOutDto.md)>>


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


## getMeetingTimes

> CompletableFuture<BookingTimesOutDto> getMeetingTimes(aurinkoClientId, name)

Get available meeting times

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.models.*;
import io.aurinko.api.BookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");

        BookingApi apiInstance = new BookingApi(defaultClient);
        String aurinkoClientId = "aurinkoClientId_example"; // String | Application client Id
        String name = "name_example"; // String | Booking profile name
        try {
            CompletableFuture<BookingTimesOutDto> result = apiInstance.getMeetingTimes(aurinkoClientId, name);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingApi#getMeetingTimes");
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

## getMeetingTimesWithHttpInfo

> CompletableFuture<ApiResponse<BookingTimesOutDto>> getMeetingTimes getMeetingTimesWithHttpInfo(aurinkoClientId, name)

Get available meeting times

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.models.*;
import io.aurinko.api.BookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");

        BookingApi apiInstance = new BookingApi(defaultClient);
        String aurinkoClientId = "aurinkoClientId_example"; // String | Application client Id
        String name = "name_example"; // String | Booking profile name
        try {
            CompletableFuture<ApiResponse<BookingTimesOutDto>> response = apiInstance.getMeetingTimesWithHttpInfo(aurinkoClientId, name);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BookingApi#getMeetingTimes");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingApi#getMeetingTimes");
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


## updateBooking

> CompletableFuture<BookingSuccessOutDto> updateBooking(id, bookingUpdateDto)

Update a booking profile

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.BookingApi;
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

        BookingApi apiInstance = new BookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        BookingUpdateDto bookingUpdateDto = new BookingUpdateDto(); // BookingUpdateDto | 
        try {
            CompletableFuture<BookingSuccessOutDto> result = apiInstance.updateBooking(id, bookingUpdateDto);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingApi#updateBooking");
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
| **bookingUpdateDto** | [**BookingUpdateDto**](BookingUpdateDto.md)|  | [optional] |

### Return type

CompletableFuture<[**BookingSuccessOutDto**](BookingSuccessOutDto.md)>


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

## updateBookingWithHttpInfo

> CompletableFuture<ApiResponse<BookingSuccessOutDto>> updateBooking updateBookingWithHttpInfo(id, bookingUpdateDto)

Update a booking profile

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.BookingApi;
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

        BookingApi apiInstance = new BookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        BookingUpdateDto bookingUpdateDto = new BookingUpdateDto(); // BookingUpdateDto | 
        try {
            CompletableFuture<ApiResponse<BookingSuccessOutDto>> response = apiInstance.updateBookingWithHttpInfo(id, bookingUpdateDto);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BookingApi#updateBooking");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingApi#updateBooking");
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
| **bookingUpdateDto** | [**BookingUpdateDto**](BookingUpdateDto.md)|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**BookingSuccessOutDto**](BookingSuccessOutDto.md)>>


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


## workHours

> CompletableFuture<WeekWorkSchedule> workHours()

Get user work hours

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.BookingApi;
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

        BookingApi apiInstance = new BookingApi(defaultClient);
        try {
            CompletableFuture<WeekWorkSchedule> result = apiInstance.workHours();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingApi#workHours");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<[**WeekWorkSchedule**](WeekWorkSchedule.md)>


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

## workHoursWithHttpInfo

> CompletableFuture<ApiResponse<WeekWorkSchedule>> workHours workHoursWithHttpInfo()

Get user work hours

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.BookingApi;
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

        BookingApi apiInstance = new BookingApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<WeekWorkSchedule>> response = apiInstance.workHoursWithHttpInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BookingApi#workHours");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingApi#workHours");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<ApiResponse<[**WeekWorkSchedule**](WeekWorkSchedule.md)>>


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


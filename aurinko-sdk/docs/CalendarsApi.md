# CalendarsApi

All URIs are relative to *https://api.aurinko.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**calendarById**](CalendarsApi.md#calendarById) | **GET** /v1/calendars/{id} | Get a calendar |
| [**calendarByIdWithHttpInfo**](CalendarsApi.md#calendarByIdWithHttpInfo) | **GET** /v1/calendars/{id} | Get a calendar |
| [**calendars**](CalendarsApi.md#calendars) | **GET** /v1/calendars | Request list of calendars |
| [**calendarsWithHttpInfo**](CalendarsApi.md#calendarsWithHttpInfo) | **GET** /v1/calendars | Request list of calendars |
| [**createCalendar**](CalendarsApi.md#createCalendar) | **POST** /v1/calendars | Create new calendar |
| [**createCalendarWithHttpInfo**](CalendarsApi.md#createCalendarWithHttpInfo) | **POST** /v1/calendars | Create new calendar |
| [**updateCalendar**](CalendarsApi.md#updateCalendar) | **PATCH** /v1/calendars/{id} | Update a calendar |
| [**updateCalendarWithHttpInfo**](CalendarsApi.md#updateCalendarWithHttpInfo) | **PATCH** /v1/calendars/{id} | Update a calendar |



## calendarById

> CompletableFuture<Calendar> calendarById(id)

Get a calendar

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.CalendarsApi;
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

        CalendarsApi apiInstance = new CalendarsApi(defaultClient);
        String id = "id_example"; // String | Calendar id
        try {
            CompletableFuture<Calendar> result = apiInstance.calendarById(id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalendarsApi#calendarById");
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
| **id** | **String**| Calendar id | |

### Return type

CompletableFuture<[**Calendar**](Calendar.md)>


### Authorization

[UserSessionHeader](../README.md#UserSessionHeader), [AuthTypeHeader](../README.md#AuthTypeHeader), [AppAuth](../README.md#AppAuth), [AccountToken](../README.md#AccountToken), [AccountIdHeader](../README.md#AccountIdHeader), [ClientIdHeader](../README.md#ClientIdHeader), [UserSessionCookie](../README.md#UserSessionCookie), [ExchangeIdToken](../README.md#ExchangeIdToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## calendarByIdWithHttpInfo

> CompletableFuture<ApiResponse<Calendar>> calendarById calendarByIdWithHttpInfo(id)

Get a calendar

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.CalendarsApi;
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

        CalendarsApi apiInstance = new CalendarsApi(defaultClient);
        String id = "id_example"; // String | Calendar id
        try {
            CompletableFuture<ApiResponse<Calendar>> response = apiInstance.calendarByIdWithHttpInfo(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CalendarsApi#calendarById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CalendarsApi#calendarById");
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
| **id** | **String**| Calendar id | |

### Return type

CompletableFuture<ApiResponse<[**Calendar**](Calendar.md)>>


### Authorization

[UserSessionHeader](../README.md#UserSessionHeader), [AuthTypeHeader](../README.md#AuthTypeHeader), [AppAuth](../README.md#AppAuth), [AccountToken](../README.md#AccountToken), [AccountIdHeader](../README.md#AccountIdHeader), [ClientIdHeader](../README.md#ClientIdHeader), [UserSessionCookie](../README.md#UserSessionCookie), [ExchangeIdToken](../README.md#ExchangeIdToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## calendars

> CompletableFuture<CalendarsPage> calendars(pageToken, withShared)

Request list of calendars

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.CalendarsApi;
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

        CalendarsApi apiInstance = new CalendarsApi(defaultClient);
        String pageToken = "pageToken_example"; // String | A token received as nextPageToken from a previous page request (for the first page it must be empty)
        Boolean withShared = true; // Boolean | 
        try {
            CompletableFuture<CalendarsPage> result = apiInstance.calendars(pageToken, withShared);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalendarsApi#calendars");
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
| **pageToken** | **String**| A token received as nextPageToken from a previous page request (for the first page it must be empty) | [optional] |
| **withShared** | **Boolean**|  | [optional] |

### Return type

CompletableFuture<[**CalendarsPage**](CalendarsPage.md)>


### Authorization

[UserSessionHeader](../README.md#UserSessionHeader), [AuthTypeHeader](../README.md#AuthTypeHeader), [AppAuth](../README.md#AppAuth), [AccountToken](../README.md#AccountToken), [AccountIdHeader](../README.md#AccountIdHeader), [ClientIdHeader](../README.md#ClientIdHeader), [UserSessionCookie](../README.md#UserSessionCookie), [ExchangeIdToken](../README.md#ExchangeIdToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## calendarsWithHttpInfo

> CompletableFuture<ApiResponse<CalendarsPage>> calendars calendarsWithHttpInfo(pageToken, withShared)

Request list of calendars

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.CalendarsApi;
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

        CalendarsApi apiInstance = new CalendarsApi(defaultClient);
        String pageToken = "pageToken_example"; // String | A token received as nextPageToken from a previous page request (for the first page it must be empty)
        Boolean withShared = true; // Boolean | 
        try {
            CompletableFuture<ApiResponse<CalendarsPage>> response = apiInstance.calendarsWithHttpInfo(pageToken, withShared);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CalendarsApi#calendars");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CalendarsApi#calendars");
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
| **pageToken** | **String**| A token received as nextPageToken from a previous page request (for the first page it must be empty) | [optional] |
| **withShared** | **Boolean**|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CalendarsPage**](CalendarsPage.md)>>


### Authorization

[UserSessionHeader](../README.md#UserSessionHeader), [AuthTypeHeader](../README.md#AuthTypeHeader), [AppAuth](../README.md#AppAuth), [AccountToken](../README.md#AccountToken), [AccountIdHeader](../README.md#AccountIdHeader), [ClientIdHeader](../README.md#ClientIdHeader), [UserSessionCookie](../README.md#UserSessionCookie), [ExchangeIdToken](../README.md#ExchangeIdToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## createCalendar

> CompletableFuture<Calendar> createCalendar(calendarCreate)

Create new calendar

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.CalendarsApi;
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

        CalendarsApi apiInstance = new CalendarsApi(defaultClient);
        CalendarCreate calendarCreate = new CalendarCreate(); // CalendarCreate | 
        try {
            CompletableFuture<Calendar> result = apiInstance.createCalendar(calendarCreate);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalendarsApi#createCalendar");
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
| **calendarCreate** | [**CalendarCreate**](CalendarCreate.md)|  | [optional] |

### Return type

CompletableFuture<[**Calendar**](Calendar.md)>


### Authorization

[UserSessionHeader](../README.md#UserSessionHeader), [AuthTypeHeader](../README.md#AuthTypeHeader), [AppAuth](../README.md#AppAuth), [AccountToken](../README.md#AccountToken), [AccountIdHeader](../README.md#AccountIdHeader), [ClientIdHeader](../README.md#ClientIdHeader), [UserSessionCookie](../README.md#UserSessionCookie), [ExchangeIdToken](../README.md#ExchangeIdToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## createCalendarWithHttpInfo

> CompletableFuture<ApiResponse<Calendar>> createCalendar createCalendarWithHttpInfo(calendarCreate)

Create new calendar

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.CalendarsApi;
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

        CalendarsApi apiInstance = new CalendarsApi(defaultClient);
        CalendarCreate calendarCreate = new CalendarCreate(); // CalendarCreate | 
        try {
            CompletableFuture<ApiResponse<Calendar>> response = apiInstance.createCalendarWithHttpInfo(calendarCreate);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CalendarsApi#createCalendar");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CalendarsApi#createCalendar");
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
| **calendarCreate** | [**CalendarCreate**](CalendarCreate.md)|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**Calendar**](Calendar.md)>>


### Authorization

[UserSessionHeader](../README.md#UserSessionHeader), [AuthTypeHeader](../README.md#AuthTypeHeader), [AppAuth](../README.md#AppAuth), [AccountToken](../README.md#AccountToken), [AccountIdHeader](../README.md#AccountIdHeader), [ClientIdHeader](../README.md#ClientIdHeader), [UserSessionCookie](../README.md#UserSessionCookie), [ExchangeIdToken](../README.md#ExchangeIdToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateCalendar

> CompletableFuture<Calendar> updateCalendar(id, calendarUpdate)

Update a calendar

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.CalendarsApi;
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

        CalendarsApi apiInstance = new CalendarsApi(defaultClient);
        String id = "id_example"; // String | Calendar id
        CalendarUpdate calendarUpdate = new CalendarUpdate(); // CalendarUpdate | 
        try {
            CompletableFuture<Calendar> result = apiInstance.updateCalendar(id, calendarUpdate);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalendarsApi#updateCalendar");
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
| **id** | **String**| Calendar id | |
| **calendarUpdate** | [**CalendarUpdate**](CalendarUpdate.md)|  | [optional] |

### Return type

CompletableFuture<[**Calendar**](Calendar.md)>


### Authorization

[UserSessionHeader](../README.md#UserSessionHeader), [AuthTypeHeader](../README.md#AuthTypeHeader), [AppAuth](../README.md#AppAuth), [AccountToken](../README.md#AccountToken), [AccountIdHeader](../README.md#AccountIdHeader), [ClientIdHeader](../README.md#ClientIdHeader), [UserSessionCookie](../README.md#UserSessionCookie), [ExchangeIdToken](../README.md#ExchangeIdToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## updateCalendarWithHttpInfo

> CompletableFuture<ApiResponse<Calendar>> updateCalendar updateCalendarWithHttpInfo(id, calendarUpdate)

Update a calendar

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.CalendarsApi;
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

        CalendarsApi apiInstance = new CalendarsApi(defaultClient);
        String id = "id_example"; // String | Calendar id
        CalendarUpdate calendarUpdate = new CalendarUpdate(); // CalendarUpdate | 
        try {
            CompletableFuture<ApiResponse<Calendar>> response = apiInstance.updateCalendarWithHttpInfo(id, calendarUpdate);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CalendarsApi#updateCalendar");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CalendarsApi#updateCalendar");
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
| **id** | **String**| Calendar id | |
| **calendarUpdate** | [**CalendarUpdate**](CalendarUpdate.md)|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**Calendar**](Calendar.md)>>


### Authorization

[UserSessionHeader](../README.md#UserSessionHeader), [AuthTypeHeader](../README.md#AuthTypeHeader), [AppAuth](../README.md#AppAuth), [AccountToken](../README.md#AccountToken), [AccountIdHeader](../README.md#AccountIdHeader), [ClientIdHeader](../README.md#ClientIdHeader), [UserSessionCookie](../README.md#UserSessionCookie), [ExchangeIdToken](../README.md#ExchangeIdToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


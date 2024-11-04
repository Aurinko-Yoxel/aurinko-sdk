# GroupBookingApi

All URIs are relative to *https://api.aurinko.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**attachAccountsGroupBooking**](GroupBookingApi.md#attachAccountsGroupBooking) | **POST** /v1/book/group/profiles/{id}/attachAccounts | Assign accounts to group booking |
| [**attachAccountsGroupBookingWithHttpInfo**](GroupBookingApi.md#attachAccountsGroupBookingWithHttpInfo) | **POST** /v1/book/group/profiles/{id}/attachAccounts | Assign accounts to group booking |
| [**attachGroupsBooking**](GroupBookingApi.md#attachGroupsBooking) | **POST** /v1/book/group/profiles/{id}/attachGroups | Assign groups to group booking |
| [**attachGroupsBookingWithHttpInfo**](GroupBookingApi.md#attachGroupsBookingWithHttpInfo) | **POST** /v1/book/group/profiles/{id}/attachGroups | Assign groups to group booking |
| [**attachedAccountsGroupBooking**](GroupBookingApi.md#attachedAccountsGroupBooking) | **GET** /v1/book/group/profiles/{id}/attachAccounts | List accounts of a group booking profile |
| [**attachedAccountsGroupBookingWithHttpInfo**](GroupBookingApi.md#attachedAccountsGroupBookingWithHttpInfo) | **GET** /v1/book/group/profiles/{id}/attachAccounts | List accounts of a group booking profile |
| [**attachedGroupsBooking**](GroupBookingApi.md#attachedGroupsBooking) | **GET** /v1/book/group/profiles/{id}/attachGroups | List groups of a group booking profile |
| [**attachedGroupsBookingWithHttpInfo**](GroupBookingApi.md#attachedGroupsBookingWithHttpInfo) | **GET** /v1/book/group/profiles/{id}/attachGroups | List groups of a group booking profile |
| [**bookingGroupAvailability**](GroupBookingApi.md#bookingGroupAvailability) | **POST** /v1/book/group/profiles/dynamic/availability | Get available bookings for а time range |
| [**bookingGroupAvailabilityWithHttpInfo**](GroupBookingApi.md#bookingGroupAvailabilityWithHttpInfo) | **POST** /v1/book/group/profiles/dynamic/availability | Get available bookings for а time range |
| [**bookingGroupCreateMeeting**](GroupBookingApi.md#bookingGroupCreateMeeting) | **POST** /v1/book/group/profiles/{id}/meeting | Create a meeting |
| [**bookingGroupCreateMeetingWithHttpInfo**](GroupBookingApi.md#bookingGroupCreateMeetingWithHttpInfo) | **POST** /v1/book/group/profiles/{id}/meeting | Create a meeting |
| [**bookingGroupMeetingTimes**](GroupBookingApi.md#bookingGroupMeetingTimes) | **GET** /v1/book/group/profiles/{id}/meeting | Get available meeting times |
| [**bookingGroupMeetingTimesWithHttpInfo**](GroupBookingApi.md#bookingGroupMeetingTimesWithHttpInfo) | **GET** /v1/book/group/profiles/{id}/meeting | Get available meeting times |
| [**bookingGroupReservationConfirm**](GroupBookingApi.md#bookingGroupReservationConfirm) | **POST** /v1/book/group/reservations/{id}/confirm | Convert an unconfirmed booking reservation to a calendar event |
| [**bookingGroupReservationConfirmWithHttpInfo**](GroupBookingApi.md#bookingGroupReservationConfirmWithHttpInfo) | **POST** /v1/book/group/reservations/{id}/confirm | Convert an unconfirmed booking reservation to a calendar event |
| [**bookingGroupReservationDelete**](GroupBookingApi.md#bookingGroupReservationDelete) | **DELETE** /v1/book/group/reservations/{id} | Cancel an unconfirmed booking reservation |
| [**bookingGroupReservationDeleteWithHttpInfo**](GroupBookingApi.md#bookingGroupReservationDeleteWithHttpInfo) | **DELETE** /v1/book/group/reservations/{id} | Cancel an unconfirmed booking reservation |
| [**createGroupBooking**](GroupBookingApi.md#createGroupBooking) | **POST** /v1/book/group/profiles | Create a group booking profile |
| [**createGroupBookingWithHttpInfo**](GroupBookingApi.md#createGroupBookingWithHttpInfo) | **POST** /v1/book/group/profiles | Create a group booking profile |
| [**deleteGroupBooking**](GroupBookingApi.md#deleteGroupBooking) | **DELETE** /v1/book/group/profiles/{id} | Delete a group booking profile by id |
| [**deleteGroupBookingWithHttpInfo**](GroupBookingApi.md#deleteGroupBookingWithHttpInfo) | **DELETE** /v1/book/group/profiles/{id} | Delete a group booking profile by id |
| [**detachAccountsGroupBooking**](GroupBookingApi.md#detachAccountsGroupBooking) | **POST** /v1/book/group/profiles/{id}/detachAccounts | Remove accounts from group booking |
| [**detachAccountsGroupBookingWithHttpInfo**](GroupBookingApi.md#detachAccountsGroupBookingWithHttpInfo) | **POST** /v1/book/group/profiles/{id}/detachAccounts | Remove accounts from group booking |
| [**detachGroupsBooking**](GroupBookingApi.md#detachGroupsBooking) | **POST** /v1/book/group/profiles/{id}/detachGroups | Remove groups from group booking |
| [**detachGroupsBookingWithHttpInfo**](GroupBookingApi.md#detachGroupsBookingWithHttpInfo) | **POST** /v1/book/group/profiles/{id}/detachGroups | Remove groups from group booking |
| [**getGroupBooking**](GroupBookingApi.md#getGroupBooking) | **GET** /v1/book/group/profiles/{id} | Get a group booking profile by id |
| [**getGroupBookingWithHttpInfo**](GroupBookingApi.md#getGroupBookingWithHttpInfo) | **GET** /v1/book/group/profiles/{id} | Get a group booking profile by id |
| [**getGroupBookings**](GroupBookingApi.md#getGroupBookings) | **GET** /v1/book/group/profiles | Get group booking profiles |
| [**getGroupBookingsWithHttpInfo**](GroupBookingApi.md#getGroupBookingsWithHttpInfo) | **GET** /v1/book/group/profiles | Get group booking profiles |
| [**updateGroupBooking**](GroupBookingApi.md#updateGroupBooking) | **PATCH** /v1/book/group/profiles/{id} | Update a group booking profile |
| [**updateGroupBookingWithHttpInfo**](GroupBookingApi.md#updateGroupBookingWithHttpInfo) | **PATCH** /v1/book/group/profiles/{id} | Update a group booking profile |



## attachAccountsGroupBooking

> CompletableFuture<BookingSuccessOutDto> attachAccountsGroupBooking(id, bookingAttachAccountsDto)

Assign accounts to group booking

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        BookingAttachAccountsDto bookingAttachAccountsDto = new BookingAttachAccountsDto(); // BookingAttachAccountsDto | 
        try {
            CompletableFuture<BookingSuccessOutDto> result = apiInstance.attachAccountsGroupBooking(id, bookingAttachAccountsDto);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#attachAccountsGroupBooking");
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
| **bookingAttachAccountsDto** | [**BookingAttachAccountsDto**](BookingAttachAccountsDto.md)|  | [optional] |

### Return type

CompletableFuture<[**BookingSuccessOutDto**](BookingSuccessOutDto.md)>


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

## attachAccountsGroupBookingWithHttpInfo

> CompletableFuture<ApiResponse<BookingSuccessOutDto>> attachAccountsGroupBooking attachAccountsGroupBookingWithHttpInfo(id, bookingAttachAccountsDto)

Assign accounts to group booking

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        BookingAttachAccountsDto bookingAttachAccountsDto = new BookingAttachAccountsDto(); // BookingAttachAccountsDto | 
        try {
            CompletableFuture<ApiResponse<BookingSuccessOutDto>> response = apiInstance.attachAccountsGroupBookingWithHttpInfo(id, bookingAttachAccountsDto);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling GroupBookingApi#attachAccountsGroupBooking");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#attachAccountsGroupBooking");
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
| **bookingAttachAccountsDto** | [**BookingAttachAccountsDto**](BookingAttachAccountsDto.md)|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**BookingSuccessOutDto**](BookingSuccessOutDto.md)>>


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


## attachGroupsBooking

> CompletableFuture<BookingSuccessOutDto> attachGroupsBooking(id, bookingAttachGroupsDto)

Assign groups to group booking

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        BookingAttachGroupsDto bookingAttachGroupsDto = new BookingAttachGroupsDto(); // BookingAttachGroupsDto | 
        try {
            CompletableFuture<BookingSuccessOutDto> result = apiInstance.attachGroupsBooking(id, bookingAttachGroupsDto);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#attachGroupsBooking");
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
| **bookingAttachGroupsDto** | [**BookingAttachGroupsDto**](BookingAttachGroupsDto.md)|  | [optional] |

### Return type

CompletableFuture<[**BookingSuccessOutDto**](BookingSuccessOutDto.md)>


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

## attachGroupsBookingWithHttpInfo

> CompletableFuture<ApiResponse<BookingSuccessOutDto>> attachGroupsBooking attachGroupsBookingWithHttpInfo(id, bookingAttachGroupsDto)

Assign groups to group booking

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        BookingAttachGroupsDto bookingAttachGroupsDto = new BookingAttachGroupsDto(); // BookingAttachGroupsDto | 
        try {
            CompletableFuture<ApiResponse<BookingSuccessOutDto>> response = apiInstance.attachGroupsBookingWithHttpInfo(id, bookingAttachGroupsDto);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling GroupBookingApi#attachGroupsBooking");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#attachGroupsBooking");
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
| **bookingAttachGroupsDto** | [**BookingAttachGroupsDto**](BookingAttachGroupsDto.md)|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**BookingSuccessOutDto**](BookingSuccessOutDto.md)>>


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


## attachedAccountsGroupBooking

> CompletableFuture<BookingAttachedAccountsPage> attachedAccountsGroupBooking(id, limit, offset)

List accounts of a group booking profile

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        Integer limit = 50; // Integer | page size
        Integer offset = 0; // Integer | return records offset by the given number
        try {
            CompletableFuture<BookingAttachedAccountsPage> result = apiInstance.attachedAccountsGroupBooking(id, limit, offset);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#attachedAccountsGroupBooking");
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
| **limit** | **Integer**| page size | [optional] [default to 50] |
| **offset** | **Integer**| return records offset by the given number | [optional] [default to 0] |

### Return type

CompletableFuture<[**BookingAttachedAccountsPage**](BookingAttachedAccountsPage.md)>


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

## attachedAccountsGroupBookingWithHttpInfo

> CompletableFuture<ApiResponse<BookingAttachedAccountsPage>> attachedAccountsGroupBooking attachedAccountsGroupBookingWithHttpInfo(id, limit, offset)

List accounts of a group booking profile

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        Integer limit = 50; // Integer | page size
        Integer offset = 0; // Integer | return records offset by the given number
        try {
            CompletableFuture<ApiResponse<BookingAttachedAccountsPage>> response = apiInstance.attachedAccountsGroupBookingWithHttpInfo(id, limit, offset);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling GroupBookingApi#attachedAccountsGroupBooking");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#attachedAccountsGroupBooking");
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
| **limit** | **Integer**| page size | [optional] [default to 50] |
| **offset** | **Integer**| return records offset by the given number | [optional] [default to 0] |

### Return type

CompletableFuture<ApiResponse<[**BookingAttachedAccountsPage**](BookingAttachedAccountsPage.md)>>


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


## attachedGroupsBooking

> CompletableFuture<BookingAttachedGroupsPage> attachedGroupsBooking(id, limit, offset)

List groups of a group booking profile

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        Integer limit = 50; // Integer | page size
        Integer offset = 0; // Integer | return records offset by the given number
        try {
            CompletableFuture<BookingAttachedGroupsPage> result = apiInstance.attachedGroupsBooking(id, limit, offset);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#attachedGroupsBooking");
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
| **limit** | **Integer**| page size | [optional] [default to 50] |
| **offset** | **Integer**| return records offset by the given number | [optional] [default to 0] |

### Return type

CompletableFuture<[**BookingAttachedGroupsPage**](BookingAttachedGroupsPage.md)>


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

## attachedGroupsBookingWithHttpInfo

> CompletableFuture<ApiResponse<BookingAttachedGroupsPage>> attachedGroupsBooking attachedGroupsBookingWithHttpInfo(id, limit, offset)

List groups of a group booking profile

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        Integer limit = 50; // Integer | page size
        Integer offset = 0; // Integer | return records offset by the given number
        try {
            CompletableFuture<ApiResponse<BookingAttachedGroupsPage>> response = apiInstance.attachedGroupsBookingWithHttpInfo(id, limit, offset);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling GroupBookingApi#attachedGroupsBooking");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#attachedGroupsBooking");
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
| **limit** | **Integer**| page size | [optional] [default to 50] |
| **offset** | **Integer**| return records offset by the given number | [optional] [default to 0] |

### Return type

CompletableFuture<ApiResponse<[**BookingAttachedGroupsPage**](BookingAttachedGroupsPage.md)>>


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
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        BookingAvailableProfilesInDto bookingAvailableProfilesInDto = new BookingAvailableProfilesInDto(); // BookingAvailableProfilesInDto | 
        try {
            CompletableFuture<BookingAvailableProfilesOutDto> result = apiInstance.bookingGroupAvailability(bookingAvailableProfilesInDto);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#bookingGroupAvailability");
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
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        BookingAvailableProfilesInDto bookingAvailableProfilesInDto = new BookingAvailableProfilesInDto(); // BookingAvailableProfilesInDto | 
        try {
            CompletableFuture<ApiResponse<BookingAvailableProfilesOutDto>> response = apiInstance.bookingGroupAvailabilityWithHttpInfo(bookingAvailableProfilesInDto);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling GroupBookingApi#bookingGroupAvailability");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#bookingGroupAvailability");
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
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        BookingRequiredMode required = BookingRequiredMode.fromValue("one"); // BookingRequiredMode | a way to select times
        Long reserveForMinutes = 56L; // Long | Time in minutes, blocks the interval for a time (creates an unconfirmed reservation), the meeting is not created
        CreateMeetingDto createMeetingDto = new CreateMeetingDto(); // CreateMeetingDto | 
        try {
            CompletableFuture<CreateMeetingResponse> result = apiInstance.bookingGroupCreateMeeting(id, required, reserveForMinutes, createMeetingDto);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#bookingGroupCreateMeeting");
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
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
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
            System.err.println("Exception when calling GroupBookingApi#bookingGroupCreateMeeting");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#bookingGroupCreateMeeting");
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
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
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
            System.err.println("Exception when calling GroupBookingApi#bookingGroupMeetingTimes");
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
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
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
            System.err.println("Exception when calling GroupBookingApi#bookingGroupMeetingTimes");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#bookingGroupMeetingTimes");
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


## bookingGroupReservationConfirm

> CompletableFuture<ConfirmReservationOutDto> bookingGroupReservationConfirm(id)

Convert an unconfirmed booking reservation to a calendar event

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | An unconfirmed reservation id
        try {
            CompletableFuture<ConfirmReservationOutDto> result = apiInstance.bookingGroupReservationConfirm(id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#bookingGroupReservationConfirm");
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
| **id** | **Long**| An unconfirmed reservation id | |

### Return type

CompletableFuture<[**ConfirmReservationOutDto**](ConfirmReservationOutDto.md)>


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

## bookingGroupReservationConfirmWithHttpInfo

> CompletableFuture<ApiResponse<ConfirmReservationOutDto>> bookingGroupReservationConfirm bookingGroupReservationConfirmWithHttpInfo(id)

Convert an unconfirmed booking reservation to a calendar event

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | An unconfirmed reservation id
        try {
            CompletableFuture<ApiResponse<ConfirmReservationOutDto>> response = apiInstance.bookingGroupReservationConfirmWithHttpInfo(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling GroupBookingApi#bookingGroupReservationConfirm");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#bookingGroupReservationConfirm");
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
| **id** | **Long**| An unconfirmed reservation id | |

### Return type

CompletableFuture<ApiResponse<[**ConfirmReservationOutDto**](ConfirmReservationOutDto.md)>>


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


## bookingGroupReservationDelete

> CompletableFuture<ConfirmSlotDeleteOutDto> bookingGroupReservationDelete(id)

Cancel an unconfirmed booking reservation

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | An unconfirmed reservation id
        try {
            CompletableFuture<ConfirmSlotDeleteOutDto> result = apiInstance.bookingGroupReservationDelete(id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#bookingGroupReservationDelete");
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
| **id** | **Long**| An unconfirmed reservation id | |

### Return type

CompletableFuture<[**ConfirmSlotDeleteOutDto**](ConfirmSlotDeleteOutDto.md)>


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

## bookingGroupReservationDeleteWithHttpInfo

> CompletableFuture<ApiResponse<ConfirmSlotDeleteOutDto>> bookingGroupReservationDelete bookingGroupReservationDeleteWithHttpInfo(id)

Cancel an unconfirmed booking reservation

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | An unconfirmed reservation id
        try {
            CompletableFuture<ApiResponse<ConfirmSlotDeleteOutDto>> response = apiInstance.bookingGroupReservationDeleteWithHttpInfo(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling GroupBookingApi#bookingGroupReservationDelete");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#bookingGroupReservationDelete");
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
| **id** | **Long**| An unconfirmed reservation id | |

### Return type

CompletableFuture<ApiResponse<[**ConfirmSlotDeleteOutDto**](ConfirmSlotDeleteOutDto.md)>>


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


## createGroupBooking

> CompletableFuture<GroupBookingOutDto> createGroupBooking(groupBookingInDto)

Create a group booking profile

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        GroupBookingInDto groupBookingInDto = new GroupBookingInDto(); // GroupBookingInDto | 
        try {
            CompletableFuture<GroupBookingOutDto> result = apiInstance.createGroupBooking(groupBookingInDto);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#createGroupBooking");
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
| **groupBookingInDto** | [**GroupBookingInDto**](GroupBookingInDto.md)|  | [optional] |

### Return type

CompletableFuture<[**GroupBookingOutDto**](GroupBookingOutDto.md)>


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

## createGroupBookingWithHttpInfo

> CompletableFuture<ApiResponse<GroupBookingOutDto>> createGroupBooking createGroupBookingWithHttpInfo(groupBookingInDto)

Create a group booking profile

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        GroupBookingInDto groupBookingInDto = new GroupBookingInDto(); // GroupBookingInDto | 
        try {
            CompletableFuture<ApiResponse<GroupBookingOutDto>> response = apiInstance.createGroupBookingWithHttpInfo(groupBookingInDto);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling GroupBookingApi#createGroupBooking");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#createGroupBooking");
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
| **groupBookingInDto** | [**GroupBookingInDto**](GroupBookingInDto.md)|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**GroupBookingOutDto**](GroupBookingOutDto.md)>>


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


## deleteGroupBooking

> CompletableFuture<BookingSuccessOutDto> deleteGroupBooking(id)

Delete a group booking profile by id

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        try {
            CompletableFuture<BookingSuccessOutDto> result = apiInstance.deleteGroupBooking(id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#deleteGroupBooking");
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

[AppAuth](../README.md#AppAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |

## deleteGroupBookingWithHttpInfo

> CompletableFuture<ApiResponse<BookingSuccessOutDto>> deleteGroupBooking deleteGroupBookingWithHttpInfo(id)

Delete a group booking profile by id

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        try {
            CompletableFuture<ApiResponse<BookingSuccessOutDto>> response = apiInstance.deleteGroupBookingWithHttpInfo(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling GroupBookingApi#deleteGroupBooking");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#deleteGroupBooking");
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

[AppAuth](../README.md#AppAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |


## detachAccountsGroupBooking

> CompletableFuture<BookingSuccessOutDto> detachAccountsGroupBooking(id, bookingDetachGroupAccountsDto)

Remove accounts from group booking

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        BookingDetachGroupAccountsDto bookingDetachGroupAccountsDto = new BookingDetachGroupAccountsDto(); // BookingDetachGroupAccountsDto | 
        try {
            CompletableFuture<BookingSuccessOutDto> result = apiInstance.detachAccountsGroupBooking(id, bookingDetachGroupAccountsDto);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#detachAccountsGroupBooking");
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
| **bookingDetachGroupAccountsDto** | [**BookingDetachGroupAccountsDto**](BookingDetachGroupAccountsDto.md)|  | [optional] |

### Return type

CompletableFuture<[**BookingSuccessOutDto**](BookingSuccessOutDto.md)>


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

## detachAccountsGroupBookingWithHttpInfo

> CompletableFuture<ApiResponse<BookingSuccessOutDto>> detachAccountsGroupBooking detachAccountsGroupBookingWithHttpInfo(id, bookingDetachGroupAccountsDto)

Remove accounts from group booking

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        BookingDetachGroupAccountsDto bookingDetachGroupAccountsDto = new BookingDetachGroupAccountsDto(); // BookingDetachGroupAccountsDto | 
        try {
            CompletableFuture<ApiResponse<BookingSuccessOutDto>> response = apiInstance.detachAccountsGroupBookingWithHttpInfo(id, bookingDetachGroupAccountsDto);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling GroupBookingApi#detachAccountsGroupBooking");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#detachAccountsGroupBooking");
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
| **bookingDetachGroupAccountsDto** | [**BookingDetachGroupAccountsDto**](BookingDetachGroupAccountsDto.md)|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**BookingSuccessOutDto**](BookingSuccessOutDto.md)>>


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


## detachGroupsBooking

> CompletableFuture<BookingSuccessOutDto> detachGroupsBooking(id, bookingDetachGroupsDto)

Remove groups from group booking

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        BookingDetachGroupsDto bookingDetachGroupsDto = new BookingDetachGroupsDto(); // BookingDetachGroupsDto | 
        try {
            CompletableFuture<BookingSuccessOutDto> result = apiInstance.detachGroupsBooking(id, bookingDetachGroupsDto);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#detachGroupsBooking");
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
| **bookingDetachGroupsDto** | [**BookingDetachGroupsDto**](BookingDetachGroupsDto.md)|  | [optional] |

### Return type

CompletableFuture<[**BookingSuccessOutDto**](BookingSuccessOutDto.md)>


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

## detachGroupsBookingWithHttpInfo

> CompletableFuture<ApiResponse<BookingSuccessOutDto>> detachGroupsBooking detachGroupsBookingWithHttpInfo(id, bookingDetachGroupsDto)

Remove groups from group booking

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        BookingDetachGroupsDto bookingDetachGroupsDto = new BookingDetachGroupsDto(); // BookingDetachGroupsDto | 
        try {
            CompletableFuture<ApiResponse<BookingSuccessOutDto>> response = apiInstance.detachGroupsBookingWithHttpInfo(id, bookingDetachGroupsDto);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling GroupBookingApi#detachGroupsBooking");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#detachGroupsBooking");
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
| **bookingDetachGroupsDto** | [**BookingDetachGroupsDto**](BookingDetachGroupsDto.md)|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**BookingSuccessOutDto**](BookingSuccessOutDto.md)>>


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


## getGroupBooking

> CompletableFuture<GroupBookingOutDto> getGroupBooking(id)

Get a group booking profile by id

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        try {
            CompletableFuture<GroupBookingOutDto> result = apiInstance.getGroupBooking(id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#getGroupBooking");
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

CompletableFuture<[**GroupBookingOutDto**](GroupBookingOutDto.md)>


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

## getGroupBookingWithHttpInfo

> CompletableFuture<ApiResponse<GroupBookingOutDto>> getGroupBooking getGroupBookingWithHttpInfo(id)

Get a group booking profile by id

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        try {
            CompletableFuture<ApiResponse<GroupBookingOutDto>> response = apiInstance.getGroupBookingWithHttpInfo(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling GroupBookingApi#getGroupBooking");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#getGroupBooking");
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

CompletableFuture<ApiResponse<[**GroupBookingOutDto**](GroupBookingOutDto.md)>>


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


## getGroupBookings

> CompletableFuture<GroupBookingPage> getGroupBookings(limit, offset)

Get group booking profiles

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Integer limit = 50; // Integer | page size
        Integer offset = 0; // Integer | return records offset by the given number
        try {
            CompletableFuture<GroupBookingPage> result = apiInstance.getGroupBookings(limit, offset);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#getGroupBookings");
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
| **limit** | **Integer**| page size | [optional] [default to 50] |
| **offset** | **Integer**| return records offset by the given number | [optional] [default to 0] |

### Return type

CompletableFuture<[**GroupBookingPage**](GroupBookingPage.md)>


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

## getGroupBookingsWithHttpInfo

> CompletableFuture<ApiResponse<GroupBookingPage>> getGroupBookings getGroupBookingsWithHttpInfo(limit, offset)

Get group booking profiles

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Integer limit = 50; // Integer | page size
        Integer offset = 0; // Integer | return records offset by the given number
        try {
            CompletableFuture<ApiResponse<GroupBookingPage>> response = apiInstance.getGroupBookingsWithHttpInfo(limit, offset);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling GroupBookingApi#getGroupBookings");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#getGroupBookings");
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
| **limit** | **Integer**| page size | [optional] [default to 50] |
| **offset** | **Integer**| return records offset by the given number | [optional] [default to 0] |

### Return type

CompletableFuture<ApiResponse<[**GroupBookingPage**](GroupBookingPage.md)>>


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


## updateGroupBooking

> CompletableFuture<BookingSuccessOutDto> updateGroupBooking(id, groupBookingUpdateDto)

Update a group booking profile

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        GroupBookingUpdateDto groupBookingUpdateDto = new GroupBookingUpdateDto(); // GroupBookingUpdateDto | 
        try {
            CompletableFuture<BookingSuccessOutDto> result = apiInstance.updateGroupBooking(id, groupBookingUpdateDto);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#updateGroupBooking");
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
| **groupBookingUpdateDto** | [**GroupBookingUpdateDto**](GroupBookingUpdateDto.md)|  | [optional] |

### Return type

CompletableFuture<[**BookingSuccessOutDto**](BookingSuccessOutDto.md)>


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

## updateGroupBookingWithHttpInfo

> CompletableFuture<ApiResponse<BookingSuccessOutDto>> updateGroupBooking updateGroupBookingWithHttpInfo(id, groupBookingUpdateDto)

Update a group booking profile

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.GroupBookingApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        GroupBookingApi apiInstance = new GroupBookingApi(defaultClient);
        Long id = 56L; // Long | A booking id
        GroupBookingUpdateDto groupBookingUpdateDto = new GroupBookingUpdateDto(); // GroupBookingUpdateDto | 
        try {
            CompletableFuture<ApiResponse<BookingSuccessOutDto>> response = apiInstance.updateGroupBookingWithHttpInfo(id, groupBookingUpdateDto);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling GroupBookingApi#updateGroupBooking");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupBookingApi#updateGroupBooking");
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
| **groupBookingUpdateDto** | [**GroupBookingUpdateDto**](GroupBookingUpdateDto.md)|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**BookingSuccessOutDto**](BookingSuccessOutDto.md)>>


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


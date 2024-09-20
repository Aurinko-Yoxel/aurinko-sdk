# AvailabilityApi

All URIs are relative to *https://api.aurinko.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMeeting**](AvailabilityApi.md#createMeeting) | **POST** /v1/book/{aurinkoClientId}/{name}/meeting | Create a meeting |
| [**createMeetingWithHttpInfo**](AvailabilityApi.md#createMeetingWithHttpInfo) | **POST** /v1/book/{aurinkoClientId}/{name}/meeting | Create a meeting |
| [**getAvailableBookings**](AvailabilityApi.md#getAvailableBookings) | **POST** /v1/book/{aurinkoClientId}/dynamic/availability | Get available bookings for а time range |
| [**getAvailableBookingsWithHttpInfo**](AvailabilityApi.md#getAvailableBookingsWithHttpInfo) | **POST** /v1/book/{aurinkoClientId}/dynamic/availability | Get available bookings for а time range |
| [**getMeetingTimes**](AvailabilityApi.md#getMeetingTimes) | **GET** /v1/book/{aurinkoClientId}/{name}/meeting | Get available meeting times |
| [**getMeetingTimesWithHttpInfo**](AvailabilityApi.md#getMeetingTimesWithHttpInfo) | **GET** /v1/book/{aurinkoClientId}/{name}/meeting | Get available meeting times |



## createMeeting

> CompletableFuture<CreateMeetingResponse> createMeeting(aurinkoClientId, name, required, createMeetingDto)

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
        CreateMeetingDto createMeetingDto = new CreateMeetingDto(); // CreateMeetingDto | 
        try {
            CompletableFuture<CreateMeetingResponse> result = apiInstance.createMeeting(aurinkoClientId, name, required, createMeetingDto);
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
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |

## createMeetingWithHttpInfo

> CompletableFuture<ApiResponse<CreateMeetingResponse>> createMeeting createMeetingWithHttpInfo(aurinkoClientId, name, required, createMeetingDto)

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
        CreateMeetingDto createMeetingDto = new CreateMeetingDto(); // CreateMeetingDto | 
        try {
            CompletableFuture<ApiResponse<CreateMeetingResponse>> response = apiInstance.createMeetingWithHttpInfo(aurinkoClientId, name, required, createMeetingDto);
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
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |


## getAvailableBookings

> CompletableFuture<BookingAvailableProfilesOutDto> getAvailableBookings(aurinkoClientId, bookingAvailableProfilesInDto)

Get available bookings for а time range

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
        BookingAvailableProfilesInDto bookingAvailableProfilesInDto = new BookingAvailableProfilesInDto(); // BookingAvailableProfilesInDto | 
        try {
            CompletableFuture<BookingAvailableProfilesOutDto> result = apiInstance.getAvailableBookings(aurinkoClientId, bookingAvailableProfilesInDto);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling AvailabilityApi#getAvailableBookings");
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
| **bookingAvailableProfilesInDto** | [**BookingAvailableProfilesInDto**](BookingAvailableProfilesInDto.md)|  | [optional] |

### Return type

CompletableFuture<[**BookingAvailableProfilesOutDto**](BookingAvailableProfilesOutDto.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAvailableBookingsWithHttpInfo

> CompletableFuture<ApiResponse<BookingAvailableProfilesOutDto>> getAvailableBookings getAvailableBookingsWithHttpInfo(aurinkoClientId, bookingAvailableProfilesInDto)

Get available bookings for а time range

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
        BookingAvailableProfilesInDto bookingAvailableProfilesInDto = new BookingAvailableProfilesInDto(); // BookingAvailableProfilesInDto | 
        try {
            CompletableFuture<ApiResponse<BookingAvailableProfilesOutDto>> response = apiInstance.getAvailableBookingsWithHttpInfo(aurinkoClientId, bookingAvailableProfilesInDto);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AvailabilityApi#getAvailableBookings");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AvailabilityApi#getAvailableBookings");
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
| **bookingAvailableProfilesInDto** | [**BookingAvailableProfilesInDto**](BookingAvailableProfilesInDto.md)|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**BookingAvailableProfilesOutDto**](BookingAvailableProfilesOutDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getMeetingTimes

> CompletableFuture<BookingTimesOutDto> getMeetingTimes(aurinkoClientId, name, required, limit, offset)

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
        Integer limit = 10; // Integer | page size
        Integer offset = 0; // Integer | return records offset by the given number
        try {
            CompletableFuture<BookingTimesOutDto> result = apiInstance.getMeetingTimes(aurinkoClientId, name, required, limit, offset);
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
| **limit** | **Integer**| page size | [optional] [default to 10] |
| **offset** | **Integer**| return records offset by the given number | [optional] [default to 0] |

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

> CompletableFuture<ApiResponse<BookingTimesOutDto>> getMeetingTimes getMeetingTimesWithHttpInfo(aurinkoClientId, name, required, limit, offset)

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
        Integer limit = 10; // Integer | page size
        Integer offset = 0; // Integer | return records offset by the given number
        try {
            CompletableFuture<ApiResponse<BookingTimesOutDto>> response = apiInstance.getMeetingTimesWithHttpInfo(aurinkoClientId, name, required, limit, offset);
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
| **limit** | **Integer**| page size | [optional] [default to 10] |
| **offset** | **Integer**| return records offset by the given number | [optional] [default to 0] |

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


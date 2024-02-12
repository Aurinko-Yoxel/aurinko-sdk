# ServicesApi

All URIs are relative to *https://api.aurinko.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSvcAccounts**](ServicesApi.md#getSvcAccounts) | **GET** /v1/am/svc_accounts | Get service accounts |
| [**getSvcAccountsWithHttpInfo**](ServicesApi.md#getSvcAccountsWithHttpInfo) | **GET** /v1/am/svc_accounts | Get service accounts |
| [**upsertServiceAccount**](ServicesApi.md#upsertServiceAccount) | **POST** /v1/am/svc_accounts | Upsert a service account |
| [**upsertServiceAccountWithHttpInfo**](ServicesApi.md#upsertServiceAccountWithHttpInfo) | **POST** /v1/am/svc_accounts | Upsert a service account |



## getSvcAccounts

> CompletableFuture<AccountsPage> getSvcAccounts(limit, offset, clientOrgId, authOrgId, serviceType, subscriptionId)

Get service accounts

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.ServicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        ServicesApi apiInstance = new ServicesApi(defaultClient);
        Integer limit = 50; // Integer | page size
        Integer offset = 0; // Integer | return records offset by the given number
        String clientOrgId = "clientOrgId_example"; // String | A client OrgId
        String authOrgId = "authOrgId_example"; // String | An authenticated OrgId
        ServiceTypeDaemon serviceType = ServiceTypeDaemon.fromValue("Google"); // ServiceTypeDaemon | 
        Long subscriptionId = 56L; // Long | 
        try {
            CompletableFuture<AccountsPage> result = apiInstance.getSvcAccounts(limit, offset, clientOrgId, authOrgId, serviceType, subscriptionId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServicesApi#getSvcAccounts");
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
| **clientOrgId** | **String**| A client OrgId | [optional] |
| **authOrgId** | **String**| An authenticated OrgId | [optional] |
| **serviceType** | [**ServiceTypeDaemon**](.md)|  | [optional] [enum: Google, GoogleBot, Office365, EWS, MsTeamsBot, Slack, SlackBot, ZoomBot, MCTrade, Zoho] |
| **subscriptionId** | **Long**|  | [optional] |

### Return type

CompletableFuture<[**AccountsPage**](AccountsPage.md)>


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

## getSvcAccountsWithHttpInfo

> CompletableFuture<ApiResponse<AccountsPage>> getSvcAccounts getSvcAccountsWithHttpInfo(limit, offset, clientOrgId, authOrgId, serviceType, subscriptionId)

Get service accounts

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.ServicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        ServicesApi apiInstance = new ServicesApi(defaultClient);
        Integer limit = 50; // Integer | page size
        Integer offset = 0; // Integer | return records offset by the given number
        String clientOrgId = "clientOrgId_example"; // String | A client OrgId
        String authOrgId = "authOrgId_example"; // String | An authenticated OrgId
        ServiceTypeDaemon serviceType = ServiceTypeDaemon.fromValue("Google"); // ServiceTypeDaemon | 
        Long subscriptionId = 56L; // Long | 
        try {
            CompletableFuture<ApiResponse<AccountsPage>> response = apiInstance.getSvcAccountsWithHttpInfo(limit, offset, clientOrgId, authOrgId, serviceType, subscriptionId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ServicesApi#getSvcAccounts");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ServicesApi#getSvcAccounts");
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
| **clientOrgId** | **String**| A client OrgId | [optional] |
| **authOrgId** | **String**| An authenticated OrgId | [optional] |
| **serviceType** | [**ServiceTypeDaemon**](.md)|  | [optional] [enum: Google, GoogleBot, Office365, EWS, MsTeamsBot, Slack, SlackBot, ZoomBot, MCTrade, Zoho] |
| **subscriptionId** | **Long**|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**AccountsPage**](AccountsPage.md)>>


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


## upsertServiceAccount

> CompletableFuture<AccountSaveResult> upsertServiceAccount(recycleKeys, apiAccountInDto)

Upsert a service account

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.ServicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        ServicesApi apiInstance = new ServicesApi(defaultClient);
        List<ServiceKey> recycleKeys = Arrays.asList(); // List<ServiceKey> | Recycle Keys
        ApiAccountInDto apiAccountInDto = new ApiAccountInDto(); // ApiAccountInDto | 
        try {
            CompletableFuture<AccountSaveResult> result = apiInstance.upsertServiceAccount(recycleKeys, apiAccountInDto);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServicesApi#upsertServiceAccount");
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
| **recycleKeys** | [**List&lt;ServiceKey&gt;**](ServiceKey.md)| Recycle Keys | [optional] |
| **apiAccountInDto** | [**ApiAccountInDto**](ApiAccountInDto.md)|  | [optional] |

### Return type

CompletableFuture<[**AccountSaveResult**](AccountSaveResult.md)>


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

## upsertServiceAccountWithHttpInfo

> CompletableFuture<ApiResponse<AccountSaveResult>> upsertServiceAccount upsertServiceAccountWithHttpInfo(recycleKeys, apiAccountInDto)

Upsert a service account

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.ServicesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        ServicesApi apiInstance = new ServicesApi(defaultClient);
        List<ServiceKey> recycleKeys = Arrays.asList(); // List<ServiceKey> | Recycle Keys
        ApiAccountInDto apiAccountInDto = new ApiAccountInDto(); // ApiAccountInDto | 
        try {
            CompletableFuture<ApiResponse<AccountSaveResult>> response = apiInstance.upsertServiceAccountWithHttpInfo(recycleKeys, apiAccountInDto);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ServicesApi#upsertServiceAccount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ServicesApi#upsertServiceAccount");
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
| **recycleKeys** | [**List&lt;ServiceKey&gt;**](ServiceKey.md)| Recycle Keys | [optional] |
| **apiAccountInDto** | [**ApiAccountInDto**](ApiAccountInDto.md)|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**AccountSaveResult**](AccountSaveResult.md)>>


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


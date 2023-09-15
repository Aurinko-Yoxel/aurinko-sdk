# AccountsApi

All URIs are relative to *https://api.aurinko.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**amAccountDelete**](AccountsApi.md#amAccountDelete) | **DELETE** /v1/am/accounts/{id} | Delete account by ID |
| [**amAccountDeleteWithHttpInfo**](AccountsApi.md#amAccountDeleteWithHttpInfo) | **DELETE** /v1/am/accounts/{id} | Delete account by ID |
| [**getAccounts**](AccountsApi.md#getAccounts) | **GET** /v1/am/accounts | Get accounts |
| [**getAccountsWithHttpInfo**](AccountsApi.md#getAccountsWithHttpInfo) | **GET** /v1/am/accounts | Get accounts |
| [**upsertPersonal**](AccountsApi.md#upsertPersonal) | **POST** /v1/am/accounts | Upsert an account |
| [**upsertPersonalWithHttpInfo**](AccountsApi.md#upsertPersonalWithHttpInfo) | **POST** /v1/am/accounts | Upsert an account |



## amAccountDelete

> CompletableFuture<Void> amAccountDelete(id)

Delete account by ID

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        AccountsApi apiInstance = new AccountsApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            CompletableFuture<Void> result = apiInstance.amAccountDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#amAccountDelete");
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
| **id** | **Long**|  | |

### Return type


CompletableFuture<void> (empty response body)

### Authorization

[AppAuth](../README.md#AppAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |

## amAccountDeleteWithHttpInfo

> CompletableFuture<ApiResponse<Void>> amAccountDelete amAccountDeleteWithHttpInfo(id)

Delete account by ID

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        AccountsApi apiInstance = new AccountsApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.amAccountDeleteWithHttpInfo(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AccountsApi#amAccountDelete");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#amAccountDelete");
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
| **id** | **Long**|  | |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

[AppAuth](../README.md#AppAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Authentication information is missing or invalid |  * WWW_Authenticate -  <br>  |


## getAccounts

> CompletableFuture<AccountsPage> getAccounts(limit, offset, authOrgId, serviceType, subscriptionId)

Get accounts

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        AccountsApi apiInstance = new AccountsApi(defaultClient);
        Integer limit = 50; // Integer | page size
        Integer offset = 0; // Integer | return records offset by the given number
        String authOrgId = "authOrgId_example"; // String | An authenticated OrgId
        ServiceTypeNonDaemon serviceType = ServiceTypeNonDaemon.fromValue("Google"); // ServiceTypeNonDaemon | 
        Long subscriptionId = 56L; // Long | 
        try {
            CompletableFuture<AccountsPage> result = apiInstance.getAccounts(limit, offset, authOrgId, serviceType, subscriptionId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#getAccounts");
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
| **authOrgId** | **String**| An authenticated OrgId | [optional] |
| **serviceType** | [**ServiceTypeNonDaemon**](.md)|  | [optional] [enum: Google, Office365, EWS, EWS365, IMAP, Salesforce, Salesflare, Repfabric, Slack, SugarCRM, HighLevel, Hubspot, Zoom, Webex, WebexBot, Pipedrive, EclipseERP, AutoQuotes, Teamwork, NetSuite, DDS, Zoho, Clientify, QuickBooks] |
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

## getAccountsWithHttpInfo

> CompletableFuture<ApiResponse<AccountsPage>> getAccounts getAccountsWithHttpInfo(limit, offset, authOrgId, serviceType, subscriptionId)

Get accounts

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        AccountsApi apiInstance = new AccountsApi(defaultClient);
        Integer limit = 50; // Integer | page size
        Integer offset = 0; // Integer | return records offset by the given number
        String authOrgId = "authOrgId_example"; // String | An authenticated OrgId
        ServiceTypeNonDaemon serviceType = ServiceTypeNonDaemon.fromValue("Google"); // ServiceTypeNonDaemon | 
        Long subscriptionId = 56L; // Long | 
        try {
            CompletableFuture<ApiResponse<AccountsPage>> response = apiInstance.getAccountsWithHttpInfo(limit, offset, authOrgId, serviceType, subscriptionId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AccountsApi#getAccounts");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#getAccounts");
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
| **authOrgId** | **String**| An authenticated OrgId | [optional] |
| **serviceType** | [**ServiceTypeNonDaemon**](.md)|  | [optional] [enum: Google, Office365, EWS, EWS365, IMAP, Salesforce, Salesflare, Repfabric, Slack, SugarCRM, HighLevel, Hubspot, Zoom, Webex, WebexBot, Pipedrive, EclipseERP, AutoQuotes, Teamwork, NetSuite, DDS, Zoho, Clientify, QuickBooks] |
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


## upsertPersonal

> CompletableFuture<AccountSaveResult> upsertPersonal(userAccount, userId, recycleKeys, apiAccountInDto)

Upsert an account

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        AccountsApi apiInstance = new AccountsApi(defaultClient);
        UserAccountType userAccount = UserAccountType.fromValue("primary"); // UserAccountType | 
        String userId = "userId_example"; // String | ID of a user this account should be attached to.
        List<ServiceKey> recycleKeys = Arrays.asList(); // List<ServiceKey> | 
        ApiAccountInDto apiAccountInDto = new ApiAccountInDto(); // ApiAccountInDto | 
        try {
            CompletableFuture<AccountSaveResult> result = apiInstance.upsertPersonal(userAccount, userId, recycleKeys, apiAccountInDto);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#upsertPersonal");
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
| **userAccount** | [**UserAccountType**](.md)|  | [optional] [enum: primary, secondary] |
| **userId** | **String**| ID of a user this account should be attached to. | [optional] |
| **recycleKeys** | [**List&lt;ServiceKey&gt;**](ServiceKey.md)|  | [optional] |
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

## upsertPersonalWithHttpInfo

> CompletableFuture<ApiResponse<AccountSaveResult>> upsertPersonal upsertPersonalWithHttpInfo(userAccount, userId, recycleKeys, apiAccountInDto)

Upsert an account

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        AccountsApi apiInstance = new AccountsApi(defaultClient);
        UserAccountType userAccount = UserAccountType.fromValue("primary"); // UserAccountType | 
        String userId = "userId_example"; // String | ID of a user this account should be attached to.
        List<ServiceKey> recycleKeys = Arrays.asList(); // List<ServiceKey> | 
        ApiAccountInDto apiAccountInDto = new ApiAccountInDto(); // ApiAccountInDto | 
        try {
            CompletableFuture<ApiResponse<AccountSaveResult>> response = apiInstance.upsertPersonalWithHttpInfo(userAccount, userId, recycleKeys, apiAccountInDto);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AccountsApi#upsertPersonal");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#upsertPersonal");
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
| **userAccount** | [**UserAccountType**](.md)|  | [optional] [enum: primary, secondary] |
| **userId** | **String**| ID of a user this account should be attached to. | [optional] |
| **recycleKeys** | [**List&lt;ServiceKey&gt;**](ServiceKey.md)|  | [optional] |
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

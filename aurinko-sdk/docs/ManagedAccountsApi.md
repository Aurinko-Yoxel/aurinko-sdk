# ManagedAccountsApi

All URIs are relative to *https://api.aurinko.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**upsertManagedAccount**](ManagedAccountsApi.md#upsertManagedAccount) | **POST** /v1/am/svc_accounts/{accId}/accounts | Upsert a managed account |
| [**upsertManagedAccountWithHttpInfo**](ManagedAccountsApi.md#upsertManagedAccountWithHttpInfo) | **POST** /v1/am/svc_accounts/{accId}/accounts | Upsert a managed account |



## upsertManagedAccount

> CompletableFuture<AccountSaveResult> upsertManagedAccount(accId, userAccount, userId, recycleKeys, ensureAccess, apiAccountInDto)

Upsert a managed account

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.ManagedAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        ManagedAccountsApi apiInstance = new ManagedAccountsApi(defaultClient);
        Long accId = 56L; // Long | A service account id
        UserAccountType userAccount = UserAccountType.fromValue("primary"); // UserAccountType | 
        String userId = "userId_example"; // String | 
        List<ServiceKey> recycleKeys = Arrays.asList(); // List<ServiceKey> | 
        Boolean ensureAccess = true; // Boolean | When set to true, Aurinko will check if a user has access to the requested resources. Supported only for Google and Office365, and only for Email, Calendar, Contacts and Tasks APIs.
        ApiAccountInDto apiAccountInDto = new ApiAccountInDto(); // ApiAccountInDto | 
        try {
            CompletableFuture<AccountSaveResult> result = apiInstance.upsertManagedAccount(accId, userAccount, userId, recycleKeys, ensureAccess, apiAccountInDto);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagedAccountsApi#upsertManagedAccount");
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
| **accId** | **Long**| A service account id | |
| **userAccount** | [**UserAccountType**](.md)|  | [optional] [enum: primary, secondary] |
| **userId** | **String**|  | [optional] |
| **recycleKeys** | [**List&lt;ServiceKey&gt;**](ServiceKey.md)|  | [optional] |
| **ensureAccess** | **Boolean**| When set to true, Aurinko will check if a user has access to the requested resources. Supported only for Google and Office365, and only for Email, Calendar, Contacts and Tasks APIs. | [optional] |
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

## upsertManagedAccountWithHttpInfo

> CompletableFuture<ApiResponse<AccountSaveResult>> upsertManagedAccount upsertManagedAccountWithHttpInfo(accId, userAccount, userId, recycleKeys, ensureAccess, apiAccountInDto)

Upsert a managed account

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.ManagedAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        ManagedAccountsApi apiInstance = new ManagedAccountsApi(defaultClient);
        Long accId = 56L; // Long | A service account id
        UserAccountType userAccount = UserAccountType.fromValue("primary"); // UserAccountType | 
        String userId = "userId_example"; // String | 
        List<ServiceKey> recycleKeys = Arrays.asList(); // List<ServiceKey> | 
        Boolean ensureAccess = true; // Boolean | When set to true, Aurinko will check if a user has access to the requested resources. Supported only for Google and Office365, and only for Email, Calendar, Contacts and Tasks APIs.
        ApiAccountInDto apiAccountInDto = new ApiAccountInDto(); // ApiAccountInDto | 
        try {
            CompletableFuture<ApiResponse<AccountSaveResult>> response = apiInstance.upsertManagedAccountWithHttpInfo(accId, userAccount, userId, recycleKeys, ensureAccess, apiAccountInDto);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ManagedAccountsApi#upsertManagedAccount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagedAccountsApi#upsertManagedAccount");
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
| **accId** | **Long**| A service account id | |
| **userAccount** | [**UserAccountType**](.md)|  | [optional] [enum: primary, secondary] |
| **userId** | **String**|  | [optional] |
| **recycleKeys** | [**List&lt;ServiceKey&gt;**](ServiceKey.md)|  | [optional] |
| **ensureAccess** | **Boolean**| When set to true, Aurinko will check if a user has access to the requested resources. Supported only for Google and Office365, and only for Email, Calendar, Contacts and Tasks APIs. | [optional] |
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


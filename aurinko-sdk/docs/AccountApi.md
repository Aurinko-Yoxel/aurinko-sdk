# AccountApi

All URIs are relative to *https://api.aurinko.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAccount**](AccountApi.md#deleteAccount) | **DELETE** /v1/account | Delete the account |
| [**deleteAccountWithHttpInfo**](AccountApi.md#deleteAccountWithHttpInfo) | **DELETE** /v1/account | Delete the account |
| [**deleteToken**](AccountApi.md#deleteToken) | **DELETE** /v1/account/token | Delete the token and revoke all provider authentication data associated with it |
| [**deleteTokenWithHttpInfo**](AccountApi.md#deleteTokenWithHttpInfo) | **DELETE** /v1/account/token | Delete the token and revoke all provider authentication data associated with it |
| [**getMyAccount**](AccountApi.md#getMyAccount) | **GET** /v1/account | Get account status |
| [**getMyAccountWithHttpInfo**](AccountApi.md#getMyAccountWithHttpInfo) | **GET** /v1/account | Get account status |



## deleteAccount

> CompletableFuture<Void> deleteAccount()

Delete the account

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AccountApi;
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

        AccountApi apiInstance = new AccountApi(defaultClient);
        try {
            CompletableFuture<Void> result = apiInstance.deleteAccount();
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#deleteAccount");
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


CompletableFuture<void> (empty response body)

### Authorization

[UserSessionHeader](../README.md#UserSessionHeader), [AuthTypeHeader](../README.md#AuthTypeHeader), [AppAuth](../README.md#AppAuth), [AccountToken](../README.md#AccountToken), [AccountIdHeader](../README.md#AccountIdHeader), [ClientIdHeader](../README.md#ClientIdHeader), [UserSessionCookie](../README.md#UserSessionCookie), [ExchangeIdToken](../README.md#ExchangeIdToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Access token is missing or invalid |  -  |
| **0** | See \&quot;Handling errors\&quot; section for details |  -  |

## deleteAccountWithHttpInfo

> CompletableFuture<ApiResponse<Void>> deleteAccount deleteAccountWithHttpInfo()

Delete the account

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AccountApi;
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

        AccountApi apiInstance = new AccountApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.deleteAccountWithHttpInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AccountApi#deleteAccount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#deleteAccount");
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


CompletableFuture<ApiResponse<Void>>

### Authorization

[UserSessionHeader](../README.md#UserSessionHeader), [AuthTypeHeader](../README.md#AuthTypeHeader), [AppAuth](../README.md#AppAuth), [AccountToken](../README.md#AccountToken), [AccountIdHeader](../README.md#AccountIdHeader), [ClientIdHeader](../README.md#ClientIdHeader), [UserSessionCookie](../README.md#UserSessionCookie), [ExchangeIdToken](../README.md#ExchangeIdToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Access token is missing or invalid |  -  |
| **0** | See \&quot;Handling errors\&quot; section for details |  -  |


## deleteToken

> CompletableFuture<Void> deleteToken()

Delete the token and revoke all provider authentication data associated with it

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AccountApi;
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

        AccountApi apiInstance = new AccountApi(defaultClient);
        try {
            CompletableFuture<Void> result = apiInstance.deleteToken();
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#deleteToken");
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


CompletableFuture<void> (empty response body)

### Authorization

[UserSessionHeader](../README.md#UserSessionHeader), [AuthTypeHeader](../README.md#AuthTypeHeader), [AppAuth](../README.md#AppAuth), [AccountToken](../README.md#AccountToken), [AccountIdHeader](../README.md#AccountIdHeader), [ClientIdHeader](../README.md#ClientIdHeader), [UserSessionCookie](../README.md#UserSessionCookie), [ExchangeIdToken](../README.md#ExchangeIdToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Access token is missing or invalid |  -  |
| **0** | See \&quot;Handling errors\&quot; section for details |  -  |

## deleteTokenWithHttpInfo

> CompletableFuture<ApiResponse<Void>> deleteToken deleteTokenWithHttpInfo()

Delete the token and revoke all provider authentication data associated with it

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AccountApi;
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

        AccountApi apiInstance = new AccountApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.deleteTokenWithHttpInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AccountApi#deleteToken");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#deleteToken");
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


CompletableFuture<ApiResponse<Void>>

### Authorization

[UserSessionHeader](../README.md#UserSessionHeader), [AuthTypeHeader](../README.md#AuthTypeHeader), [AppAuth](../README.md#AppAuth), [AccountToken](../README.md#AccountToken), [AccountIdHeader](../README.md#AccountIdHeader), [ClientIdHeader](../README.md#ClientIdHeader), [UserSessionCookie](../README.md#UserSessionCookie), [ExchangeIdToken](../README.md#ExchangeIdToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Access token is missing or invalid |  -  |
| **0** | See \&quot;Handling errors\&quot; section for details |  -  |


## getMyAccount

> CompletableFuture<ApiAccountOutDto> getMyAccount(pingProvider, includeProviderAuth)

Get account status

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AccountApi;
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

        AccountApi apiInstance = new AccountApi(defaultClient);
        Boolean pingProvider = true; // Boolean | If true, the provider will be pinged to check if the token is still valid. Currently supported only for Google, Office365, Salesforce, NetSuite, IMAP.
        Boolean includeProviderAuth = true; // Boolean | 
        try {
            CompletableFuture<ApiAccountOutDto> result = apiInstance.getMyAccount(pingProvider, includeProviderAuth);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#getMyAccount");
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
| **pingProvider** | **Boolean**| If true, the provider will be pinged to check if the token is still valid. Currently supported only for Google, Office365, Salesforce, NetSuite, IMAP. | [optional] |
| **includeProviderAuth** | **Boolean**|  | [optional] |

### Return type

CompletableFuture<[**ApiAccountOutDto**](ApiAccountOutDto.md)>


### Authorization

[UserSessionHeader](../README.md#UserSessionHeader), [AuthTypeHeader](../README.md#AuthTypeHeader), [AppAuth](../README.md#AppAuth), [AccountToken](../README.md#AccountToken), [AccountIdHeader](../README.md#AccountIdHeader), [ClientIdHeader](../README.md#ClientIdHeader), [UserSessionCookie](../README.md#UserSessionCookie), [ExchangeIdToken](../README.md#ExchangeIdToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Access token is missing or invalid |  -  |
| **0** | See \&quot;Handling errors\&quot; section for details |  -  |

## getMyAccountWithHttpInfo

> CompletableFuture<ApiResponse<ApiAccountOutDto>> getMyAccount getMyAccountWithHttpInfo(pingProvider, includeProviderAuth)

Get account status

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AccountApi;
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

        AccountApi apiInstance = new AccountApi(defaultClient);
        Boolean pingProvider = true; // Boolean | If true, the provider will be pinged to check if the token is still valid. Currently supported only for Google, Office365, Salesforce, NetSuite, IMAP.
        Boolean includeProviderAuth = true; // Boolean | 
        try {
            CompletableFuture<ApiResponse<ApiAccountOutDto>> response = apiInstance.getMyAccountWithHttpInfo(pingProvider, includeProviderAuth);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AccountApi#getMyAccount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#getMyAccount");
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
| **pingProvider** | **Boolean**| If true, the provider will be pinged to check if the token is still valid. Currently supported only for Google, Office365, Salesforce, NetSuite, IMAP. | [optional] |
| **includeProviderAuth** | **Boolean**|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ApiAccountOutDto**](ApiAccountOutDto.md)>>


### Authorization

[UserSessionHeader](../README.md#UserSessionHeader), [AuthTypeHeader](../README.md#AuthTypeHeader), [AppAuth](../README.md#AppAuth), [AccountToken](../README.md#AccountToken), [AccountIdHeader](../README.md#AccountIdHeader), [ClientIdHeader](../README.md#ClientIdHeader), [UserSessionCookie](../README.md#UserSessionCookie), [ExchangeIdToken](../README.md#ExchangeIdToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Access token is missing or invalid |  -  |
| **0** | See \&quot;Handling errors\&quot; section for details |  -  |


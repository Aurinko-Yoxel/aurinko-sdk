# AuthApi

All URIs are relative to *https://api.aurinko.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authCodeExchange**](AuthApi.md#authCodeExchange) | **POST** /v1/auth/token/{code} | Request an access token |
| [**authCodeExchangeWithHttpInfo**](AuthApi.md#authCodeExchangeWithHttpInfo) | **POST** /v1/auth/token/{code} | Request an access token |
| [**authorize**](AuthApi.md#authorize) | **GET** /v1/auth/authorize | Start an account authentication flow |
| [**authorizeWithHttpInfo**](AuthApi.md#authorizeWithHttpInfo) | **GET** /v1/auth/authorize | Start an account authentication flow |
| [**authorizeDaemon**](AuthApi.md#authorizeDaemon) | **GET** /v1/auth/authorizeDaemon | Start an service/daemon account authentication flow |
| [**authorizeDaemonWithHttpInfo**](AuthApi.md#authorizeDaemonWithHttpInfo) | **GET** /v1/auth/authorizeDaemon | Start an service/daemon account authentication flow |
| [**getAccessTokenByCode**](AuthApi.md#getAccessTokenByCode) | **GET** /v1/auth/token/{code} | Get access token, Deprecated use POST instead |
| [**getAccessTokenByCodeWithHttpInfo**](AuthApi.md#getAccessTokenByCodeWithHttpInfo) | **GET** /v1/auth/token/{code} | Get access token, Deprecated use POST instead |



## authCodeExchange

> CompletableFuture<AccountSaveResult> authCodeExchange(code)

Request an access token

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AuthApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        AuthApi apiInstance = new AuthApi(defaultClient);
        String code = "code_example"; // String | A code returned by /authorize
        try {
            CompletableFuture<AccountSaveResult> result = apiInstance.authCodeExchange(code);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#authCodeExchange");
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
| **code** | **String**| A code returned by /authorize | |

### Return type

CompletableFuture<[**AccountSaveResult**](AccountSaveResult.md)>


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

## authCodeExchangeWithHttpInfo

> CompletableFuture<ApiResponse<AccountSaveResult>> authCodeExchange authCodeExchangeWithHttpInfo(code)

Request an access token

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AuthApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        AuthApi apiInstance = new AuthApi(defaultClient);
        String code = "code_example"; // String | A code returned by /authorize
        try {
            CompletableFuture<ApiResponse<AccountSaveResult>> response = apiInstance.authCodeExchangeWithHttpInfo(code);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AuthApi#authCodeExchange");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#authCodeExchange");
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
| **code** | **String**| A code returned by /authorize | |

### Return type

CompletableFuture<ApiResponse<[**AccountSaveResult**](AccountSaveResult.md)>>


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


## authorize

> CompletableFuture<Void> authorize(clientId, serviceType, returnUrl, mailboxInfo, scopes, nativeScopes, responseType, accountId, loginHint, state, fromPortal, clientOrgId, userAccount, userId, timestamp, userSignature, sandbox, communityUrl, checkServiceAccount, serverUrl)

Start an account authentication flow

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.models.*;
import io.aurinko.api.AuthApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");

        AuthApi apiInstance = new AuthApi(defaultClient);
        String clientId = "clientId_example"; // String | Application client Id
        ServiceTypeNonDaemon serviceType = ServiceTypeNonDaemon.fromValue("Google"); // ServiceTypeNonDaemon | 
        String returnUrl = "returnUrl_example"; // String | Redirect/callback url
        String mailboxInfo = "mailboxInfo_example"; // String | 
        List<Scope> scopes = Arrays.asList(); // List<Scope> | Space separated list of scopes
        List<String> nativeScopes = Arrays.asList(); // List<String> | 
        String responseType = "code"; // String | 
        Long accountId = 56L; // Long | When re-authorizing an existing account
        String loginHint = "loginHint_example"; // String | 
        String state = "state_example"; // String | Custom state string
        Boolean fromPortal = true; // Boolean | 
        String clientOrgId = "clientOrgId_example"; // String | 
        UserAccountType userAccount = UserAccountType.fromValue("primary"); // UserAccountType | 
        String userId = "userId_example"; // String | 
        Long timestamp = 56L; // Long | 
        String userSignature = "userSignature_example"; // String | 
        Boolean sandbox = true; // Boolean | 
        String communityUrl = "communityUrl_example"; // String | 
        Boolean checkServiceAccount = true; // Boolean | 
        String serverUrl = "serverUrl_example"; // String | 
        try {
            CompletableFuture<Void> result = apiInstance.authorize(clientId, serviceType, returnUrl, mailboxInfo, scopes, nativeScopes, responseType, accountId, loginHint, state, fromPortal, clientOrgId, userAccount, userId, timestamp, userSignature, sandbox, communityUrl, checkServiceAccount, serverUrl);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#authorize");
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
| **clientId** | **String**| Application client Id | |
| **serviceType** | [**ServiceTypeNonDaemon**](.md)|  | [enum: Google, Office365, EWS, EWS365, IMAP, Salesforce, Salesflare, Repfabric, Slack, SugarCRM, HighLevel, Hubspot, Zoom, Webex, WebexBot, Pipedrive, EclipseERP, AutoQuotes, Teamwork, NetSuite, DDS, Zoho, Clientify, QuickBooks] |
| **returnUrl** | **String**| Redirect/callback url | |
| **mailboxInfo** | **String**|  | [optional] |
| **scopes** | [**List&lt;Scope&gt;**](Scope.md)| Space separated list of scopes | [optional] |
| **nativeScopes** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **responseType** | **String**|  | [optional] [default to code] [enum: code, token] |
| **accountId** | **Long**| When re-authorizing an existing account | [optional] |
| **loginHint** | **String**|  | [optional] |
| **state** | **String**| Custom state string | [optional] |
| **fromPortal** | **Boolean**|  | [optional] |
| **clientOrgId** | **String**|  | [optional] |
| **userAccount** | [**UserAccountType**](.md)|  | [optional] [enum: primary, secondary] |
| **userId** | **String**|  | [optional] |
| **timestamp** | **Long**|  | [optional] |
| **userSignature** | **String**|  | [optional] |
| **sandbox** | **Boolean**|  | [optional] |
| **communityUrl** | **String**|  | [optional] |
| **checkServiceAccount** | **Boolean**|  | [optional] |
| **serverUrl** | **String**|  | [optional] |

### Return type


CompletableFuture<void> (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **303** | Redirect |  -  |

## authorizeWithHttpInfo

> CompletableFuture<ApiResponse<Void>> authorize authorizeWithHttpInfo(clientId, serviceType, returnUrl, mailboxInfo, scopes, nativeScopes, responseType, accountId, loginHint, state, fromPortal, clientOrgId, userAccount, userId, timestamp, userSignature, sandbox, communityUrl, checkServiceAccount, serverUrl)

Start an account authentication flow

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.models.*;
import io.aurinko.api.AuthApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");

        AuthApi apiInstance = new AuthApi(defaultClient);
        String clientId = "clientId_example"; // String | Application client Id
        ServiceTypeNonDaemon serviceType = ServiceTypeNonDaemon.fromValue("Google"); // ServiceTypeNonDaemon | 
        String returnUrl = "returnUrl_example"; // String | Redirect/callback url
        String mailboxInfo = "mailboxInfo_example"; // String | 
        List<Scope> scopes = Arrays.asList(); // List<Scope> | Space separated list of scopes
        List<String> nativeScopes = Arrays.asList(); // List<String> | 
        String responseType = "code"; // String | 
        Long accountId = 56L; // Long | When re-authorizing an existing account
        String loginHint = "loginHint_example"; // String | 
        String state = "state_example"; // String | Custom state string
        Boolean fromPortal = true; // Boolean | 
        String clientOrgId = "clientOrgId_example"; // String | 
        UserAccountType userAccount = UserAccountType.fromValue("primary"); // UserAccountType | 
        String userId = "userId_example"; // String | 
        Long timestamp = 56L; // Long | 
        String userSignature = "userSignature_example"; // String | 
        Boolean sandbox = true; // Boolean | 
        String communityUrl = "communityUrl_example"; // String | 
        Boolean checkServiceAccount = true; // Boolean | 
        String serverUrl = "serverUrl_example"; // String | 
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.authorizeWithHttpInfo(clientId, serviceType, returnUrl, mailboxInfo, scopes, nativeScopes, responseType, accountId, loginHint, state, fromPortal, clientOrgId, userAccount, userId, timestamp, userSignature, sandbox, communityUrl, checkServiceAccount, serverUrl);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AuthApi#authorize");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#authorize");
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
| **clientId** | **String**| Application client Id | |
| **serviceType** | [**ServiceTypeNonDaemon**](.md)|  | [enum: Google, Office365, EWS, EWS365, IMAP, Salesforce, Salesflare, Repfabric, Slack, SugarCRM, HighLevel, Hubspot, Zoom, Webex, WebexBot, Pipedrive, EclipseERP, AutoQuotes, Teamwork, NetSuite, DDS, Zoho, Clientify, QuickBooks] |
| **returnUrl** | **String**| Redirect/callback url | |
| **mailboxInfo** | **String**|  | [optional] |
| **scopes** | [**List&lt;Scope&gt;**](Scope.md)| Space separated list of scopes | [optional] |
| **nativeScopes** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **responseType** | **String**|  | [optional] [default to code] [enum: code, token] |
| **accountId** | **Long**| When re-authorizing an existing account | [optional] |
| **loginHint** | **String**|  | [optional] |
| **state** | **String**| Custom state string | [optional] |
| **fromPortal** | **Boolean**|  | [optional] |
| **clientOrgId** | **String**|  | [optional] |
| **userAccount** | [**UserAccountType**](.md)|  | [optional] [enum: primary, secondary] |
| **userId** | **String**|  | [optional] |
| **timestamp** | **Long**|  | [optional] |
| **userSignature** | **String**|  | [optional] |
| **sandbox** | **Boolean**|  | [optional] |
| **communityUrl** | **String**|  | [optional] |
| **checkServiceAccount** | **Boolean**|  | [optional] |
| **serverUrl** | **String**|  | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **303** | Redirect |  -  |


## authorizeDaemon

> CompletableFuture<Void> authorizeDaemon(clientId, serviceType, returnUrl, mailboxInfo, scopes, nativeScopes, responseType, accountId, state, fromPortal, clientOrgId)

Start an service/daemon account authentication flow

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.models.*;
import io.aurinko.api.AuthApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");

        AuthApi apiInstance = new AuthApi(defaultClient);
        String clientId = "clientId_example"; // String | Application client Id
        ServiceTypeDaemon serviceType = ServiceTypeDaemon.fromValue("Google"); // ServiceTypeDaemon | 
        String returnUrl = "returnUrl_example"; // String | Redirect/callback url
        String mailboxInfo = "mailboxInfo_example"; // String | 
        List<Scope> scopes = Arrays.asList(); // List<Scope> | Space separated list of scopes
        List<String> nativeScopes = Arrays.asList(); // List<String> | 
        String responseType = "code"; // String | 
        Long accountId = 56L; // Long | When re-authorizing an existing account
        String state = "state_example"; // String | Custom state string
        Boolean fromPortal = true; // Boolean | 
        String clientOrgId = "clientOrgId_example"; // String | 
        try {
            CompletableFuture<Void> result = apiInstance.authorizeDaemon(clientId, serviceType, returnUrl, mailboxInfo, scopes, nativeScopes, responseType, accountId, state, fromPortal, clientOrgId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#authorizeDaemon");
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
| **clientId** | **String**| Application client Id | |
| **serviceType** | [**ServiceTypeDaemon**](.md)|  | [enum: Google, GoogleBot, Office365, EWS, EWS365, MsTeamsBot, Slack, SlackBot, ZoomBot, MCTrade, Zoho] |
| **returnUrl** | **String**| Redirect/callback url | |
| **mailboxInfo** | **String**|  | [optional] |
| **scopes** | [**List&lt;Scope&gt;**](Scope.md)| Space separated list of scopes | [optional] |
| **nativeScopes** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **responseType** | **String**|  | [optional] [default to code] [enum: code, token] |
| **accountId** | **Long**| When re-authorizing an existing account | [optional] |
| **state** | **String**| Custom state string | [optional] |
| **fromPortal** | **Boolean**|  | [optional] |
| **clientOrgId** | **String**|  | [optional] |

### Return type


CompletableFuture<void> (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **303** | Redirect |  -  |

## authorizeDaemonWithHttpInfo

> CompletableFuture<ApiResponse<Void>> authorizeDaemon authorizeDaemonWithHttpInfo(clientId, serviceType, returnUrl, mailboxInfo, scopes, nativeScopes, responseType, accountId, state, fromPortal, clientOrgId)

Start an service/daemon account authentication flow

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.models.*;
import io.aurinko.api.AuthApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");

        AuthApi apiInstance = new AuthApi(defaultClient);
        String clientId = "clientId_example"; // String | Application client Id
        ServiceTypeDaemon serviceType = ServiceTypeDaemon.fromValue("Google"); // ServiceTypeDaemon | 
        String returnUrl = "returnUrl_example"; // String | Redirect/callback url
        String mailboxInfo = "mailboxInfo_example"; // String | 
        List<Scope> scopes = Arrays.asList(); // List<Scope> | Space separated list of scopes
        List<String> nativeScopes = Arrays.asList(); // List<String> | 
        String responseType = "code"; // String | 
        Long accountId = 56L; // Long | When re-authorizing an existing account
        String state = "state_example"; // String | Custom state string
        Boolean fromPortal = true; // Boolean | 
        String clientOrgId = "clientOrgId_example"; // String | 
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.authorizeDaemonWithHttpInfo(clientId, serviceType, returnUrl, mailboxInfo, scopes, nativeScopes, responseType, accountId, state, fromPortal, clientOrgId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AuthApi#authorizeDaemon");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#authorizeDaemon");
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
| **clientId** | **String**| Application client Id | |
| **serviceType** | [**ServiceTypeDaemon**](.md)|  | [enum: Google, GoogleBot, Office365, EWS, EWS365, MsTeamsBot, Slack, SlackBot, ZoomBot, MCTrade, Zoho] |
| **returnUrl** | **String**| Redirect/callback url | |
| **mailboxInfo** | **String**|  | [optional] |
| **scopes** | [**List&lt;Scope&gt;**](Scope.md)| Space separated list of scopes | [optional] |
| **nativeScopes** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **responseType** | **String**|  | [optional] [default to code] [enum: code, token] |
| **accountId** | **Long**| When re-authorizing an existing account | [optional] |
| **state** | **String**| Custom state string | [optional] |
| **fromPortal** | **Boolean**|  | [optional] |
| **clientOrgId** | **String**|  | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **303** | Redirect |  -  |


## getAccessTokenByCode

> CompletableFuture<AccountSaveResult> getAccessTokenByCode(code)

Get access token, Deprecated use POST instead

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AuthApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        AuthApi apiInstance = new AuthApi(defaultClient);
        String code = "code_example"; // String | A code returned by /authorize
        try {
            CompletableFuture<AccountSaveResult> result = apiInstance.getAccessTokenByCode(code);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#getAccessTokenByCode");
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
| **code** | **String**| A code returned by /authorize | |

### Return type

CompletableFuture<[**AccountSaveResult**](AccountSaveResult.md)>


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

## getAccessTokenByCodeWithHttpInfo

> CompletableFuture<ApiResponse<AccountSaveResult>> getAccessTokenByCode getAccessTokenByCodeWithHttpInfo(code)

Get access token, Deprecated use POST instead

### Example

```java
// Import classes:
import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Configuration;
import io.aurinko.client.auth.*;
import io.aurinko.client.models.*;
import io.aurinko.api.AuthApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.aurinko.io");
        
        // Configure HTTP basic authorization: AppAuth
        HttpBasicAuth AppAuth = (HttpBasicAuth) defaultClient.getAuthentication("AppAuth");
        AppAuth.setUsername("YOUR USERNAME");
        AppAuth.setPassword("YOUR PASSWORD");

        AuthApi apiInstance = new AuthApi(defaultClient);
        String code = "code_example"; // String | A code returned by /authorize
        try {
            CompletableFuture<ApiResponse<AccountSaveResult>> response = apiInstance.getAccessTokenByCodeWithHttpInfo(code);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AuthApi#getAccessTokenByCode");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#getAccessTokenByCode");
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
| **code** | **String**| A code returned by /authorize | |

### Return type

CompletableFuture<ApiResponse<[**AccountSaveResult**](AccountSaveResult.md)>>


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


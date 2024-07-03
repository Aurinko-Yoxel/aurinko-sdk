# AuthApi

All URIs are relative to *https://api.aurinko.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authCodeExchange**](AuthApi.md#authCodeExchange) | **POST** /v1/auth/token/{code} | Request an access token |
| [**authCodeExchangeWithHttpInfo**](AuthApi.md#authCodeExchangeWithHttpInfo) | **POST** /v1/auth/token/{code} | Request an access token |
| [**authorize**](AuthApi.md#authorize) | **GET** /v1/auth/authorize | Start an account authorization flow |
| [**authorizeWithHttpInfo**](AuthApi.md#authorizeWithHttpInfo) | **GET** /v1/auth/authorize | Start an account authorization flow |
| [**authorizeDaemon**](AuthApi.md#authorizeDaemon) | **GET** /v1/auth/authorizeDaemon | Start a service/daemon account authorization flow |
| [**authorizeDaemonWithHttpInfo**](AuthApi.md#authorizeDaemonWithHttpInfo) | **GET** /v1/auth/authorizeDaemon | Start a service/daemon account authorization flow |
| [**authorizeUser**](AuthApi.md#authorizeUser) | **GET** /v1/auth/authorizeUser | Start a user session authorization flow |
| [**authorizeUserWithHttpInfo**](AuthApi.md#authorizeUserWithHttpInfo) | **GET** /v1/auth/authorizeUser | Start a user session authorization flow |
| [**getAccessTokenByCode**](AuthApi.md#getAccessTokenByCode) | **GET** /v1/auth/token/{code} | Get access token, Deprecated use POST instead |
| [**getAccessTokenByCodeWithHttpInfo**](AuthApi.md#getAccessTokenByCodeWithHttpInfo) | **GET** /v1/auth/token/{code} | Get access token, Deprecated use POST instead |
| [**prepareAuth**](AuthApi.md#prepareAuth) | **POST** /v1/auth/prepare | Validate an external identity token |
| [**prepareAuthWithHttpInfo**](AuthApi.md#prepareAuthWithHttpInfo) | **POST** /v1/auth/prepare | Validate an external identity token |



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

> CompletableFuture<Void> authorize(clientId, serviceType, returnUrl, scopes, nativeScopes, responseType, accountId, loginHint, state, clientOrgId, serverUrl, ensureScopes, ensureAccess, recycle, authEmail)

Start an account authorization flow

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
        String clientId = "clientId_example"; // String | Application Client Id from the Aurinko portal dashboard.
        ServiceTypeNonDaemon serviceType = ServiceTypeNonDaemon.fromValue("Google"); // ServiceTypeNonDaemon | 
        String returnUrl = "returnUrl_example"; // String | Return/Callback url for receiving the authorization code or token. It must be registered on the settings page in Aurinko portal.
        List<Scope> scopes = Arrays.asList(); // List<Scope> | Space separated list of Aurinko defined scopes.
        List<String> nativeScopes = Arrays.asList(); // List<String> | Space separated list of provider defined scopes
        String responseType = "code"; // String | The type of response expected from the authorization flow. Choose `token` to directly receive the authentication token, or `code` to obtain a temporary code that can be exchanged for the token using the /auth/token endpoint.
        Long accountId = 56L; // Long | For re-authorizing an existing account.
        String loginHint = "loginHint_example"; // String | Is passed as \"login_hint\" in OAuth flows, suggesting user identity for a smoother login process.
        String state = "state_example"; // String | Custom state string that will be returned in the callback.
        String clientOrgId = "clientOrgId_example"; // String | Allows clients to group accounts based on their internal organization data.
        String serverUrl = "serverUrl_example"; // String | Can be used in the form-based authentication to specify the URL of the server to which the user intends to authenticate. When included, it automatically populates the corresponding input field on the authentication form.
        Boolean ensureScopes = true; // Boolean | When set to true, Aurinko will check if a user granted all requested permissions.
        Boolean ensureAccess = true; // Boolean | When set to true, Aurinko will check if a user has access to the requested resources. Supported only for Google and Office365, and only for Email, Calendar, Contacts and Tasks APIs.
        Boolean recycle = true; // Boolean | Indicates whether to reuse an existing account instead of creating a new one during authentication.
        String authEmail = "authEmail_example"; // String | Email address that must be used for authentication. Aurinko will fail the authentication flow if the email address does not match the one provided.
        try {
            CompletableFuture<Void> result = apiInstance.authorize(clientId, serviceType, returnUrl, scopes, nativeScopes, responseType, accountId, loginHint, state, clientOrgId, serverUrl, ensureScopes, ensureAccess, recycle, authEmail);
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
| **clientId** | **String**| Application Client Id from the Aurinko portal dashboard. | |
| **serviceType** | [**ServiceTypeNonDaemon**](.md)|  | [enum: Google, Office365, EWS, IMAP, Salesforce, Salesflare, Repfabric, Slack, SugarCRM, HighLevel, Hubspot, Zoom, Webex, WebexBot, Pipedrive, EclipseERP, AutoQuotes, Teamwork, NetSuite, SpecPath, Zoho, Clientify, QuickBooks, ActiveCampaign, Creatio, ConstantContact, Fishbowl, iCloud] |
| **returnUrl** | **String**| Return/Callback url for receiving the authorization code or token. It must be registered on the settings page in Aurinko portal. | |
| **scopes** | [**List&lt;Scope&gt;**](Scope.md)| Space separated list of Aurinko defined scopes. | [optional] |
| **nativeScopes** | [**List&lt;String&gt;**](String.md)| Space separated list of provider defined scopes | [optional] |
| **responseType** | **String**| The type of response expected from the authorization flow. Choose &#x60;token&#x60; to directly receive the authentication token, or &#x60;code&#x60; to obtain a temporary code that can be exchanged for the token using the /auth/token endpoint. | [optional] [default to code] [enum: code, token] |
| **accountId** | **Long**| For re-authorizing an existing account. | [optional] |
| **loginHint** | **String**| Is passed as \&quot;login_hint\&quot; in OAuth flows, suggesting user identity for a smoother login process. | [optional] |
| **state** | **String**| Custom state string that will be returned in the callback. | [optional] |
| **clientOrgId** | **String**| Allows clients to group accounts based on their internal organization data. | [optional] |
| **serverUrl** | **String**| Can be used in the form-based authentication to specify the URL of the server to which the user intends to authenticate. When included, it automatically populates the corresponding input field on the authentication form. | [optional] |
| **ensureScopes** | **Boolean**| When set to true, Aurinko will check if a user granted all requested permissions. | [optional] |
| **ensureAccess** | **Boolean**| When set to true, Aurinko will check if a user has access to the requested resources. Supported only for Google and Office365, and only for Email, Calendar, Contacts and Tasks APIs. | [optional] |
| **recycle** | **Boolean**| Indicates whether to reuse an existing account instead of creating a new one during authentication. | [optional] |
| **authEmail** | **String**| Email address that must be used for authentication. Aurinko will fail the authentication flow if the email address does not match the one provided. | [optional] |

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

> CompletableFuture<ApiResponse<Void>> authorize authorizeWithHttpInfo(clientId, serviceType, returnUrl, scopes, nativeScopes, responseType, accountId, loginHint, state, clientOrgId, serverUrl, ensureScopes, ensureAccess, recycle, authEmail)

Start an account authorization flow

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
        String clientId = "clientId_example"; // String | Application Client Id from the Aurinko portal dashboard.
        ServiceTypeNonDaemon serviceType = ServiceTypeNonDaemon.fromValue("Google"); // ServiceTypeNonDaemon | 
        String returnUrl = "returnUrl_example"; // String | Return/Callback url for receiving the authorization code or token. It must be registered on the settings page in Aurinko portal.
        List<Scope> scopes = Arrays.asList(); // List<Scope> | Space separated list of Aurinko defined scopes.
        List<String> nativeScopes = Arrays.asList(); // List<String> | Space separated list of provider defined scopes
        String responseType = "code"; // String | The type of response expected from the authorization flow. Choose `token` to directly receive the authentication token, or `code` to obtain a temporary code that can be exchanged for the token using the /auth/token endpoint.
        Long accountId = 56L; // Long | For re-authorizing an existing account.
        String loginHint = "loginHint_example"; // String | Is passed as \"login_hint\" in OAuth flows, suggesting user identity for a smoother login process.
        String state = "state_example"; // String | Custom state string that will be returned in the callback.
        String clientOrgId = "clientOrgId_example"; // String | Allows clients to group accounts based on their internal organization data.
        String serverUrl = "serverUrl_example"; // String | Can be used in the form-based authentication to specify the URL of the server to which the user intends to authenticate. When included, it automatically populates the corresponding input field on the authentication form.
        Boolean ensureScopes = true; // Boolean | When set to true, Aurinko will check if a user granted all requested permissions.
        Boolean ensureAccess = true; // Boolean | When set to true, Aurinko will check if a user has access to the requested resources. Supported only for Google and Office365, and only for Email, Calendar, Contacts and Tasks APIs.
        Boolean recycle = true; // Boolean | Indicates whether to reuse an existing account instead of creating a new one during authentication.
        String authEmail = "authEmail_example"; // String | Email address that must be used for authentication. Aurinko will fail the authentication flow if the email address does not match the one provided.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.authorizeWithHttpInfo(clientId, serviceType, returnUrl, scopes, nativeScopes, responseType, accountId, loginHint, state, clientOrgId, serverUrl, ensureScopes, ensureAccess, recycle, authEmail);
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
| **clientId** | **String**| Application Client Id from the Aurinko portal dashboard. | |
| **serviceType** | [**ServiceTypeNonDaemon**](.md)|  | [enum: Google, Office365, EWS, IMAP, Salesforce, Salesflare, Repfabric, Slack, SugarCRM, HighLevel, Hubspot, Zoom, Webex, WebexBot, Pipedrive, EclipseERP, AutoQuotes, Teamwork, NetSuite, SpecPath, Zoho, Clientify, QuickBooks, ActiveCampaign, Creatio, ConstantContact, Fishbowl, iCloud] |
| **returnUrl** | **String**| Return/Callback url for receiving the authorization code or token. It must be registered on the settings page in Aurinko portal. | |
| **scopes** | [**List&lt;Scope&gt;**](Scope.md)| Space separated list of Aurinko defined scopes. | [optional] |
| **nativeScopes** | [**List&lt;String&gt;**](String.md)| Space separated list of provider defined scopes | [optional] |
| **responseType** | **String**| The type of response expected from the authorization flow. Choose &#x60;token&#x60; to directly receive the authentication token, or &#x60;code&#x60; to obtain a temporary code that can be exchanged for the token using the /auth/token endpoint. | [optional] [default to code] [enum: code, token] |
| **accountId** | **Long**| For re-authorizing an existing account. | [optional] |
| **loginHint** | **String**| Is passed as \&quot;login_hint\&quot; in OAuth flows, suggesting user identity for a smoother login process. | [optional] |
| **state** | **String**| Custom state string that will be returned in the callback. | [optional] |
| **clientOrgId** | **String**| Allows clients to group accounts based on their internal organization data. | [optional] |
| **serverUrl** | **String**| Can be used in the form-based authentication to specify the URL of the server to which the user intends to authenticate. When included, it automatically populates the corresponding input field on the authentication form. | [optional] |
| **ensureScopes** | **Boolean**| When set to true, Aurinko will check if a user granted all requested permissions. | [optional] |
| **ensureAccess** | **Boolean**| When set to true, Aurinko will check if a user has access to the requested resources. Supported only for Google and Office365, and only for Email, Calendar, Contacts and Tasks APIs. | [optional] |
| **recycle** | **Boolean**| Indicates whether to reuse an existing account instead of creating a new one during authentication. | [optional] |
| **authEmail** | **String**| Email address that must be used for authentication. Aurinko will fail the authentication flow if the email address does not match the one provided. | [optional] |

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

> CompletableFuture<Void> authorizeDaemon(clientId, serviceType, returnUrl, scopes, nativeScopes, responseType, accountId, state, clientOrgId, ensureScopes)

Start a service/daemon account authorization flow

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
        String clientId = "clientId_example"; // String | Application Client Id from the Aurinko portal dashboard.
        ServiceTypeDaemon serviceType = ServiceTypeDaemon.fromValue("Google"); // ServiceTypeDaemon | 
        String returnUrl = "returnUrl_example"; // String | Return/Callback url for receiving the authorization code or token. It must be registered on the settings page in Aurinko portal.
        List<Scope> scopes = Arrays.asList(); // List<Scope> | Space separated list of Aurinko defined scopes.
        List<String> nativeScopes = Arrays.asList(); // List<String> | Space separated list of provider defined scopes.
        String responseType = "code"; // String | The type of response expected from the authorization flow. Choose `token` to directly receive the authentication token, or `code` to obtain a temporary code that can be exchanged for the token using the /auth/token endpoint.
        Long accountId = 56L; // Long | For re-authorizing an existing account.
        String state = "state_example"; // String | Custom state string
        String clientOrgId = "clientOrgId_example"; // String | Allows clients to group accounts based on their internal organization data.
        Boolean ensureScopes = true; // Boolean | When set to true, Aurinko will check if a user granted all requested permissions.
        try {
            CompletableFuture<Void> result = apiInstance.authorizeDaemon(clientId, serviceType, returnUrl, scopes, nativeScopes, responseType, accountId, state, clientOrgId, ensureScopes);
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
| **clientId** | **String**| Application Client Id from the Aurinko portal dashboard. | |
| **serviceType** | [**ServiceTypeDaemon**](.md)|  | [enum: Google, GoogleBot, Office365, EWS, MsTeamsBot, Slack, SlackBot, ZoomBot, MCTrade, Zoho] |
| **returnUrl** | **String**| Return/Callback url for receiving the authorization code or token. It must be registered on the settings page in Aurinko portal. | |
| **scopes** | [**List&lt;Scope&gt;**](Scope.md)| Space separated list of Aurinko defined scopes. | [optional] |
| **nativeScopes** | [**List&lt;String&gt;**](String.md)| Space separated list of provider defined scopes. | [optional] |
| **responseType** | **String**| The type of response expected from the authorization flow. Choose &#x60;token&#x60; to directly receive the authentication token, or &#x60;code&#x60; to obtain a temporary code that can be exchanged for the token using the /auth/token endpoint. | [optional] [default to code] [enum: code, token] |
| **accountId** | **Long**| For re-authorizing an existing account. | [optional] |
| **state** | **String**| Custom state string | [optional] |
| **clientOrgId** | **String**| Allows clients to group accounts based on their internal organization data. | [optional] |
| **ensureScopes** | **Boolean**| When set to true, Aurinko will check if a user granted all requested permissions. | [optional] |

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

> CompletableFuture<ApiResponse<Void>> authorizeDaemon authorizeDaemonWithHttpInfo(clientId, serviceType, returnUrl, scopes, nativeScopes, responseType, accountId, state, clientOrgId, ensureScopes)

Start a service/daemon account authorization flow

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
        String clientId = "clientId_example"; // String | Application Client Id from the Aurinko portal dashboard.
        ServiceTypeDaemon serviceType = ServiceTypeDaemon.fromValue("Google"); // ServiceTypeDaemon | 
        String returnUrl = "returnUrl_example"; // String | Return/Callback url for receiving the authorization code or token. It must be registered on the settings page in Aurinko portal.
        List<Scope> scopes = Arrays.asList(); // List<Scope> | Space separated list of Aurinko defined scopes.
        List<String> nativeScopes = Arrays.asList(); // List<String> | Space separated list of provider defined scopes.
        String responseType = "code"; // String | The type of response expected from the authorization flow. Choose `token` to directly receive the authentication token, or `code` to obtain a temporary code that can be exchanged for the token using the /auth/token endpoint.
        Long accountId = 56L; // Long | For re-authorizing an existing account.
        String state = "state_example"; // String | Custom state string
        String clientOrgId = "clientOrgId_example"; // String | Allows clients to group accounts based on their internal organization data.
        Boolean ensureScopes = true; // Boolean | When set to true, Aurinko will check if a user granted all requested permissions.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.authorizeDaemonWithHttpInfo(clientId, serviceType, returnUrl, scopes, nativeScopes, responseType, accountId, state, clientOrgId, ensureScopes);
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
| **clientId** | **String**| Application Client Id from the Aurinko portal dashboard. | |
| **serviceType** | [**ServiceTypeDaemon**](.md)|  | [enum: Google, GoogleBot, Office365, EWS, MsTeamsBot, Slack, SlackBot, ZoomBot, MCTrade, Zoho] |
| **returnUrl** | **String**| Return/Callback url for receiving the authorization code or token. It must be registered on the settings page in Aurinko portal. | |
| **scopes** | [**List&lt;Scope&gt;**](Scope.md)| Space separated list of Aurinko defined scopes. | [optional] |
| **nativeScopes** | [**List&lt;String&gt;**](String.md)| Space separated list of provider defined scopes. | [optional] |
| **responseType** | **String**| The type of response expected from the authorization flow. Choose &#x60;token&#x60; to directly receive the authentication token, or &#x60;code&#x60; to obtain a temporary code that can be exchanged for the token using the /auth/token endpoint. | [optional] [default to code] [enum: code, token] |
| **accountId** | **Long**| For re-authorizing an existing account. | [optional] |
| **state** | **String**| Custom state string | [optional] |
| **clientOrgId** | **String**| Allows clients to group accounts based on their internal organization data. | [optional] |
| **ensureScopes** | **Boolean**| When set to true, Aurinko will check if a user granted all requested permissions. | [optional] |

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


## authorizeUser

> CompletableFuture<Void> authorizeUser(clientId, serviceType, returnUrl, accountRole, mailboxInfo, scopes, nativeScopes, responseType, accountId, loginHint, state, userId, timestamp, userSignature, serverUrl, ensureScopes, ensureAccess, token)

Start a user session authorization flow

This endpoint is used to authorize accounts that are linked to &#x60;Users&#x60;. The &#x60;accountRole&#x60; parameter must be set to either &#x60;primary&#x60; or &#x60;secondary&#x60;. A &#x60;primary&#x60; role creates a new User entity and assigns the account as its key/primary account, with subsequent authorizations simply re-authorizing the existing primary account with its User. The &#x60;secondary&#x60; role requires an existing &#x60;User&#x60; cookie or &#x60;userId&#x60;+&#x60;userSignature&#x60; parameters and links the new account to the &#x60;User&#x60; specified by the cookie or &#x60;userId&#x60;.

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
        String clientId = "clientId_example"; // String | Application Client Id from the Aurinko portal dashboard.
        ServiceTypeNonDaemon serviceType = ServiceTypeNonDaemon.fromValue("Google"); // ServiceTypeNonDaemon | 
        String returnUrl = "returnUrl_example"; // String | Return/Callback url for receiving the authorization code or token. It must be registered on the settings page in Aurinko portal.
        String accountRole = "primary"; // String | The account's role in relation to a User. Use `primary` for the account to act as a key account; this will create a new User if the primary account doesn't exist already. If the primary account exists, it's simply re-authorized without creating a new user. Choose `secondary` to associate the account with an already existing User, which requires either existing User cookie or `userId` + `userSignature` for identification.
        String mailboxInfo = "mailboxInfo_example"; // String | Relevant only for cookie-based authentication in multi-client setups. When different client apps are connected to a single Aurinko application, this string (commonly the user's email, but can be any unique identifier) is combined with \"clientId\" to create a distinct authentication cookie name and prevent cookie conflicts. Clients using cookie-based auth must send \"clientId\" and \"mailboxInfo\" via \"X-Aurinko-Client-Id\" and \"X-Aurinko-Mailbox-Info\" HTTP headers for accurate cookie identification.
        List<Scope> scopes = Arrays.asList(); // List<Scope> | Space separated list of Aurinko defined scopes.
        List<String> nativeScopes = Arrays.asList(); // List<String> | Space separated list of provider defined scopes
        String responseType = "cookie"; // String | The type of response expected from the user authorization flow. For `primary` accounts, choose `cookie` or `code`, for `secondary` accounts, choose `none`. `cookie` will set a cookie in the user's browser in the callback, `code` will return a temporary code that can be exchanged for a user session token using the /auth/token endpoint. `none` will return only the status of the operation and information about an occurred error. Because `secondary` accounts are linked to an existing and authorized User, they don't need to receive a token or cookie in the callback.
        Long accountId = 56L; // Long | For re-authorizing an existing `secondary` account.
        String loginHint = "loginHint_example"; // String | Is passed as \"login_hint\" in OAuth flows, suggesting user identity for a smoother login process.
        String state = "state_example"; // String | Custom state string
        String userId = "userId_example"; // String | Identifies a user for whom a secondary account is being added. Should be used only when `userAccount=secondary` and user cookie is not present in the request. Works in conjunction with `timestamp` and `userSignature` to authorize the addition of secondary account.
        Long timestamp = 56L; // Long | Request timestamp in seconds. Should be used only when `userAccount=secondary` and user cookie is not present in the request. Works in conjunction with `userId` and `userSignature` to authorize the addition of secondary account.
        String userSignature = "userSignature_example"; // String | A string that is generated by concatenating `userId` and `timestamp`, then hashing with HmacSHA256 using the application's `clientSecret`, then encoding in Hex, base64, or base64 web format. Should be used only when `userAccount=secondary` and user cookie is not present in the request Works in conjunction with `userId` and `timestamp` to authorize the addition of secondary account.
        String serverUrl = "serverUrl_example"; // String | Can be used in the form-based authentication to specify the URL of the server to which the user intends to authenticate. When included, it automatically populates the corresponding input field on the authentication form.
        Boolean ensureScopes = true; // Boolean | When set to true, Aurinko will check if a user granted all requested permissions.
        Boolean ensureAccess = true; // Boolean | When set to true, Aurinko will check if a user has access to the requested resources. Supported only for Google and Office365, and only for Email, Calendar, Contacts and Tasks APIs.
        String token = "token_example"; // String | Token from the /auth/prepare endpoint.
        try {
            CompletableFuture<Void> result = apiInstance.authorizeUser(clientId, serviceType, returnUrl, accountRole, mailboxInfo, scopes, nativeScopes, responseType, accountId, loginHint, state, userId, timestamp, userSignature, serverUrl, ensureScopes, ensureAccess, token);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#authorizeUser");
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
| **clientId** | **String**| Application Client Id from the Aurinko portal dashboard. | |
| **serviceType** | [**ServiceTypeNonDaemon**](.md)|  | [enum: Google, Office365, EWS, IMAP, Salesforce, Salesflare, Repfabric, Slack, SugarCRM, HighLevel, Hubspot, Zoom, Webex, WebexBot, Pipedrive, EclipseERP, AutoQuotes, Teamwork, NetSuite, SpecPath, Zoho, Clientify, QuickBooks, ActiveCampaign, Creatio, ConstantContact, Fishbowl, iCloud] |
| **returnUrl** | **String**| Return/Callback url for receiving the authorization code or token. It must be registered on the settings page in Aurinko portal. | |
| **accountRole** | **String**| The account&#39;s role in relation to a User. Use &#x60;primary&#x60; for the account to act as a key account; this will create a new User if the primary account doesn&#39;t exist already. If the primary account exists, it&#39;s simply re-authorized without creating a new user. Choose &#x60;secondary&#x60; to associate the account with an already existing User, which requires either existing User cookie or &#x60;userId&#x60; + &#x60;userSignature&#x60; for identification. | [enum: primary, secondary] |
| **mailboxInfo** | **String**| Relevant only for cookie-based authentication in multi-client setups. When different client apps are connected to a single Aurinko application, this string (commonly the user&#39;s email, but can be any unique identifier) is combined with \&quot;clientId\&quot; to create a distinct authentication cookie name and prevent cookie conflicts. Clients using cookie-based auth must send \&quot;clientId\&quot; and \&quot;mailboxInfo\&quot; via \&quot;X-Aurinko-Client-Id\&quot; and \&quot;X-Aurinko-Mailbox-Info\&quot; HTTP headers for accurate cookie identification. | [optional] |
| **scopes** | [**List&lt;Scope&gt;**](Scope.md)| Space separated list of Aurinko defined scopes. | [optional] |
| **nativeScopes** | [**List&lt;String&gt;**](String.md)| Space separated list of provider defined scopes | [optional] |
| **responseType** | **String**| The type of response expected from the user authorization flow. For &#x60;primary&#x60; accounts, choose &#x60;cookie&#x60; or &#x60;code&#x60;, for &#x60;secondary&#x60; accounts, choose &#x60;none&#x60;. &#x60;cookie&#x60; will set a cookie in the user&#39;s browser in the callback, &#x60;code&#x60; will return a temporary code that can be exchanged for a user session token using the /auth/token endpoint. &#x60;none&#x60; will return only the status of the operation and information about an occurred error. Because &#x60;secondary&#x60; accounts are linked to an existing and authorized User, they don&#39;t need to receive a token or cookie in the callback. | [optional] [default to cookie] [enum: cookie, code, none] |
| **accountId** | **Long**| For re-authorizing an existing &#x60;secondary&#x60; account. | [optional] |
| **loginHint** | **String**| Is passed as \&quot;login_hint\&quot; in OAuth flows, suggesting user identity for a smoother login process. | [optional] |
| **state** | **String**| Custom state string | [optional] |
| **userId** | **String**| Identifies a user for whom a secondary account is being added. Should be used only when &#x60;userAccount&#x3D;secondary&#x60; and user cookie is not present in the request. Works in conjunction with &#x60;timestamp&#x60; and &#x60;userSignature&#x60; to authorize the addition of secondary account. | [optional] |
| **timestamp** | **Long**| Request timestamp in seconds. Should be used only when &#x60;userAccount&#x3D;secondary&#x60; and user cookie is not present in the request. Works in conjunction with &#x60;userId&#x60; and &#x60;userSignature&#x60; to authorize the addition of secondary account. | [optional] |
| **userSignature** | **String**| A string that is generated by concatenating &#x60;userId&#x60; and &#x60;timestamp&#x60;, then hashing with HmacSHA256 using the application&#39;s &#x60;clientSecret&#x60;, then encoding in Hex, base64, or base64 web format. Should be used only when &#x60;userAccount&#x3D;secondary&#x60; and user cookie is not present in the request Works in conjunction with &#x60;userId&#x60; and &#x60;timestamp&#x60; to authorize the addition of secondary account. | [optional] |
| **serverUrl** | **String**| Can be used in the form-based authentication to specify the URL of the server to which the user intends to authenticate. When included, it automatically populates the corresponding input field on the authentication form. | [optional] |
| **ensureScopes** | **Boolean**| When set to true, Aurinko will check if a user granted all requested permissions. | [optional] |
| **ensureAccess** | **Boolean**| When set to true, Aurinko will check if a user has access to the requested resources. Supported only for Google and Office365, and only for Email, Calendar, Contacts and Tasks APIs. | [optional] |
| **token** | **String**| Token from the /auth/prepare endpoint. | [optional] |

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

## authorizeUserWithHttpInfo

> CompletableFuture<ApiResponse<Void>> authorizeUser authorizeUserWithHttpInfo(clientId, serviceType, returnUrl, accountRole, mailboxInfo, scopes, nativeScopes, responseType, accountId, loginHint, state, userId, timestamp, userSignature, serverUrl, ensureScopes, ensureAccess, token)

Start a user session authorization flow

This endpoint is used to authorize accounts that are linked to &#x60;Users&#x60;. The &#x60;accountRole&#x60; parameter must be set to either &#x60;primary&#x60; or &#x60;secondary&#x60;. A &#x60;primary&#x60; role creates a new User entity and assigns the account as its key/primary account, with subsequent authorizations simply re-authorizing the existing primary account with its User. The &#x60;secondary&#x60; role requires an existing &#x60;User&#x60; cookie or &#x60;userId&#x60;+&#x60;userSignature&#x60; parameters and links the new account to the &#x60;User&#x60; specified by the cookie or &#x60;userId&#x60;.

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
        String clientId = "clientId_example"; // String | Application Client Id from the Aurinko portal dashboard.
        ServiceTypeNonDaemon serviceType = ServiceTypeNonDaemon.fromValue("Google"); // ServiceTypeNonDaemon | 
        String returnUrl = "returnUrl_example"; // String | Return/Callback url for receiving the authorization code or token. It must be registered on the settings page in Aurinko portal.
        String accountRole = "primary"; // String | The account's role in relation to a User. Use `primary` for the account to act as a key account; this will create a new User if the primary account doesn't exist already. If the primary account exists, it's simply re-authorized without creating a new user. Choose `secondary` to associate the account with an already existing User, which requires either existing User cookie or `userId` + `userSignature` for identification.
        String mailboxInfo = "mailboxInfo_example"; // String | Relevant only for cookie-based authentication in multi-client setups. When different client apps are connected to a single Aurinko application, this string (commonly the user's email, but can be any unique identifier) is combined with \"clientId\" to create a distinct authentication cookie name and prevent cookie conflicts. Clients using cookie-based auth must send \"clientId\" and \"mailboxInfo\" via \"X-Aurinko-Client-Id\" and \"X-Aurinko-Mailbox-Info\" HTTP headers for accurate cookie identification.
        List<Scope> scopes = Arrays.asList(); // List<Scope> | Space separated list of Aurinko defined scopes.
        List<String> nativeScopes = Arrays.asList(); // List<String> | Space separated list of provider defined scopes
        String responseType = "cookie"; // String | The type of response expected from the user authorization flow. For `primary` accounts, choose `cookie` or `code`, for `secondary` accounts, choose `none`. `cookie` will set a cookie in the user's browser in the callback, `code` will return a temporary code that can be exchanged for a user session token using the /auth/token endpoint. `none` will return only the status of the operation and information about an occurred error. Because `secondary` accounts are linked to an existing and authorized User, they don't need to receive a token or cookie in the callback.
        Long accountId = 56L; // Long | For re-authorizing an existing `secondary` account.
        String loginHint = "loginHint_example"; // String | Is passed as \"login_hint\" in OAuth flows, suggesting user identity for a smoother login process.
        String state = "state_example"; // String | Custom state string
        String userId = "userId_example"; // String | Identifies a user for whom a secondary account is being added. Should be used only when `userAccount=secondary` and user cookie is not present in the request. Works in conjunction with `timestamp` and `userSignature` to authorize the addition of secondary account.
        Long timestamp = 56L; // Long | Request timestamp in seconds. Should be used only when `userAccount=secondary` and user cookie is not present in the request. Works in conjunction with `userId` and `userSignature` to authorize the addition of secondary account.
        String userSignature = "userSignature_example"; // String | A string that is generated by concatenating `userId` and `timestamp`, then hashing with HmacSHA256 using the application's `clientSecret`, then encoding in Hex, base64, or base64 web format. Should be used only when `userAccount=secondary` and user cookie is not present in the request Works in conjunction with `userId` and `timestamp` to authorize the addition of secondary account.
        String serverUrl = "serverUrl_example"; // String | Can be used in the form-based authentication to specify the URL of the server to which the user intends to authenticate. When included, it automatically populates the corresponding input field on the authentication form.
        Boolean ensureScopes = true; // Boolean | When set to true, Aurinko will check if a user granted all requested permissions.
        Boolean ensureAccess = true; // Boolean | When set to true, Aurinko will check if a user has access to the requested resources. Supported only for Google and Office365, and only for Email, Calendar, Contacts and Tasks APIs.
        String token = "token_example"; // String | Token from the /auth/prepare endpoint.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.authorizeUserWithHttpInfo(clientId, serviceType, returnUrl, accountRole, mailboxInfo, scopes, nativeScopes, responseType, accountId, loginHint, state, userId, timestamp, userSignature, serverUrl, ensureScopes, ensureAccess, token);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AuthApi#authorizeUser");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#authorizeUser");
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
| **clientId** | **String**| Application Client Id from the Aurinko portal dashboard. | |
| **serviceType** | [**ServiceTypeNonDaemon**](.md)|  | [enum: Google, Office365, EWS, IMAP, Salesforce, Salesflare, Repfabric, Slack, SugarCRM, HighLevel, Hubspot, Zoom, Webex, WebexBot, Pipedrive, EclipseERP, AutoQuotes, Teamwork, NetSuite, SpecPath, Zoho, Clientify, QuickBooks, ActiveCampaign, Creatio, ConstantContact, Fishbowl, iCloud] |
| **returnUrl** | **String**| Return/Callback url for receiving the authorization code or token. It must be registered on the settings page in Aurinko portal. | |
| **accountRole** | **String**| The account&#39;s role in relation to a User. Use &#x60;primary&#x60; for the account to act as a key account; this will create a new User if the primary account doesn&#39;t exist already. If the primary account exists, it&#39;s simply re-authorized without creating a new user. Choose &#x60;secondary&#x60; to associate the account with an already existing User, which requires either existing User cookie or &#x60;userId&#x60; + &#x60;userSignature&#x60; for identification. | [enum: primary, secondary] |
| **mailboxInfo** | **String**| Relevant only for cookie-based authentication in multi-client setups. When different client apps are connected to a single Aurinko application, this string (commonly the user&#39;s email, but can be any unique identifier) is combined with \&quot;clientId\&quot; to create a distinct authentication cookie name and prevent cookie conflicts. Clients using cookie-based auth must send \&quot;clientId\&quot; and \&quot;mailboxInfo\&quot; via \&quot;X-Aurinko-Client-Id\&quot; and \&quot;X-Aurinko-Mailbox-Info\&quot; HTTP headers for accurate cookie identification. | [optional] |
| **scopes** | [**List&lt;Scope&gt;**](Scope.md)| Space separated list of Aurinko defined scopes. | [optional] |
| **nativeScopes** | [**List&lt;String&gt;**](String.md)| Space separated list of provider defined scopes | [optional] |
| **responseType** | **String**| The type of response expected from the user authorization flow. For &#x60;primary&#x60; accounts, choose &#x60;cookie&#x60; or &#x60;code&#x60;, for &#x60;secondary&#x60; accounts, choose &#x60;none&#x60;. &#x60;cookie&#x60; will set a cookie in the user&#39;s browser in the callback, &#x60;code&#x60; will return a temporary code that can be exchanged for a user session token using the /auth/token endpoint. &#x60;none&#x60; will return only the status of the operation and information about an occurred error. Because &#x60;secondary&#x60; accounts are linked to an existing and authorized User, they don&#39;t need to receive a token or cookie in the callback. | [optional] [default to cookie] [enum: cookie, code, none] |
| **accountId** | **Long**| For re-authorizing an existing &#x60;secondary&#x60; account. | [optional] |
| **loginHint** | **String**| Is passed as \&quot;login_hint\&quot; in OAuth flows, suggesting user identity for a smoother login process. | [optional] |
| **state** | **String**| Custom state string | [optional] |
| **userId** | **String**| Identifies a user for whom a secondary account is being added. Should be used only when &#x60;userAccount&#x3D;secondary&#x60; and user cookie is not present in the request. Works in conjunction with &#x60;timestamp&#x60; and &#x60;userSignature&#x60; to authorize the addition of secondary account. | [optional] |
| **timestamp** | **Long**| Request timestamp in seconds. Should be used only when &#x60;userAccount&#x3D;secondary&#x60; and user cookie is not present in the request. Works in conjunction with &#x60;userId&#x60; and &#x60;userSignature&#x60; to authorize the addition of secondary account. | [optional] |
| **userSignature** | **String**| A string that is generated by concatenating &#x60;userId&#x60; and &#x60;timestamp&#x60;, then hashing with HmacSHA256 using the application&#39;s &#x60;clientSecret&#x60;, then encoding in Hex, base64, or base64 web format. Should be used only when &#x60;userAccount&#x3D;secondary&#x60; and user cookie is not present in the request Works in conjunction with &#x60;userId&#x60; and &#x60;timestamp&#x60; to authorize the addition of secondary account. | [optional] |
| **serverUrl** | **String**| Can be used in the form-based authentication to specify the URL of the server to which the user intends to authenticate. When included, it automatically populates the corresponding input field on the authentication form. | [optional] |
| **ensureScopes** | **Boolean**| When set to true, Aurinko will check if a user granted all requested permissions. | [optional] |
| **ensureAccess** | **Boolean**| When set to true, Aurinko will check if a user has access to the requested resources. Supported only for Google and Office365, and only for Email, Calendar, Contacts and Tasks APIs. | [optional] |
| **token** | **String**| Token from the /auth/prepare endpoint. | [optional] |

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


## prepareAuth

> CompletableFuture<PreparedAuthToken> prepareAuth()

Validate an external identity token

This method is for Office365 web add-ins that want to implement external authentication based on [Exchange Identity Token](https://learn.microsoft.com/en-us/office/dev/add-ins/outlook/inside-the-identity-token).  Here are the steps involved in establishing an Aurinko User session:  1. Your Office 365 web add-in gets the Exchange identity token (see the link above for how it is done).  2. Makes a POST call to the &#x60;/auth/prepare&#x60; endpoint with the following HTTP headers:   - &#x60;X-Aurinko-Auth-Type&#x60;: &#x60;exchangeIdToken&#x60;   - &#x60;Authorization&#x60;: &#x60;Bearer &lt;your_exchange_id_token&gt;&#x60;       Auriko validates the identity token and provides a temporary token if the ID is valid:      &#x60;{ \&quot;token\&quot;: \&quot;your-temporary-token\&quot; }&#x60;  3. The addin then calls the &#x60;/authorizeUser&#x60; endpoint with the temporary token, using the query parameter    &#x60;?token&#x3D;your-temporary-token&#x60;.  Upon successful completion of the steps a new Aurinko User is created or an existing User is re-authorized. And from now on this identity token is recognized by Aurinko and is associated with the User session.  From here on the add-in can access Aurinko API with its Exchange identity token, this way:  - &#x60;X-Aurinko-Auth-Type&#x60;: &#x60;exchangeIdToken&#x60; - &#x60;Authorization&#x60;: &#x60;Bearer &lt;your_exchange_id_token&gt;&#x60; 

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

        AuthApi apiInstance = new AuthApi(defaultClient);
        try {
            CompletableFuture<PreparedAuthToken> result = apiInstance.prepareAuth();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#prepareAuth");
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

CompletableFuture<[**PreparedAuthToken**](PreparedAuthToken.md)>


### Authorization

[UserSessionHeader](../README.md#UserSessionHeader), [AuthTypeHeader](../README.md#AuthTypeHeader), [AppAuth](../README.md#AppAuth), [AccountToken](../README.md#AccountToken), [AccountIdHeader](../README.md#AccountIdHeader), [ClientIdHeader](../README.md#ClientIdHeader), [UserSessionCookie](../README.md#UserSessionCookie), [ExchangeIdToken](../README.md#ExchangeIdToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## prepareAuthWithHttpInfo

> CompletableFuture<ApiResponse<PreparedAuthToken>> prepareAuth prepareAuthWithHttpInfo()

Validate an external identity token

This method is for Office365 web add-ins that want to implement external authentication based on [Exchange Identity Token](https://learn.microsoft.com/en-us/office/dev/add-ins/outlook/inside-the-identity-token).  Here are the steps involved in establishing an Aurinko User session:  1. Your Office 365 web add-in gets the Exchange identity token (see the link above for how it is done).  2. Makes a POST call to the &#x60;/auth/prepare&#x60; endpoint with the following HTTP headers:   - &#x60;X-Aurinko-Auth-Type&#x60;: &#x60;exchangeIdToken&#x60;   - &#x60;Authorization&#x60;: &#x60;Bearer &lt;your_exchange_id_token&gt;&#x60;       Auriko validates the identity token and provides a temporary token if the ID is valid:      &#x60;{ \&quot;token\&quot;: \&quot;your-temporary-token\&quot; }&#x60;  3. The addin then calls the &#x60;/authorizeUser&#x60; endpoint with the temporary token, using the query parameter    &#x60;?token&#x3D;your-temporary-token&#x60;.  Upon successful completion of the steps a new Aurinko User is created or an existing User is re-authorized. And from now on this identity token is recognized by Aurinko and is associated with the User session.  From here on the add-in can access Aurinko API with its Exchange identity token, this way:  - &#x60;X-Aurinko-Auth-Type&#x60;: &#x60;exchangeIdToken&#x60; - &#x60;Authorization&#x60;: &#x60;Bearer &lt;your_exchange_id_token&gt;&#x60; 

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

        AuthApi apiInstance = new AuthApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<PreparedAuthToken>> response = apiInstance.prepareAuthWithHttpInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AuthApi#prepareAuth");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#prepareAuth");
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

CompletableFuture<ApiResponse<[**PreparedAuthToken**](PreparedAuthToken.md)>>


### Authorization

[UserSessionHeader](../README.md#UserSessionHeader), [AuthTypeHeader](../README.md#AuthTypeHeader), [AppAuth](../README.md#AppAuth), [AccountToken](../README.md#AccountToken), [AccountIdHeader](../README.md#AccountIdHeader), [ClientIdHeader](../README.md#ClientIdHeader), [UserSessionCookie](../README.md#UserSessionCookie), [ExchangeIdToken](../README.md#ExchangeIdToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


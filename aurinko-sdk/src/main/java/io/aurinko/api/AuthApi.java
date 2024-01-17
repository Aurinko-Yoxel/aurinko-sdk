/*
 * Aurinko.io API
 * ## Introduction The Aurinko API is a unified API platform allowing developers to quickly build integrations with many mailbox providers and services like Google, Office 365, Outlook.com, MS Exchange, IMAP. The unified API abstracts away differences between many email, calendar, contact, task APIs to make it easy to connect and sync the mailbox data.  The Aurinko API's focus is convenient and reliable data synchronization for all supported data categories (email, calendar, contacts, tasks) so the API provides methods to receive changes/deltas and be notified of the changes (through webhooks) in a unified manner. The API's sync/deltas model should allow developers to build reliable event based solutions easily.  The Aurinko API is built on HTTP. Our API is RESTful. It has predictable resource URLs. It returns HTTP response codes to indicate errors. It also accepts and returns JSON in the HTTP body.  ## API Authentication When you [sign up for an account](https://app.aurinko.io/#/signUp), you are given a Client Id and Secret for every application that you create. You use those to go through OAuth flows that allow you to start syncing remote account data through Aurinko. An account OAuth flow can be started with just the Client Id and the Client Secret will be required to obtain an account access token in the \"authorization code\" flow (\"implicit grant\" flow does is secured by the \"trusted domains\" setting).  Aurinko offers two forms of authentication:  - `Basic <Client Id, Client Secret>` - used for authentication flows and administrative requests made from the server side. - `Bearer <Account Access Token>` - used for working with an account data. - `Api Key in Cookie` - for in-browser apps that use Aurinko as their backend API with user sessions. - `Api Key in Header (X-Aurinko-Session)` - for server side apps that need user sessions  Never share your client secret or access token. Keep them guarded and secure.  ## Getting Started Guide If you have a use case you would like to implement, please consult us for feedback on the best API operations for the task.  [Click here to visit our API Guides](https://docs.aurinko.io/ctg-getting-started/getting-started). 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@aurinko.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.aurinko.api;

import io.aurinko.client.ApiClient;
import io.aurinko.client.ApiException;
import io.aurinko.client.ApiResponse;
import io.aurinko.client.Pair;

import io.aurinko.client.model.AccountSaveResult;
import io.aurinko.client.model.Scope;
import io.aurinko.client.model.ServiceTypeDaemon;
import io.aurinko.client.model.ServiceTypeNonDaemon;
import io.aurinko.client.model.UserAccountType;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import java.util.concurrent.CompletableFuture;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T11:18:51.511282Z[Africa/Bamako]")
public class AuthApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public AuthApi() {
    this(new ApiClient());
  }

  public AuthApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  private ApiException getApiException(String operationId, HttpResponse<String> response) {
    String message = formatExceptionMessage(operationId, response.statusCode(), response.body());
    return new ApiException(response.statusCode(), message, response.headers(), response.body());
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Request an access token
   * 
   * @param code A code returned by /authorize (required)
   * @return CompletableFuture&lt;AccountSaveResult&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<AccountSaveResult> authCodeExchange(String code) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = authCodeExchangeRequestBuilder(code);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("authCodeExchange", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<AccountSaveResult>() {})
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * Request an access token
   * 
   * @param code A code returned by /authorize (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AccountSaveResult&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<AccountSaveResult>> authCodeExchangeWithHttpInfo(String code) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = authCodeExchangeRequestBuilder(code);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("authCodeExchange", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<AccountSaveResult>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<AccountSaveResult>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder authCodeExchangeRequestBuilder(String code) throws ApiException {
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling authCodeExchange");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/auth/token/{code}"
        .replace("{code}", ApiClient.urlEncode(code.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Start an account authentication flow
   * 
   * @param clientId Application client Id (required)
   * @param serviceType  (required)
   * @param returnUrl Redirect/callback url (required)
   * @param mailboxInfo  (optional)
   * @param scopes Space separated list of scopes (optional
   * @param nativeScopes  (optional
   * @param responseType  (optional, default to code)
   * @param accountId When re-authorizing an existing account (optional)
   * @param loginHint  (optional)
   * @param state Custom state string (optional)
   * @param fromPortal  (optional)
   * @param clientOrgId  (optional)
   * @param userAccount  (optional)
   * @param userId  (optional)
   * @param timestamp  (optional)
   * @param userSignature  (optional)
   * @param sandbox  (optional)
   * @param communityUrl  (optional)
   * @param checkServiceAccount  (optional)
   * @param serverUrl  (optional)
   * @param ensureScopes When set to true, raises an error if any of the requested scopes are not granted by the user (optional)
   * @return CompletableFuture&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Void> authorize(String clientId, ServiceTypeNonDaemon serviceType, String returnUrl, String mailboxInfo, List<Scope> scopes, List<String> nativeScopes, String responseType, Long accountId, String loginHint, String state, Boolean fromPortal, String clientOrgId, UserAccountType userAccount, String userId, Long timestamp, String userSignature, Boolean sandbox, String communityUrl, Boolean checkServiceAccount, String serverUrl, Boolean ensureScopes) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = authorizeRequestBuilder(clientId, serviceType, returnUrl, mailboxInfo, scopes, nativeScopes, responseType, accountId, loginHint, state, fromPortal, clientOrgId, userAccount, userId, timestamp, userSignature, sandbox, communityUrl, checkServiceAccount, serverUrl, ensureScopes);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("authorize", localVarResponse));
            }
            return CompletableFuture.completedFuture(null);
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * Start an account authentication flow
   * 
   * @param clientId Application client Id (required)
   * @param serviceType  (required)
   * @param returnUrl Redirect/callback url (required)
   * @param mailboxInfo  (optional)
   * @param scopes Space separated list of scopes (optional
   * @param nativeScopes  (optional
   * @param responseType  (optional, default to code)
   * @param accountId When re-authorizing an existing account (optional)
   * @param loginHint  (optional)
   * @param state Custom state string (optional)
   * @param fromPortal  (optional)
   * @param clientOrgId  (optional)
   * @param userAccount  (optional)
   * @param userId  (optional)
   * @param timestamp  (optional)
   * @param userSignature  (optional)
   * @param sandbox  (optional)
   * @param communityUrl  (optional)
   * @param checkServiceAccount  (optional)
   * @param serverUrl  (optional)
   * @param ensureScopes When set to true, raises an error if any of the requested scopes are not granted by the user (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<Void>> authorizeWithHttpInfo(String clientId, ServiceTypeNonDaemon serviceType, String returnUrl, String mailboxInfo, List<Scope> scopes, List<String> nativeScopes, String responseType, Long accountId, String loginHint, String state, Boolean fromPortal, String clientOrgId, UserAccountType userAccount, String userId, Long timestamp, String userSignature, Boolean sandbox, String communityUrl, Boolean checkServiceAccount, String serverUrl, Boolean ensureScopes) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = authorizeRequestBuilder(clientId, serviceType, returnUrl, mailboxInfo, scopes, nativeScopes, responseType, accountId, loginHint, state, fromPortal, clientOrgId, userAccount, userId, timestamp, userSignature, sandbox, communityUrl, checkServiceAccount, serverUrl, ensureScopes);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("authorize", localVarResponse));
            }
            return CompletableFuture.completedFuture(
                new ApiResponse<Void>(localVarResponse.statusCode(), localVarResponse.headers().map(), null)
            );
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder authorizeRequestBuilder(String clientId, ServiceTypeNonDaemon serviceType, String returnUrl, String mailboxInfo, List<Scope> scopes, List<String> nativeScopes, String responseType, Long accountId, String loginHint, String state, Boolean fromPortal, String clientOrgId, UserAccountType userAccount, String userId, Long timestamp, String userSignature, Boolean sandbox, String communityUrl, Boolean checkServiceAccount, String serverUrl, Boolean ensureScopes) throws ApiException {
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling authorize");
    }
    // verify the required parameter 'serviceType' is set
    if (serviceType == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceType' when calling authorize");
    }
    // verify the required parameter 'returnUrl' is set
    if (returnUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'returnUrl' when calling authorize");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/auth/authorize";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "clientId";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("clientId", clientId));
    localVarQueryParameterBaseName = "mailboxInfo";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("mailboxInfo", mailboxInfo));
    localVarQueryParameterBaseName = "serviceType";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("serviceType", serviceType));
    localVarQueryParameterBaseName = "scopes";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "scopes", scopes));
    localVarQueryParameterBaseName = "nativeScopes";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "nativeScopes", nativeScopes));
    localVarQueryParameterBaseName = "responseType";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("responseType", responseType));
    localVarQueryParameterBaseName = "accountId";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("accountId", accountId));
    localVarQueryParameterBaseName = "loginHint";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("loginHint", loginHint));
    localVarQueryParameterBaseName = "returnUrl";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("returnUrl", returnUrl));
    localVarQueryParameterBaseName = "state";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("state", state));
    localVarQueryParameterBaseName = "fromPortal";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("fromPortal", fromPortal));
    localVarQueryParameterBaseName = "clientOrgId";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("clientOrgId", clientOrgId));
    localVarQueryParameterBaseName = "userAccount";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("userAccount", userAccount));
    localVarQueryParameterBaseName = "userId";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("userId", userId));
    localVarQueryParameterBaseName = "timestamp";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("timestamp", timestamp));
    localVarQueryParameterBaseName = "userSignature";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("userSignature", userSignature));
    localVarQueryParameterBaseName = "sandbox";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("sandbox", sandbox));
    localVarQueryParameterBaseName = "communityUrl";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("communityUrl", communityUrl));
    localVarQueryParameterBaseName = "checkServiceAccount";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("checkServiceAccount", checkServiceAccount));
    localVarQueryParameterBaseName = "serverUrl";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("serverUrl", serverUrl));
    localVarQueryParameterBaseName = "ensureScopes";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("ensureScopes", ensureScopes));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Start an service/daemon account authentication flow
   * 
   * @param clientId Application client Id (required)
   * @param serviceType  (required)
   * @param returnUrl Redirect/callback url (required)
   * @param mailboxInfo  (optional)
   * @param scopes Space separated list of scopes (optional
   * @param nativeScopes  (optional
   * @param responseType  (optional, default to code)
   * @param accountId When re-authorizing an existing account (optional)
   * @param state Custom state string (optional)
   * @param fromPortal  (optional)
   * @param clientOrgId  (optional)
   * @param ensureScopes When set to true, raises an error if any of the requested scopes are not granted by the user (optional)
   * @return CompletableFuture&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Void> authorizeDaemon(String clientId, ServiceTypeDaemon serviceType, String returnUrl, String mailboxInfo, List<Scope> scopes, List<String> nativeScopes, String responseType, Long accountId, String state, Boolean fromPortal, String clientOrgId, Boolean ensureScopes) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = authorizeDaemonRequestBuilder(clientId, serviceType, returnUrl, mailboxInfo, scopes, nativeScopes, responseType, accountId, state, fromPortal, clientOrgId, ensureScopes);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("authorizeDaemon", localVarResponse));
            }
            return CompletableFuture.completedFuture(null);
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * Start an service/daemon account authentication flow
   * 
   * @param clientId Application client Id (required)
   * @param serviceType  (required)
   * @param returnUrl Redirect/callback url (required)
   * @param mailboxInfo  (optional)
   * @param scopes Space separated list of scopes (optional
   * @param nativeScopes  (optional
   * @param responseType  (optional, default to code)
   * @param accountId When re-authorizing an existing account (optional)
   * @param state Custom state string (optional)
   * @param fromPortal  (optional)
   * @param clientOrgId  (optional)
   * @param ensureScopes When set to true, raises an error if any of the requested scopes are not granted by the user (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<Void>> authorizeDaemonWithHttpInfo(String clientId, ServiceTypeDaemon serviceType, String returnUrl, String mailboxInfo, List<Scope> scopes, List<String> nativeScopes, String responseType, Long accountId, String state, Boolean fromPortal, String clientOrgId, Boolean ensureScopes) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = authorizeDaemonRequestBuilder(clientId, serviceType, returnUrl, mailboxInfo, scopes, nativeScopes, responseType, accountId, state, fromPortal, clientOrgId, ensureScopes);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("authorizeDaemon", localVarResponse));
            }
            return CompletableFuture.completedFuture(
                new ApiResponse<Void>(localVarResponse.statusCode(), localVarResponse.headers().map(), null)
            );
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder authorizeDaemonRequestBuilder(String clientId, ServiceTypeDaemon serviceType, String returnUrl, String mailboxInfo, List<Scope> scopes, List<String> nativeScopes, String responseType, Long accountId, String state, Boolean fromPortal, String clientOrgId, Boolean ensureScopes) throws ApiException {
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling authorizeDaemon");
    }
    // verify the required parameter 'serviceType' is set
    if (serviceType == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceType' when calling authorizeDaemon");
    }
    // verify the required parameter 'returnUrl' is set
    if (returnUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'returnUrl' when calling authorizeDaemon");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/auth/authorizeDaemon";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "clientId";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("clientId", clientId));
    localVarQueryParameterBaseName = "mailboxInfo";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("mailboxInfo", mailboxInfo));
    localVarQueryParameterBaseName = "serviceType";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("serviceType", serviceType));
    localVarQueryParameterBaseName = "scopes";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "scopes", scopes));
    localVarQueryParameterBaseName = "nativeScopes";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "nativeScopes", nativeScopes));
    localVarQueryParameterBaseName = "responseType";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("responseType", responseType));
    localVarQueryParameterBaseName = "accountId";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("accountId", accountId));
    localVarQueryParameterBaseName = "returnUrl";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("returnUrl", returnUrl));
    localVarQueryParameterBaseName = "state";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("state", state));
    localVarQueryParameterBaseName = "fromPortal";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("fromPortal", fromPortal));
    localVarQueryParameterBaseName = "clientOrgId";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("clientOrgId", clientOrgId));
    localVarQueryParameterBaseName = "ensureScopes";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("ensureScopes", ensureScopes));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Get access token, Deprecated use POST instead
   * 
   * @param code A code returned by /authorize (required)
   * @return CompletableFuture&lt;AccountSaveResult&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<AccountSaveResult> getAccessTokenByCode(String code) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getAccessTokenByCodeRequestBuilder(code);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getAccessTokenByCode", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<AccountSaveResult>() {})
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * Get access token, Deprecated use POST instead
   * 
   * @param code A code returned by /authorize (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AccountSaveResult&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<AccountSaveResult>> getAccessTokenByCodeWithHttpInfo(String code) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getAccessTokenByCodeRequestBuilder(code);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getAccessTokenByCode", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<AccountSaveResult>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<AccountSaveResult>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder getAccessTokenByCodeRequestBuilder(String code) throws ApiException {
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling getAccessTokenByCode");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/auth/token/{code}"
        .replace("{code}", ApiClient.urlEncode(code.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}

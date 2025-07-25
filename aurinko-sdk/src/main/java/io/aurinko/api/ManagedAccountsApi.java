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
import io.aurinko.client.Configuration;
import io.aurinko.client.Pair;

import io.aurinko.client.model.AccountSaveResult;
import io.aurinko.client.model.ApiAccountInDto;
import io.aurinko.client.model.ServiceKey;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class ManagedAccountsApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public ManagedAccountsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ManagedAccountsApi(ApiClient apiClient) {
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
   * Upsert a managed account
   * 
   * @param accId A service account id (required)
   * @param userAccount  (optional)
   * @param userId  (optional)
   * @param recycleKeys  (optional)
   * @param ensureAccess When set to true, Aurinko will check if a user has access to the requested resources. Supported only for Google and Office365, and only for Email, Calendar, Contacts and Tasks APIs. (optional)
   * @param apiAccountInDto  (optional)
   * @return CompletableFuture&lt;AccountSaveResult&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<AccountSaveResult> upsertManagedAccount(@javax.annotation.Nonnull Long accId, @javax.annotation.Nullable UserAccountType userAccount, @javax.annotation.Nullable String userId, @javax.annotation.Nullable List<ServiceKey> recycleKeys, @javax.annotation.Nullable Boolean ensureAccess, @javax.annotation.Nullable ApiAccountInDto apiAccountInDto) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = upsertManagedAccountRequestBuilder(accId, userAccount, userId, recycleKeys, ensureAccess, apiAccountInDto);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("upsertManagedAccount", localVarResponse));
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
   * Upsert a managed account
   * 
   * @param accId A service account id (required)
   * @param userAccount  (optional)
   * @param userId  (optional)
   * @param recycleKeys  (optional)
   * @param ensureAccess When set to true, Aurinko will check if a user has access to the requested resources. Supported only for Google and Office365, and only for Email, Calendar, Contacts and Tasks APIs. (optional)
   * @param apiAccountInDto  (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;AccountSaveResult&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<AccountSaveResult>> upsertManagedAccountWithHttpInfo(@javax.annotation.Nonnull Long accId, @javax.annotation.Nullable UserAccountType userAccount, @javax.annotation.Nullable String userId, @javax.annotation.Nullable List<ServiceKey> recycleKeys, @javax.annotation.Nullable Boolean ensureAccess, @javax.annotation.Nullable ApiAccountInDto apiAccountInDto) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = upsertManagedAccountRequestBuilder(accId, userAccount, userId, recycleKeys, ensureAccess, apiAccountInDto);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("upsertManagedAccount", localVarResponse));
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

  private HttpRequest.Builder upsertManagedAccountRequestBuilder(@javax.annotation.Nonnull Long accId, @javax.annotation.Nullable UserAccountType userAccount, @javax.annotation.Nullable String userId, @javax.annotation.Nullable List<ServiceKey> recycleKeys, @javax.annotation.Nullable Boolean ensureAccess, @javax.annotation.Nullable ApiAccountInDto apiAccountInDto) throws ApiException {
    // verify the required parameter 'accId' is set
    if (accId == null) {
      throw new ApiException(400, "Missing the required parameter 'accId' when calling upsertManagedAccount");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/am/svc_accounts/{accId}/accounts"
        .replace("{accId}", ApiClient.urlEncode(accId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "userAccount";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("userAccount", userAccount));
    localVarQueryParameterBaseName = "userId";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("userId", userId));
    localVarQueryParameterBaseName = "recycleKeys";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "recycleKeys", recycleKeys));
    localVarQueryParameterBaseName = "ensureAccess";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("ensureAccess", ensureAccess));

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

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(apiAccountInDto);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

}

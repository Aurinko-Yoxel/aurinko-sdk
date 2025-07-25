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

import io.aurinko.client.model.DeletedPage;
import io.aurinko.client.model.EventsPage;
import java.time.OffsetDateTime;
import io.aurinko.client.model.SyncStatus;

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
public class CalSyncApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public CalSyncApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CalSyncApi(ApiClient apiClient) {
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
   * Request deleted events (deltas)
   * 
   * @param calendarId Calendar id (required)
   * @param deltaToken A token received as nextDeltaToken from a previous sync request or a start sync request (optional)
   * @param pageToken A token received as nextPageToken from a previous page request (optional)
   * @return CompletableFuture&lt;DeletedPage&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<DeletedPage> calSyncDeleted(@javax.annotation.Nonnull String calendarId, @javax.annotation.Nullable String deltaToken, @javax.annotation.Nullable String pageToken) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = calSyncDeletedRequestBuilder(calendarId, deltaToken, pageToken);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("calSyncDeleted", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<DeletedPage>() {})
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
   * Request deleted events (deltas)
   * 
   * @param calendarId Calendar id (required)
   * @param deltaToken A token received as nextDeltaToken from a previous sync request or a start sync request (optional)
   * @param pageToken A token received as nextPageToken from a previous page request (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;DeletedPage&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<DeletedPage>> calSyncDeletedWithHttpInfo(@javax.annotation.Nonnull String calendarId, @javax.annotation.Nullable String deltaToken, @javax.annotation.Nullable String pageToken) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = calSyncDeletedRequestBuilder(calendarId, deltaToken, pageToken);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("calSyncDeleted", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<DeletedPage>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<DeletedPage>() {}))
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

  private HttpRequest.Builder calSyncDeletedRequestBuilder(@javax.annotation.Nonnull String calendarId, @javax.annotation.Nullable String deltaToken, @javax.annotation.Nullable String pageToken) throws ApiException {
    // verify the required parameter 'calendarId' is set
    if (calendarId == null) {
      throw new ApiException(400, "Missing the required parameter 'calendarId' when calling calSyncDeleted");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/calendars/{calendarId}/sync/deleted"
        .replace("{calendarId}", ApiClient.urlEncode(calendarId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "deltaToken";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("deltaToken", deltaToken));
    localVarQueryParameterBaseName = "pageToken";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("pageToken", pageToken));

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
   * Start a new calendar sync
   * 
   * @param calendarId Calendar id (required)
   * @param timeMin Lower bound (exclusive) for an event&#39;s end time to filter by. Must be an RFC3339 timestamp with mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. If timeMax is set, timeMin must be smaller than timeMax.  (required)
   * @param timeMax Upper bound (exclusive) for an event&#39;s start time to filter by. Must be an RFC3339 timestamp with mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If timeMin is set, timeMax must be greater than timeMin.  (required)
   * @return CompletableFuture&lt;SyncStatus&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<SyncStatus> calSyncStart(@javax.annotation.Nonnull String calendarId, @javax.annotation.Nonnull OffsetDateTime timeMin, @javax.annotation.Nonnull OffsetDateTime timeMax) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = calSyncStartRequestBuilder(calendarId, timeMin, timeMax);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("calSyncStart", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<SyncStatus>() {})
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
   * Start a new calendar sync
   * 
   * @param calendarId Calendar id (required)
   * @param timeMin Lower bound (exclusive) for an event&#39;s end time to filter by. Must be an RFC3339 timestamp with mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. If timeMax is set, timeMin must be smaller than timeMax.  (required)
   * @param timeMax Upper bound (exclusive) for an event&#39;s start time to filter by. Must be an RFC3339 timestamp with mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If timeMin is set, timeMax must be greater than timeMin.  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SyncStatus&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<SyncStatus>> calSyncStartWithHttpInfo(@javax.annotation.Nonnull String calendarId, @javax.annotation.Nonnull OffsetDateTime timeMin, @javax.annotation.Nonnull OffsetDateTime timeMax) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = calSyncStartRequestBuilder(calendarId, timeMin, timeMax);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("calSyncStart", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<SyncStatus>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<SyncStatus>() {}))
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

  private HttpRequest.Builder calSyncStartRequestBuilder(@javax.annotation.Nonnull String calendarId, @javax.annotation.Nonnull OffsetDateTime timeMin, @javax.annotation.Nonnull OffsetDateTime timeMax) throws ApiException {
    // verify the required parameter 'calendarId' is set
    if (calendarId == null) {
      throw new ApiException(400, "Missing the required parameter 'calendarId' when calling calSyncStart");
    }
    // verify the required parameter 'timeMin' is set
    if (timeMin == null) {
      throw new ApiException(400, "Missing the required parameter 'timeMin' when calling calSyncStart");
    }
    // verify the required parameter 'timeMax' is set
    if (timeMax == null) {
      throw new ApiException(400, "Missing the required parameter 'timeMax' when calling calSyncStart");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/calendars/{calendarId}/sync"
        .replace("{calendarId}", ApiClient.urlEncode(calendarId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "timeMin";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("timeMin", timeMin));
    localVarQueryParameterBaseName = "timeMax";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("timeMax", timeMax));

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
   * Request changed events (deltas)
   * 
   * @param calendarId Calendar id (required)
   * @param deltaToken A token received as nextDeltaToken from a previous sync request or a start sync request (optional)
   * @param pageToken A token received as nextPageToken from a previous page request (optional)
   * @return CompletableFuture&lt;EventsPage&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<EventsPage> calSyncUpdated(@javax.annotation.Nonnull String calendarId, @javax.annotation.Nullable String deltaToken, @javax.annotation.Nullable String pageToken) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = calSyncUpdatedRequestBuilder(calendarId, deltaToken, pageToken);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("calSyncUpdated", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<EventsPage>() {})
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
   * Request changed events (deltas)
   * 
   * @param calendarId Calendar id (required)
   * @param deltaToken A token received as nextDeltaToken from a previous sync request or a start sync request (optional)
   * @param pageToken A token received as nextPageToken from a previous page request (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;EventsPage&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<EventsPage>> calSyncUpdatedWithHttpInfo(@javax.annotation.Nonnull String calendarId, @javax.annotation.Nullable String deltaToken, @javax.annotation.Nullable String pageToken) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = calSyncUpdatedRequestBuilder(calendarId, deltaToken, pageToken);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("calSyncUpdated", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<EventsPage>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<EventsPage>() {}))
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

  private HttpRequest.Builder calSyncUpdatedRequestBuilder(@javax.annotation.Nonnull String calendarId, @javax.annotation.Nullable String deltaToken, @javax.annotation.Nullable String pageToken) throws ApiException {
    // verify the required parameter 'calendarId' is set
    if (calendarId == null) {
      throw new ApiException(400, "Missing the required parameter 'calendarId' when calling calSyncUpdated");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/calendars/{calendarId}/sync/updated"
        .replace("{calendarId}", ApiClient.urlEncode(calendarId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "deltaToken";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("deltaToken", deltaToken));
    localVarQueryParameterBaseName = "pageToken";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("pageToken", pageToken));

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

}

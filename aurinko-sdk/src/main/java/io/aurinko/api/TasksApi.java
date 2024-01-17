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

import io.aurinko.client.model.OkResponse;
import io.aurinko.client.model.Task;
import io.aurinko.client.model.TaskCreate;
import io.aurinko.client.model.TaskCreateResponse;
import io.aurinko.client.model.TaskUpdate;
import io.aurinko.client.model.TaskUpdateResponse;
import io.aurinko.client.model.TasksPage;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-09T14:13:35.152987Z[Africa/Bamako]")
public class TasksApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public TasksApi() {
    this(new ApiClient());
  }

  public TasksApi(ApiClient apiClient) {
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
   * Create a task
   * 
   * @param taskListId Task list id (required)
   * @param taskCreate  (optional)
   * @return CompletableFuture&lt;TaskCreateResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<TaskCreateResponse> createTask(String taskListId, TaskCreate taskCreate) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = createTaskRequestBuilder(taskListId, taskCreate);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("createTask", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<TaskCreateResponse>() {})
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
   * Create a task
   * 
   * @param taskListId Task list id (required)
   * @param taskCreate  (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;TaskCreateResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<TaskCreateResponse>> createTaskWithHttpInfo(String taskListId, TaskCreate taskCreate) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = createTaskRequestBuilder(taskListId, taskCreate);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("createTask", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<TaskCreateResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<TaskCreateResponse>() {}))
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

  private HttpRequest.Builder createTaskRequestBuilder(String taskListId, TaskCreate taskCreate) throws ApiException {
    // verify the required parameter 'taskListId' is set
    if (taskListId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskListId' when calling createTask");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/tasklists/{taskListId}/tasks"
        .replace("{taskListId}", ApiClient.urlEncode(taskListId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(taskCreate);
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
  /**
   * Delete a task list by id
   * 
   * @param taskListId Task list id (required)
   * @param id Task id (required)
   * @return CompletableFuture&lt;OkResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<OkResponse> deleteTask(String taskListId, String id) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = deleteTaskRequestBuilder(taskListId, id);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("deleteTask", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<OkResponse>() {})
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
   * Delete a task list by id
   * 
   * @param taskListId Task list id (required)
   * @param id Task id (required)
   * @return CompletableFuture&lt;ApiResponse&lt;OkResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<OkResponse>> deleteTaskWithHttpInfo(String taskListId, String id) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = deleteTaskRequestBuilder(taskListId, id);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("deleteTask", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<OkResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<OkResponse>() {}))
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

  private HttpRequest.Builder deleteTaskRequestBuilder(String taskListId, String id) throws ApiException {
    // verify the required parameter 'taskListId' is set
    if (taskListId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskListId' when calling deleteTask");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteTask");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/tasklists/{taskListId}/tasks/{id}"
        .replace("{taskListId}", ApiClient.urlEncode(taskListId.toString()))
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Request a task by id
   * 
   * @param taskListId Task list id (required)
   * @param id Task id (required)
   * @return CompletableFuture&lt;Task&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<Task> task(String taskListId, String id) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = taskRequestBuilder(taskListId, id);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("task", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<Task>() {})
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
   * Request a task by id
   * 
   * @param taskListId Task list id (required)
   * @param id Task id (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Task&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<Task>> taskWithHttpInfo(String taskListId, String id) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = taskRequestBuilder(taskListId, id);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("task", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<Task>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<Task>() {}))
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

  private HttpRequest.Builder taskRequestBuilder(String taskListId, String id) throws ApiException {
    // verify the required parameter 'taskListId' is set
    if (taskListId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskListId' when calling task");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling task");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/tasklists/{taskListId}/tasks/{id}"
        .replace("{taskListId}", ApiClient.urlEncode(taskListId.toString()))
        .replace("{id}", ApiClient.urlEncode(id.toString()));

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
  /**
   * Request list of tasks
   * 
   * @param taskListId Task list id (required)
   * @param pageToken A token received as nextPageToken from a previous page request (for the first page it must be empty) (optional)
   * @return CompletableFuture&lt;TasksPage&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<TasksPage> tasksList(String taskListId, String pageToken) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = tasksListRequestBuilder(taskListId, pageToken);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("tasksList", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<TasksPage>() {})
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
   * Request list of tasks
   * 
   * @param taskListId Task list id (required)
   * @param pageToken A token received as nextPageToken from a previous page request (for the first page it must be empty) (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;TasksPage&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<TasksPage>> tasksListWithHttpInfo(String taskListId, String pageToken) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = tasksListRequestBuilder(taskListId, pageToken);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("tasksList", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<TasksPage>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<TasksPage>() {}))
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

  private HttpRequest.Builder tasksListRequestBuilder(String taskListId, String pageToken) throws ApiException {
    // verify the required parameter 'taskListId' is set
    if (taskListId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskListId' when calling tasksList");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/tasklists/{taskListId}/tasks"
        .replace("{taskListId}", ApiClient.urlEncode(taskListId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
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
   * Update a task
   * 
   * @param taskListId Task list id (required)
   * @param id Task id (required)
   * @param ifMatch The HTTP entity tag of the resource (ETag). Used for web cache validation. (optional)
   * @param taskUpdate  (optional)
   * @return CompletableFuture&lt;TaskUpdateResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<TaskUpdateResponse> updateTask(String taskListId, String id, String ifMatch, TaskUpdate taskUpdate) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = updateTaskRequestBuilder(taskListId, id, ifMatch, taskUpdate);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("updateTask", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<TaskUpdateResponse>() {})
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
   * Update a task
   * 
   * @param taskListId Task list id (required)
   * @param id Task id (required)
   * @param ifMatch The HTTP entity tag of the resource (ETag). Used for web cache validation. (optional)
   * @param taskUpdate  (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;TaskUpdateResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<TaskUpdateResponse>> updateTaskWithHttpInfo(String taskListId, String id, String ifMatch, TaskUpdate taskUpdate) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = updateTaskRequestBuilder(taskListId, id, ifMatch, taskUpdate);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("updateTask", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<TaskUpdateResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<TaskUpdateResponse>() {}))
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

  private HttpRequest.Builder updateTaskRequestBuilder(String taskListId, String id, String ifMatch, TaskUpdate taskUpdate) throws ApiException {
    // verify the required parameter 'taskListId' is set
    if (taskListId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskListId' when calling updateTask");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateTask");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/tasklists/{taskListId}/tasks/{id}"
        .replace("{taskListId}", ApiClient.urlEncode(taskListId.toString()))
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (ifMatch != null) {
      localVarRequestBuilder.header("If-Match", ifMatch.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(taskUpdate);
      localVarRequestBuilder.method("PATCH", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
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

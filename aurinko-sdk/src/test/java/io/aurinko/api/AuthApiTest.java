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

import io.aurinko.client.ApiException;
import io.aurinko.client.model.AccountSaveResult;
import io.aurinko.client.model.PreparedAuthToken;
import io.aurinko.client.model.Scope;
import io.aurinko.client.model.ServiceTypeDaemon;
import io.aurinko.client.model.ServiceTypeNonDaemon;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for AuthApi
 */
@Disabled
public class AuthApiTest {

    private final AuthApi api = new AuthApi();

    
    /**
     * Request an access token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authCodeExchangeTest() throws ApiException {
        String code = null;
        CompletableFuture<AccountSaveResult> response = 
        api.authCodeExchange(code);
        
        // TODO: test validations
    }
    
    /**
     * Start an account authorization flow
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authorizeTest() throws ApiException {
        String clientId = null;
        ServiceTypeNonDaemon serviceType = null;
        String returnUrl = null;
        List<Scope> scopes = null;
        List<String> nativeScopes = null;
        String responseType = null;
        Long accountId = null;
        String loginHint = null;
        String state = null;
        String clientOrgId = null;
        String serverUrl = null;
        Boolean ensureScopes = null;
        Boolean ensureAccess = null;
        Boolean recycle = null;
        String authEmail = null;
        
        CompletableFuture<Void> response = api.authorize(clientId, serviceType, returnUrl, scopes, nativeScopes, responseType, accountId, loginHint, state, clientOrgId, serverUrl, ensureScopes, ensureAccess, recycle, authEmail);
        
        // TODO: test validations
    }
    
    /**
     * Start a service/daemon account authorization flow
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authorizeDaemonTest() throws ApiException {
        String clientId = null;
        ServiceTypeDaemon serviceType = null;
        String returnUrl = null;
        List<Scope> scopes = null;
        List<String> nativeScopes = null;
        String responseType = null;
        Long accountId = null;
        String state = null;
        String clientOrgId = null;
        Boolean ensureScopes = null;
        
        CompletableFuture<Void> response = api.authorizeDaemon(clientId, serviceType, returnUrl, scopes, nativeScopes, responseType, accountId, state, clientOrgId, ensureScopes);
        
        // TODO: test validations
    }
    
    /**
     * Start a user session authorization flow
     *
     * This endpoint is used to authorize accounts that are linked to &#x60;Users&#x60;. The &#x60;accountRole&#x60; parameter must be set to either &#x60;primary&#x60; or &#x60;secondary&#x60;. A &#x60;primary&#x60; role creates a new User entity and assigns the account as its key/primary account, with subsequent authorizations simply re-authorizing the existing primary account with its User. The &#x60;secondary&#x60; role requires an existing &#x60;User&#x60; cookie or &#x60;userId&#x60;+&#x60;userSignature&#x60; parameters and links the new account to the &#x60;User&#x60; specified by the cookie or &#x60;userId&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authorizeUserTest() throws ApiException {
        String clientId = null;
        ServiceTypeNonDaemon serviceType = null;
        String returnUrl = null;
        String accountRole = null;
        String mailboxInfo = null;
        List<Scope> scopes = null;
        List<String> nativeScopes = null;
        String responseType = null;
        Long accountId = null;
        String loginHint = null;
        String state = null;
        String userId = null;
        Long timestamp = null;
        String userSignature = null;
        String serverUrl = null;
        Boolean ensureScopes = null;
        Boolean ensureAccess = null;
        String token = null;
        
        CompletableFuture<Void> response = api.authorizeUser(clientId, serviceType, returnUrl, accountRole, mailboxInfo, scopes, nativeScopes, responseType, accountId, loginHint, state, userId, timestamp, userSignature, serverUrl, ensureScopes, ensureAccess, token);
        
        // TODO: test validations
    }
    
    /**
     * Get access token, Deprecated use POST instead
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccessTokenByCodeTest() throws ApiException {
        String code = null;
        CompletableFuture<AccountSaveResult> response = 
        api.getAccessTokenByCode(code);
        
        // TODO: test validations
    }
    
    /**
     * Validate an external identity token
     *
     * This method is for Office365 web add-ins that want to implement external authentication based on [Exchange Identity Token](https://learn.microsoft.com/en-us/office/dev/add-ins/outlook/inside-the-identity-token).  Here are the steps involved in establishing an Aurinko User session:  1. Your Office 365 web add-in gets the Exchange identity token (see the link above for how it is done).  2. Makes a POST call to the &#x60;/auth/prepare&#x60; endpoint with the following HTTP headers:   - &#x60;X-Aurinko-Auth-Type&#x60;: &#x60;exchangeIdToken&#x60;   - &#x60;Authorization&#x60;: &#x60;Bearer &lt;your_exchange_id_token&gt;&#x60;       Auriko validates the identity token and provides a temporary token if the ID is valid:      &#x60;{ \&quot;token\&quot;: \&quot;your-temporary-token\&quot; }&#x60;  3. The addin then calls the &#x60;/authorizeUser&#x60; endpoint with the temporary token, using the query parameter    &#x60;?token&#x3D;your-temporary-token&#x60;.  Upon successful completion of the steps a new Aurinko User is created or an existing User is re-authorized. And from now on this identity token is recognized by Aurinko and is associated with the User session.  From here on the add-in can access Aurinko API with its Exchange identity token, this way:  - &#x60;X-Aurinko-Auth-Type&#x60;: &#x60;exchangeIdToken&#x60; - &#x60;Authorization&#x60;: &#x60;Bearer &lt;your_exchange_id_token&gt;&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void prepareAuthTest() throws ApiException {
        CompletableFuture<PreparedAuthToken> response = 
        api.prepareAuth();
        
        // TODO: test validations
    }
    
}

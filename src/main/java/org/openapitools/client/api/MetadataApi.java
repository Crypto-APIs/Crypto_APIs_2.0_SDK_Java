/*
 * CryptoAPIs
 * Crypto APIs 2.0 is a complex and innovative infrastructure layer that radically simplifies the development of any Blockchain and Crypto related applications. Organized around REST, Crypto APIs 2.0 can assist both novice Bitcoin/Ethereum enthusiasts and crypto experts with the development of their blockchain applications. Crypto APIs 2.0 provides unified endpoints and data, raw data, automatic tokens and coins forwardings, callback functionalities, and much more.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: developers@cryptoapis.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import io.cryptoapis.sdk.ApiCallback;
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.ApiResponse;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.Pair;
import io.cryptoapis.sdk.ProgressRequestBody;
import io.cryptoapis.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.InlineResponse40086;
import org.openapitools.client.model.InlineResponse40186;
import org.openapitools.client.model.InlineResponse402;
import org.openapitools.client.model.InlineResponse40386;
import org.openapitools.client.model.InlineResponse409;
import org.openapitools.client.model.InlineResponse415;
import org.openapitools.client.model.InlineResponse422;
import org.openapitools.client.model.InlineResponse429;
import org.openapitools.client.model.InlineResponse500;
import org.openapitools.client.model.ListSupportedAssetsR;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetadataApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MetadataApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MetadataApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for listSupportedAssets
     * @param context In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. (optional)
     * @param assetType Defines the type of the supported asset. This could be either \&quot;crypto\&quot; or \&quot;fiat\&quot;. (optional)
     * @param limit Defines how many items should be returned in the response per page basis. (optional, default to 50)
     * @param offset The starting index of the response items, i.e. where the response should start listing the returned items. (optional, default to 0)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request has been successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> 400 </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> 403 </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The data provided seems to be invalid. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Your request body for POST requests must have a structure of { data: { item: [...properties] } } </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listSupportedAssetsCall(String context, String assetType, Integer limit, Integer offset, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/market-data/assets/supported";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (context != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("context", context));
        }

        if (assetType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("assetType", assetType));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listSupportedAssetsValidateBeforeCall(String context, String assetType, Integer limit, Integer offset, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listSupportedAssetsCall(context, assetType, limit, offset, _callback);
        return localVarCall;

    }

    /**
     * List Supported Assets
     * This endpoint will return a list of supported assets. The asset could be a cryptocurrency or FIAT assets that we support. Each asset has a unique identifier - &#x60;assetId&#x60; and a unique symbol in the form of a string, e.g. \&quot;BTC\&quot;.
     * @param context In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. (optional)
     * @param assetType Defines the type of the supported asset. This could be either \&quot;crypto\&quot; or \&quot;fiat\&quot;. (optional)
     * @param limit Defines how many items should be returned in the response per page basis. (optional, default to 50)
     * @param offset The starting index of the response items, i.e. where the response should start listing the returned items. (optional, default to 0)
     * @return ListSupportedAssetsR
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request has been successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> 400 </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> 403 </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The data provided seems to be invalid. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Your request body for POST requests must have a structure of { data: { item: [...properties] } } </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. </td><td>  -  </td></tr>
     </table>
     */
    public ListSupportedAssetsR listSupportedAssets(String context, String assetType, Integer limit, Integer offset) throws ApiException {
        ApiResponse<ListSupportedAssetsR> localVarResp = listSupportedAssetsWithHttpInfo(context, assetType, limit, offset);
        return localVarResp.getData();
    }

    /**
     * List Supported Assets
     * This endpoint will return a list of supported assets. The asset could be a cryptocurrency or FIAT assets that we support. Each asset has a unique identifier - &#x60;assetId&#x60; and a unique symbol in the form of a string, e.g. \&quot;BTC\&quot;.
     * @param context In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. (optional)
     * @param assetType Defines the type of the supported asset. This could be either \&quot;crypto\&quot; or \&quot;fiat\&quot;. (optional)
     * @param limit Defines how many items should be returned in the response per page basis. (optional, default to 50)
     * @param offset The starting index of the response items, i.e. where the response should start listing the returned items. (optional, default to 0)
     * @return ApiResponse&lt;ListSupportedAssetsR&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request has been successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> 400 </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> 403 </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The data provided seems to be invalid. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Your request body for POST requests must have a structure of { data: { item: [...properties] } } </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListSupportedAssetsR> listSupportedAssetsWithHttpInfo(String context, String assetType, Integer limit, Integer offset) throws ApiException {
        okhttp3.Call localVarCall = listSupportedAssetsValidateBeforeCall(context, assetType, limit, offset, null);
        Type localVarReturnType = new TypeToken<ListSupportedAssetsR>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Supported Assets (asynchronously)
     * This endpoint will return a list of supported assets. The asset could be a cryptocurrency or FIAT assets that we support. Each asset has a unique identifier - &#x60;assetId&#x60; and a unique symbol in the form of a string, e.g. \&quot;BTC\&quot;.
     * @param context In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. (optional)
     * @param assetType Defines the type of the supported asset. This could be either \&quot;crypto\&quot; or \&quot;fiat\&quot;. (optional)
     * @param limit Defines how many items should be returned in the response per page basis. (optional, default to 50)
     * @param offset The starting index of the response items, i.e. where the response should start listing the returned items. (optional, default to 0)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request has been successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> 400 </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> 403 </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The data provided seems to be invalid. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Your request body for POST requests must have a structure of { data: { item: [...properties] } } </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listSupportedAssetsAsync(String context, String assetType, Integer limit, Integer offset, final ApiCallback<ListSupportedAssetsR> _callback) throws ApiException {

        okhttp3.Call localVarCall = listSupportedAssetsValidateBeforeCall(context, assetType, limit, offset, _callback);
        Type localVarReturnType = new TypeToken<ListSupportedAssetsR>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

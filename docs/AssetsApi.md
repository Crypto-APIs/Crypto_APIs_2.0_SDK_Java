# AssetsApi

All URIs are relative to *https://rest.cryptoapis.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAssetDetailsByAssetID**](AssetsApi.md#getAssetDetailsByAssetID) | **GET** /market-data/assets/assetId/{assetId} | Get Asset Details By Asset ID |
| [**getAssetDetailsByAssetSymbol**](AssetsApi.md#getAssetDetailsByAssetSymbol) | **GET** /market-data/assets/{assetSymbol} | Get Asset Details By Asset Symbol |


<a name="getAssetDetailsByAssetID"></a>
# **getAssetDetailsByAssetID**
> GetAssetDetailsByAssetIDR getAssetDetailsByAssetID(assetId, context)

Get Asset Details By Asset ID

Through this endpoint users can obtain information on assets by &#x60;assetId&#x60;.    The details returned could include information on the latest rate and rate fluctuation of different periods of time - 24 hours, a week, one hour, the encoding of the logo, and more.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String assetId = "5b1ea92e584bf50020130612"; // String | Defines the unique ID of the specific asset.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    try {
      GetAssetDetailsByAssetIDR result = apiInstance.getAssetDetailsByAssetID(assetId, context);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetDetailsByAssetID");
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
| **assetId** | **String**| Defines the unique ID of the specific asset. | |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |

### Return type

[**GetAssetDetailsByAssetIDR**](GetAssetDetailsByAssetIDR.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has been successful. |  -  |
| **400** | 400 |  -  |
| **401** | 401 |  -  |
| **402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
| **403** | 403 |  -  |
| **409** | The data provided seems to be invalid. |  -  |
| **415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
| **422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
| **429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
| **500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="getAssetDetailsByAssetSymbol"></a>
# **getAssetDetailsByAssetSymbol**
> GetAssetDetailsByAssetSymbolR getAssetDetailsByAssetSymbol(assetSymbol, context)

Get Asset Details By Asset Symbol

Through this endpoint users can obtain information on assets by asset symbol.    The details returned could include information on the latest rate and rate fluctuation of different periods of time - 24 hours, a week, one hour, the encoding of the logo, and more.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String assetSymbol = "BTC"; // String | Specifies the asset's unique symbol in the Crypto APIs listings.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    try {
      GetAssetDetailsByAssetSymbolR result = apiInstance.getAssetDetailsByAssetSymbol(assetSymbol, context);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetDetailsByAssetSymbol");
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
| **assetSymbol** | **String**| Specifies the asset&#39;s unique symbol in the Crypto APIs listings. | |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |

### Return type

[**GetAssetDetailsByAssetSymbolR**](GetAssetDetailsByAssetSymbolR.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has been successful. |  -  |
| **400** | 400 |  -  |
| **401** | 401 |  -  |
| **402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
| **403** | 403 |  -  |
| **409** | The data provided seems to be invalid. |  -  |
| **415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
| **422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
| **429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
| **500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |


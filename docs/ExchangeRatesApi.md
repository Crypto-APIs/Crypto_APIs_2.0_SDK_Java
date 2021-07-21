# ExchangeRatesApi

All URIs are relative to *https://rest.cryptoapis.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExchangeRateByAssetSymbols**](ExchangeRatesApi.md#getExchangeRateByAssetSymbols) | **GET** /market-data/exchange-rates/by-symbols/{fromAssetSymbol}/{toAssetSymbol} | Get Exchange Rate By Asset Symbols
[**getExchangeRateByAssetsIDs**](ExchangeRatesApi.md#getExchangeRateByAssetsIDs) | **GET** /market-data/exchange-rates/by-asset-ids/{fromAssetId}/{toAssetId} | Get Exchange Rate By Assets IDs


<a name="getExchangeRateByAssetSymbols"></a>
# **getExchangeRateByAssetSymbols**
> GetExchangeRateByAssetSymbolsR getExchangeRateByAssetSymbols(fromAssetSymbol, toAssetSymbol, context, calculationTimestamp)

Get Exchange Rate By Asset Symbols

Through this endpoint customers can obtain exchange rates by asset symbols. The process represents the exchange rate value of a single unit of one asset versus another one. Data is provided per unique asset symbol.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.ExchangeRatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ExchangeRatesApi apiInstance = new ExchangeRatesApi(defaultClient);
    String fromAssetSymbol = "btc"; // String | Defines the base asset symbol to get a rate for.
    String toAssetSymbol = "usd"; // String | Defines the relation asset symbol in which the base asset rate will be displayed.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    Integer calculationTimestamp = 1618577849; // Integer | Defines the time of the market data used to calculate the exchange rate in UNIX Timestamp.
    try {
      GetExchangeRateByAssetSymbolsR result = apiInstance.getExchangeRateByAssetSymbols(fromAssetSymbol, toAssetSymbol, context, calculationTimestamp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeRatesApi#getExchangeRateByAssetSymbols");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromAssetSymbol** | **String**| Defines the base asset symbol to get a rate for. |
 **toAssetSymbol** | **String**| Defines the relation asset symbol in which the base asset rate will be displayed. |
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **calculationTimestamp** | **Integer**| Defines the time of the market data used to calculate the exchange rate in UNIX Timestamp. | [optional]

### Return type

[**GetExchangeRateByAssetSymbolsR**](GetExchangeRateByAssetSymbolsR.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has been successful. |  -  |
**400** | The pagination attributes that have been used are invalid. Please check the Documentation to see details on pagination. |  -  |
**401** | The provided API key is invalid. Please, generate a new one from your Dashboard. |  -  |
**402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
**403** | Mainnets access is not available for your current subscription plan, please upgrade your plan to be able to use it. |  -  |
**409** | The data provided seems to be invalid. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Rate could not be calculated due to not enough pair trades data. |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="getExchangeRateByAssetsIDs"></a>
# **getExchangeRateByAssetsIDs**
> GetExchangeRateByAssetsIDsR getExchangeRateByAssetsIDs(fromAssetId, toAssetId, context, calculationTimestamp)

Get Exchange Rate By Assets IDs

Through this endpoint customers can obtain exchange rates by asset IDs. The process represents the exchange rate value of a single unit of one asset versus another one. Data is provided per unique asset Reference ID.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.ExchangeRatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ExchangeRatesApi apiInstance = new ExchangeRatesApi(defaultClient);
    String fromAssetId = "5b1ea92e584bf50020130612"; // String | Defines the base asset Reference ID to get a rate for.
    String toAssetId = "5b1ea92e584bf50020130615"; // String | Defines the relation asset Reference ID in which the base asset rate will be displayed.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    Integer calculationTimestamp = 1618577849; // Integer | Defines the time of the market data used to calculate the exchange rate in UNIX Timestamp.
    try {
      GetExchangeRateByAssetsIDsR result = apiInstance.getExchangeRateByAssetsIDs(fromAssetId, toAssetId, context, calculationTimestamp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExchangeRatesApi#getExchangeRateByAssetsIDs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromAssetId** | **String**| Defines the base asset Reference ID to get a rate for. |
 **toAssetId** | **String**| Defines the relation asset Reference ID in which the base asset rate will be displayed. |
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **calculationTimestamp** | **Integer**| Defines the time of the market data used to calculate the exchange rate in UNIX Timestamp. | [optional]

### Return type

[**GetExchangeRateByAssetsIDsR**](GetExchangeRateByAssetsIDsR.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has been successfull. |  -  |
**400** | The pagination attributes that have been used are invalid. Please check the Documentation to see details on pagination. |  -  |
**401** | The provided API key is invalid. Please, generate a new one from your Dashboard. |  -  |
**402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
**403** | Mainnets access is not available for your current subscription plan, please upgrade your plan to be able to use it. |  -  |
**409** | The data provided seems to be invalid. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Rate could not be calculated due to not enough pair trades data. |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |


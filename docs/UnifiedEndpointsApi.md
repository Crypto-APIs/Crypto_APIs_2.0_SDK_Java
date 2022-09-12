# UnifiedEndpointsApi

All URIs are relative to *https://rest.cryptoapis.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**estimateTransactionSmartFee**](UnifiedEndpointsApi.md#estimateTransactionSmartFee) | **GET** /blockchain-data/{blockchain}/{network}/estimate-transaction-smart-fee | Estimate Transaction Smart Fee |
| [**getAddressBalance**](UnifiedEndpointsApi.md#getAddressBalance) | **GET** /blockchain-data/{blockchain}/{network}/addresses/{address}/balance | Get Address Balance |
| [**getAddressDetails**](UnifiedEndpointsApi.md#getAddressDetails) | **GET** /blockchain-data/{blockchain}/{network}/addresses/{address} | Get Address Details |
| [**getBlockDetailsByBlockHash**](UnifiedEndpointsApi.md#getBlockDetailsByBlockHash) | **GET** /blockchain-data/{blockchain}/{network}/blocks/hash/{blockHash} | Get Block Details By Block Hash |
| [**getBlockDetailsByBlockHeight**](UnifiedEndpointsApi.md#getBlockDetailsByBlockHeight) | **GET** /blockchain-data/{blockchain}/{network}/blocks/height/{height} | Get Block Details By Block Height |
| [**getFeeRecommendations**](UnifiedEndpointsApi.md#getFeeRecommendations) | **GET** /blockchain-data/{blockchain}/{network}/mempool/fees | Get Fee Recommendations |
| [**getLastMinedBlock**](UnifiedEndpointsApi.md#getLastMinedBlock) | **GET** /blockchain-data/{blockchain}/{network}/blocks/last | Get Last Mined Block |
| [**getNextAvailableNonce**](UnifiedEndpointsApi.md#getNextAvailableNonce) | **GET** /blockchain-data/{blockchain}/{network}/addresses/{address}/next-available-nonce | Get Next Available Nonce |
| [**getRawTransactionData**](UnifiedEndpointsApi.md#getRawTransactionData) | **GET** /blockchain-data/{blockchain}/{network}/transactions/{transactionId}/raw-data | Get Raw Transaction Data |
| [**getTransactionDetailsByTransactionID**](UnifiedEndpointsApi.md#getTransactionDetailsByTransactionID) | **GET** /blockchain-data/{blockchain}/{network}/transactions/{transactionId} | Get Transaction Details By Transaction ID |
| [**listConfirmedTokensTransfersByAddressAndTimeRange**](UnifiedEndpointsApi.md#listConfirmedTokensTransfersByAddressAndTimeRange) | **GET** /blockchain-data/{blockchain}/{network}/addresses/{address}/tokens-transfers-by-time-range | List Confirmed Tokens Transfers By Address And Time Range |
| [**listConfirmedTransactionsByAddress**](UnifiedEndpointsApi.md#listConfirmedTransactionsByAddress) | **GET** /blockchain-data/{blockchain}/{network}/addresses/{address}/transactions | List Confirmed Transactions By Address |
| [**listConfirmedTransactionsByAddressAndTimeRange**](UnifiedEndpointsApi.md#listConfirmedTransactionsByAddressAndTimeRange) | **GET** /blockchain-data/{blockchain}/{network}/addresses/{address}/transactions-by-time-range | List Confirmed Transactions By Address And Time Range |
| [**listInternalTransactionsByAddressAndTimeRange**](UnifiedEndpointsApi.md#listInternalTransactionsByAddressAndTimeRange) | **GET** /blockchain-data/{blockchain}/{network}/addresses/{address}/internal-by-time-range | List Internal Transactions By Address And Time Range |
| [**listLatestMinedBlocks**](UnifiedEndpointsApi.md#listLatestMinedBlocks) | **GET** /blockchain-data/{blockchain}/{network}/blocks/last/{count} | List Latest Mined Blocks |
| [**listTransactionsByBlockHash**](UnifiedEndpointsApi.md#listTransactionsByBlockHash) | **GET** /blockchain-data/{blockchain}/{network}/blocks/hash/{blockHash}/transactions | List Transactions by Block Hash |
| [**listTransactionsByBlockHeight**](UnifiedEndpointsApi.md#listTransactionsByBlockHeight) | **GET** /blockchain-data/{blockchain}/{network}/blocks/height/{height}/transactions | List Transactions by Block Height |
| [**listUnconfirmedTransactionsByAddress**](UnifiedEndpointsApi.md#listUnconfirmedTransactionsByAddress) | **GET** /blockchain-data/{blockchain}/{network}/address-transactions-unconfirmed/{address} | List Unconfirmed Transactions by Address |
| [**listUnspentTransactionOutputsByAddress**](UnifiedEndpointsApi.md#listUnspentTransactionOutputsByAddress) | **GET** /blockchain-data/{blockchain}/{network}/addresses/{address}/unspent-outputs | List Unspent Transaction Outputs By Address |


<a name="estimateTransactionSmartFee"></a>
# **estimateTransactionSmartFee**
> EstimateTransactionSmartFeeR estimateTransactionSmartFee(blockchain, network, context, confirmationTarget, estimateMode)

Estimate Transaction Smart Fee

Through this endpoint, customers can estimate the approximate fee per kilobyte needed for a transaction to begin confirmation within the &#x60;confirmationTarget&#x60; blocks when possible. After which it will return the number of blocks for which the estimate is valid.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UnifiedEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UnifiedEndpointsApi apiInstance = new UnifiedEndpointsApi(defaultClient);
    String blockchain = "bitcoin"; // String | 
    String network = "testnet"; // String | 
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    Integer confirmationTarget = 2; // Integer | Integer representation of confirmation target in blocks that estimation will be valid for
    String estimateMode = "economical"; // String | String representation of the address
    try {
      EstimateTransactionSmartFeeR result = apiInstance.estimateTransactionSmartFee(blockchain, network, context, confirmationTarget, estimateMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnifiedEndpointsApi#estimateTransactionSmartFee");
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
| **blockchain** | **String**|  | [enum: bitcoin, litecoin, dash] |
| **network** | **String**|  | [enum: testnet, mainnet] |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |
| **confirmationTarget** | **Integer**| Integer representation of confirmation target in blocks that estimation will be valid for | [optional] |
| **estimateMode** | **String**| String representation of the address | [optional] [enum: economical, conservative] |

### Return type

[**EstimateTransactionSmartFeeR**](EstimateTransactionSmartFeeR.md)

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
| **501** | This {feature} has not been implemented yet. |  -  |

<a name="getAddressBalance"></a>
# **getAddressBalance**
> GetAddressBalanceR getAddressBalance(blockchain, network, address, context)

Get Address Balance

Through this endpoint the customer can receive the balance of a given address based on confirmed/synced blocks only. In the case where there are any incoming or outgoing unconfirmed transactions for the specific address, they will not be counted or calculated here. Applies only for coins.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UnifiedEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UnifiedEndpointsApi apiInstance = new UnifiedEndpointsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String address = "0x0902a667d6a3f287835e0a4593cae4167384abc6"; // String | Represents the public address, which is a compressed and shortened form of a public key.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    try {
      GetAddressBalanceR result = apiInstance.getAddressBalance(blockchain, network, address, context);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnifiedEndpointsApi#getAddressBalance");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, ethereum, ethereum-classic, binance-smart-chain, bitcoin-cash, litecoin, dash, dogecoin, xrp, tron] |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, testnet, mordor, nile, goerli] |
| **address** | **String**| Represents the public address, which is a compressed and shortened form of a public key. | |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |

### Return type

[**GetAddressBalanceR**](GetAddressBalanceR.md)

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

<a name="getAddressDetails"></a>
# **getAddressDetails**
> GetAddressDetailsR getAddressDetails(blockchain, network, address, context)

Get Address Details

Through this endpoint the customer can receive basic information about a given address based on confirmed/synced blocks only. In the case where there are any incoming or outgoing **unconfirmed** transactions for the specific address, they **will not** be counted or calculated here. Applies only for coins.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UnifiedEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UnifiedEndpointsApi apiInstance = new UnifiedEndpointsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String address = "mzYijhgmzZrmuB7wBDazRKirnChKyow4M3"; // String | Represents the public address, which is a compressed and shortened form of a public key.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    try {
      GetAddressDetailsR result = apiInstance.getAddressDetails(blockchain, network, address, context);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnifiedEndpointsApi#getAddressDetails");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, bitcoin-cash, litecoin, dogecoin, dash, ethereum, ethereum-classic, binance-smart-chain, zcash] |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, testnet, mordor, goerli] |
| **address** | **String**| Represents the public address, which is a compressed and shortened form of a public key. | |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |

### Return type

[**GetAddressDetailsR**](GetAddressDetailsR.md)

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

<a name="getBlockDetailsByBlockHash"></a>
# **getBlockDetailsByBlockHash**
> GetBlockDetailsByBlockHashR getBlockDetailsByBlockHash(blockchain, network, blockHash, context)

Get Block Details By Block Hash

Through this endpoint customers can obtain basic information about a given mined block, specifically by using the &#x60;hash&#x60; parameter. These block details could include the hash of the specific, the previous and the next block, its transactions count, its height, etc.     Blockchain specific data is information such as version, nonce, size, bits, merkleroot, etc.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UnifiedEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UnifiedEndpointsApi apiInstance = new UnifiedEndpointsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String blockHash = "0000000006b3f483bec16b8a85c632bdd30a14a202c83a9148002c9ee441dd0c"; // String | Represents the hash of the block, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    try {
      GetBlockDetailsByBlockHashR result = apiInstance.getBlockDetailsByBlockHash(blockchain, network, blockHash, context);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnifiedEndpointsApi#getBlockDetailsByBlockHash");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, ethereum, ethereum-classic, bitcoin-cash, litecoin, dogecoin, dash, binance-smart-chain, zcash, zilliqa] |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, testnet, mordor, goerli] |
| **blockHash** | **String**| Represents the hash of the block, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm. | |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |

### Return type

[**GetBlockDetailsByBlockHashR**](GetBlockDetailsByBlockHashR.md)

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
| **404** | The specified block has not been found on the specific blockchain. |  -  |
| **409** | The data provided seems to be invalid. |  -  |
| **415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
| **422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
| **429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
| **500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="getBlockDetailsByBlockHeight"></a>
# **getBlockDetailsByBlockHeight**
> GetBlockDetailsByBlockHeightR getBlockDetailsByBlockHeight(blockchain, network, height, context)

Get Block Details By Block Height

Through this endpoint customers can obtain basic information about a given mined block, specifically by using the &#x60;height&#x60; parameter. These block details could include the hash of the specific, the previous and the next block, its transactions count, its height, etc.     Blockchain specific data is information such as version, nonce, size, bits, merkleroot, etc.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UnifiedEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UnifiedEndpointsApi apiInstance = new UnifiedEndpointsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    Long height = 673852L; // Long | Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \"Genesis block\".
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    try {
      GetBlockDetailsByBlockHeightR result = apiInstance.getBlockDetailsByBlockHeight(blockchain, network, height, context);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnifiedEndpointsApi#getBlockDetailsByBlockHeight");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, ethereum, ethereum-classic, bitcoin-cash, litecoin, dogecoin, dash, binance-smart-chain, zcash, zilliqa] |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, testnet, mordor, goerli] |
| **height** | **Long**| Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \&quot;Genesis block\&quot;. | |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |

### Return type

[**GetBlockDetailsByBlockHeightR**](GetBlockDetailsByBlockHeightR.md)

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
| **404** | The specified block has not been found on the specific blockchain. |  -  |
| **409** | The data provided seems to be invalid. |  -  |
| **415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
| **422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
| **429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
| **500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="getFeeRecommendations"></a>
# **getFeeRecommendations**
> GetFeeRecommendationsR getFeeRecommendations(blockchain, network, context)

Get Fee Recommendations

Through this endpoint customers can obtain fee recommendations. Our fees recommendations are based on Mempool data which makes them much more accurate than fees based on already mined blocks. Calculations are done in real time live. Using this endpoint customers can get gas price for Ethereum, fee per byte for Bitcoin, etc.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UnifiedEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UnifiedEndpointsApi apiInstance = new UnifiedEndpointsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    try {
      GetFeeRecommendationsR result = apiInstance.getFeeRecommendations(blockchain, network, context);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnifiedEndpointsApi#getFeeRecommendations");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, ethereum, ethereum-classic, bitcoin-cash, dogecoin, dash, litecoin, binance-smart-chain, zcash, xrp] |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, testnet, mordor, goerli] |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |

### Return type

[**GetFeeRecommendationsR**](GetFeeRecommendationsR.md)

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
| **404** | The specified resource has not been found. |  -  |
| **409** | The data provided seems to be invalid. |  -  |
| **415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
| **422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
| **429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
| **500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="getLastMinedBlock"></a>
# **getLastMinedBlock**
> GetLastMinedBlockR getLastMinedBlock(blockchain, network, context)

Get Last Mined Block

Through this endpoint customers can fetch the last mined block in a specific blockchain network, along with its details. These could include the hash of the specific, the previous and the next block, its transactions count, its height, etc.     Blockchain specific data is information such as version, nonce, size, bits, merkleroot, etc.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UnifiedEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UnifiedEndpointsApi apiInstance = new UnifiedEndpointsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    try {
      GetLastMinedBlockR result = apiInstance.getLastMinedBlock(blockchain, network, context);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnifiedEndpointsApi#getLastMinedBlock");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, ethereum, ethereum-classic, bitcoin-cash, litecoin, dogecoin, dash, binance-smart-chain, zcash, zilliqa] |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, testnet, mordor, goerli] |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |

### Return type

[**GetLastMinedBlockR**](GetLastMinedBlockR.md)

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
| **404** | The specified block has not been found on the specific blockchain. |  -  |
| **409** | The data provided seems to be invalid. |  -  |
| **415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
| **422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
| **429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
| **500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="getNextAvailableNonce"></a>
# **getNextAvailableNonce**
> GetNextAvailableNonceR getNextAvailableNonce(blockchain, network, address, context)

Get Next Available Nonce

Through this endpoint customers can get information about the next available nonce by providing the specific blockchain, network and address.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UnifiedEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UnifiedEndpointsApi apiInstance = new UnifiedEndpointsApi(defaultClient);
    String blockchain = "ethereum"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String address = "0x626b046b0ce356f248b215b01b459f8b8d59e1a4"; // String | Represents the public address, which is a compressed and shortened form of a public key.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    try {
      GetNextAvailableNonceR result = apiInstance.getNextAvailableNonce(blockchain, network, address, context);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnifiedEndpointsApi#getNextAvailableNonce");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: ethereum, ethereum-classic, binance-smart-chain] |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, mordor, testnet, goerli] |
| **address** | **String**| Represents the public address, which is a compressed and shortened form of a public key. | |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |

### Return type

[**GetNextAvailableNonceR**](GetNextAvailableNonceR.md)

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

<a name="getRawTransactionData"></a>
# **getRawTransactionData**
> GetRawTransactionDataR getRawTransactionData(blockchain, network, transactionId, context)

Get Raw Transaction Data

Through this endpoint customers can get information on a transaction in its raw format by providing its &#x60;transactionId&#x60;.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UnifiedEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UnifiedEndpointsApi apiInstance = new UnifiedEndpointsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String transactionId = "4b66461bf88b61e1e4326356534c135129defb504c7acb2fd6c92697d79eb250"; // String | Represents the unique identifier of a transaction, i.e. it could be transactionId in UTXO-based protocols like Bitcoin, and transaction hash in Ethereum blockchain.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    try {
      GetRawTransactionDataR result = apiInstance.getRawTransactionData(blockchain, network, transactionId, context);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnifiedEndpointsApi#getRawTransactionData");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, bitcoin-cash, litecoin, dogecoin, dash, zcash] |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, testnet] |
| **transactionId** | **String**| Represents the unique identifier of a transaction, i.e. it could be transactionId in UTXO-based protocols like Bitcoin, and transaction hash in Ethereum blockchain. | |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |

### Return type

[**GetRawTransactionDataR**](GetRawTransactionDataR.md)

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
| **404** | The specified transaction has not been found on the specific blockchain. |  -  |
| **409** | The data provided seems to be invalid. |  -  |
| **415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
| **422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
| **429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
| **500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="getTransactionDetailsByTransactionID"></a>
# **getTransactionDetailsByTransactionID**
> GetTransactionDetailsByTransactionIDR getTransactionDetailsByTransactionID(blockchain, network, transactionId, context)

Get Transaction Details By Transaction ID

Through this endpoint customers can obtain details about a transaction by the transaction&#39;s unique identifier. In UTXO-based protocols like BTC there are attributes such as &#x60;transactionId&#x60; and transaction &#x60;hash&#x60;. They still could be different. In protocols like Ethereum there is only one unique value and it&#39;s &#x60;hash&#x60;.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UnifiedEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UnifiedEndpointsApi apiInstance = new UnifiedEndpointsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String transactionId = "4b66461bf88b61e1e4326356534c135129defb504c7acb2fd6c92697d79eb250"; // String | Represents the unique identifier of a transaction, i.e. it could be `transactionId` in UTXO-based protocols like Bitcoin, and transaction `hash` in Ethereum blockchain.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    try {
      GetTransactionDetailsByTransactionIDR result = apiInstance.getTransactionDetailsByTransactionID(blockchain, network, transactionId, context);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnifiedEndpointsApi#getTransactionDetailsByTransactionID");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, bitcoin-cash, litecoin, dogecoin, dash, ethereum, ethereum-classic, binance-smart-chain, zcash] |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, testnet, mordor, goerli] |
| **transactionId** | **String**| Represents the unique identifier of a transaction, i.e. it could be &#x60;transactionId&#x60; in UTXO-based protocols like Bitcoin, and transaction &#x60;hash&#x60; in Ethereum blockchain. | |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |

### Return type

[**GetTransactionDetailsByTransactionIDR**](GetTransactionDetailsByTransactionIDR.md)

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
| **404** | The specified transaction has not been found on the specific blockchain. |  -  |
| **409** | The data provided seems to be invalid. |  -  |
| **415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
| **422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
| **429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
| **500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="listConfirmedTokensTransfersByAddressAndTimeRange"></a>
# **listConfirmedTokensTransfersByAddressAndTimeRange**
> ListConfirmedTokensTransfersByAddressAndTimeRangeR listConfirmedTokensTransfersByAddressAndTimeRange(blockchain, network, address, fromTimestamp, toTimestamp, context, limit, offset)

List Confirmed Tokens Transfers By Address And Time Range

Through this endpoint customers can obtain a list with **confirmed** token transfers by the &#x60;address&#x60; attribute and the query parameters &#x60;fromTimestamp&#x60; and &#x60;toTimestamp&#x60; which gives customers the opportunity to filter the results by a specified time period.    {note}This refers only to transfers done for **confirmed tokens** not coins.{/note}

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UnifiedEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UnifiedEndpointsApi apiInstance = new UnifiedEndpointsApi(defaultClient);
    String blockchain = "ethereum"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Ethereum Classic, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String address = "0x033ef6db9fbd0ee60e2931906b987fe0280471a0"; // String | Represents the public address, which is a compressed and shortened form of a public key.
    Integer fromTimestamp = 1236238648; // Integer | Defines the specific time/date from which the results will start being listed.
    Integer toTimestamp = 1644417868; // Integer | Defines the specific time/date to which the results will be listed.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    Long limit = 50L; // Long | Defines how many items should be returned in the response per page basis.
    Long offset = 0L; // Long | The starting index of the response items, i.e. where the response should start listing the returned items.
    try {
      ListConfirmedTokensTransfersByAddressAndTimeRangeR result = apiInstance.listConfirmedTokensTransfersByAddressAndTimeRange(blockchain, network, address, fromTimestamp, toTimestamp, context, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnifiedEndpointsApi#listConfirmedTokensTransfersByAddressAndTimeRange");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Ethereum Classic, etc. | [enum: ethereum, ethereum-classic, binance-smart-chain] |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, mordor, testnet, goerli] |
| **address** | **String**| Represents the public address, which is a compressed and shortened form of a public key. | |
| **fromTimestamp** | **Integer**| Defines the specific time/date from which the results will start being listed. | |
| **toTimestamp** | **Integer**| Defines the specific time/date to which the results will be listed. | |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |
| **limit** | **Long**| Defines how many items should be returned in the response per page basis. | [optional] [default to 50] |
| **offset** | **Long**| The starting index of the response items, i.e. where the response should start listing the returned items. | [optional] [default to 0] |

### Return type

[**ListConfirmedTokensTransfersByAddressAndTimeRangeR**](ListConfirmedTokensTransfersByAddressAndTimeRangeR.md)

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

<a name="listConfirmedTransactionsByAddress"></a>
# **listConfirmedTransactionsByAddress**
> ListConfirmedTransactionsByAddressR listConfirmedTransactionsByAddress(blockchain, network, address, context, limit, offset)

List Confirmed Transactions By Address

This endpoint will list transactions by an attribute &#x60;address&#x60;. The transactions listed will detail additional information such as hash, height, time of creation in Unix timestamp, etc.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UnifiedEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UnifiedEndpointsApi apiInstance = new UnifiedEndpointsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String address = "mho4jHBcrNCncKt38trJahXakuaBnS7LK5"; // String | Represents the public address, which is a compressed and shortened form of a public key.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    Long limit = 50L; // Long | Defines how many items should be returned in the response per page basis.
    Long offset = 0L; // Long | The starting index of the response items, i.e. where the response should start listing the returned items.
    try {
      ListConfirmedTransactionsByAddressR result = apiInstance.listConfirmedTransactionsByAddress(blockchain, network, address, context, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnifiedEndpointsApi#listConfirmedTransactionsByAddress");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, bitcoin-cash, litecoin, dogecoin, dash, ethereum-classic, ethereum, binance-smart-chain, zcash] |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, testnet, mordor, goerli] |
| **address** | **String**| Represents the public address, which is a compressed and shortened form of a public key. | |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |
| **limit** | **Long**| Defines how many items should be returned in the response per page basis. | [optional] [default to 50] |
| **offset** | **Long**| The starting index of the response items, i.e. where the response should start listing the returned items. | [optional] [default to 0] |

### Return type

[**ListConfirmedTransactionsByAddressR**](ListConfirmedTransactionsByAddressR.md)

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

<a name="listConfirmedTransactionsByAddressAndTimeRange"></a>
# **listConfirmedTransactionsByAddressAndTimeRange**
> ListConfirmedTransactionsByAddressAndTimeRangeR listConfirmedTransactionsByAddressAndTimeRange(blockchain, network, address, fromTimestamp, toTimestamp, context, limit, offset)

List Confirmed Transactions By Address And Time Range

This endpoint will list confirmed transactions by the attribute &#x60;address&#x60; and the query parameters &#x60;fromTimestamp&#x60; and &#x60;toTimestamp&#x60; which gives customers the opportunity to filter the results by a specified time period.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UnifiedEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UnifiedEndpointsApi apiInstance = new UnifiedEndpointsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String address = "mho4jHBcrNCncKt38trJahXakuaBnS7LK5"; // String | Represents the public address, which is a compressed and shortened form of a public key.
    Integer fromTimestamp = 1236238648; // Integer | Defines the specific time/date from which the results will start being listed.
    Integer toTimestamp = 1644417868; // Integer | Defines the specific time/date to which the results will be listed.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    Long limit = 50L; // Long | Defines how many items should be returned in the response per page basis.
    Long offset = 0L; // Long | The starting index of the response items, i.e. where the response should start listing the returned items.
    try {
      ListConfirmedTransactionsByAddressAndTimeRangeR result = apiInstance.listConfirmedTransactionsByAddressAndTimeRange(blockchain, network, address, fromTimestamp, toTimestamp, context, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnifiedEndpointsApi#listConfirmedTransactionsByAddressAndTimeRange");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, bitcoin-cash, litecoin, dogecoin, dash, ethereum-classic, ethereum, binance-smart-chain, zcash] |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, testnet, mordor, goerli] |
| **address** | **String**| Represents the public address, which is a compressed and shortened form of a public key. | |
| **fromTimestamp** | **Integer**| Defines the specific time/date from which the results will start being listed. | |
| **toTimestamp** | **Integer**| Defines the specific time/date to which the results will be listed. | |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |
| **limit** | **Long**| Defines how many items should be returned in the response per page basis. | [optional] [default to 50] |
| **offset** | **Long**| The starting index of the response items, i.e. where the response should start listing the returned items. | [optional] [default to 0] |

### Return type

[**ListConfirmedTransactionsByAddressAndTimeRangeR**](ListConfirmedTransactionsByAddressAndTimeRangeR.md)

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

<a name="listInternalTransactionsByAddressAndTimeRange"></a>
# **listInternalTransactionsByAddressAndTimeRange**
> ListInternalTransactionsByAddressAndTimeRangeR listInternalTransactionsByAddressAndTimeRange(blockchain, network, address, fromTimestamp, toTimestamp, context, limit, offset)

List Internal Transactions By Address And Time Range

Through this endpoint customers can list internal transactions by the &#x60;address&#x60; attribute and the query parameters &#x60;fromTimestamp&#x60; and &#x60;toTimestamp&#x60;  which gives customers the opportunity to filter the results by a specified time period.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UnifiedEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UnifiedEndpointsApi apiInstance = new UnifiedEndpointsApi(defaultClient);
    String blockchain = "ethereum"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String address = "0xc8fe2ceac93ad50e496b497357ae5385192dd28d"; // String | String identifier of the address document represented in CryptoAPIs
    Integer fromTimestamp = 1635979828; // Integer | Defines the specific time/date from which the results will start being listed.
    Integer toTimestamp = 1643329896; // Integer | Defines the specific time/date to which the results will be listed.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    Long limit = 50L; // Long | Defines how many items should be returned in the response per page basis.
    Long offset = 0L; // Long | The starting index of the response items, i.e. where the response should start listing the returned items.
    try {
      ListInternalTransactionsByAddressAndTimeRangeR result = apiInstance.listInternalTransactionsByAddressAndTimeRange(blockchain, network, address, fromTimestamp, toTimestamp, context, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnifiedEndpointsApi#listInternalTransactionsByAddressAndTimeRange");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: ethereum, ethereum-classic, binance-smart-chain] |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, mordor, testnet, goerli] |
| **address** | **String**| String identifier of the address document represented in CryptoAPIs | |
| **fromTimestamp** | **Integer**| Defines the specific time/date from which the results will start being listed. | |
| **toTimestamp** | **Integer**| Defines the specific time/date to which the results will be listed. | |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |
| **limit** | **Long**| Defines how many items should be returned in the response per page basis. | [optional] [default to 50] |
| **offset** | **Long**| The starting index of the response items, i.e. where the response should start listing the returned items. | [optional] [default to 0] |

### Return type

[**ListInternalTransactionsByAddressAndTimeRangeR**](ListInternalTransactionsByAddressAndTimeRangeR.md)

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

<a name="listLatestMinedBlocks"></a>
# **listLatestMinedBlocks**
> ListLatestMinedBlocksR listLatestMinedBlocks(network, blockchain, count, context)

List Latest Mined Blocks

Through this endpoint customers can list **up to 50** from the latest blocks that were mined.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UnifiedEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UnifiedEndpointsApi apiInstance = new UnifiedEndpointsApi(defaultClient);
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    Integer count = 2; // Integer | Specifies how many records were requested.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    try {
      ListLatestMinedBlocksR result = apiInstance.listLatestMinedBlocks(network, blockchain, count, context);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnifiedEndpointsApi#listLatestMinedBlocks");
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
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks | [enum: testnet, mordor, mainnet, goerli] |
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, bitcoin-cash, ethereum-classic, ethereum, litecoin, dash, dogecoin, binance-smart-chain, zilliqa, zcash, xrp] |
| **count** | **Integer**| Specifies how many records were requested. | |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |

### Return type

[**ListLatestMinedBlocksR**](ListLatestMinedBlocksR.md)

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
| **404** | The specified resource has not been found. |  -  |
| **409** | The data provided seems to be invalid. |  -  |
| **415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
| **422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
| **429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
| **500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="listTransactionsByBlockHash"></a>
# **listTransactionsByBlockHash**
> ListTransactionsByBlockHashR listTransactionsByBlockHash(blockchain, network, blockHash, context, limit, offset)

List Transactions by Block Hash

This endpoint will list transactions by an attribute &#x60;transactionHash&#x60;. The transactions listed will detail additional information such as addresses, height, time of creation in Unix timestamp, etc.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UnifiedEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UnifiedEndpointsApi apiInstance = new UnifiedEndpointsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String blockHash = "00000000000000127080d8bcf84f4ad830a71ea0aadce3632579b6b2f26cd94b"; // String | Represents the hash of the block, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    Long limit = 50L; // Long | Defines how many items should be returned in the response per page basis.
    Long offset = 0L; // Long | The starting index of the response items, i.e. where the response should start listing the returned items.
    try {
      ListTransactionsByBlockHashR result = apiInstance.listTransactionsByBlockHash(blockchain, network, blockHash, context, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnifiedEndpointsApi#listTransactionsByBlockHash");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, bitcoin-cash, litecoin, dogecoin, dash, ethereum, ethereum-classic, binance-smart-chain, zcash] |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: testnet, mainnet, mordor, goerli] |
| **blockHash** | **String**| Represents the hash of the block, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm. | |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |
| **limit** | **Long**| Defines how many items should be returned in the response per page basis. | [optional] [default to 50] |
| **offset** | **Long**| The starting index of the response items, i.e. where the response should start listing the returned items. | [optional] [default to 0] |

### Return type

[**ListTransactionsByBlockHashR**](ListTransactionsByBlockHashR.md)

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

<a name="listTransactionsByBlockHeight"></a>
# **listTransactionsByBlockHeight**
> ListTransactionsByBlockHeightR listTransactionsByBlockHeight(blockchain, network, height, context, limit, offset)

List Transactions by Block Height

This endpoint will list transactions by an attribute &#x60;blockHeight&#x60;. The transactions listed will detail additional information such as hash, addresses, time of creation in Unix timestamp, etc.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UnifiedEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UnifiedEndpointsApi apiInstance = new UnifiedEndpointsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    Long height = 673852L; // Long | Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \"Genesis block\".
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    Long limit = 50L; // Long | Defines how many items should be returned in the response per page basis.
    Long offset = 0L; // Long | The starting index of the response items, i.e. where the response should start listing the returned items.
    try {
      ListTransactionsByBlockHeightR result = apiInstance.listTransactionsByBlockHeight(blockchain, network, height, context, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnifiedEndpointsApi#listTransactionsByBlockHeight");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, ethereum, dash, dogecoin, litecoin, bitcoin-cash, ethereum-classic, binance-smart-chain, zcash] |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, testnet, mordor, goerli] |
| **height** | **Long**| Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \&quot;Genesis block\&quot;. | |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |
| **limit** | **Long**| Defines how many items should be returned in the response per page basis. | [optional] [default to 50] |
| **offset** | **Long**| The starting index of the response items, i.e. where the response should start listing the returned items. | [optional] [default to 0] |

### Return type

[**ListTransactionsByBlockHeightR**](ListTransactionsByBlockHeightR.md)

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
| **404** | The specified block has not been found on the specific blockchain. |  -  |
| **409** | The data provided seems to be invalid. |  -  |
| **415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
| **422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
| **429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
| **500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="listUnconfirmedTransactionsByAddress"></a>
# **listUnconfirmedTransactionsByAddress**
> ListUnconfirmedTransactionsByAddressR listUnconfirmedTransactionsByAddress(blockchain, network, address, context, limit, offset)

List Unconfirmed Transactions by Address

Through this endpoint customers can list transactions by &#x60;address&#x60; that are **unconfirmed**.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UnifiedEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UnifiedEndpointsApi apiInstance = new UnifiedEndpointsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String address = "2NDt6eztswLiVgVYaGUhkTPmugUGovVypAe"; // String | Represents the public address, which is a compressed and shortened form of a public key.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    Long limit = 50L; // Long | Defines how many items should be returned in the response per page basis.
    Long offset = 0L; // Long | The starting index of the response items, i.e. where the response should start listing the returned items.
    try {
      ListUnconfirmedTransactionsByAddressR result = apiInstance.listUnconfirmedTransactionsByAddress(blockchain, network, address, context, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnifiedEndpointsApi#listUnconfirmedTransactionsByAddress");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, bitcoin-cash, litecoin, dogecoin, dash, ethereum, ethereum-classic, zcash, binance-smart-chain] |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, testnet, mordor, goerli] |
| **address** | **String**| Represents the public address, which is a compressed and shortened form of a public key. | |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |
| **limit** | **Long**| Defines how many items should be returned in the response per page basis. | [optional] [default to 50] |
| **offset** | **Long**| The starting index of the response items, i.e. where the response should start listing the returned items. | [optional] [default to 0] |

### Return type

[**ListUnconfirmedTransactionsByAddressR**](ListUnconfirmedTransactionsByAddressR.md)

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

<a name="listUnspentTransactionOutputsByAddress"></a>
# **listUnspentTransactionOutputsByAddress**
> ListUnspentTransactionOutputsByAddressR listUnspentTransactionOutputsByAddress(blockchain, network, address, context, limit, offset)

List Unspent Transaction Outputs By Address

Through this endpoint customers can list their transactions&#39; unspent outputs by &#x60;address&#x60;.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UnifiedEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UnifiedEndpointsApi apiInstance = new UnifiedEndpointsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String address = "2MtzNEqm2D9jcbPJ5mW7Z3AUNwqt3afZH66"; // String | Represents the address that has unspend funds per which the result is returned.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    Integer limit = 50; // Integer | Defines how many items should be returned in the response per page basis.
    Integer offset = 0; // Integer | The starting index of the response items, i.e. where the response should start listing the returned items.
    try {
      ListUnspentTransactionOutputsByAddressR result = apiInstance.listUnspentTransactionOutputsByAddress(blockchain, network, address, context, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UnifiedEndpointsApi#listUnspentTransactionOutputsByAddress");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, bitcoin-cash, litecoin, dash, dogecoin, zcash] |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: testnet, mainnet] |
| **address** | **String**| Represents the address that has unspend funds per which the result is returned. | |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |
| **limit** | **Integer**| Defines how many items should be returned in the response per page basis. | [optional] [default to 50] |
| **offset** | **Integer**| The starting index of the response items, i.e. where the response should start listing the returned items. | [optional] [default to 0] |

### Return type

[**ListUnspentTransactionOutputsByAddressR**](ListUnspentTransactionOutputsByAddressR.md)

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


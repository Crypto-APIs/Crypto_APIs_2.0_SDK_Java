# TransactionsApi

All URIs are relative to *https://rest.cryptoapis.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCoinsTransactionRequestFromAddress**](TransactionsApi.md#createCoinsTransactionRequestFromAddress) | **POST** /wallet-as-a-service/wallets/{walletId}/{blockchain}/{network}/addresses/{address}/transaction-requests | Create Coins Transaction Request from Address
[**createCoinsTransactionRequestFromWallet**](TransactionsApi.md#createCoinsTransactionRequestFromWallet) | **POST** /wallet-as-a-service/wallets/{walletId}/{blockchain}/{network}/transaction-requests | Create Coins Transaction Request from Wallet
[**createTokensTransactionRequestFromAddress**](TransactionsApi.md#createTokensTransactionRequestFromAddress) | **POST** /wallet-as-a-service/wallets/{walletId}/{blockchain}/{network}/addresses/{address}/token-transaction-requests | Create Tokens Transaction Request from Address


<a name="createCoinsTransactionRequestFromAddress"></a>
# **createCoinsTransactionRequestFromAddress**
> CreateCoinsTransactionRequestFromAddressR createCoinsTransactionRequestFromAddress(address, blockchain, network, walletId, context, createCoinsTransactionRequestFromAddressRB)

Create Coins Transaction Request from Address

Through this endpoint users can create a new single transaction request from one address to another.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String address = "0x6f61e3c2fbb8c8be698bd0907ba6c04b62800fe5"; // String | Defines the specific source address for the transaction.
    String blockchain = "ethereum"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "network_example"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String walletId = "609e221675d04500068718dc"; // String | Represents the sender's specific and unique Wallet ID of the sender.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    CreateCoinsTransactionRequestFromAddressRB createCoinsTransactionRequestFromAddressRB = new CreateCoinsTransactionRequestFromAddressRB(); // CreateCoinsTransactionRequestFromAddressRB | 
    try {
      CreateCoinsTransactionRequestFromAddressR result = apiInstance.createCoinsTransactionRequestFromAddress(address, blockchain, network, walletId, context, createCoinsTransactionRequestFromAddressRB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#createCoinsTransactionRequestFromAddress");
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
 **address** | **String**| Defines the specific source address for the transaction. |
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: ethereum]
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [enum: mainnet]
 **walletId** | **String**| Represents the sender&#39;s specific and unique Wallet ID of the sender. |
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **createCoinsTransactionRequestFromAddressRB** | [**CreateCoinsTransactionRequestFromAddressRB**](CreateCoinsTransactionRequestFromAddressRB.md)|  | [optional]

### Return type

[**CreateCoinsTransactionRequestFromAddressR**](CreateCoinsTransactionRequestFromAddressR.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has been successful. |  -  |
**400** | The pagination attributes that have been used are invalid. Please check the Documentation to see details on pagination. |  -  |
**401** | The provided API key is invalid. Please, generate a new one from your Dashboard. |  -  |
**402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
**403** | Mainnets access is not available for your current subscription plan, please upgrade your plan to be able to use it. |  -  |
**409** | Your Wallet balance is insufficient to complete the action. Please, deposit funds to your Wallet and try again. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="createCoinsTransactionRequestFromWallet"></a>
# **createCoinsTransactionRequestFromWallet**
> CreateCoinsTransactionRequestFromWalletR createCoinsTransactionRequestFromWallet(blockchain, network, walletId, context, createCoinsTransactionRequestFromWalletRB)

Create Coins Transaction Request from Wallet

Through this endpoint users can create a new transaction request from the entire Wallet instead from just a specific address. This endpoint can generate transactions from multiple to multiple addresses.    {warning}This is available **only** for UTXO-based protocols such as Bitcoin, Bitcoin Cash, Litecoin, etc. It **is not** available for Account-based protocols like Ethereum.{/warning}

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String walletId = "609e221675d04500068718dc"; // String | Represents the sender's specific and unique Wallet ID of the sender.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    CreateCoinsTransactionRequestFromWalletRB createCoinsTransactionRequestFromWalletRB = new CreateCoinsTransactionRequestFromWalletRB(); // CreateCoinsTransactionRequestFromWalletRB | 
    try {
      CreateCoinsTransactionRequestFromWalletR result = apiInstance.createCoinsTransactionRequestFromWallet(blockchain, network, walletId, context, createCoinsTransactionRequestFromWalletRB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#createCoinsTransactionRequestFromWallet");
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
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, bitcoin-cash, litecoin, dogecoin, dash]
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [enum: mainnet, testnet]
 **walletId** | **String**| Represents the sender&#39;s specific and unique Wallet ID of the sender. |
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **createCoinsTransactionRequestFromWalletRB** | [**CreateCoinsTransactionRequestFromWalletRB**](CreateCoinsTransactionRequestFromWalletRB.md)|  | [optional]

### Return type

[**CreateCoinsTransactionRequestFromWalletR**](CreateCoinsTransactionRequestFromWalletR.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has been successful. |  -  |
**400** | The pagination attributes that have been used are invalid. Please check the Documentation to see details on pagination. |  -  |
**401** | The provided API key is invalid. Please, generate a new one from your Dashboard. |  -  |
**402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
**403** | Mainnets access is not available for your current subscription plan, please upgrade your plan to be able to use it. |  -  |
**409** | Please first create a deposit address for the specific blockchain and network, in order to be able to make transactions. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="createTokensTransactionRequestFromAddress"></a>
# **createTokensTransactionRequestFromAddress**
> CreateTokensTransactionRequestFromAddressR createTokensTransactionRequestFromAddress(address, blockchain, network, walletId, context, createTokensTransactionRequestFromAddressRB)

Create Tokens Transaction Request from Address

Through this endpoint users can make a single token transaction.    {warning}This applies only to **fungible** tokens, **not** NFTs (non-fungible tokens).{/warning}

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String address = "0x6f61e3c2fbb8c8be698bd0907ba6c04b62800fe5"; // String | Defines the specific source address for the transaction.
    String blockchain = "ethereum"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String walletId = "609e221675d04500068718dc"; // String | Defines the unique ID of the Wallet.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    CreateTokensTransactionRequestFromAddressRB createTokensTransactionRequestFromAddressRB = new CreateTokensTransactionRequestFromAddressRB(); // CreateTokensTransactionRequestFromAddressRB | 
    try {
      CreateTokensTransactionRequestFromAddressR result = apiInstance.createTokensTransactionRequestFromAddress(address, blockchain, network, walletId, context, createTokensTransactionRequestFromAddressRB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#createTokensTransactionRequestFromAddress");
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
 **address** | **String**| Defines the specific source address for the transaction. |
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [default to ethereum] [enum: ethereum]
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [default to mainnet] [enum: mainnet, ropsten]
 **walletId** | **String**| Defines the unique ID of the Wallet. |
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **createTokensTransactionRequestFromAddressRB** | [**CreateTokensTransactionRequestFromAddressRB**](CreateTokensTransactionRequestFromAddressRB.md)|  | [optional]

### Return type

[**CreateTokensTransactionRequestFromAddressR**](CreateTokensTransactionRequestFromAddressR.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The resource has been successfully created. |  -  |
**400** | The pagination attributes that have been used are invalid. Please check the Documentation to see details on pagination. |  -  |
**401** | The provided API key is invalid. Please, generate a new one from your Dashboard. |  -  |
**402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
**403** | Mainnets access is not available for your current subscription plan, please upgrade your plan to be able to use it. |  -  |
**409** | The token is not supported for this blockchain and network. To be supported, please contact our team. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |


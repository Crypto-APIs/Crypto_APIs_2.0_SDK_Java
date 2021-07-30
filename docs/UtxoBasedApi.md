# UtxoBasedApi

All URIs are relative to *https://rest.cryptoapis.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHDWalletXPubYPubZPubDetails**](UtxoBasedApi.md#getHDWalletXPubYPubZPubDetails) | **GET** /blockchain-data/{blockchain}/{network}/hd/{extendedPublicKey}/details | Get HD Wallet (xPub, yPub, zPub) Details
[**listHDWalletXPubYPubZPubTransactions**](UtxoBasedApi.md#listHDWalletXPubYPubZPubTransactions) | **GET** /blockchain-data/{blockchain}/{network}/hd/{extendedPublicKey}/transactions | List HD Wallet (xPub, yPub, zPub) Transactions
[**syncHDWalletXPubYPubZPub**](UtxoBasedApi.md#syncHDWalletXPubYPubZPub) | **POST** /blockchain-data/{blockchain}/{network}/hd/sync | Sync HD Wallet (xPub, yPub, zPub)


<a name="getHDWalletXPubYPubZPubDetails"></a>
# **getHDWalletXPubYPubZPubDetails**
> GetHDWalletXPubYPubZPubDetailsR getHDWalletXPubYPubZPubDetails(blockchain, extendedPublicKey, network, context, derivation)

Get HD Wallet (xPub, yPub, zPub) Details

HD wallet details is useful endpoint to get the most important data about HD wallet without the need to do a lot of calculations, once the HD Wallet is synced using Sync endpoint we keep it up to date and we calculate these details in advance.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UtxoBasedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UtxoBasedApi apiInstance = new UtxoBasedApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String extendedPublicKey = "upub5Ei6bRNneqozk6smK7dvtXHC5PjUyEL4ynCfMKvjznLcXi9DQaikETzQjHvJC43XexMvQs64jxB1njMjCHpRZ4xQWAmv3ge9cVtjfsHmbvQ"; // String | Defines the account extended publicly known key which is used to derive all child public keys.
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    String derivation = "derivation_example"; // String | The way how the HD walled derives, for example when the type is ACCOUNT, it derives change and receive addresses while when the type is BIP32 it derives directly.
    try {
      GetHDWalletXPubYPubZPubDetailsR result = apiInstance.getHDWalletXPubYPubZPubDetails(blockchain, extendedPublicKey, network, context, derivation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UtxoBasedApi#getHDWalletXPubYPubZPubDetails");
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
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, bitcoin-cash, litecoin, dogecoin, dash, ethereum]
 **extendedPublicKey** | **String**| Defines the account extended publicly known key which is used to derive all child public keys. |
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [enum: mainnet, testnet, ropsten, rinkeby]
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **derivation** | **String**| The way how the HD walled derives, for example when the type is ACCOUNT, it derives change and receive addresses while when the type is BIP32 it derives directly. | [optional] [enum: account, bip32]

### Return type

[**GetHDWalletXPubYPubZPubDetailsR**](GetHDWalletXPubYPubZPubDetailsR.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has been successful. |  -  |
**400** | This xPub is not yet synced, please first use endpoint “Sync HD (xPub, yPub, zPub) wallet” to synchronize it. |  -  |
**401** | The provided API key is invalid. Please, generate a new one from your Dashboard. |  -  |
**402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
**403** | Mainnets access is not available for your current subscription plan, please upgrade your plan to be able to use it. |  -  |
**409** | The data provided seems to be invalid. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your wallet (xPub, yPub, zPub) is still syncing, it should take few seconds depending on how many transactions it has. |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="listHDWalletXPubYPubZPubTransactions"></a>
# **listHDWalletXPubYPubZPubTransactions**
> ListHDWalletXPubYPubZPubTransactionsR listHDWalletXPubYPubZPubTransactions(blockchain, extendedPublicKey, network, context, derivation, limit, offset)

List HD Wallet (xPub, yPub, zPub) Transactions

This endpoint will list HD Wallet transactions.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UtxoBasedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UtxoBasedApi apiInstance = new UtxoBasedApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain.
    String extendedPublicKey = "tpubD9GMECjiZHCaF9NHSMAeMbQMXnM7CviEJZsYBuztVwsUjPHWjxewWAUXWV2UExaAtoEvQGXDBmVWo6ZHGtj6TsH6Pop7D9DskQwGHA1gu1w"; // String | Defines the master public key (xPub) of the account.
    String network = "testnet"; // String | Represents the specific network.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    String derivation = "derivation_example"; // String | The way how the HD walled derives, for example when the type is ACCOUNT, it derives change and receive addresses while when the type is BIP32 it derives directly.
    Integer limit = 50; // Integer | Defines how many items should be returned in the response per page basis.
    Integer offset = 0; // Integer | The starting index of the response items, i.e. where the response should start listing the returned items.
    try {
      ListHDWalletXPubYPubZPubTransactionsR result = apiInstance.listHDWalletXPubYPubZPubTransactions(blockchain, extendedPublicKey, network, context, derivation, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UtxoBasedApi#listHDWalletXPubYPubZPubTransactions");
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
 **blockchain** | **String**| Represents the specific blockchain. | [enum: bitcoin, bitcoin-cash, litecoin, dogecoin, dash, ethereum]
 **extendedPublicKey** | **String**| Defines the master public key (xPub) of the account. |
 **network** | **String**| Represents the specific network. | [enum: mainnet, testnet, ropsten, rinkeby]
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **derivation** | **String**| The way how the HD walled derives, for example when the type is ACCOUNT, it derives change and receive addresses while when the type is BIP32 it derives directly. | [optional] [enum: account, bip32]
 **limit** | **Integer**| Defines how many items should be returned in the response per page basis. | [optional] [default to 50]
 **offset** | **Integer**| The starting index of the response items, i.e. where the response should start listing the returned items. | [optional] [default to 0]

### Return type

[**ListHDWalletXPubYPubZPubTransactionsR**](ListHDWalletXPubYPubZPubTransactionsR.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has been successful. |  -  |
**400** | This xPub is not yet synced, please first use endpoint “Sync HD (xPub, yPub, zPub) wallet” to synchronize it. |  -  |
**401** | The provided API key is invalid. Please, generate a new one from your Dashboard. |  -  |
**402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
**403** | Mainnets access is not available for your current subscription plan, please upgrade your plan to be able to use it. |  -  |
**409** | The data provided seems to be invalid. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your wallet (xPub, yPub, zPub) is still syncing, it should take few seconds depending on how many transactions it has. |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="syncHDWalletXPubYPubZPub"></a>
# **syncHDWalletXPubYPubZPub**
> SyncHDWalletXPubYPubZPubR syncHDWalletXPubYPubZPub(blockchain, network, context, syncHDWalletXPubYPubZPubRB)

Sync HD Wallet (xPub, yPub, zPub)

HD wallets usually have a lot of addresses and transactions, getting the data on demand is a heavy operation. That&#39;s why we have created this feature, to be able to get HD wallet details or transactions this HD wallet must be synced first. In addition to the initial sync we keep updating the synced HD wallets all the time.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.UtxoBasedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UtxoBasedApi apiInstance = new UtxoBasedApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    SyncHDWalletXPubYPubZPubRB syncHDWalletXPubYPubZPubRB = new SyncHDWalletXPubYPubZPubRB(); // SyncHDWalletXPubYPubZPubRB | 
    try {
      SyncHDWalletXPubYPubZPubR result = apiInstance.syncHDWalletXPubYPubZPub(blockchain, network, context, syncHDWalletXPubYPubZPubRB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UtxoBasedApi#syncHDWalletXPubYPubZPub");
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
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **syncHDWalletXPubYPubZPubRB** | [**SyncHDWalletXPubYPubZPubRB**](SyncHDWalletXPubYPubZPubRB.md)|  | [optional]

### Return type

[**SyncHDWalletXPubYPubZPubR**](SyncHDWalletXPubYPubZPubR.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The resource has been successfully created. |  -  |
**400** | The provided Xpub is invalid. |  -  |
**401** | The provided API key is invalid. Please, generate a new one from your Dashboard. |  -  |
**402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
**403** | Mainnets access is not available for your current subscription plan, please upgrade your plan to be able to use it. |  -  |
**409** | The specified resource already exists. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your wallet (xPub, yPub, zPub) is still syncing, it should take few seconds depending on how many transactions it has. |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |


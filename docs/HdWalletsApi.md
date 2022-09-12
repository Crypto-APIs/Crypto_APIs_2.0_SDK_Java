# HdWalletsApi

All URIs are relative to *https://rest.cryptoapis.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deriveAndSyncNewChangeAddresses**](HdWalletsApi.md#deriveAndSyncNewChangeAddresses) | **POST** /blockchain-data/{blockchain}/{network}/hd/derive-sync-change | Derive And Sync New Change Addresses |
| [**deriveAndSyncNewReceivingAddresses**](HdWalletsApi.md#deriveAndSyncNewReceivingAddresses) | **POST** /blockchain-data/{blockchain}/{network}/hd/derive-and-sync | Derive And Sync New Receiving Addresses |
| [**getHDWalletXPubYPubZPubAssets**](HdWalletsApi.md#getHDWalletXPubYPubZPubAssets) | **GET** /blockchain-data/{blockchain}/{network}/hd/{extendedPublicKey}/assets | Get HD Wallet (xPub, yPub, zPub) Assets |
| [**getHDWalletXPubYPubZPubDetails**](HdWalletsApi.md#getHDWalletXPubYPubZPubDetails) | **GET** /blockchain-data/{blockchain}/{network}/hd/{extendedPublicKey}/details | Get HD Wallet (xPub, yPub, zPub) Details |
| [**listHDWalletXPubYPubZPubTransactions**](HdWalletsApi.md#listHDWalletXPubYPubZPubTransactions) | **GET** /blockchain-data/{blockchain}/{network}/hd/{extendedPublicKey}/transactions | List HD Wallet (xPub, yPub, zPub) Transactions |
| [**listHDWalletXPubYPubZPubUTXOs**](HdWalletsApi.md#listHDWalletXPubYPubZPubUTXOs) | **GET** /blockchain-data/{blockchain}/{network}/hd/{extendedPublicKey}/utxos | List HD Wallet (xPub, yPub, zPub) UTXOs |
| [**listSyncedAddresses**](HdWalletsApi.md#listSyncedAddresses) | **GET** /blockchain-data/{blockchain}/{network}/hd/{extendedPublicKey}/synced-addresses | List Synced Addresses |
| [**prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPub**](HdWalletsApi.md#prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPub) | **POST** /blockchain-data/{blockchain}/{network}/transactions/prepare-utxo-transaction | Prepare A UTXO-Based Transaction From HD Wallet (xPub, yPub, zPub) |
| [**prepareAnAccountBasedTransactionFromHDWalletXPubYPubZPub**](HdWalletsApi.md#prepareAnAccountBasedTransactionFromHDWalletXPubYPubZPub) | **POST** /blockchain-data/{blockchain}/{network}/transactions/prepare-account-based-transaction | Prepare An Account-Based Transaction From HD Wallet (xPub, yPub, zPub) |
| [**syncHDWalletXPubYPubZPub**](HdWalletsApi.md#syncHDWalletXPubYPubZPub) | **POST** /blockchain-data/{blockchain}/{network}/hd/sync | Sync HD Wallet (xPub, yPub, zPub) |
| [**syncNewHDWalletXPubYPubZPub**](HdWalletsApi.md#syncNewHDWalletXPubYPubZPub) | **POST** /blockchain-data/{blockchain}/{network}/hd/sync-new | Sync New HD Wallet (xPub, yPub, zPub) |


<a name="deriveAndSyncNewChangeAddresses"></a>
# **deriveAndSyncNewChangeAddresses**
> DeriveAndSyncNewChangeAddressesR deriveAndSyncNewChangeAddresses(blockchain, network, context, deriveAndSyncNewChangeAddressesRB)

Derive And Sync New Change Addresses

Through this endpoint users can derive 100 change addresses, starting from the last index we have data for, which are then added to the xPub, subscribed for syncing, and start recording data. If no data is available, it will start from index 0.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.HdWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    HdWalletsApi apiInstance = new HdWalletsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    DeriveAndSyncNewChangeAddressesRB deriveAndSyncNewChangeAddressesRB = new DeriveAndSyncNewChangeAddressesRB(); // DeriveAndSyncNewChangeAddressesRB | 
    try {
      DeriveAndSyncNewChangeAddressesR result = apiInstance.deriveAndSyncNewChangeAddresses(blockchain, network, context, deriveAndSyncNewChangeAddressesRB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HdWalletsApi#deriveAndSyncNewChangeAddresses");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin] |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, testnet] |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |
| **deriveAndSyncNewChangeAddressesRB** | [**DeriveAndSyncNewChangeAddressesRB**](DeriveAndSyncNewChangeAddressesRB.md)|  | [optional] |

### Return type

[**DeriveAndSyncNewChangeAddressesR**](DeriveAndSyncNewChangeAddressesR.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfull Request |  -  |
| **400** | 400 |  -  |
| **401** | 401 |  -  |
| **402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
| **403** | 403 |  -  |
| **409** | The data provided seems to be invalid. |  -  |
| **415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
| **422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
| **429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
| **500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="deriveAndSyncNewReceivingAddresses"></a>
# **deriveAndSyncNewReceivingAddresses**
> DeriveAndSyncNewReceivingAddressesR deriveAndSyncNewReceivingAddresses(blockchain, network, context, deriveAndSyncNewReceivingAddressesRB)

Derive And Sync New Receiving Addresses

Through this endpoint users can derive 100 receiving addresses, starting from the last index we have data for, which are then added to the xPub, subscribed for syncing, and start recording data. If no data is available, it will start from index 0.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.HdWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    HdWalletsApi apiInstance = new HdWalletsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    DeriveAndSyncNewReceivingAddressesRB deriveAndSyncNewReceivingAddressesRB = new DeriveAndSyncNewReceivingAddressesRB(); // DeriveAndSyncNewReceivingAddressesRB | 
    try {
      DeriveAndSyncNewReceivingAddressesR result = apiInstance.deriveAndSyncNewReceivingAddresses(blockchain, network, context, deriveAndSyncNewReceivingAddressesRB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HdWalletsApi#deriveAndSyncNewReceivingAddresses");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, ethereum] |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, testnet, goerli] |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |
| **deriveAndSyncNewReceivingAddressesRB** | [**DeriveAndSyncNewReceivingAddressesRB**](DeriveAndSyncNewReceivingAddressesRB.md)|  | [optional] |

### Return type

[**DeriveAndSyncNewReceivingAddressesR**](DeriveAndSyncNewReceivingAddressesR.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfull Request |  -  |
| **400** | 400 |  -  |
| **401** | 401 |  -  |
| **402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
| **403** | 403 |  -  |
| **409** | The data provided seems to be invalid. |  -  |
| **415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
| **422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
| **429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
| **500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="getHDWalletXPubYPubZPubAssets"></a>
# **getHDWalletXPubYPubZPubAssets**
> GetHDWalletXPubYPubZPubAssetsR getHDWalletXPubYPubZPubAssets(blockchain, extendedPublicKey, network, context, derivation)

Get HD Wallet (xPub, yPub, zPub) Assets

This endpoint will return details on assets we support for a specified from the customer extended public key (xPub). These could be cryptocurrencies, fungible or non-fungible (NFT) tokens. Each asset has a unique identifier - assetId, and a unique symbol in the form of a string, e.g. \&quot;USDT\&quot;.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.HdWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    HdWalletsApi apiInstance = new HdWalletsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String extendedPublicKey = "xpub68SyZPMPpZUy9QB2fk2J28b5Rwd6jeWKind3K8oziZuVcL7wWZiXZNCPKuh42ejSpTLYngQ9Gbzj9a1Ap2QQmoFs2sMSbUvkEr8D3GW7MrR"; // String | Defines the account extended publicly known key which is used to derive all child public keys.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    String derivation = "account"; // String | The way how the HD walled derives, for example when the type is ACCOUNT, it derives change and receive addresses while when the type is BIP32 it derives directly.
    try {
      GetHDWalletXPubYPubZPubAssetsR result = apiInstance.getHDWalletXPubYPubZPubAssets(blockchain, extendedPublicKey, network, context, derivation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HdWalletsApi#getHDWalletXPubYPubZPubAssets");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, bitcoin-cash, litecoin, dogecoin, dash, ethereum, zcash, ethereum-classic, binance-smart-chain, xrp] |
| **extendedPublicKey** | **String**| Defines the account extended publicly known key which is used to derive all child public keys. | |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, testnet, mordor, goerli] |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |
| **derivation** | **String**| The way how the HD walled derives, for example when the type is ACCOUNT, it derives change and receive addresses while when the type is BIP32 it derives directly. | [optional] [enum: account, bip32] |

### Return type

[**GetHDWalletXPubYPubZPubAssetsR**](GetHDWalletXPubYPubZPubAssetsR.md)

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
| **422** | 422 |  -  |
| **429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
| **500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

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
import org.openapitools.client.api.HdWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    HdWalletsApi apiInstance = new HdWalletsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String extendedPublicKey = "upub5Ei6bRNneqozk6smK7dvtXHC5PjUyEL4ynCfMKvjznLcXi9DQaikETzQjHvJC43XexMvQs64jxB1njMjCHpRZ4xQWAmv3ge9cVtjfsHmbvQ"; // String | Defines the account extended publicly known key which is used to derive all child public keys.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    String derivation = "account"; // String | The way how the HD walled derives, for example when the type is ACCOUNT, it derives change and receive addresses while when the type is BIP32 it derives directly.
    try {
      GetHDWalletXPubYPubZPubDetailsR result = apiInstance.getHDWalletXPubYPubZPubDetails(blockchain, extendedPublicKey, network, context, derivation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HdWalletsApi#getHDWalletXPubYPubZPubDetails");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, bitcoin-cash, litecoin, dogecoin, dash, ethereum, zcash, ethereum-classic, binance-smart-chain, xrp] |
| **extendedPublicKey** | **String**| Defines the account extended publicly known key which is used to derive all child public keys. | |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, testnet, mordor, goerli] |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |
| **derivation** | **String**| The way how the HD walled derives, for example when the type is ACCOUNT, it derives change and receive addresses while when the type is BIP32 it derives directly. | [optional] [enum: account, bip32] |

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
| **200** | The request has been successful. |  -  |
| **400** | 400 |  -  |
| **401** | 401 |  -  |
| **402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
| **403** | 403 |  -  |
| **409** | The data provided seems to be invalid. |  -  |
| **415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
| **422** | 422 |  -  |
| **429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
| **500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

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
import org.openapitools.client.api.HdWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    HdWalletsApi apiInstance = new HdWalletsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain.
    String extendedPublicKey = "tpubD9GMECjiZHCaF9NHSMAeMbQMXnM7CviEJZsYBuztVwsUjPHWjxewWAUXWV2UExaAtoEvQGXDBmVWo6ZHGtj6TsH6Pop7D9DskQwGHA1gu1w"; // String | Defines the master public key (xPub) of the account.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    String derivation = "account"; // String | The way how the HD walled derives, for example when the type is ACCOUNT, it derives change and receive addresses while when the type is BIP32 it derives directly.
    Long limit = 50L; // Long | Defines how many items should be returned in the response per page basis.
    Long offset = 0L; // Long | The starting index of the response items, i.e. where the response should start listing the returned items.
    try {
      ListHDWalletXPubYPubZPubTransactionsR result = apiInstance.listHDWalletXPubYPubZPubTransactions(blockchain, extendedPublicKey, network, context, derivation, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HdWalletsApi#listHDWalletXPubYPubZPubTransactions");
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
| **blockchain** | **String**| Represents the specific blockchain. | [enum: bitcoin, bitcoin-cash, litecoin, dogecoin, dash, ethereum, zcash, ethereum-classic, binance-smart-chain, xrp] |
| **extendedPublicKey** | **String**| Defines the master public key (xPub) of the account. | |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, testnet, mordor, goerli] |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |
| **derivation** | **String**| The way how the HD walled derives, for example when the type is ACCOUNT, it derives change and receive addresses while when the type is BIP32 it derives directly. | [optional] [enum: account, bip32] |
| **limit** | **Long**| Defines how many items should be returned in the response per page basis. | [optional] [default to 50] |
| **offset** | **Long**| The starting index of the response items, i.e. where the response should start listing the returned items. | [optional] [default to 0] |

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
| **200** | The request has been successful. |  -  |
| **400** | 400 |  -  |
| **401** | 401 |  -  |
| **402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
| **403** | 403 |  -  |
| **409** | The data provided seems to be invalid. |  -  |
| **415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
| **422** | 422 |  -  |
| **429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
| **500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="listHDWalletXPubYPubZPubUTXOs"></a>
# **listHDWalletXPubYPubZPubUTXOs**
> ListHDWalletXPubYPubZPubUTXOsR listHDWalletXPubYPubZPubUTXOs(blockchain, extendedPublicKey, network, context, derivation, limit, offset)

List HD Wallet (xPub, yPub, zPub) UTXOs

Through this endpoint you can list HD wallet&#39;s UTXOs (Unspent Transaction Outputs) by providing extended public key of an already synced HD wallet.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.HdWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    HdWalletsApi apiInstance = new HdWalletsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String extendedPublicKey = "tpubDDCs6jf3Tg8VTts6EBCNpibVanPQpSkmYRLAXVvuhcuC6ZcbYtEizqERj8D4TBukuvjNSjtjEbKYdtFuRG5WuisrirZG9m5L8wUvf4bHhgQ"; // String | Defines the account extended publicly known key which is used to derive all child public keys.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    String derivation = "account"; // String | The way how the HD walled derives, for example when the type is ACCOUNT, it derives change and receive addresses while when the type is BIP32 it derives directly.
    Long limit = 50L; // Long | Defines how many items should be returned in the response per page basis.
    Long offset = 0L; // Long | The starting index of the response items, i.e. where the response should start listing the returned items.
    try {
      ListHDWalletXPubYPubZPubUTXOsR result = apiInstance.listHDWalletXPubYPubZPubUTXOs(blockchain, extendedPublicKey, network, context, derivation, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HdWalletsApi#listHDWalletXPubYPubZPubUTXOs");
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
| **extendedPublicKey** | **String**| Defines the account extended publicly known key which is used to derive all child public keys. | |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, testnet] |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |
| **derivation** | **String**| The way how the HD walled derives, for example when the type is ACCOUNT, it derives change and receive addresses while when the type is BIP32 it derives directly. | [optional] [enum: account, bip32] |
| **limit** | **Long**| Defines how many items should be returned in the response per page basis. | [optional] [default to 50] |
| **offset** | **Long**| The starting index of the response items, i.e. where the response should start listing the returned items. | [optional] [default to 0] |

### Return type

[**ListHDWalletXPubYPubZPubUTXOsR**](ListHDWalletXPubYPubZPubUTXOsR.md)

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
| **422** | 422 |  -  |
| **429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
| **500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="listSyncedAddresses"></a>
# **listSyncedAddresses**
> ListSyncedAddressesR listSyncedAddresses(blockchain, extendedPublicKey, network, context, addressFormat, isChangeAddress, limit, offset)

List Synced Addresses

Through this endpoint users can list all addresses that Crypto APIs has synced for a specific xPub. This includes previous and current/new xPubs, what addresses we’ve synced for them, etc.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.HdWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    HdWalletsApi apiInstance = new HdWalletsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String extendedPublicKey = "tpubD9GMECjiZHCaF9NHSMAeMbQMXnM7CviEJZsYBuztVwsUjPHWjxewWAUXWV2UExaAtoEvQGXDBmVWo6ZHGtj6TsH6Pop7D9DskQwGHA1gu1w"; // String | Defines the account extended publicly known key which is used to derive all child public keys.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    String addressFormat = "p2pkh"; // String | Defines the address format value.
    Boolean isChangeAddress = true; // Boolean | Defines if the address is change addres or not.
    Long limit = 50L; // Long | Defines how many items should be returned in the response per page basis.
    Long offset = 0L; // Long | The starting index of the response items, i.e. where the response should start listing the returned items.
    try {
      ListSyncedAddressesR result = apiInstance.listSyncedAddresses(blockchain, extendedPublicKey, network, context, addressFormat, isChangeAddress, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HdWalletsApi#listSyncedAddresses");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, ethereum] |
| **extendedPublicKey** | **String**| Defines the account extended publicly known key which is used to derive all child public keys. | |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, testnet, goerli] |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |
| **addressFormat** | **String**| Defines the address format value. | [optional] [enum: p2pkh, p2sh, p2wpkh, p2pkh-cash, p2sh-cash, standard, classic] |
| **isChangeAddress** | **Boolean**| Defines if the address is change addres or not. | [optional] [default to true] |
| **limit** | **Long**| Defines how many items should be returned in the response per page basis. | [optional] [default to 50] |
| **offset** | **Long**| The starting index of the response items, i.e. where the response should start listing the returned items. | [optional] [default to 0] |

### Return type

[**ListSyncedAddressesR**](ListSyncedAddressesR.md)

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

<a name="prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPub"></a>
# **prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPub**
> PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubR prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPub(blockchain, network, context, prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRB)

Prepare A UTXO-Based Transaction From HD Wallet (xPub, yPub, zPub)

Through the “Prepare a UTXO-based transaction from xPub” endpoint users can prepare a transaction for signing from all synced with Crypto APIs addresses for the specific xPub. This is based on the &#x60;selectionStrategy&#x60; and the addresses’ balances. In the case a user has an address not synced with Crypto APIs, it will not be included. This endpoint applies to all supported UTXO-based blockchain protocols, e.g. Bitcoin, Litecoin, etc.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.HdWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    HdWalletsApi apiInstance = new HdWalletsApi(defaultClient);
    String blockchain = "bitcoin"; // String | 
    String network = "testnet"; // String | 
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRB prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRB = new PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRB(); // PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRB | 
    try {
      PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubR result = apiInstance.prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPub(blockchain, network, context, prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HdWalletsApi#prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPub");
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
| **blockchain** | **String**|  | [enum: bitcoin] |
| **network** | **String**|  | [enum: testnet, mainnet] |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |
| **prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRB** | [**PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRB**](PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRB.md)|  | [optional] |

### Return type

[**PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubR**](PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubR.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The resource has been successfully submitted. |  -  |
| **400** | 400 |  -  |
| **401** | 401 |  -  |
| **402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
| **403** | 403 |  -  |
| **409** | The data provided seems to be invalid. |  -  |
| **415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
| **422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
| **429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
| **500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="prepareAnAccountBasedTransactionFromHDWalletXPubYPubZPub"></a>
# **prepareAnAccountBasedTransactionFromHDWalletXPubYPubZPub**
> PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubR prepareAnAccountBasedTransactionFromHDWalletXPubYPubZPub(blockchain, network, context, prepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRB)

Prepare An Account-Based Transaction From HD Wallet (xPub, yPub, zPub)

Through the “Prepare an account-based transaction from xPub” endpoint users can prepare a transaction for signing from a synced with Crypto APIs address from the specific xPub. This endpoint applies to all supported account-based blockchain protocols, e.g. Ethereum, BSC, etc

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.HdWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    HdWalletsApi apiInstance = new HdWalletsApi(defaultClient);
    String blockchain = "ethereum"; // String | 
    String network = "mainnet"; // String | 
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRB prepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRB = new PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRB(); // PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRB | 
    try {
      PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubR result = apiInstance.prepareAnAccountBasedTransactionFromHDWalletXPubYPubZPub(blockchain, network, context, prepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HdWalletsApi#prepareAnAccountBasedTransactionFromHDWalletXPubYPubZPub");
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
| **blockchain** | **String**|  | [enum: ethereum] |
| **network** | **String**|  | [enum: mainnet, goerli] |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |
| **prepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRB** | [**PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRB**](PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRB.md)|  | [optional] |

### Return type

[**PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubR**](PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubR.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The resource has been successfully submitted. |  -  |
| **400** | 400 |  -  |
| **401** | 401 |  -  |
| **402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
| **403** | 403 |  -  |
| **409** | The data provided seems to be invalid. |  -  |
| **415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
| **422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
| **429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
| **500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

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
import org.openapitools.client.api.HdWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    HdWalletsApi apiInstance = new HdWalletsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    SyncHDWalletXPubYPubZPubRB syncHDWalletXPubYPubZPubRB = new SyncHDWalletXPubYPubZPubRB(); // SyncHDWalletXPubYPubZPubRB | 
    try {
      SyncHDWalletXPubYPubZPubR result = apiInstance.syncHDWalletXPubYPubZPub(blockchain, network, context, syncHDWalletXPubYPubZPubRB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HdWalletsApi#syncHDWalletXPubYPubZPub");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, bitcoin-cash, litecoin, dogecoin, dash, ethereum, zcash, ethereum-classic, binance-smart-chain, xrp] |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, testnet, mordor, goerli] |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |
| **syncHDWalletXPubYPubZPubRB** | [**SyncHDWalletXPubYPubZPubRB**](SyncHDWalletXPubYPubZPubRB.md)|  | [optional] |

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
| **201** | The resource has been successfully created. |  -  |
| **400** | 400 |  -  |
| **401** | 401 |  -  |
| **402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
| **403** | 403 |  -  |
| **409** | 409 |  -  |
| **415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
| **422** | 422 |  -  |
| **429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
| **500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="syncNewHDWalletXPubYPubZPub"></a>
# **syncNewHDWalletXPubYPubZPub**
> SyncNewHDWalletXPubYPubZPubR syncNewHDWalletXPubYPubZPub(blockchain, network, context, syncNewHDWalletXPubYPubZPubRB)

Sync New HD Wallet (xPub, yPub, zPub)

Through this endpoint users can add a brand new xPub to the Crypto APIs system to be ready for deriving. Unlike our other similar endpoint “Sync HD Wallet (xPub, yPub, zPub)”, this endpoint does not create new addresses nor syncs old data.

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.HdWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    HdWalletsApi apiInstance = new HdWalletsApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.
    String context = "yourExampleString"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    SyncNewHDWalletXPubYPubZPubRB syncNewHDWalletXPubYPubZPubRB = new SyncNewHDWalletXPubYPubZPubRB(); // SyncNewHDWalletXPubYPubZPubRB | 
    try {
      SyncNewHDWalletXPubYPubZPubR result = apiInstance.syncNewHDWalletXPubYPubZPub(blockchain, network, context, syncNewHDWalletXPubYPubZPubRB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HdWalletsApi#syncNewHDWalletXPubYPubZPub");
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
| **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, ethereum] |
| **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. | [enum: mainnet, testnet, goerli] |
| **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional] |
| **syncNewHDWalletXPubYPubZPubRB** | [**SyncNewHDWalletXPubYPubZPubRB**](SyncNewHDWalletXPubYPubZPubRB.md)|  | [optional] |

### Return type

[**SyncNewHDWalletXPubYPubZPubR**](SyncNewHDWalletXPubYPubZPubR.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The resource has been successfully created. |  -  |
| **400** | 400 |  -  |
| **401** | 401 |  -  |
| **402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
| **403** | 403 |  -  |
| **409** | 409 |  -  |
| **415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
| **422** | 422 |  -  |
| **429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
| **500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |


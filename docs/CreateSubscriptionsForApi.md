# CreateSubscriptionsForApi

All URIs are relative to *https://rest.cryptoapis.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**minedTransaction**](CreateSubscriptionsForApi.md#minedTransaction) | **POST** /blockchain-events/{blockchain}/{network}/subscriptions/transaction-mined | Mined transaction
[**newBlock**](CreateSubscriptionsForApi.md#newBlock) | **POST** /blockchain-events/{blockchain}/{network}/subscriptions/block-mined | New Block
[**newConfirmedCoinsTransactions**](CreateSubscriptionsForApi.md#newConfirmedCoinsTransactions) | **POST** /blockchain-events/{blockchain}/{network}/subscriptions/address-coins-transactions-confirmed | New confirmed coins transactions
[**newConfirmedCoinsTransactionsAndEachConfirmation**](CreateSubscriptionsForApi.md#newConfirmedCoinsTransactionsAndEachConfirmation) | **POST** /blockchain-events/{blockchain}/{network}/subscriptions/address-coins-transactions-confirmed-each-confirmation | New confirmed coins transactions and each confirmation
[**newConfirmedInternalTransactions**](CreateSubscriptionsForApi.md#newConfirmedInternalTransactions) | **POST** /blockchain-events/{blockchain}/{network}/subscriptions/address-internal-transactions-confirmed | New confirmed internal transactions
[**newConfirmedInternalTransactionsAndEachConfirmation**](CreateSubscriptionsForApi.md#newConfirmedInternalTransactionsAndEachConfirmation) | **POST** /blockchain-events/{blockchain}/{network}/subscriptions/address-internal-transactions-confirmed-each-confirmation | New confirmed internal transactions and each confirmation
[**newConfirmedTokensTransactions**](CreateSubscriptionsForApi.md#newConfirmedTokensTransactions) | **POST** /blockchain-events/{blockchain}/{network}/subscriptions/address-tokens-transactions-confirmed | New confirmed tokens transactions
[**newConfirmedTokensTransactionsAndEachConfirmation**](CreateSubscriptionsForApi.md#newConfirmedTokensTransactionsAndEachConfirmation) | **POST** /blockchain-events/{blockchain}/{network}/subscriptions/address-tokens-transactions-confirmed-each-confirmation | New confirmed tokens transactions and each confirmation
[**newUnconfirmedCoinsTransactions**](CreateSubscriptionsForApi.md#newUnconfirmedCoinsTransactions) | **POST** /blockchain-events/{blockchain}/{network}/subscriptions/address-coins-transactions-unconfirmed | New unconfirmed coins transactions
[**newUnconfirmedTokensTransactions**](CreateSubscriptionsForApi.md#newUnconfirmedTokensTransactions) | **POST** /blockchain-events/{blockchain}/{network}/subscriptions/address-tokens-transactions-unconfirmed | New unconfirmed tokens transactions


<a name="minedTransaction"></a>
# **minedTransaction**
> MinedTransactionR minedTransaction(blockchain, network, context, minedTransactionRB)

Mined transaction

Through this endpoint customers can create callback subscriptions for a specific event. In this case the event is when a specific transaction is mined. By creating this subscription the user will be notified by Crypto APIs 2.0 when that event occurs. The information is returned per specified &#x60;transactionId&#x60;.    A transaction is mined when it is included in a new block in the blockchain.    {note}To have an operational callback subscription, you need to first verify a domain for the Callback URL. Please see more information on Callbacks [here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-url).{/note}    {warning}Crypto APIs will notify the user **only when** the event occurs. There are cases when the specific event doesn&#39;t happen at all, or takes a long time to do so. A callback notification **will not** be sent if the event does not or cannot occur, or will take long time to occur.{/warning}

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.CreateSubscriptionsForApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    CreateSubscriptionsForApi apiInstance = new CreateSubscriptionsForApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    MinedTransactionRB minedTransactionRB = new MinedTransactionRB(); // MinedTransactionRB | 
    try {
      MinedTransactionR result = apiInstance.minedTransaction(blockchain, network, context, minedTransactionRB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateSubscriptionsForApi#minedTransaction");
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
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, bitcoin-cash, litecoin, dogecoin, dash, ethereum, ethereum-classic, xrp, zilliqa]
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [enum: mainnet, testnet, ropsten, rinkeby, mordor, kotti]
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **minedTransactionRB** | [**MinedTransactionRB**](MinedTransactionRB.md)|  | [optional]

### Return type

[**MinedTransactionR**](MinedTransactionR.md)

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
**403** | You have reached the maximum number of active Blockchain Events subscriptions which is {callbacks_limit} now. Please upgrade your plan to be get higher number of active subscriptions. |  -  |
**409** | The specified resource already exists. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="newBlock"></a>
# **newBlock**
> NewBlockR newBlock(blockchain, network, context, newBlockRB)

New Block

Through this endpoint customers can create callback subscriptions for a specific event. In this case the event is when a new block is mined in the specific blockchain. By creating this subscription the user will be notified by Crypto APIs 2.0 when that event occurs. The information is returned per specified address.    A new block is mined when it is added to the chain once a consensus is reached by the majority of the miners, which is when the block gets validated and added to the blockchain.    {note}To have an operational callback subscription, you need to first verify a domain for the Callback URL. Please see more information on Callbacks [here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-url).{/note}    {warning}Crypto APIs will notify the user **only when** the event occurs. There are cases when the specific event doesn&#39;t happen at all, or takes a long time to do so. A callback notification **will not** be sent if the event does not or cannot occur, or will take long time to occur.{/warning}

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.CreateSubscriptionsForApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    CreateSubscriptionsForApi apiInstance = new CreateSubscriptionsForApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    NewBlockRB newBlockRB = new NewBlockRB(); // NewBlockRB | 
    try {
      NewBlockR result = apiInstance.newBlock(blockchain, network, context, newBlockRB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateSubscriptionsForApi#newBlock");
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
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, bitcoin-cash, litecoin, dogecoin, dash, ethereum, ethereum-classic, xrp, zilliqa]
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [enum: mainnet, testnet, ropsten, rinkeby, mordor, kotti]
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **newBlockRB** | [**NewBlockRB**](NewBlockRB.md)|  | [optional]

### Return type

[**NewBlockR**](NewBlockR.md)

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
**403** | You have reached the maximum number of active Blockchain Events subscriptions which is {callbacks_limit} now. Please upgrade your plan to be get higher number of active subscriptions. |  -  |
**409** | The specified resource already exists. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="newConfirmedCoinsTransactions"></a>
# **newConfirmedCoinsTransactions**
> NewConfirmedCoinsTransactionsR newConfirmedCoinsTransactions(blockchain, network, context, newConfirmedCoinsTransactionsRB)

New confirmed coins transactions

Through this endpoint customers can create callback subscriptions for a specific event. In this case the event is when there are new incoming or outgoing confirmed transactions for coins from/to the customer&#39;s address. By creating this subscription the user will be notified by Crypto APIs 2.0 when that event occurs. The information is returned per specified address.     Being confirmed means that the transactions are verified by miners and added to the next block.    {note}To have an operational callback subscription, you need to first verify a domain for the Callback URL. Please see more information on Callbacks [here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-url).{/note}    {warning}Crypto APIs will notify the user **only when** the event occurs. There are cases when the specific event doesn&#39;t happen at all, or takes a long time to do so. A callback notification **will not** be sent if the event does not or cannot occur, or will take long time to occur.{/warning}

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.CreateSubscriptionsForApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    CreateSubscriptionsForApi apiInstance = new CreateSubscriptionsForApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    NewConfirmedCoinsTransactionsRB newConfirmedCoinsTransactionsRB = new NewConfirmedCoinsTransactionsRB(); // NewConfirmedCoinsTransactionsRB | 
    try {
      NewConfirmedCoinsTransactionsR result = apiInstance.newConfirmedCoinsTransactions(blockchain, network, context, newConfirmedCoinsTransactionsRB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateSubscriptionsForApi#newConfirmedCoinsTransactions");
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
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, bitcoin-cash, litecoin, dogecoin, dash, ethereum, ethereum-classic, xrp, zilliqa]
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [enum: mainnet, testnet, ropsten, rinkeby, mordor, kotti]
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **newConfirmedCoinsTransactionsRB** | [**NewConfirmedCoinsTransactionsRB**](NewConfirmedCoinsTransactionsRB.md)|  | [optional]

### Return type

[**NewConfirmedCoinsTransactionsR**](NewConfirmedCoinsTransactionsR.md)

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
**403** | You have reached the maximum number of active Blockchain Events subscriptions which is {callbacks_limit} now. Please upgrade your plan to be get higher number of active subscriptions. |  -  |
**409** | The specified resource already exists. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="newConfirmedCoinsTransactionsAndEachConfirmation"></a>
# **newConfirmedCoinsTransactionsAndEachConfirmation**
> NewConfirmedCoinsTransactionsAndEachConfirmationR newConfirmedCoinsTransactionsAndEachConfirmation(blockchain, network, context, newConfirmedCoinsTransactionsAndEachConfirmationRB)

New confirmed coins transactions and each confirmation

Through this endpoint customers can create callback subscriptions for a specific event. In this case the event is when there are new incoming or outgoing confirmed transactions for coins from/to the customer&#39;s address with also a response at each confirmation the transaction has received until the specified confirmations limit is reached. By creating this subscription the user will be notified by Crypto APIs 2.0 when that event occurs. The information is returned per specified address.     Being confirmed means that the transactions are verified by miners and added to the next block. This endpoint refers to **coins transactions only, not tokens**.    {note}To have an operational callback subscription, you need to first verify a domain for the Callback URL. Please see more information on Callbacks [here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-url).{/note}    {warning}Crypto APIs will notify the user **only when** the event occurs. There are cases when the specific event doesn&#39;t happen at all, or takes a long time to do so. A callback notification **will not** be sent if the event does not or cannot occur, or will take long time to occur.{/warning}

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.CreateSubscriptionsForApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    CreateSubscriptionsForApi apiInstance = new CreateSubscriptionsForApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    NewConfirmedCoinsTransactionsAndEachConfirmationRB newConfirmedCoinsTransactionsAndEachConfirmationRB = new NewConfirmedCoinsTransactionsAndEachConfirmationRB(); // NewConfirmedCoinsTransactionsAndEachConfirmationRB | 
    try {
      NewConfirmedCoinsTransactionsAndEachConfirmationR result = apiInstance.newConfirmedCoinsTransactionsAndEachConfirmation(blockchain, network, context, newConfirmedCoinsTransactionsAndEachConfirmationRB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateSubscriptionsForApi#newConfirmedCoinsTransactionsAndEachConfirmation");
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
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, bitcoin-cash, litecoin, dogecoin, dash, ethereum, ethereum-classic, xrp, zilliqa]
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [enum: mainnet, testnet, ropsten, rinkeby, mordor, kotti]
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **newConfirmedCoinsTransactionsAndEachConfirmationRB** | [**NewConfirmedCoinsTransactionsAndEachConfirmationRB**](NewConfirmedCoinsTransactionsAndEachConfirmationRB.md)|  | [optional]

### Return type

[**NewConfirmedCoinsTransactionsAndEachConfirmationR**](NewConfirmedCoinsTransactionsAndEachConfirmationR.md)

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
**403** | You have reached the maximum number of active Blockchain Events subscriptions which is {callbacks_limit} now. Please upgrade your plan to be get higher number of active subscriptions. |  -  |
**409** | The specified resource already exists. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="newConfirmedInternalTransactions"></a>
# **newConfirmedInternalTransactions**
> NewConfirmedInternalTransactionsR newConfirmedInternalTransactions(blockchain, network, context, newConfirmedInternalTransactionsRB)

New confirmed internal transactions

Through this endpoint customers can create callback subscriptions for a specific event. In this case the event is when there are new confirmed internal transactions. By creating this subscription the user will be notified by Crypto APIs 2.0 when that event occurs.    Being confirmed means that the transactions are verified by miners and added to the next block.    {note}To have an operational callback subscription, you need to first verify a domain for the Callback URL. Please see more information on Callbacks [here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-url).{/note}    {warning}Crypto APIs will notify the user **only when** the event occurs. There are cases when the specific event doesn&#39;t happen at all, or takes a long time to do so. A callback notification **will not** be sent if the event does not or cannot occur, or will take long time to occur.{/warning}

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.CreateSubscriptionsForApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    CreateSubscriptionsForApi apiInstance = new CreateSubscriptionsForApi(defaultClient);
    String blockchain = "ethereum"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    NewConfirmedInternalTransactionsRB newConfirmedInternalTransactionsRB = new NewConfirmedInternalTransactionsRB(); // NewConfirmedInternalTransactionsRB | 
    try {
      NewConfirmedInternalTransactionsR result = apiInstance.newConfirmedInternalTransactions(blockchain, network, context, newConfirmedInternalTransactionsRB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateSubscriptionsForApi#newConfirmedInternalTransactions");
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
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, bitcoin-cash, litecoin, dogecoin, dash, ethereum, ethereum-classic, xrp, zilliqa]
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [enum: mainnet, testnet, ropsten, rinkeby, mordor, kotti]
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **newConfirmedInternalTransactionsRB** | [**NewConfirmedInternalTransactionsRB**](NewConfirmedInternalTransactionsRB.md)|  | [optional]

### Return type

[**NewConfirmedInternalTransactionsR**](NewConfirmedInternalTransactionsR.md)

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
**403** | You have reached the maximum number of active Blockchain Events subscriptions which is {callbacks_limit} now. Please upgrade your plan to be get higher number of active subscriptions. |  -  |
**409** | The specified resource already exists. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="newConfirmedInternalTransactionsAndEachConfirmation"></a>
# **newConfirmedInternalTransactionsAndEachConfirmation**
> NewConfirmedInternalTransactionsAndEachConfirmationR newConfirmedInternalTransactionsAndEachConfirmation(blockchain, network, context, newConfirmedInternalTransactionsAndEachConfirmationRB)

New confirmed internal transactions and each confirmation

Through this endpoint customers can create callback subscriptions for a specific event. In this case the event is when there are new confirmed internal transactions. Includes also a response at each confirmation the transaction receives until the specified confirmations limit is reached. By creating this subscription the user will be notified by Crypto APIs 2.0 when that event occurs.     Being confirmed means that the transactions are verified by miners and added to the next block.    {note}To have an operational callback subscription, you need to first verify a domain for the Callback URL. Please see more information on Callbacks [here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-url).{/note}    {warning}Crypto APIs will notify the user **only when** the event occurs. There are cases when the specific event doesn&#39;t happen at all, or takes a long time to do so. A callback notification **will not** be sent if the event does not or cannot occur, or will take long time to occur.{/warning}

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.CreateSubscriptionsForApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    CreateSubscriptionsForApi apiInstance = new CreateSubscriptionsForApi(defaultClient);
    String blockchain = "ethereum"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "mainnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    NewConfirmedInternalTransactionsAndEachConfirmationRB newConfirmedInternalTransactionsAndEachConfirmationRB = new NewConfirmedInternalTransactionsAndEachConfirmationRB(); // NewConfirmedInternalTransactionsAndEachConfirmationRB | 
    try {
      NewConfirmedInternalTransactionsAndEachConfirmationR result = apiInstance.newConfirmedInternalTransactionsAndEachConfirmation(blockchain, network, context, newConfirmedInternalTransactionsAndEachConfirmationRB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateSubscriptionsForApi#newConfirmedInternalTransactionsAndEachConfirmation");
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
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, bitcoin-cash, litecoin, dogecoin, dash, ethereum, ethereum-classic, xrp, zilliqa]
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [enum: mainnet, testnet, ropsten, rinkeby, mordor, kotti]
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **newConfirmedInternalTransactionsAndEachConfirmationRB** | [**NewConfirmedInternalTransactionsAndEachConfirmationRB**](NewConfirmedInternalTransactionsAndEachConfirmationRB.md)|  | [optional]

### Return type

[**NewConfirmedInternalTransactionsAndEachConfirmationR**](NewConfirmedInternalTransactionsAndEachConfirmationR.md)

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
**403** | You have reached the maximum number of active Blockchain Events subscriptions which is {callbacks_limit} now. Please upgrade your plan to be get higher number of active subscriptions. |  -  |
**409** | The specified resource already exists. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="newConfirmedTokensTransactions"></a>
# **newConfirmedTokensTransactions**
> NewConfirmedTokensTransactionsR newConfirmedTokensTransactions(blockchain, network, context, newConfirmedTokensTransactionsRB)

New confirmed tokens transactions

Through this endpoint customers can create callback subscriptions for a specific event. In this case the event is when there are new incoming or outgoing confirmed transactions for tokens from/to the customer&#39;s address. By creating this subscription the user will be notified by Crypto APIs 2.0 when that event occurs. The information is returned per specified address.     Being confirmed means that the transactions are verified by miners and added to the next block. This endpoint refers to **tokens transactions only, not coins**.    {note}To have an operational callback subscription, you need to first verify a domain for the Callback URL. Please see more information on Callbacks [here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-url).{/note}    {warning}Crypto APIs will notify the user **only when** the event occurs. There are cases when the specific event doesn&#39;t happen at all, or takes a long time to do so. A callback notification **will not** be sent if the event does not or cannot occur, or will take long time to occur.{/warning}

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.CreateSubscriptionsForApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    CreateSubscriptionsForApi apiInstance = new CreateSubscriptionsForApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    NewConfirmedTokensTransactionsRB newConfirmedTokensTransactionsRB = new NewConfirmedTokensTransactionsRB(); // NewConfirmedTokensTransactionsRB | 
    try {
      NewConfirmedTokensTransactionsR result = apiInstance.newConfirmedTokensTransactions(blockchain, network, context, newConfirmedTokensTransactionsRB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateSubscriptionsForApi#newConfirmedTokensTransactions");
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
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, ethereum]
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [enum: mainnet, testnet, ropsten, rinkeby]
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **newConfirmedTokensTransactionsRB** | [**NewConfirmedTokensTransactionsRB**](NewConfirmedTokensTransactionsRB.md)|  | [optional]

### Return type

[**NewConfirmedTokensTransactionsR**](NewConfirmedTokensTransactionsR.md)

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
**403** | You have reached the maximum number of active Blockchain Events subscriptions which is {callbacks_limit} now. Please upgrade your plan to be get higher number of active subscriptions. |  -  |
**409** | The specified resource already exists. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="newConfirmedTokensTransactionsAndEachConfirmation"></a>
# **newConfirmedTokensTransactionsAndEachConfirmation**
> NewConfirmedTokensTransactionsAndEachConfirmationR newConfirmedTokensTransactionsAndEachConfirmation(blockchain, network, context, newConfirmedTokensTransactionsAndEachConfirmationRB)

New confirmed tokens transactions and each confirmation

Through this endpoint customers can create callback subscriptions for a specific event. In this case the event is when there are new incoming or outgoing confirmed transactions for tokens from/to the customer&#39;s address with also a response at each confirmation the transaction has received until the specified confirmations limit is reached. By creating this subscription the user will be notified by Crypto APIs 2.0 when that event occurs. The information is returned per specified address.     Being confirmed means that the transactions are verified by miners and added to the next block. This endpoint refers to **tokens transactions only, not coins**.    {note}To have an operational callback subscription, you need to first verify a domain for the Callback URL. Please see more information on Callbacks [here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-url).{/note}    {warning}Crypto APIs will notify the user **only when** the event occurs. There are cases when the specific event doesn&#39;t happen at all, or takes a long time to do so. A callback notification **will not** be sent if the event does not or cannot occur, or will take long time to occur.{/warning}

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.CreateSubscriptionsForApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    CreateSubscriptionsForApi apiInstance = new CreateSubscriptionsForApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    NewConfirmedTokensTransactionsAndEachConfirmationRB newConfirmedTokensTransactionsAndEachConfirmationRB = new NewConfirmedTokensTransactionsAndEachConfirmationRB(); // NewConfirmedTokensTransactionsAndEachConfirmationRB | 
    try {
      NewConfirmedTokensTransactionsAndEachConfirmationR result = apiInstance.newConfirmedTokensTransactionsAndEachConfirmation(blockchain, network, context, newConfirmedTokensTransactionsAndEachConfirmationRB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateSubscriptionsForApi#newConfirmedTokensTransactionsAndEachConfirmation");
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
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, ethereum]
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [enum: mainnet, testnet, ropsten, rinkeby]
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **newConfirmedTokensTransactionsAndEachConfirmationRB** | [**NewConfirmedTokensTransactionsAndEachConfirmationRB**](NewConfirmedTokensTransactionsAndEachConfirmationRB.md)|  | [optional]

### Return type

[**NewConfirmedTokensTransactionsAndEachConfirmationR**](NewConfirmedTokensTransactionsAndEachConfirmationR.md)

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
**403** | You have reached the maximum number of active Blockchain Events subscriptions which is {callbacks_limit} now. Please upgrade your plan to be get higher number of active subscriptions. |  -  |
**409** | The specified resource already exists. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="newUnconfirmedCoinsTransactions"></a>
# **newUnconfirmedCoinsTransactions**
> NewUnconfirmedCoinsTransactionsR newUnconfirmedCoinsTransactions(blockchain, network, context, newUnconfirmedCoinsTransactionsRB)

New unconfirmed coins transactions

Through this endpoint customers can create callback subscriptions for a specific event. In this case the event is when there are new unconfirmed coins transactions for the user. By creating this subscription the user will be notified by Crypto APIs 2.0 when that event occurs. The information is returned per specified address.    Unconfirmed coins transactions remain in the mempool (memory pool) until they are confirmed by miners and added to the next block. Sometimes spikes in transaction activity can cause delays in confirmations.    {warning}We cannot guarantee at 100% that webhooks for unconfirmed transactions will always be received. Some may **not get received** due to the possibility of some nodes not being updated with that information. This can occur in networks with low activity and/or not many nodes, e.g. Testnet networks and rarely Mainnets.{/warning}    {note}To have an operational callback subscription, you need to first verify a domain for the Callback URL. Please see more information on Callbacks [here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-url).{/note}    {note}It is also **important to note** that just because pending unconfirmed transactions are in the mempool, **doesn&#39;t necessarily** mean they will get confirmed.{/note}    {warning}Crypto APIs will notify the user **only when** the event occurs. There are cases when the specific event doesn&#39;t happen at all, or takes a long time to do so. A callback notification **will not** be sent if the event does not or cannot occur, or will take long time to occur.{/warning}

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.CreateSubscriptionsForApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    CreateSubscriptionsForApi apiInstance = new CreateSubscriptionsForApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    NewUnconfirmedCoinsTransactionsRB newUnconfirmedCoinsTransactionsRB = new NewUnconfirmedCoinsTransactionsRB(); // NewUnconfirmedCoinsTransactionsRB | 
    try {
      NewUnconfirmedCoinsTransactionsR result = apiInstance.newUnconfirmedCoinsTransactions(blockchain, network, context, newUnconfirmedCoinsTransactionsRB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateSubscriptionsForApi#newUnconfirmedCoinsTransactions");
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
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, litecoin, bitcoin-cash, dogecoin, dash, ethereum, ethereum-classic]
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [enum: mainnet, testnet, ropsten, rinkeby, mordor]
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **newUnconfirmedCoinsTransactionsRB** | [**NewUnconfirmedCoinsTransactionsRB**](NewUnconfirmedCoinsTransactionsRB.md)|  | [optional]

### Return type

[**NewUnconfirmedCoinsTransactionsR**](NewUnconfirmedCoinsTransactionsR.md)

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
**403** | You have reached the maximum number of active Blockchain Events subscriptions which is {callbacks_limit} now. Please upgrade your plan to be get higher number of active subscriptions. |  -  |
**409** | The specified resource already exists. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="newUnconfirmedTokensTransactions"></a>
# **newUnconfirmedTokensTransactions**
> NewUnconfirmedTokensTransactionsR newUnconfirmedTokensTransactions(blockchain, network, context, newUnconfirmedTokensTransactionsRB)

New unconfirmed tokens transactions

Through this endpoint customers can create callback subscriptions for a specific event. In this case the event is when there are new unconfirmed tokens transactions for the user. By creating this subscription the user will be notified by Crypto APIs 2.0 when that event occurs. The information is returned per specified address.    Unconfirmed tokens transactions remain in the mempool (memory pool) until they are confirmed by miners and added to the next block. Sometimes spikes in transaction activity can cause delays in confirmations.    {warning}We cannot guarantee at 100% that webhooks for unconfirmed transactions will always be received. Some may **not get received** due to the possibility of some nodes not being updated with that information. This can occur in networks with low activity and/or not many nodes, e.g. Testnet networks and rarely Mainnets.{/warning}    {note}To have an operational callback subscription, you need to first verify a domain for the Callback URL. Please see more information on Callbacks [here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-url).{/note}    {note}It is also **important to note** that just because pending unconfirmed transactions are in the mempool, **doesn&#39;t necessarily** mean they will get confirmed.{/note}    {warning}Crypto APIs will notify the user **only when** the event occurs. There are cases when the specific event doesn&#39;t happen at all, or takes a long time to do so. A callback notification **will not** be sent if the event does not or cannot occur, or will take long time to occur.{/warning}

### Example
```java
// Import classes:
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.auth.*;
import io.cryptoapis.sdk.models.*;
import org.openapitools.client.api.CreateSubscriptionsForApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    CreateSubscriptionsForApi apiInstance = new CreateSubscriptionsForApi(defaultClient);
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    NewUnconfirmedTokensTransactionsRB newUnconfirmedTokensTransactionsRB = new NewUnconfirmedTokensTransactionsRB(); // NewUnconfirmedTokensTransactionsRB | 
    try {
      NewUnconfirmedTokensTransactionsR result = apiInstance.newUnconfirmedTokensTransactions(blockchain, network, context, newUnconfirmedTokensTransactionsRB);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateSubscriptionsForApi#newUnconfirmedTokensTransactions");
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
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin, ethereum]
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [enum: mainnet, testnet, ropsten, rinkeby]
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **newUnconfirmedTokensTransactionsRB** | [**NewUnconfirmedTokensTransactionsRB**](NewUnconfirmedTokensTransactionsRB.md)|  | [optional]

### Return type

[**NewUnconfirmedTokensTransactionsR**](NewUnconfirmedTokensTransactionsR.md)

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
**403** | You have reached the maximum number of active Blockchain Events subscriptions which is {callbacks_limit} now. Please upgrade your plan to be get higher number of active subscriptions. |  -  |
**409** | The specified resource already exists. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |


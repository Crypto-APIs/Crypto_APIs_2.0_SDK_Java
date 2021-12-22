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

import io.cryptoapis.sdk.ApiException;
import org.openapitools.client.model.InlineResponse40058;
import org.openapitools.client.model.InlineResponse40059;
import org.openapitools.client.model.InlineResponse40060;
import org.openapitools.client.model.InlineResponse40061;
import org.openapitools.client.model.InlineResponse40062;
import org.openapitools.client.model.InlineResponse40063;
import org.openapitools.client.model.InlineResponse40064;
import org.openapitools.client.model.InlineResponse40065;
import org.openapitools.client.model.InlineResponse40073;
import org.openapitools.client.model.InlineResponse40074;
import org.openapitools.client.model.InlineResponse40158;
import org.openapitools.client.model.InlineResponse40159;
import org.openapitools.client.model.InlineResponse40160;
import org.openapitools.client.model.InlineResponse40161;
import org.openapitools.client.model.InlineResponse40162;
import org.openapitools.client.model.InlineResponse40163;
import org.openapitools.client.model.InlineResponse40164;
import org.openapitools.client.model.InlineResponse40165;
import org.openapitools.client.model.InlineResponse40173;
import org.openapitools.client.model.InlineResponse40174;
import org.openapitools.client.model.InlineResponse402;
import org.openapitools.client.model.InlineResponse40358;
import org.openapitools.client.model.InlineResponse40359;
import org.openapitools.client.model.InlineResponse40360;
import org.openapitools.client.model.InlineResponse40361;
import org.openapitools.client.model.InlineResponse40362;
import org.openapitools.client.model.InlineResponse40363;
import org.openapitools.client.model.InlineResponse40364;
import org.openapitools.client.model.InlineResponse40365;
import org.openapitools.client.model.InlineResponse40373;
import org.openapitools.client.model.InlineResponse40374;
import org.openapitools.client.model.InlineResponse40910;
import org.openapitools.client.model.InlineResponse40911;
import org.openapitools.client.model.InlineResponse40912;
import org.openapitools.client.model.InlineResponse40913;
import org.openapitools.client.model.InlineResponse40914;
import org.openapitools.client.model.InlineResponse40915;
import org.openapitools.client.model.InlineResponse4096;
import org.openapitools.client.model.InlineResponse4097;
import org.openapitools.client.model.InlineResponse4098;
import org.openapitools.client.model.InlineResponse4099;
import org.openapitools.client.model.InlineResponse415;
import org.openapitools.client.model.InlineResponse422;
import org.openapitools.client.model.InlineResponse429;
import org.openapitools.client.model.InlineResponse500;
import org.openapitools.client.model.MinedTransactionR;
import org.openapitools.client.model.MinedTransactionRB;
import org.openapitools.client.model.NewBlockR;
import org.openapitools.client.model.NewBlockRB;
import org.openapitools.client.model.NewConfirmedCoinsTransactionsAndEachConfirmationR;
import org.openapitools.client.model.NewConfirmedCoinsTransactionsAndEachConfirmationRB;
import org.openapitools.client.model.NewConfirmedCoinsTransactionsR;
import org.openapitools.client.model.NewConfirmedCoinsTransactionsRB;
import org.openapitools.client.model.NewConfirmedInternalTransactionsAndEachConfirmationR;
import org.openapitools.client.model.NewConfirmedInternalTransactionsAndEachConfirmationRB;
import org.openapitools.client.model.NewConfirmedInternalTransactionsR;
import org.openapitools.client.model.NewConfirmedInternalTransactionsRB;
import org.openapitools.client.model.NewConfirmedTokensTransactionsAndEachConfirmationR;
import org.openapitools.client.model.NewConfirmedTokensTransactionsAndEachConfirmationRB;
import org.openapitools.client.model.NewConfirmedTokensTransactionsR;
import org.openapitools.client.model.NewConfirmedTokensTransactionsRB;
import org.openapitools.client.model.NewUnconfirmedCoinsTransactionsR;
import org.openapitools.client.model.NewUnconfirmedCoinsTransactionsRB;
import org.openapitools.client.model.NewUnconfirmedTokensTransactionsR;
import org.openapitools.client.model.NewUnconfirmedTokensTransactionsRB;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CreateSubscriptionsForApi
 */
@Ignore
public class CreateSubscriptionsForApiTest {

    private final CreateSubscriptionsForApi api = new CreateSubscriptionsForApi();

    
    /**
     * Mined transaction
     *
     * Through this endpoint customers can create callback subscriptions for a specific event. In this case the event is when a specific transaction is mined. By creating this subscription the user will be notified by Crypto APIs 2.0 when that event occurs. The information is returned per specified &#x60;transactionId&#x60;.    A transaction is mined when it is included in a new block in the blockchain.    {note}To have an operational callback subscription, you need to first verify a domain for the Callback URL. Please see more information on Callbacks [here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-url).{/note}    {warning}Crypto APIs will notify the user **only when** the event occurs. There are cases when the specific event doesn&#39;t happen at all, or takes a long time to do so. A callback notification **will not** be sent if the event does not or cannot occur, or will take long time to occur.{/warning}
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void minedTransactionTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        MinedTransactionRB minedTransactionRB = null;
                MinedTransactionR response = api.minedTransaction(blockchain, network, context, minedTransactionRB);
        // TODO: test validations
    }
    
    /**
     * New Block
     *
     * Through this endpoint customers can create callback subscriptions for a specific event. In this case the event is when a new block is mined in the specific blockchain. By creating this subscription the user will be notified by Crypto APIs 2.0 when that event occurs. The information is returned per specified address.    A new block is mined when it is added to the chain once a consensus is reached by the majority of the miners, which is when the block gets validated and added to the blockchain.    {note}To have an operational callback subscription, you need to first verify a domain for the Callback URL. Please see more information on Callbacks [here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-url).{/note}    {warning}Crypto APIs will notify the user **only when** the event occurs. There are cases when the specific event doesn&#39;t happen at all, or takes a long time to do so. A callback notification **will not** be sent if the event does not or cannot occur, or will take long time to occur.{/warning}
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newBlockTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        NewBlockRB newBlockRB = null;
                NewBlockR response = api.newBlock(blockchain, network, context, newBlockRB);
        // TODO: test validations
    }
    
    /**
     * New confirmed coins transactions
     *
     * Through this endpoint customers can create callback subscriptions for a specific event. In this case the event is when there are new incoming or outgoing confirmed transactions for coins from/to the customer&#39;s address. By creating this subscription the user will be notified by Crypto APIs 2.0 when that event occurs. The information is returned per specified address.     Being confirmed means that the transactions are verified by miners and added to the next block.    {note}For UTXO-based protocols like Bitcoin a transaction could have multiple inputs and outputs which means the address could in as both sender and recipient. [Here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-data-returned-for-utxo-based-transactions) is how we inform you on that.{/note}    {note}To have an operational callback subscription, you need to first verify a domain for the Callback URL. Please see more information on Callbacks [here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-url).{/note}    {warning}Crypto APIs will notify the user **only when** the event occurs. There are cases when the specific event doesn&#39;t happen at all, or takes a long time to do so. A callback notification **will not** be sent if the event does not or cannot occur, or will take long time to occur.{/warning}
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newConfirmedCoinsTransactionsTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        NewConfirmedCoinsTransactionsRB newConfirmedCoinsTransactionsRB = null;
                NewConfirmedCoinsTransactionsR response = api.newConfirmedCoinsTransactions(blockchain, network, context, newConfirmedCoinsTransactionsRB);
        // TODO: test validations
    }
    
    /**
     * New confirmed coins transactions and each confirmation
     *
     * Through this endpoint customers can create callback subscriptions for a specific event. In this case the event is when there are new incoming or outgoing confirmed transactions for coins from/to the customer&#39;s address with also a response at each confirmation the transaction has received until the specified confirmations limit is reached. By creating this subscription the user will be notified by Crypto APIs 2.0 when that event occurs. The information is returned per specified address.     Being confirmed means that the transactions are verified by miners and added to the next block. This endpoint refers to **coins transactions only, not tokens**.    {note}For UTXO-based protocols like Bitcoin a transaction could have multiple inputs and outputs which means the address could in as both sender and recipient. [Here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-data-returned-for-utxo-based-transactions) is how we inform you on that.{/note}    {note}To have an operational callback subscription, you need to first verify a domain for the Callback URL. Please see more information on Callbacks [here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-url).{/note}    {warning}Crypto APIs will notify the user **only when** the event occurs. There are cases when the specific event doesn&#39;t happen at all, or takes a long time to do so. A callback notification **will not** be sent if the event does not or cannot occur, or will take long time to occur.{/warning}
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newConfirmedCoinsTransactionsAndEachConfirmationTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        NewConfirmedCoinsTransactionsAndEachConfirmationRB newConfirmedCoinsTransactionsAndEachConfirmationRB = null;
                NewConfirmedCoinsTransactionsAndEachConfirmationR response = api.newConfirmedCoinsTransactionsAndEachConfirmation(blockchain, network, context, newConfirmedCoinsTransactionsAndEachConfirmationRB);
        // TODO: test validations
    }
    
    /**
     * New confirmed internal transactions
     *
     * Through this endpoint customers can create callback subscriptions for a specific event. In this case the event is when there are new confirmed internal transactions. By creating this subscription the user will be notified by Crypto APIs 2.0 when that event occurs.    Being confirmed means that the transactions are verified by miners and added to the next block.    {note}To have an operational callback subscription, you need to first verify a domain for the Callback URL. Please see more information on Callbacks [here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-url).{/note}    {warning}Crypto APIs will notify the user **only when** the event occurs. There are cases when the specific event doesn&#39;t happen at all, or takes a long time to do so. A callback notification **will not** be sent if the event does not or cannot occur, or will take long time to occur.{/warning}
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newConfirmedInternalTransactionsTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        NewConfirmedInternalTransactionsRB newConfirmedInternalTransactionsRB = null;
                NewConfirmedInternalTransactionsR response = api.newConfirmedInternalTransactions(blockchain, network, context, newConfirmedInternalTransactionsRB);
        // TODO: test validations
    }
    
    /**
     * New confirmed internal transactions and each confirmation
     *
     * Through this endpoint customers can create callback subscriptions for a specific event. In this case the event is when there are new confirmed internal transactions. Includes also a response at each confirmation the transaction receives until the specified confirmations limit is reached. By creating this subscription the user will be notified by Crypto APIs 2.0 when that event occurs.     Being confirmed means that the transactions are verified by miners and added to the next block.    {note}To have an operational callback subscription, you need to first verify a domain for the Callback URL. Please see more information on Callbacks [here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-url).{/note}    {warning}Crypto APIs will notify the user **only when** the event occurs. There are cases when the specific event doesn&#39;t happen at all, or takes a long time to do so. A callback notification **will not** be sent if the event does not or cannot occur, or will take long time to occur.{/warning}
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newConfirmedInternalTransactionsAndEachConfirmationTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        NewConfirmedInternalTransactionsAndEachConfirmationRB newConfirmedInternalTransactionsAndEachConfirmationRB = null;
                NewConfirmedInternalTransactionsAndEachConfirmationR response = api.newConfirmedInternalTransactionsAndEachConfirmation(blockchain, network, context, newConfirmedInternalTransactionsAndEachConfirmationRB);
        // TODO: test validations
    }
    
    /**
     * New confirmed tokens transactions
     *
     * Through this endpoint customers can create callback subscriptions for a specific event. In this case the event is when there are new incoming or outgoing confirmed transactions for tokens from/to the customer&#39;s address. By creating this subscription the user will be notified by Crypto APIs 2.0 when that event occurs. The information is returned per specified address.     Being confirmed means that the transactions are verified by miners and added to the next block. This endpoint refers to **tokens transactions only, not coins**.    {note}To have an operational callback subscription, you need to first verify a domain for the Callback URL. Please see more information on Callbacks [here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-url).{/note}    {warning}Crypto APIs will notify the user **only when** the event occurs. There are cases when the specific event doesn&#39;t happen at all, or takes a long time to do so. A callback notification **will not** be sent if the event does not or cannot occur, or will take long time to occur.{/warning}
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newConfirmedTokensTransactionsTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        NewConfirmedTokensTransactionsRB newConfirmedTokensTransactionsRB = null;
                NewConfirmedTokensTransactionsR response = api.newConfirmedTokensTransactions(blockchain, network, context, newConfirmedTokensTransactionsRB);
        // TODO: test validations
    }
    
    /**
     * New confirmed tokens transactions and each confirmation
     *
     * Through this endpoint customers can create callback subscriptions for a specific event. In this case the event is when there are new incoming or outgoing confirmed transactions for tokens from/to the customer&#39;s address with also a response at each confirmation the transaction has received until the specified confirmations limit is reached. By creating this subscription the user will be notified by Crypto APIs 2.0 when that event occurs. The information is returned per specified address.     Being confirmed means that the transactions are verified by miners and added to the next block. This endpoint refers to **tokens transactions only, not coins**.    {note}To have an operational callback subscription, you need to first verify a domain for the Callback URL. Please see more information on Callbacks [here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-url).{/note}    {warning}Crypto APIs will notify the user **only when** the event occurs. There are cases when the specific event doesn&#39;t happen at all, or takes a long time to do so. A callback notification **will not** be sent if the event does not or cannot occur, or will take long time to occur.{/warning}
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newConfirmedTokensTransactionsAndEachConfirmationTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        NewConfirmedTokensTransactionsAndEachConfirmationRB newConfirmedTokensTransactionsAndEachConfirmationRB = null;
                NewConfirmedTokensTransactionsAndEachConfirmationR response = api.newConfirmedTokensTransactionsAndEachConfirmation(blockchain, network, context, newConfirmedTokensTransactionsAndEachConfirmationRB);
        // TODO: test validations
    }
    
    /**
     * New unconfirmed coins transactions
     *
     * Through this endpoint customers can create callback subscriptions for a specific event. In this case the event is when there are new unconfirmed coins transactions for the user. By creating this subscription the user will be notified by Crypto APIs 2.0 when that event occurs. The information is returned per specified address.    Unconfirmed coins transactions remain in the mempool (memory pool) until they are confirmed by miners and added to the next block. Sometimes spikes in transaction activity can cause delays in confirmations.    {note}For UTXO-based protocols like Bitcoin a transaction could have multiple inputs and outputs which means the address could in as both sender and recipient. [Here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-data-returned-for-utxo-based-transactions) is how we inform you on that.{/note}    {warning}We cannot guarantee at 100% that webhooks for unconfirmed transactions will always be received. Some may **not get received** due to the possibility of some nodes not being updated with that information. This can occur in networks with low activity and/or not many nodes, e.g. Testnet networks and rarely Mainnets.{/warning}    {note}To have an operational callback subscription, you need to first verify a domain for the Callback URL. Please see more information on Callbacks [here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-url).{/note}    {note}It is also **important to note** that just because pending unconfirmed transactions are in the mempool, **doesn&#39;t necessarily** mean they will get confirmed.{/note}    {warning}Crypto APIs will notify the user **only when** the event occurs. There are cases when the specific event doesn&#39;t happen at all, or takes a long time to do so. A callback notification **will not** be sent if the event does not or cannot occur, or will take long time to occur.{/warning}
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newUnconfirmedCoinsTransactionsTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        NewUnconfirmedCoinsTransactionsRB newUnconfirmedCoinsTransactionsRB = null;
                NewUnconfirmedCoinsTransactionsR response = api.newUnconfirmedCoinsTransactions(blockchain, network, context, newUnconfirmedCoinsTransactionsRB);
        // TODO: test validations
    }
    
    /**
     * New unconfirmed tokens transactions
     *
     * Through this endpoint customers can create callback subscriptions for a specific event. In this case the event is when there are new unconfirmed tokens transactions for the user. By creating this subscription the user will be notified by Crypto APIs 2.0 when that event occurs. The information is returned per specified address.    Unconfirmed tokens transactions remain in the mempool (memory pool) until they are confirmed by miners and added to the next block. Sometimes spikes in transaction activity can cause delays in confirmations.    {warning}We cannot guarantee at 100% that webhooks for unconfirmed transactions will always be received. Some may **not get received** due to the possibility of some nodes not being updated with that information. This can occur in networks with low activity and/or not many nodes, e.g. Testnet networks and rarely Mainnets.{/warning}    {note}To have an operational callback subscription, you need to first verify a domain for the Callback URL. Please see more information on Callbacks [here](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-url).{/note}    {note}It is also **important to note** that just because pending unconfirmed transactions are in the mempool, **doesn&#39;t necessarily** mean they will get confirmed.{/note}    {warning}Crypto APIs will notify the user **only when** the event occurs. There are cases when the specific event doesn&#39;t happen at all, or takes a long time to do so. A callback notification **will not** be sent if the event does not or cannot occur, or will take long time to occur.{/warning}
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newUnconfirmedTokensTransactionsTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        NewUnconfirmedTokensTransactionsRB newUnconfirmedTokensTransactionsRB = null;
                NewUnconfirmedTokensTransactionsR response = api.newUnconfirmedTokensTransactions(blockchain, network, context, newUnconfirmedTokensTransactionsRB);
        // TODO: test validations
    }
    
}

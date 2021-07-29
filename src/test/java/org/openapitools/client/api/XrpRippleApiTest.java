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
import org.openapitools.client.model.FeatureMainnetsNotAllowedForPlan;
import org.openapitools.client.model.GetLatestMinedXRPRippleBlockR;
import org.openapitools.client.model.GetXRPRippleAddressDetailsR;
import org.openapitools.client.model.GetXRPRippleBlockDetailsByBlockHashR;
import org.openapitools.client.model.GetXRPRippleBlockDetailsByBlockHeightR;
import org.openapitools.client.model.GetXRPRippleTransactionDetailsByTransactionIDR;
import org.openapitools.client.model.InsufficientCredits;
import org.openapitools.client.model.InvalidApiKey;
import org.openapitools.client.model.InvalidData;
import org.openapitools.client.model.InvalidPagination;
import org.openapitools.client.model.InvalidRequestBodyStructure;
import org.openapitools.client.model.ListXRPRippleTransactionsByAddressR;
import org.openapitools.client.model.ListXRPRippleTransactionsByBlockHashR;
import org.openapitools.client.model.ListXRPRippleTransactionsByBlockHeightR;
import org.openapitools.client.model.RequestLimitReached;
import org.openapitools.client.model.ResourceNotFound;
import org.openapitools.client.model.UnexpectedServerError;
import org.openapitools.client.model.UnsupportedMediaType;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for XrpRippleApi
 */
@Ignore
public class XrpRippleApiTest {

    private final XrpRippleApi api = new XrpRippleApi();

    
    /**
     * Get Latest Mined XRP (Ripple) Block
     *
     * Through this endpoint customers can fetch the last mined XRP block in the blockchain, along with its details. These could include the hash of the specific, the previous and the next block, its transactions count, its height, etc.     Since XRP is a different blockchain than Bitcoin and Ethereum, it isn&#39;t unified.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLatestMinedXRPRippleBlockTest() throws ApiException {
        String network = null;
        String context = null;
        GetLatestMinedXRPRippleBlockR response = api.getLatestMinedXRPRippleBlock(network, context);

        // TODO: test validations
    }
    
    /**
     * Get XRP (Ripple) Address Details
     *
     * Through this endpoint the customer can receive basic information about a given XRP address based on confirmed/synced blocks only. In the case where there are any incoming or outgoing **unconfirmed** transactions for the specific address, they **will not** be counted or calculated here.    Since XRP is a different blockchain than Bitcoin and Ethereum, it isn&#39;t unified.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getXRPRippleAddressDetailsTest() throws ApiException {
        String network = null;
        String address = null;
        String context = null;
        GetXRPRippleAddressDetailsR response = api.getXRPRippleAddressDetails(network, address, context);

        // TODO: test validations
    }
    
    /**
     * Get XRP (Ripple) Block Details By Block Hash
     *
     * Through this endpoint customers can obtain basic information about a given XRP block (a block on the XRP blockchain), specifically by using the &#x60;hash&#x60; parameter. These block details could include the hash of the specific, the previous and the next block, the number of included transactions, etc.     Since XRP is a different blockchain than Bitcoin and Ethereum, it isn&#39;t unified.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getXRPRippleBlockDetailsByBlockHashTest() throws ApiException {
        String network = null;
        String blockHash = null;
        String context = null;
        GetXRPRippleBlockDetailsByBlockHashR response = api.getXRPRippleBlockDetailsByBlockHash(network, blockHash, context);

        // TODO: test validations
    }
    
    /**
     * Get XRP (Ripple) Block Details By Block Height
     *
     * Through this endpoint customers can obtain basic information about a given XRP block (a block on the XRP blockchain), specifically by using the &#x60;height&#x60; parameter. These block details could include the hash of the specific, the previous and the next block, its transactions count, etc.    Since XRP is a different blockchain than Bitcoin and Ethereum, it isn&#39;t unified.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getXRPRippleBlockDetailsByBlockHeightTest() throws ApiException {
        String network = null;
        String blockHeight = null;
        String context = null;
        GetXRPRippleBlockDetailsByBlockHeightR response = api.getXRPRippleBlockDetailsByBlockHeight(network, blockHeight, context);

        // TODO: test validations
    }
    
    /**
     * Get XRP (Ripple) Transaction Details By Transaction ID
     *
     * Through this endpoint customers can obtain details about a XRP transaction by the transaction&#39;s unique identifier.     Since XRP is a different blockchain than Bitcoin and Ethereum, it isn&#39;t unified.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getXRPRippleTransactionDetailsByTransactionIDTest() throws ApiException {
        String network = null;
        String transactionHash = null;
        String context = null;
        GetXRPRippleTransactionDetailsByTransactionIDR response = api.getXRPRippleTransactionDetailsByTransactionID(network, transactionHash, context);

        // TODO: test validations
    }
    
    /**
     * List XRP (Ripple) Transactions by Address
     *
     * This endpoint will list XRP transactions by a attribute &#x60;address&#x60;. The transactions listed will detail additional information such as hash, height, time of creation in Unix timestamp, etc.    Since XRP is a different blockchain than Bitcoin and Ethereum, it isn&#39;t unified.    {note}Please note that listing data from the same type will apply pagination on the results.{/note}
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listXRPRippleTransactionsByAddressTest() throws ApiException {
        String network = null;
        String address = null;
        String context = null;
        Integer limit = null;
        Integer offset = null;
        String transactionType = null;
        ListXRPRippleTransactionsByAddressR response = api.listXRPRippleTransactionsByAddress(network, address, context, limit, offset, transactionType);

        // TODO: test validations
    }
    
    /**
     * List XRP (Ripple) Transactions By Block Hash
     *
     * This endpoint will list transactions by an attribute &#x60;blockHash&#x60;. The transactions listed will detail additional information such as hash, addresses, time of creation in Unix timestamp, etc.    Since XRP is a different blockchain than Bitcoin and Ethereum, it isn&#39;t unified.    {note}Please note that listing data from the same type will apply pagination on the results.{/note}
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listXRPRippleTransactionsByBlockHashTest() throws ApiException {
        String network = null;
        String blockHash = null;
        String context = null;
        Integer limit = null;
        Integer offset = null;
        ListXRPRippleTransactionsByBlockHashR response = api.listXRPRippleTransactionsByBlockHash(network, blockHash, context, limit, offset);

        // TODO: test validations
    }
    
    /**
     * List XRP (Ripple) Transactions By Block Height
     *
     * This endpoint will list transactions by an attribute &#x60;blockHeight&#x60;. The transactions listed will detail additional information such as hash, addresses, time of creation in Unix timestamp, etc.    Since XRP is a different blockchain than Bitcoin and Ethereum, it isn&#39;t unified.    {note}Please note that listing data from the same type will apply pagination on the results.{/note}
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listXRPRippleTransactionsByBlockHeightTest() throws ApiException {
        String network = null;
        Integer blockHeight = null;
        String context = null;
        Integer limit = null;
        Integer offset = null;
        ListXRPRippleTransactionsByBlockHeightR response = api.listXRPRippleTransactionsByBlockHeight(network, blockHeight, context, limit, offset);

        // TODO: test validations
    }
    
}

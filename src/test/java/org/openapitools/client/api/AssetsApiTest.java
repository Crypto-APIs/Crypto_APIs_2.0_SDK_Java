/*
 * Crypto APIs
 * Crypto APIs 2.0 is a complex and innovative infrastructure layer that radically simplifies the development of any Blockchain and Crypto related applications. Organized around REST, Crypto APIs 2.0 can assist both novice Bitcoin/Ethereum enthusiasts and crypto experts with the development of their blockchain applications. Crypto APIs 2.0 provides unified endpoints and data, raw data, automatic tokens and coins forwardings, callback functionalities, and much more.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: bizdev@cryptoapis.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.FeatureMainnetsNotAllowedForPlan;
import org.openapitools.client.model.InsufficientCredits;
import org.openapitools.client.model.InvalidApiKey;
import org.openapitools.client.model.InvalidData;
import org.openapitools.client.model.InvalidPagination;
import org.openapitools.client.model.InvalidRequestBodyStructure;
import org.openapitools.client.model.ListAssetsDetailsResponse;
import org.openapitools.client.model.RequestLimitReached;
import org.openapitools.client.model.UnexpectedServerError;
import org.openapitools.client.model.UnsupportedMediaType;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AssetsApi
 */
@Ignore
public class AssetsApiTest {

    private final AssetsApi api = new AssetsApi();

    
    /**
     * List Assets Details
     *
     * This endpoint will return details on a requested asset. The asset could be a cryptocurrency or FIAT asset that we support. Each asset has a unique identifier - &#x60;assetId&#x60; and a unique symbol in the form of a string, e.g. \&quot;BTC\&quot;.    The details returned could include information on the latest rate and rate fluctuation of different periods of time - 24 hours, a week, one hour, the encoding of the logo, and more.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAssetsDetailsTest() throws ApiException {
        String context = null;
        String assetType = null;
        Integer limit = null;
        Integer offset = null;
        ListAssetsDetailsResponse response = api.listAssetsDetails(context, assetType, limit, offset);

        // TODO: test validations
    }
    
}

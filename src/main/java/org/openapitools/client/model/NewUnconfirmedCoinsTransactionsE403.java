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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.BannedIpAddress;
import org.openapitools.client.model.BannedIpAddressDetails;
import org.openapitools.client.model.BlockchainEventsCallbacksLimitReached;
import org.openapitools.client.model.EndpointNotAllowedForApiKey;
import org.openapitools.client.model.EndpointNotAllowedForPlan;
import org.openapitools.client.model.FeatureMainnetsNotAllowedForPlan;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import io.cryptoapis.sdk.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T12:50:48.005281Z[Etc/UTC]")
public class NewUnconfirmedCoinsTransactionsE403 extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(NewUnconfirmedCoinsTransactionsE403.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!NewUnconfirmedCoinsTransactionsE403.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'NewUnconfirmedCoinsTransactionsE403' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<BannedIpAddress> adapterBannedIpAddress = gson.getDelegateAdapter(this, TypeToken.get(BannedIpAddress.class));
            final TypeAdapter<BlockchainEventsCallbacksLimitReached> adapterBlockchainEventsCallbacksLimitReached = gson.getDelegateAdapter(this, TypeToken.get(BlockchainEventsCallbacksLimitReached.class));
            final TypeAdapter<EndpointNotAllowedForApiKey> adapterEndpointNotAllowedForApiKey = gson.getDelegateAdapter(this, TypeToken.get(EndpointNotAllowedForApiKey.class));
            final TypeAdapter<EndpointNotAllowedForPlan> adapterEndpointNotAllowedForPlan = gson.getDelegateAdapter(this, TypeToken.get(EndpointNotAllowedForPlan.class));
            final TypeAdapter<FeatureMainnetsNotAllowedForPlan> adapterFeatureMainnetsNotAllowedForPlan = gson.getDelegateAdapter(this, TypeToken.get(FeatureMainnetsNotAllowedForPlan.class));

            return (TypeAdapter<T>) new TypeAdapter<NewUnconfirmedCoinsTransactionsE403>() {
                @Override
                public void write(JsonWriter out, NewUnconfirmedCoinsTransactionsE403 value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `BannedIpAddress`
                    if (value.getActualInstance() instanceof BannedIpAddress) {
                        JsonObject obj = adapterBannedIpAddress.toJsonTree((BannedIpAddress)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `BlockchainEventsCallbacksLimitReached`
                    if (value.getActualInstance() instanceof BlockchainEventsCallbacksLimitReached) {
                        JsonObject obj = adapterBlockchainEventsCallbacksLimitReached.toJsonTree((BlockchainEventsCallbacksLimitReached)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `EndpointNotAllowedForApiKey`
                    if (value.getActualInstance() instanceof EndpointNotAllowedForApiKey) {
                        JsonObject obj = adapterEndpointNotAllowedForApiKey.toJsonTree((EndpointNotAllowedForApiKey)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `EndpointNotAllowedForPlan`
                    if (value.getActualInstance() instanceof EndpointNotAllowedForPlan) {
                        JsonObject obj = adapterEndpointNotAllowedForPlan.toJsonTree((EndpointNotAllowedForPlan)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `FeatureMainnetsNotAllowedForPlan`
                    if (value.getActualInstance() instanceof FeatureMainnetsNotAllowedForPlan) {
                        JsonObject obj = adapterFeatureMainnetsNotAllowedForPlan.toJsonTree((FeatureMainnetsNotAllowedForPlan)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: BannedIpAddress, BlockchainEventsCallbacksLimitReached, EndpointNotAllowedForApiKey, EndpointNotAllowedForPlan, FeatureMainnetsNotAllowedForPlan");
                }

                @Override
                public NewUnconfirmedCoinsTransactionsE403 read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize BannedIpAddress
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BannedIpAddress.validateJsonObject(jsonObject);
                        actualAdapter = adapterBannedIpAddress;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'BannedIpAddress'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'BannedIpAddress'", e);
                    }

                    // deserialize BlockchainEventsCallbacksLimitReached
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BlockchainEventsCallbacksLimitReached.validateJsonObject(jsonObject);
                        actualAdapter = adapterBlockchainEventsCallbacksLimitReached;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'BlockchainEventsCallbacksLimitReached'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'BlockchainEventsCallbacksLimitReached'", e);
                    }

                    // deserialize EndpointNotAllowedForApiKey
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EndpointNotAllowedForApiKey.validateJsonObject(jsonObject);
                        actualAdapter = adapterEndpointNotAllowedForApiKey;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'EndpointNotAllowedForApiKey'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'EndpointNotAllowedForApiKey'", e);
                    }

                    // deserialize EndpointNotAllowedForPlan
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EndpointNotAllowedForPlan.validateJsonObject(jsonObject);
                        actualAdapter = adapterEndpointNotAllowedForPlan;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'EndpointNotAllowedForPlan'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'EndpointNotAllowedForPlan'", e);
                    }

                    // deserialize FeatureMainnetsNotAllowedForPlan
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FeatureMainnetsNotAllowedForPlan.validateJsonObject(jsonObject);
                        actualAdapter = adapterFeatureMainnetsNotAllowedForPlan;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'FeatureMainnetsNotAllowedForPlan'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'FeatureMainnetsNotAllowedForPlan'", e);
                    }

                    if (match == 1) {
                        NewUnconfirmedCoinsTransactionsE403 ret = new NewUnconfirmedCoinsTransactionsE403();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for NewUnconfirmedCoinsTransactionsE403: %d classes match result, expected 1. JSON: %s", match, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public NewUnconfirmedCoinsTransactionsE403() {
        super("oneOf", Boolean.FALSE);
    }

    public NewUnconfirmedCoinsTransactionsE403(BannedIpAddress o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public NewUnconfirmedCoinsTransactionsE403(BlockchainEventsCallbacksLimitReached o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public NewUnconfirmedCoinsTransactionsE403(EndpointNotAllowedForApiKey o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public NewUnconfirmedCoinsTransactionsE403(EndpointNotAllowedForPlan o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public NewUnconfirmedCoinsTransactionsE403(FeatureMainnetsNotAllowedForPlan o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("BannedIpAddress", new GenericType<BannedIpAddress>() {
        });
        schemas.put("BlockchainEventsCallbacksLimitReached", new GenericType<BlockchainEventsCallbacksLimitReached>() {
        });
        schemas.put("EndpointNotAllowedForApiKey", new GenericType<EndpointNotAllowedForApiKey>() {
        });
        schemas.put("EndpointNotAllowedForPlan", new GenericType<EndpointNotAllowedForPlan>() {
        });
        schemas.put("FeatureMainnetsNotAllowedForPlan", new GenericType<FeatureMainnetsNotAllowedForPlan>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return NewUnconfirmedCoinsTransactionsE403.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * BannedIpAddress, BlockchainEventsCallbacksLimitReached, EndpointNotAllowedForApiKey, EndpointNotAllowedForPlan, FeatureMainnetsNotAllowedForPlan
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof BannedIpAddress) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof BlockchainEventsCallbacksLimitReached) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EndpointNotAllowedForApiKey) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EndpointNotAllowedForPlan) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof FeatureMainnetsNotAllowedForPlan) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be BannedIpAddress, BlockchainEventsCallbacksLimitReached, EndpointNotAllowedForApiKey, EndpointNotAllowedForPlan, FeatureMainnetsNotAllowedForPlan");
    }

    /**
     * Get the actual instance, which can be the following:
     * BannedIpAddress, BlockchainEventsCallbacksLimitReached, EndpointNotAllowedForApiKey, EndpointNotAllowedForPlan, FeatureMainnetsNotAllowedForPlan
     *
     * @return The actual instance (BannedIpAddress, BlockchainEventsCallbacksLimitReached, EndpointNotAllowedForApiKey, EndpointNotAllowedForPlan, FeatureMainnetsNotAllowedForPlan)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `BannedIpAddress`. If the actual instance is not `BannedIpAddress`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BannedIpAddress`
     * @throws ClassCastException if the instance is not `BannedIpAddress`
     */
    public BannedIpAddress getBannedIpAddress() throws ClassCastException {
        return (BannedIpAddress)super.getActualInstance();
    }

    /**
     * Get the actual instance of `BlockchainEventsCallbacksLimitReached`. If the actual instance is not `BlockchainEventsCallbacksLimitReached`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BlockchainEventsCallbacksLimitReached`
     * @throws ClassCastException if the instance is not `BlockchainEventsCallbacksLimitReached`
     */
    public BlockchainEventsCallbacksLimitReached getBlockchainEventsCallbacksLimitReached() throws ClassCastException {
        return (BlockchainEventsCallbacksLimitReached)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EndpointNotAllowedForApiKey`. If the actual instance is not `EndpointNotAllowedForApiKey`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EndpointNotAllowedForApiKey`
     * @throws ClassCastException if the instance is not `EndpointNotAllowedForApiKey`
     */
    public EndpointNotAllowedForApiKey getEndpointNotAllowedForApiKey() throws ClassCastException {
        return (EndpointNotAllowedForApiKey)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EndpointNotAllowedForPlan`. If the actual instance is not `EndpointNotAllowedForPlan`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EndpointNotAllowedForPlan`
     * @throws ClassCastException if the instance is not `EndpointNotAllowedForPlan`
     */
    public EndpointNotAllowedForPlan getEndpointNotAllowedForPlan() throws ClassCastException {
        return (EndpointNotAllowedForPlan)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FeatureMainnetsNotAllowedForPlan`. If the actual instance is not `FeatureMainnetsNotAllowedForPlan`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FeatureMainnetsNotAllowedForPlan`
     * @throws ClassCastException if the instance is not `FeatureMainnetsNotAllowedForPlan`
     */
    public FeatureMainnetsNotAllowedForPlan getFeatureMainnetsNotAllowedForPlan() throws ClassCastException {
        return (FeatureMainnetsNotAllowedForPlan)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NewUnconfirmedCoinsTransactionsE403
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    // validate the json string with BannedIpAddress
    try {
      BannedIpAddress.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with BlockchainEventsCallbacksLimitReached
    try {
      BlockchainEventsCallbacksLimitReached.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with EndpointNotAllowedForApiKey
    try {
      EndpointNotAllowedForApiKey.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with EndpointNotAllowedForPlan
    try {
      EndpointNotAllowedForPlan.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with FeatureMainnetsNotAllowedForPlan
    try {
      FeatureMainnetsNotAllowedForPlan.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for NewUnconfirmedCoinsTransactionsE403 with oneOf schemas: BannedIpAddress, BlockchainEventsCallbacksLimitReached, EndpointNotAllowedForApiKey, EndpointNotAllowedForPlan, FeatureMainnetsNotAllowedForPlan. %d class(es) match the result, expected 1. JSON: %s", validCount, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of NewUnconfirmedCoinsTransactionsE403 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NewUnconfirmedCoinsTransactionsE403
  * @throws IOException if the JSON string is invalid with respect to NewUnconfirmedCoinsTransactionsE403
  */
  public static NewUnconfirmedCoinsTransactionsE403 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NewUnconfirmedCoinsTransactionsE403.class);
  }

 /**
  * Convert an instance of NewUnconfirmedCoinsTransactionsE403 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


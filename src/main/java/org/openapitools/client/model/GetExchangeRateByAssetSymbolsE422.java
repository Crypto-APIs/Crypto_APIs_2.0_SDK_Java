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
import org.openapitools.client.model.BannedIpAddressDetails;
import org.openapitools.client.model.CouldNotCalculateRateForPair;
import org.openapitools.client.model.InvalidRequestBodyStructure;

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
public class GetExchangeRateByAssetSymbolsE422 extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetExchangeRateByAssetSymbolsE422.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetExchangeRateByAssetSymbolsE422.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetExchangeRateByAssetSymbolsE422' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CouldNotCalculateRateForPair> adapterCouldNotCalculateRateForPair = gson.getDelegateAdapter(this, TypeToken.get(CouldNotCalculateRateForPair.class));
            final TypeAdapter<InvalidRequestBodyStructure> adapterInvalidRequestBodyStructure = gson.getDelegateAdapter(this, TypeToken.get(InvalidRequestBodyStructure.class));

            return (TypeAdapter<T>) new TypeAdapter<GetExchangeRateByAssetSymbolsE422>() {
                @Override
                public void write(JsonWriter out, GetExchangeRateByAssetSymbolsE422 value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CouldNotCalculateRateForPair`
                    if (value.getActualInstance() instanceof CouldNotCalculateRateForPair) {
                        JsonObject obj = adapterCouldNotCalculateRateForPair.toJsonTree((CouldNotCalculateRateForPair)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `InvalidRequestBodyStructure`
                    if (value.getActualInstance() instanceof InvalidRequestBodyStructure) {
                        JsonObject obj = adapterInvalidRequestBodyStructure.toJsonTree((InvalidRequestBodyStructure)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CouldNotCalculateRateForPair, InvalidRequestBodyStructure");
                }

                @Override
                public GetExchangeRateByAssetSymbolsE422 read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CouldNotCalculateRateForPair
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CouldNotCalculateRateForPair.validateJsonObject(jsonObject);
                        actualAdapter = adapterCouldNotCalculateRateForPair;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CouldNotCalculateRateForPair'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'CouldNotCalculateRateForPair'", e);
                    }

                    // deserialize InvalidRequestBodyStructure
                    try {
                        // validate the JSON object to see if any exception is thrown
                        InvalidRequestBodyStructure.validateJsonObject(jsonObject);
                        actualAdapter = adapterInvalidRequestBodyStructure;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'InvalidRequestBodyStructure'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'InvalidRequestBodyStructure'", e);
                    }

                    if (match == 1) {
                        GetExchangeRateByAssetSymbolsE422 ret = new GetExchangeRateByAssetSymbolsE422();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for GetExchangeRateByAssetSymbolsE422: %d classes match result, expected 1. JSON: %s", match, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public GetExchangeRateByAssetSymbolsE422() {
        super("oneOf", Boolean.FALSE);
    }

    public GetExchangeRateByAssetSymbolsE422(CouldNotCalculateRateForPair o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetExchangeRateByAssetSymbolsE422(InvalidRequestBodyStructure o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CouldNotCalculateRateForPair", new GenericType<CouldNotCalculateRateForPair>() {
        });
        schemas.put("InvalidRequestBodyStructure", new GenericType<InvalidRequestBodyStructure>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return GetExchangeRateByAssetSymbolsE422.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CouldNotCalculateRateForPair, InvalidRequestBodyStructure
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CouldNotCalculateRateForPair) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof InvalidRequestBodyStructure) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CouldNotCalculateRateForPair, InvalidRequestBodyStructure");
    }

    /**
     * Get the actual instance, which can be the following:
     * CouldNotCalculateRateForPair, InvalidRequestBodyStructure
     *
     * @return The actual instance (CouldNotCalculateRateForPair, InvalidRequestBodyStructure)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CouldNotCalculateRateForPair`. If the actual instance is not `CouldNotCalculateRateForPair`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CouldNotCalculateRateForPair`
     * @throws ClassCastException if the instance is not `CouldNotCalculateRateForPair`
     */
    public CouldNotCalculateRateForPair getCouldNotCalculateRateForPair() throws ClassCastException {
        return (CouldNotCalculateRateForPair)super.getActualInstance();
    }

    /**
     * Get the actual instance of `InvalidRequestBodyStructure`. If the actual instance is not `InvalidRequestBodyStructure`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InvalidRequestBodyStructure`
     * @throws ClassCastException if the instance is not `InvalidRequestBodyStructure`
     */
    public InvalidRequestBodyStructure getInvalidRequestBodyStructure() throws ClassCastException {
        return (InvalidRequestBodyStructure)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetExchangeRateByAssetSymbolsE422
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    // validate the json string with CouldNotCalculateRateForPair
    try {
      CouldNotCalculateRateForPair.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with InvalidRequestBodyStructure
    try {
      InvalidRequestBodyStructure.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for GetExchangeRateByAssetSymbolsE422 with oneOf schemas: CouldNotCalculateRateForPair, InvalidRequestBodyStructure. %d class(es) match the result, expected 1. JSON: %s", validCount, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of GetExchangeRateByAssetSymbolsE422 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetExchangeRateByAssetSymbolsE422
  * @throws IOException if the JSON string is invalid with respect to GetExchangeRateByAssetSymbolsE422
  */
  public static GetExchangeRateByAssetSymbolsE422 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetExchangeRateByAssetSymbolsE422.class);
  }

 /**
  * Convert an instance of GetExchangeRateByAssetSymbolsE422 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


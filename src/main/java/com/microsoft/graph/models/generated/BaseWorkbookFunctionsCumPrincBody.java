// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.serializer.ISerializer;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Cum Princ Body.
 */
public class BaseWorkbookFunctionsCumPrincBody {

    /**
     * The rate.
     * 
     */
    @SerializedName("rate")
    @Expose
    public com.google.gson.JsonElement rate;

    /**
     * The nper.
     * 
     */
    @SerializedName("nper")
    @Expose
    public com.google.gson.JsonElement nper;

    /**
     * The pv.
     * 
     */
    @SerializedName("pv")
    @Expose
    public com.google.gson.JsonElement pv;

    /**
     * The start Period.
     * 
     */
    @SerializedName("startPeriod")
    @Expose
    public com.google.gson.JsonElement startPeriod;

    /**
     * The end Period.
     * 
     */
    @SerializedName("endPeriod")
    @Expose
    public com.google.gson.JsonElement endPeriod;

    /**
     * The type.
     * 
     */
    @SerializedName("type")
    @Expose
    public com.google.gson.JsonElement type;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}

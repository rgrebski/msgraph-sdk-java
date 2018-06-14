// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.serializer.AdditionalDataManager;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.ISerializer;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Lookup Column.
 */
public class BaseLookupColumn implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Allow Multiple Values.
     * Indicates whether multiple values can be selected from the source.
     */
    @SerializedName("allowMultipleValues")
    @Expose
    public Boolean allowMultipleValues;

    /**
     * The Allow Unlimited Length.
     * Indicates whether values in the column should be able to exceed the standard limit of 255 characters.
     */
    @SerializedName("allowUnlimitedLength")
    @Expose
    public Boolean allowUnlimitedLength;

    /**
     * The Column Name.
     * The name of the lookup source column.
     */
    @SerializedName("columnName")
    @Expose
    public String columnName;

    /**
     * The List Id.
     * The unique identifier of the lookup source list.
     */
    @SerializedName("listId")
    @Expose
    public String listId;

    /**
     * The Primary Lookup Column Id.
     * If specified, this column is a secondary lookup, pulling an additional field from the list item looked up by the primary lookup. Use the list item looked up by the primary as the source for the column named here.
     */
    @SerializedName("primaryLookupColumnId")
    @Expose
    public String primaryLookupColumnId;


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

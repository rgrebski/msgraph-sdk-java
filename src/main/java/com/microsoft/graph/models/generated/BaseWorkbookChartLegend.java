// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.models.extensions.WorkbookChartLegendFormat;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.ISerializer;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Chart Legend.
 */
public class BaseWorkbookChartLegend extends Entity implements IJsonBackedObject {


    /**
     * The Overlay.
     * 
     */
    @SerializedName("overlay")
    @Expose
    public Boolean overlay;

    /**
     * The Position.
     * 
     */
    @SerializedName("position")
    @Expose
    public String position;

    /**
     * The Visible.
     * 
     */
    @SerializedName("visible")
    @Expose
    public Boolean visible;

    /**
     * The Format.
     * 
     */
    @SerializedName("format")
    @Expose
    public WorkbookChartLegendFormat format;


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

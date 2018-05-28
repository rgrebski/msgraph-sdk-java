// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.models.extensions.TimeZoneBase;
import com.microsoft.graph.serializer.AdditionalDataManager;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.ISerializer;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Working Hours.
 */
public class BaseWorkingHours implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Days Of Week.
     * The days of the week on which the user works.
     */
    @SerializedName("daysOfWeek")
    @Expose
    public java.util.List<DayOfWeek> daysOfWeek;

    /**
     * The Start Time.
     * The time of the day that the user starts working.
     */
    @SerializedName("startTime")
    @Expose
    public com.microsoft.graph.models.extensions.TimeOfDay startTime;

    /**
     * The End Time.
     * The time of the day that the user stops working.
     */
    @SerializedName("endTime")
    @Expose
    public com.microsoft.graph.models.extensions.TimeOfDay endTime;

    /**
     * The Time Zone.
     * The time zone to which the working hours apply.
     */
    @SerializedName("timeZone")
    @Expose
    public TimeZoneBase timeZone;


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

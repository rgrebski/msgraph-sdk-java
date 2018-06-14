// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementAssignmentTarget;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.models.extensions.MobileAppAssignmentSettings;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.ISerializer;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Mobile App Assignment.
 */
public class BaseMobileAppAssignment extends Entity implements IJsonBackedObject {


    /**
     * The Intent.
     * The install intent defined by the admin. Possible values are: available, required, uninstall, availableWithoutEnrollment.
     */
    @SerializedName("intent")
    @Expose
    public InstallIntent intent;

    /**
     * The Target.
     * The target group assignment defined by the admin.
     */
    @SerializedName("target")
    @Expose
    public DeviceAndAppManagementAssignmentTarget target;

    /**
     * The Settings.
     * The settings for target assignment defined by the admin.
     */
    @SerializedName("settings")
    @Expose
    public MobileAppAssignmentSettings settings;


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

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.ISerializer;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Ios Compliance Policy.
 */
public class BaseIosCompliancePolicy extends DeviceCompliancePolicy implements IJsonBackedObject {


    /**
     * The Passcode Block Simple.
     * Indicates whether or not to block simple passcodes.
     */
    @SerializedName("passcodeBlockSimple")
    @Expose
    public Boolean passcodeBlockSimple;

    /**
     * The Passcode Expiration Days.
     * Number of days before the passcode expires. Valid values 1 to 65535
     */
    @SerializedName("passcodeExpirationDays")
    @Expose
    public Integer passcodeExpirationDays;

    /**
     * The Passcode Minimum Length.
     * Minimum length of passcode. Valid values 4 to 14
     */
    @SerializedName("passcodeMinimumLength")
    @Expose
    public Integer passcodeMinimumLength;

    /**
     * The Passcode Minutes Of Inactivity Before Lock.
     * Minutes of inactivity before a passcode is required.
     */
    @SerializedName("passcodeMinutesOfInactivityBeforeLock")
    @Expose
    public Integer passcodeMinutesOfInactivityBeforeLock;

    /**
     * The Passcode Previous Passcode Block Count.
     * Number of previous passcodes to block. Valid values 1 to 24
     */
    @SerializedName("passcodePreviousPasscodeBlockCount")
    @Expose
    public Integer passcodePreviousPasscodeBlockCount;

    /**
     * The Passcode Minimum Character Set Count.
     * The number of character sets required in the password.
     */
    @SerializedName("passcodeMinimumCharacterSetCount")
    @Expose
    public Integer passcodeMinimumCharacterSetCount;

    /**
     * The Passcode Required Type.
     * The required passcode type. Possible values are: deviceDefault, alphanumeric, numeric.
     */
    @SerializedName("passcodeRequiredType")
    @Expose
    public RequiredPasswordType passcodeRequiredType;

    /**
     * The Passcode Required.
     * Indicates whether or not to require a passcode.
     */
    @SerializedName("passcodeRequired")
    @Expose
    public Boolean passcodeRequired;

    /**
     * The Os Minimum Version.
     * Minimum IOS version.
     */
    @SerializedName("osMinimumVersion")
    @Expose
    public String osMinimumVersion;

    /**
     * The Os Maximum Version.
     * Maximum IOS version.
     */
    @SerializedName("osMaximumVersion")
    @Expose
    public String osMaximumVersion;

    /**
     * The Security Block Jailbroken Devices.
     * Devices must not be jailbroken or rooted.
     */
    @SerializedName("securityBlockJailbrokenDevices")
    @Expose
    public Boolean securityBlockJailbrokenDevices;

    /**
     * The Device Threat Protection Enabled.
     * Require that devices have enabled device threat protection .
     */
    @SerializedName("deviceThreatProtectionEnabled")
    @Expose
    public Boolean deviceThreatProtectionEnabled;

    /**
     * The Device Threat Protection Required Security Level.
     * Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet.
     */
    @SerializedName("deviceThreatProtectionRequiredSecurityLevel")
    @Expose
    public DeviceThreatProtectionLevel deviceThreatProtectionRequiredSecurityLevel;

    /**
     * The Managed Email Profile Required.
     * Indicates whether or not to require a managed email profile.
     */
    @SerializedName("managedEmailProfileRequired")
    @Expose
    public Boolean managedEmailProfileRequired;


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

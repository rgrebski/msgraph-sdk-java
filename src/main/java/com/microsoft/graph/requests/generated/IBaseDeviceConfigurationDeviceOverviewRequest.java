// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device Configuration Device Overview Request.
 */
public interface IBaseDeviceConfigurationDeviceOverviewRequest extends IHttpRequest {

    /**
     * Gets the DeviceConfigurationDeviceOverview from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceConfigurationDeviceOverview> callback);

    /**
     * Gets the DeviceConfigurationDeviceOverview from the service
     *
     * @return the DeviceConfigurationDeviceOverview from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceConfigurationDeviceOverview get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceConfigurationDeviceOverview with a source
     *
     * @param sourceDeviceConfigurationDeviceOverview the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceConfigurationDeviceOverview sourceDeviceConfigurationDeviceOverview, final ICallback<DeviceConfigurationDeviceOverview> callback);

    /**
     * Patches this DeviceConfigurationDeviceOverview with a source
     *
     * @param sourceDeviceConfigurationDeviceOverview the source object with updates
     * @return the updated DeviceConfigurationDeviceOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceConfigurationDeviceOverview patch(final DeviceConfigurationDeviceOverview sourceDeviceConfigurationDeviceOverview) throws ClientException;

    /**
     * Posts a DeviceConfigurationDeviceOverview with a new object
     *
     * @param newDeviceConfigurationDeviceOverview the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceConfigurationDeviceOverview newDeviceConfigurationDeviceOverview, final ICallback<DeviceConfigurationDeviceOverview> callback);

    /**
     * Posts a DeviceConfigurationDeviceOverview with a new object
     *
     * @param newDeviceConfigurationDeviceOverview the new object to create
     * @return the created DeviceConfigurationDeviceOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceConfigurationDeviceOverview post(final DeviceConfigurationDeviceOverview newDeviceConfigurationDeviceOverview) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseDeviceConfigurationDeviceOverviewRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseDeviceConfigurationDeviceOverviewRequest expand(final String value);

}

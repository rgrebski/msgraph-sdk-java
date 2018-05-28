// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.DeviceComplianceDeviceStatus;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device Compliance Device Status Request.
 */
public interface IBaseDeviceComplianceDeviceStatusRequest extends IHttpRequest {

    /**
     * Gets the DeviceComplianceDeviceStatus from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceComplianceDeviceStatus> callback);

    /**
     * Gets the DeviceComplianceDeviceStatus from the service
     *
     * @return the DeviceComplianceDeviceStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceDeviceStatus get() throws ClientException;

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
     * Patches this DeviceComplianceDeviceStatus with a source
     *
     * @param sourceDeviceComplianceDeviceStatus the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceComplianceDeviceStatus sourceDeviceComplianceDeviceStatus, final ICallback<DeviceComplianceDeviceStatus> callback);

    /**
     * Patches this DeviceComplianceDeviceStatus with a source
     *
     * @param sourceDeviceComplianceDeviceStatus the source object with updates
     * @return the updated DeviceComplianceDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceDeviceStatus patch(final DeviceComplianceDeviceStatus sourceDeviceComplianceDeviceStatus) throws ClientException;

    /**
     * Posts a DeviceComplianceDeviceStatus with a new object
     *
     * @param newDeviceComplianceDeviceStatus the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceComplianceDeviceStatus newDeviceComplianceDeviceStatus, final ICallback<DeviceComplianceDeviceStatus> callback);

    /**
     * Posts a DeviceComplianceDeviceStatus with a new object
     *
     * @param newDeviceComplianceDeviceStatus the new object to create
     * @return the created DeviceComplianceDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceDeviceStatus post(final DeviceComplianceDeviceStatus newDeviceComplianceDeviceStatus) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseDeviceComplianceDeviceStatusRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseDeviceComplianceDeviceStatusRequest expand(final String value);

}


// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementRoleAssignment;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementRoleAssignmentCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device And App Management Role Assignment Collection Request.
 */
public interface IBaseDeviceAndAppManagementRoleAssignmentCollectionRequest {

    void get(final ICallback<IDeviceAndAppManagementRoleAssignmentCollectionPage> callback);

    IDeviceAndAppManagementRoleAssignmentCollectionPage get() throws ClientException;

    void post(final DeviceAndAppManagementRoleAssignment newDeviceAndAppManagementRoleAssignment, final ICallback<DeviceAndAppManagementRoleAssignment> callback);

    DeviceAndAppManagementRoleAssignment post(final DeviceAndAppManagementRoleAssignment newDeviceAndAppManagementRoleAssignment) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceAndAppManagementRoleAssignmentCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceAndAppManagementRoleAssignmentCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IDeviceAndAppManagementRoleAssignmentCollectionRequest top(final int value);

}

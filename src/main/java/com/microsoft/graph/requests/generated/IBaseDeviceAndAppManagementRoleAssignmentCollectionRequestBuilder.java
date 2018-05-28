// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementRoleAssignmentCollectionRequest;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementRoleAssignmentRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device And App Management Role Assignment Collection Request Builder.
 */
public interface IBaseDeviceAndAppManagementRoleAssignmentCollectionRequestBuilder extends IRequestBuilder {

    IDeviceAndAppManagementRoleAssignmentCollectionRequest buildRequest();

    IDeviceAndAppManagementRoleAssignmentCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IDeviceAndAppManagementRoleAssignmentRequestBuilder byId(final String id);

}

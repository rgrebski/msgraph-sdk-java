// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStatusCollectionRequest;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStatusRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device Configuration Device Status Collection Request Builder.
 */
public interface IBaseDeviceConfigurationDeviceStatusCollectionRequestBuilder extends IRequestBuilder {

    IDeviceConfigurationDeviceStatusCollectionRequest buildRequest();

    IDeviceConfigurationDeviceStatusCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IDeviceConfigurationDeviceStatusRequestBuilder byId(final String id);

}

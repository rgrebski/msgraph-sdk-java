// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IManagedDeviceDisableLostModeRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Managed Device Disable Lost Mode Request Builder.
 */
public interface IBaseManagedDeviceDisableLostModeRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IManagedDeviceDisableLostModeRequest
     *
     * @return the IManagedDeviceDisableLostModeRequest instance
     */
    IManagedDeviceDisableLostModeRequest buildRequest();

    /**
     * Creates the IManagedDeviceDisableLostModeRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceDisableLostModeRequest instance
     */
    IManagedDeviceDisableLostModeRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}

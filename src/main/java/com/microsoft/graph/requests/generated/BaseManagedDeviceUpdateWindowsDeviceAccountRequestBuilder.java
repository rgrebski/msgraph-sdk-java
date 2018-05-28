// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.UpdateWindowsDeviceAccountActionParameter;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IManagedDeviceUpdateWindowsDeviceAccountRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceUpdateWindowsDeviceAccountRequest;

/**
 * The class for the Base Managed Device Update Windows Device Account Request Builder.
 */
public class BaseManagedDeviceUpdateWindowsDeviceAccountRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this ManagedDeviceUpdateWindowsDeviceAccount
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param updateWindowsDeviceAccountActionParameter the updateWindowsDeviceAccountActionParameter
     */
    public BaseManagedDeviceUpdateWindowsDeviceAccountRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final UpdateWindowsDeviceAccountActionParameter updateWindowsDeviceAccountActionParameter) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("updateWindowsDeviceAccountActionParameter", updateWindowsDeviceAccountActionParameter);
    }

    /**
     * Creates the IManagedDeviceUpdateWindowsDeviceAccountRequest
     *
     * @return the IManagedDeviceUpdateWindowsDeviceAccountRequest instance
     */
    public IManagedDeviceUpdateWindowsDeviceAccountRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IManagedDeviceUpdateWindowsDeviceAccountRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceUpdateWindowsDeviceAccountRequest instance
     */
    public IManagedDeviceUpdateWindowsDeviceAccountRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ManagedDeviceUpdateWindowsDeviceAccountRequest request = new ManagedDeviceUpdateWindowsDeviceAccountRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("updateWindowsDeviceAccountActionParameter")) {
            request.body.updateWindowsDeviceAccountActionParameter = getParameter("updateWindowsDeviceAccountActionParameter");
        }

        return request;
    }
}

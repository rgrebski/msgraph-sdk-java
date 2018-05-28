// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IManagedDeviceWindowsDefenderScanRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceWindowsDefenderScanRequest;

/**
 * The class for the Base Managed Device Windows Defender Scan Request Builder.
 */
public class BaseManagedDeviceWindowsDefenderScanRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this ManagedDeviceWindowsDefenderScan
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param quickScan the quickScan
     */
    public BaseManagedDeviceWindowsDefenderScanRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Boolean quickScan) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("quickScan", quickScan);
    }

    /**
     * Creates the IManagedDeviceWindowsDefenderScanRequest
     *
     * @return the IManagedDeviceWindowsDefenderScanRequest instance
     */
    public IManagedDeviceWindowsDefenderScanRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IManagedDeviceWindowsDefenderScanRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceWindowsDefenderScanRequest instance
     */
    public IManagedDeviceWindowsDefenderScanRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ManagedDeviceWindowsDefenderScanRequest request = new ManagedDeviceWindowsDefenderScanRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("quickScan")) {
            request.body.quickScan = getParameter("quickScan");
        }

        return request;
    }
}

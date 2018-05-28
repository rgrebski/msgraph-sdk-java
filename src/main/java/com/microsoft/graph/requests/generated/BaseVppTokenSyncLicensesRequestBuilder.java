// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IVppTokenSyncLicensesRequest;
import com.microsoft.graph.requests.extensions.VppTokenSyncLicensesRequest;

/**
 * The class for the Base Vpp Token Sync Licenses Request Builder.
 */
public class BaseVppTokenSyncLicensesRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this VppTokenSyncLicenses
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseVppTokenSyncLicensesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IVppTokenSyncLicensesRequest
     *
     * @return the IVppTokenSyncLicensesRequest instance
     */
    public IVppTokenSyncLicensesRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IVppTokenSyncLicensesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IVppTokenSyncLicensesRequest instance
     */
    public IVppTokenSyncLicensesRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        VppTokenSyncLicensesRequest request = new VppTokenSyncLicensesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}

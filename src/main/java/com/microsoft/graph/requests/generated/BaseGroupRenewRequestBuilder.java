// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.GroupRenewRequest;
import com.microsoft.graph.requests.extensions.IGroupRenewRequest;

/**
 * The class for the Base Group Renew Request Builder.
 */
public class BaseGroupRenewRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this GroupRenew
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseGroupRenewRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IGroupRenewRequest
     *
     * @return the IGroupRenewRequest instance
     */
    public IGroupRenewRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IGroupRenewRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IGroupRenewRequest instance
     */
    public IGroupRenewRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        GroupRenewRequest request = new GroupRenewRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}

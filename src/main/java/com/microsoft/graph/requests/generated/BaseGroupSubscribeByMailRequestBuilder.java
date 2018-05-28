// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.GroupSubscribeByMailRequest;
import com.microsoft.graph.requests.extensions.IGroupSubscribeByMailRequest;

/**
 * The class for the Base Group Subscribe By Mail Request Builder.
 */
public class BaseGroupSubscribeByMailRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this GroupSubscribeByMail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseGroupSubscribeByMailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IGroupSubscribeByMailRequest
     *
     * @return the IGroupSubscribeByMailRequest instance
     */
    public IGroupSubscribeByMailRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IGroupSubscribeByMailRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IGroupSubscribeByMailRequest instance
     */
    public IGroupSubscribeByMailRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        GroupSubscribeByMailRequest request = new GroupSubscribeByMailRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IMessageCreateForwardRequest;
import com.microsoft.graph.requests.extensions.MessageCreateForwardRequest;

/**
 * The class for the Base Message Create Forward Request Builder.
 */
public class BaseMessageCreateForwardRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this MessageCreateForward
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseMessageCreateForwardRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IMessageCreateForwardRequest
     *
     * @return the IMessageCreateForwardRequest instance
     */
    public IMessageCreateForwardRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IMessageCreateForwardRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IMessageCreateForwardRequest instance
     */
    public IMessageCreateForwardRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        MessageCreateForwardRequest request = new MessageCreateForwardRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}

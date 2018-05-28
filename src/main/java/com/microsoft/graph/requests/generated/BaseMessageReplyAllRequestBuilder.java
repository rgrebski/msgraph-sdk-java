// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IMessageReplyAllRequest;
import com.microsoft.graph.requests.extensions.MessageReplyAllRequest;

/**
 * The class for the Base Message Reply All Request Builder.
 */
public class BaseMessageReplyAllRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this MessageReplyAll
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param comment the comment
     */
    public BaseMessageReplyAllRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String comment) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("comment", comment);
    }

    /**
     * Creates the IMessageReplyAllRequest
     *
     * @return the IMessageReplyAllRequest instance
     */
    public IMessageReplyAllRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IMessageReplyAllRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IMessageReplyAllRequest instance
     */
    public IMessageReplyAllRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        MessageReplyAllRequest request = new MessageReplyAllRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("comment")) {
            request.body.comment = getParameter("comment");
        }

        return request;
    }
}

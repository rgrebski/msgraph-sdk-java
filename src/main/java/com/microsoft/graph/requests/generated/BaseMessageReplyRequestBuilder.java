// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IMessageReplyRequest;
import com.microsoft.graph.requests.extensions.MessageReplyRequest;

/**
 * The class for the Base Message Reply Request Builder.
 */
public class BaseMessageReplyRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this MessageReply
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param comment the comment
     */
    public BaseMessageReplyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String comment) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("comment", comment);
    }

    /**
     * Creates the IMessageReplyRequest
     *
     * @return the IMessageReplyRequest instance
     */
    public IMessageReplyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IMessageReplyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IMessageReplyRequest instance
     */
    public IMessageReplyRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        MessageReplyRequest request = new MessageReplyRequest(
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

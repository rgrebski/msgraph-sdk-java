// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.EventDeclineRequest;
import com.microsoft.graph.requests.extensions.IEventDeclineRequest;

/**
 * The class for the Base Event Decline Request Builder.
 */
public class BaseEventDeclineRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this EventDecline
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param comment the comment
     * @param sendResponse the sendResponse
     */
    public BaseEventDeclineRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String comment, final Boolean sendResponse) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("comment", comment);
        bodyParams.put("sendResponse", sendResponse);
    }

    /**
     * Creates the IEventDeclineRequest
     *
     * @return the IEventDeclineRequest instance
     */
    public IEventDeclineRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IEventDeclineRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IEventDeclineRequest instance
     */
    public IEventDeclineRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        EventDeclineRequest request = new EventDeclineRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("comment")) {
            request.body.comment = getParameter("comment");
        }

        if (hasParameter("sendResponse")) {
            request.body.sendResponse = getParameter("sendResponse");
        }

        return request;
    }
}

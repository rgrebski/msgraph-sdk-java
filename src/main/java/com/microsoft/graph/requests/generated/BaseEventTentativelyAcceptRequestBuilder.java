// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.EventTentativelyAcceptRequest;
import com.microsoft.graph.requests.extensions.IEventTentativelyAcceptRequest;

/**
 * The class for the Base Event Tentatively Accept Request Builder.
 */
public class BaseEventTentativelyAcceptRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this EventTentativelyAccept
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param comment the comment
     * @param sendResponse the sendResponse
     */
    public BaseEventTentativelyAcceptRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String comment, final Boolean sendResponse) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("comment", comment);
        bodyParams.put("sendResponse", sendResponse);
    }

    /**
     * Creates the IEventTentativelyAcceptRequest
     *
     * @return the IEventTentativelyAcceptRequest instance
     */
    public IEventTentativelyAcceptRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IEventTentativelyAcceptRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IEventTentativelyAcceptRequest instance
     */
    public IEventTentativelyAcceptRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        EventTentativelyAcceptRequest request = new EventTentativelyAcceptRequest(
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

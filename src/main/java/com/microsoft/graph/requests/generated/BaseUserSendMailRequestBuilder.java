// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IUserSendMailRequest;
import com.microsoft.graph.requests.extensions.UserSendMailRequest;

/**
 * The class for the Base User Send Mail Request Builder.
 */
public class BaseUserSendMailRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this UserSendMail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param message the message
     * @param saveToSentItems the saveToSentItems
     */
    public BaseUserSendMailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Message message, final Boolean saveToSentItems) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("message", message);
        bodyParams.put("saveToSentItems", saveToSentItems);
    }

    /**
     * Creates the IUserSendMailRequest
     *
     * @return the IUserSendMailRequest instance
     */
    public IUserSendMailRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IUserSendMailRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IUserSendMailRequest instance
     */
    public IUserSendMailRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        UserSendMailRequest request = new UserSendMailRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("message")) {
            request.body.message = getParameter("message");
        }

        if (hasParameter("saveToSentItems")) {
            request.body.saveToSentItems = getParameter("saveToSentItems");
        }

        return request;
    }
}

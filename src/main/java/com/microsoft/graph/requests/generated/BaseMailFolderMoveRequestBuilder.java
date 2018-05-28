// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IMailFolderMoveRequest;
import com.microsoft.graph.requests.extensions.MailFolderMoveRequest;

/**
 * The class for the Base Mail Folder Move Request Builder.
 */
public class BaseMailFolderMoveRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this MailFolderMove
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param destinationId the destinationId
     */
    public BaseMailFolderMoveRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String destinationId) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("destinationId", destinationId);
    }

    /**
     * Creates the IMailFolderMoveRequest
     *
     * @return the IMailFolderMoveRequest instance
     */
    public IMailFolderMoveRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IMailFolderMoveRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IMailFolderMoveRequest instance
     */
    public IMailFolderMoveRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        MailFolderMoveRequest request = new MailFolderMoveRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("destinationId")) {
            request.body.destinationId = getParameter("destinationId");
        }

        return request;
    }
}

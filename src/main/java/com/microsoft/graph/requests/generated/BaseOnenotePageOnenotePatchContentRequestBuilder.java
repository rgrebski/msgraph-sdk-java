// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.OnenotePatchContentCommand;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IOnenotePageOnenotePatchContentRequest;
import com.microsoft.graph.requests.extensions.OnenotePageOnenotePatchContentRequest;

/**
 * The class for the Base Onenote Page Onenote Patch Content Request Builder.
 */
public class BaseOnenotePageOnenotePatchContentRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this OnenotePageOnenotePatchContent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param commands the commands
     */
    public BaseOnenotePageOnenotePatchContentRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<OnenotePatchContentCommand> commands) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("commands", commands);
    }

    /**
     * Creates the IOnenotePageOnenotePatchContentRequest
     *
     * @return the IOnenotePageOnenotePatchContentRequest instance
     */
    public IOnenotePageOnenotePatchContentRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IOnenotePageOnenotePatchContentRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IOnenotePageOnenotePatchContentRequest instance
     */
    public IOnenotePageOnenotePatchContentRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        OnenotePageOnenotePatchContentRequest request = new OnenotePageOnenotePatchContentRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("commands")) {
            request.body.commands = getParameter("commands");
        }

        return request;
    }
}

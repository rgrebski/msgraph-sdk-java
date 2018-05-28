// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsFisherRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsFisherRequest;

/**
 * The class for the Base Workbook Functions Fisher Request Builder.
 */
public class BaseWorkbookFunctionsFisherRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFisher
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param x the x
     */
    public BaseWorkbookFunctionsFisherRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement x) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("x", x);
    }

    /**
     * Creates the IWorkbookFunctionsFisherRequest
     *
     * @return the IWorkbookFunctionsFisherRequest instance
     */
    public IWorkbookFunctionsFisherRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsFisherRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsFisherRequest instance
     */
    public IWorkbookFunctionsFisherRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsFisherRequest request = new WorkbookFunctionsFisherRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("x")) {
            request.body.x = getParameter("x");
        }

        return request;
    }
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsMroundRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsMroundRequest;

/**
 * The class for the Base Workbook Functions Mround Request Builder.
 */
public class BaseWorkbookFunctionsMroundRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsMround
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param multiple the multiple
     */
    public BaseWorkbookFunctionsMroundRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement multiple) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("multiple", multiple);
    }

    /**
     * Creates the IWorkbookFunctionsMroundRequest
     *
     * @return the IWorkbookFunctionsMroundRequest instance
     */
    public IWorkbookFunctionsMroundRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsMroundRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsMroundRequest instance
     */
    public IWorkbookFunctionsMroundRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsMroundRequest request = new WorkbookFunctionsMroundRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("multiple")) {
            request.body.multiple = getParameter("multiple");
        }

        return request;
    }
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsBin2OctRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsBin2OctRequest;

/**
 * The class for the Base Workbook Functions Bin2Oct Request Builder.
 */
public class BaseWorkbookFunctionsBin2OctRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBin2Oct
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param places the places
     */
    public BaseWorkbookFunctionsBin2OctRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement places) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("places", places);
    }

    /**
     * Creates the IWorkbookFunctionsBin2OctRequest
     *
     * @return the IWorkbookFunctionsBin2OctRequest instance
     */
    public IWorkbookFunctionsBin2OctRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBin2OctRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsBin2OctRequest instance
     */
    public IWorkbookFunctionsBin2OctRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsBin2OctRequest request = new WorkbookFunctionsBin2OctRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("places")) {
            request.body.places = getParameter("places");
        }

        return request;
    }
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsCeiling_PreciseRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsCeiling_PreciseRequest;

/**
 * The class for the Base Workbook Functions Ceiling_Precise Request Builder.
 */
public class BaseWorkbookFunctionsCeiling_PreciseRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsCeiling_Precise
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param significance the significance
     */
    public BaseWorkbookFunctionsCeiling_PreciseRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement significance) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("significance", significance);
    }

    /**
     * Creates the IWorkbookFunctionsCeiling_PreciseRequest
     *
     * @return the IWorkbookFunctionsCeiling_PreciseRequest instance
     */
    public IWorkbookFunctionsCeiling_PreciseRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsCeiling_PreciseRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCeiling_PreciseRequest instance
     */
    public IWorkbookFunctionsCeiling_PreciseRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsCeiling_PreciseRequest request = new WorkbookFunctionsCeiling_PreciseRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("significance")) {
            request.body.significance = getParameter("significance");
        }

        return request;
    }
}

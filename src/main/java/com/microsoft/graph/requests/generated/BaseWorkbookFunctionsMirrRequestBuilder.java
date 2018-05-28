// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsMirrRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsMirrRequest;

/**
 * The class for the Base Workbook Functions Mirr Request Builder.
 */
public class BaseWorkbookFunctionsMirrRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsMirr
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param values the values
     * @param financeRate the financeRate
     * @param reinvestRate the reinvestRate
     */
    public BaseWorkbookFunctionsMirrRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement values, final com.google.gson.JsonElement financeRate, final com.google.gson.JsonElement reinvestRate) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("values", values);
        bodyParams.put("financeRate", financeRate);
        bodyParams.put("reinvestRate", reinvestRate);
    }

    /**
     * Creates the IWorkbookFunctionsMirrRequest
     *
     * @return the IWorkbookFunctionsMirrRequest instance
     */
    public IWorkbookFunctionsMirrRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsMirrRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsMirrRequest instance
     */
    public IWorkbookFunctionsMirrRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsMirrRequest request = new WorkbookFunctionsMirrRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("values")) {
            request.body.values = getParameter("values");
        }

        if (hasParameter("financeRate")) {
            request.body.financeRate = getParameter("financeRate");
        }

        if (hasParameter("reinvestRate")) {
            request.body.reinvestRate = getParameter("reinvestRate");
        }

        return request;
    }
}

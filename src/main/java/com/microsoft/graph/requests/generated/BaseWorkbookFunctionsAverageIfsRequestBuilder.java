// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsAverageIfsRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsAverageIfsRequest;

/**
 * The class for the Base Workbook Functions Average Ifs Request Builder.
 */
public class BaseWorkbookFunctionsAverageIfsRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsAverageIfs
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param averageRange the averageRange
     * @param values the values
     */
    public BaseWorkbookFunctionsAverageIfsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement averageRange, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("averageRange", averageRange);
        bodyParams.put("values", values);
    }

    /**
     * Creates the IWorkbookFunctionsAverageIfsRequest
     *
     * @return the IWorkbookFunctionsAverageIfsRequest instance
     */
    public IWorkbookFunctionsAverageIfsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsAverageIfsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsAverageIfsRequest instance
     */
    public IWorkbookFunctionsAverageIfsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsAverageIfsRequest request = new WorkbookFunctionsAverageIfsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("averageRange")) {
            request.body.averageRange = getParameter("averageRange");
        }

        if (hasParameter("values")) {
            request.body.values = getParameter("values");
        }

        return request;
    }
}

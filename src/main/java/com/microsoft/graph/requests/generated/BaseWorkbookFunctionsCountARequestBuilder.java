// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsCountARequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsCountARequest;

/**
 * The class for the Base Workbook Functions Count ARequest Builder.
 */
public class BaseWorkbookFunctionsCountARequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsCountA
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param values the values
     */
    public BaseWorkbookFunctionsCountARequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("values", values);
    }

    /**
     * Creates the IWorkbookFunctionsCountARequest
     *
     * @return the IWorkbookFunctionsCountARequest instance
     */
    public IWorkbookFunctionsCountARequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsCountARequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCountARequest instance
     */
    public IWorkbookFunctionsCountARequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsCountARequest request = new WorkbookFunctionsCountARequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("values")) {
            request.body.values = getParameter("values");
        }

        return request;
    }
}

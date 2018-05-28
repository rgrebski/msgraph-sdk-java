// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsMultiNomialRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsMultiNomialRequest;

/**
 * The class for the Base Workbook Functions Multi Nomial Request Builder.
 */
public class BaseWorkbookFunctionsMultiNomialRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsMultiNomial
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param values the values
     */
    public BaseWorkbookFunctionsMultiNomialRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("values", values);
    }

    /**
     * Creates the IWorkbookFunctionsMultiNomialRequest
     *
     * @return the IWorkbookFunctionsMultiNomialRequest instance
     */
    public IWorkbookFunctionsMultiNomialRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsMultiNomialRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsMultiNomialRequest instance
     */
    public IWorkbookFunctionsMultiNomialRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsMultiNomialRequest request = new WorkbookFunctionsMultiNomialRequest(
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

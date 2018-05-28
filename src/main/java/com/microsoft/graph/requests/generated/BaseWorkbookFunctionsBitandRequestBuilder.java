// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsBitandRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsBitandRequest;

/**
 * The class for the Base Workbook Functions Bitand Request Builder.
 */
public class BaseWorkbookFunctionsBitandRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBitand
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number1 the number1
     * @param number2 the number2
     */
    public BaseWorkbookFunctionsBitandRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number1, final com.google.gson.JsonElement number2) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number1", number1);
        bodyParams.put("number2", number2);
    }

    /**
     * Creates the IWorkbookFunctionsBitandRequest
     *
     * @return the IWorkbookFunctionsBitandRequest instance
     */
    public IWorkbookFunctionsBitandRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBitandRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsBitandRequest instance
     */
    public IWorkbookFunctionsBitandRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsBitandRequest request = new WorkbookFunctionsBitandRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number1")) {
            request.body.number1 = getParameter("number1");
        }

        if (hasParameter("number2")) {
            request.body.number2 = getParameter("number2");
        }

        return request;
    }
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsBitxorRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsBitxorRequest;

/**
 * The class for the Base Workbook Functions Bitxor Request Builder.
 */
public class BaseWorkbookFunctionsBitxorRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBitxor
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number1 the number1
     * @param number2 the number2
     */
    public BaseWorkbookFunctionsBitxorRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number1, final com.google.gson.JsonElement number2) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number1", number1);
        bodyParams.put("number2", number2);
    }

    /**
     * Creates the IWorkbookFunctionsBitxorRequest
     *
     * @return the IWorkbookFunctionsBitxorRequest instance
     */
    public IWorkbookFunctionsBitxorRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBitxorRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsBitxorRequest instance
     */
    public IWorkbookFunctionsBitxorRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsBitxorRequest request = new WorkbookFunctionsBitxorRequest(
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

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsGeStepRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsGeStepRequest;

/**
 * The class for the Base Workbook Functions Ge Step Request Builder.
 */
public class BaseWorkbookFunctionsGeStepRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsGeStep
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param step the step
     */
    public BaseWorkbookFunctionsGeStepRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement step) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("step", step);
    }

    /**
     * Creates the IWorkbookFunctionsGeStepRequest
     *
     * @return the IWorkbookFunctionsGeStepRequest instance
     */
    public IWorkbookFunctionsGeStepRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsGeStepRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsGeStepRequest instance
     */
    public IWorkbookFunctionsGeStepRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsGeStepRequest request = new WorkbookFunctionsGeStepRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("step")) {
            request.body.step = getParameter("step");
        }

        return request;
    }
}

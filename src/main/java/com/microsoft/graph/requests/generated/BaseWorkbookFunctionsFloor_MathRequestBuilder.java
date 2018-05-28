// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsFloor_MathRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsFloor_MathRequest;

/**
 * The class for the Base Workbook Functions Floor_Math Request Builder.
 */
public class BaseWorkbookFunctionsFloor_MathRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFloor_Math
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param significance the significance
     * @param mode the mode
     */
    public BaseWorkbookFunctionsFloor_MathRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement significance, final com.google.gson.JsonElement mode) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("significance", significance);
        bodyParams.put("mode", mode);
    }

    /**
     * Creates the IWorkbookFunctionsFloor_MathRequest
     *
     * @return the IWorkbookFunctionsFloor_MathRequest instance
     */
    public IWorkbookFunctionsFloor_MathRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsFloor_MathRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsFloor_MathRequest instance
     */
    public IWorkbookFunctionsFloor_MathRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsFloor_MathRequest request = new WorkbookFunctionsFloor_MathRequest(
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

        if (hasParameter("mode")) {
            request.body.mode = getParameter("mode");
        }

        return request;
    }
}

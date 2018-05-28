// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsCombinRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsCombinRequest;

/**
 * The class for the Base Workbook Functions Combin Request Builder.
 */
public class BaseWorkbookFunctionsCombinRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsCombin
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param numberChosen the numberChosen
     */
    public BaseWorkbookFunctionsCombinRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement numberChosen) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("numberChosen", numberChosen);
    }

    /**
     * Creates the IWorkbookFunctionsCombinRequest
     *
     * @return the IWorkbookFunctionsCombinRequest instance
     */
    public IWorkbookFunctionsCombinRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsCombinRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCombinRequest instance
     */
    public IWorkbookFunctionsCombinRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsCombinRequest request = new WorkbookFunctionsCombinRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("numberChosen")) {
            request.body.numberChosen = getParameter("numberChosen");
        }

        return request;
    }
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsCombinaRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsCombinaRequest;

/**
 * The class for the Base Workbook Functions Combina Request Builder.
 */
public class BaseWorkbookFunctionsCombinaRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsCombina
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param numberChosen the numberChosen
     */
    public BaseWorkbookFunctionsCombinaRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement numberChosen) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("numberChosen", numberChosen);
    }

    /**
     * Creates the IWorkbookFunctionsCombinaRequest
     *
     * @return the IWorkbookFunctionsCombinaRequest instance
     */
    public IWorkbookFunctionsCombinaRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsCombinaRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCombinaRequest instance
     */
    public IWorkbookFunctionsCombinaRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsCombinaRequest request = new WorkbookFunctionsCombinaRequest(
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

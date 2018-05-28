// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsImPowerRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsImPowerRequest;

/**
 * The class for the Base Workbook Functions Im Power Request Builder.
 */
public class BaseWorkbookFunctionsImPowerRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsImPower
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param inumber the inumber
     * @param number the number
     */
    public BaseWorkbookFunctionsImPowerRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement inumber, final com.google.gson.JsonElement number) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("inumber", inumber);
        bodyParams.put("number", number);
    }

    /**
     * Creates the IWorkbookFunctionsImPowerRequest
     *
     * @return the IWorkbookFunctionsImPowerRequest instance
     */
    public IWorkbookFunctionsImPowerRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsImPowerRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImPowerRequest instance
     */
    public IWorkbookFunctionsImPowerRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsImPowerRequest request = new WorkbookFunctionsImPowerRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("inumber")) {
            request.body.inumber = getParameter("inumber");
        }

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        return request;
    }
}

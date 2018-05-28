// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsVarPARequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsVarPARequest;

/**
 * The class for the Base Workbook Functions Var PARequest Builder.
 */
public class BaseWorkbookFunctionsVarPARequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsVarPA
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param values the values
     */
    public BaseWorkbookFunctionsVarPARequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("values", values);
    }

    /**
     * Creates the IWorkbookFunctionsVarPARequest
     *
     * @return the IWorkbookFunctionsVarPARequest instance
     */
    public IWorkbookFunctionsVarPARequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsVarPARequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsVarPARequest instance
     */
    public IWorkbookFunctionsVarPARequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsVarPARequest request = new WorkbookFunctionsVarPARequest(
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

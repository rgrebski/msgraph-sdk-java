// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsTypeRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsTypeRequest;

/**
 * The class for the Base Workbook Functions Type Request Builder.
 */
public class BaseWorkbookFunctionsTypeRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsType
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param value the value
     */
    public BaseWorkbookFunctionsTypeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement value) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("value", value);
    }

    /**
     * Creates the IWorkbookFunctionsTypeRequest
     *
     * @return the IWorkbookFunctionsTypeRequest instance
     */
    public IWorkbookFunctionsTypeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsTypeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsTypeRequest instance
     */
    public IWorkbookFunctionsTypeRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsTypeRequest request = new WorkbookFunctionsTypeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("value")) {
            request.body.value = getParameter("value");
        }

        return request;
    }
}

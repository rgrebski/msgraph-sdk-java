// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsIsLogicalRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsIsLogicalRequest;

/**
 * The class for the Base Workbook Functions Is Logical Request Builder.
 */
public class BaseWorkbookFunctionsIsLogicalRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsIsLogical
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param value the value
     */
    public BaseWorkbookFunctionsIsLogicalRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement value) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("value", value);
    }

    /**
     * Creates the IWorkbookFunctionsIsLogicalRequest
     *
     * @return the IWorkbookFunctionsIsLogicalRequest instance
     */
    public IWorkbookFunctionsIsLogicalRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsIsLogicalRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsIsLogicalRequest instance
     */
    public IWorkbookFunctionsIsLogicalRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsIsLogicalRequest request = new WorkbookFunctionsIsLogicalRequest(
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

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsIfRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsIfRequest;

/**
 * The class for the Base Workbook Functions If Request Builder.
 */
public class BaseWorkbookFunctionsIfRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsIf
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param logicalTest the logicalTest
     * @param valueIfTrue the valueIfTrue
     * @param valueIfFalse the valueIfFalse
     */
    public BaseWorkbookFunctionsIfRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement logicalTest, final com.google.gson.JsonElement valueIfTrue, final com.google.gson.JsonElement valueIfFalse) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("logicalTest", logicalTest);
        bodyParams.put("valueIfTrue", valueIfTrue);
        bodyParams.put("valueIfFalse", valueIfFalse);
    }

    /**
     * Creates the IWorkbookFunctionsIfRequest
     *
     * @return the IWorkbookFunctionsIfRequest instance
     */
    public IWorkbookFunctionsIfRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsIfRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsIfRequest instance
     */
    public IWorkbookFunctionsIfRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsIfRequest request = new WorkbookFunctionsIfRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("logicalTest")) {
            request.body.logicalTest = getParameter("logicalTest");
        }

        if (hasParameter("valueIfTrue")) {
            request.body.valueIfTrue = getParameter("valueIfTrue");
        }

        if (hasParameter("valueIfFalse")) {
            request.body.valueIfFalse = getParameter("valueIfFalse");
        }

        return request;
    }
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsIsFormulaRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsIsFormulaRequest;

/**
 * The class for the Base Workbook Functions Is Formula Request Builder.
 */
public class BaseWorkbookFunctionsIsFormulaRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsIsFormula
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param reference the reference
     */
    public BaseWorkbookFunctionsIsFormulaRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement reference) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("reference", reference);
    }

    /**
     * Creates the IWorkbookFunctionsIsFormulaRequest
     *
     * @return the IWorkbookFunctionsIsFormulaRequest instance
     */
    public IWorkbookFunctionsIsFormulaRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsIsFormulaRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsIsFormulaRequest instance
     */
    public IWorkbookFunctionsIsFormulaRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsIsFormulaRequest request = new WorkbookFunctionsIsFormulaRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("reference")) {
            request.body.reference = getParameter("reference");
        }

        return request;
    }
}

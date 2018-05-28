// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsLookupRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsLookupRequest;

/**
 * The class for the Base Workbook Functions Lookup Request Builder.
 */
public class BaseWorkbookFunctionsLookupRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsLookup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param lookupValue the lookupValue
     * @param lookupVector the lookupVector
     * @param resultVector the resultVector
     */
    public BaseWorkbookFunctionsLookupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement lookupValue, final com.google.gson.JsonElement lookupVector, final com.google.gson.JsonElement resultVector) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("lookupValue", lookupValue);
        bodyParams.put("lookupVector", lookupVector);
        bodyParams.put("resultVector", resultVector);
    }

    /**
     * Creates the IWorkbookFunctionsLookupRequest
     *
     * @return the IWorkbookFunctionsLookupRequest instance
     */
    public IWorkbookFunctionsLookupRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsLookupRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsLookupRequest instance
     */
    public IWorkbookFunctionsLookupRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsLookupRequest request = new WorkbookFunctionsLookupRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("lookupValue")) {
            request.body.lookupValue = getParameter("lookupValue");
        }

        if (hasParameter("lookupVector")) {
            request.body.lookupVector = getParameter("lookupVector");
        }

        if (hasParameter("resultVector")) {
            request.body.resultVector = getParameter("resultVector");
        }

        return request;
    }
}

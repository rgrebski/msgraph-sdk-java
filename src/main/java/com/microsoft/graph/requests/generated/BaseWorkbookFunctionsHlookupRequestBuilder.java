// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsHlookupRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsHlookupRequest;

/**
 * The class for the Base Workbook Functions Hlookup Request Builder.
 */
public class BaseWorkbookFunctionsHlookupRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsHlookup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param lookupValue the lookupValue
     * @param tableArray the tableArray
     * @param rowIndexNum the rowIndexNum
     * @param rangeLookup the rangeLookup
     */
    public BaseWorkbookFunctionsHlookupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement lookupValue, final com.google.gson.JsonElement tableArray, final com.google.gson.JsonElement rowIndexNum, final com.google.gson.JsonElement rangeLookup) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("lookupValue", lookupValue);
        bodyParams.put("tableArray", tableArray);
        bodyParams.put("rowIndexNum", rowIndexNum);
        bodyParams.put("rangeLookup", rangeLookup);
    }

    /**
     * Creates the IWorkbookFunctionsHlookupRequest
     *
     * @return the IWorkbookFunctionsHlookupRequest instance
     */
    public IWorkbookFunctionsHlookupRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsHlookupRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsHlookupRequest instance
     */
    public IWorkbookFunctionsHlookupRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsHlookupRequest request = new WorkbookFunctionsHlookupRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("lookupValue")) {
            request.body.lookupValue = getParameter("lookupValue");
        }

        if (hasParameter("tableArray")) {
            request.body.tableArray = getParameter("tableArray");
        }

        if (hasParameter("rowIndexNum")) {
            request.body.rowIndexNum = getParameter("rowIndexNum");
        }

        if (hasParameter("rangeLookup")) {
            request.body.rangeLookup = getParameter("rangeLookup");
        }

        return request;
    }
}

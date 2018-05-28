// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsPvRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsPvRequest;

/**
 * The class for the Base Workbook Functions Pv Request Builder.
 */
public class BaseWorkbookFunctionsPvRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param rate the rate
     * @param nper the nper
     * @param pmt the pmt
     * @param fv the fv
     * @param type the type
     */
    public BaseWorkbookFunctionsPvRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement nper, final com.google.gson.JsonElement pmt, final com.google.gson.JsonElement fv, final com.google.gson.JsonElement type) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("rate", rate);
        bodyParams.put("nper", nper);
        bodyParams.put("pmt", pmt);
        bodyParams.put("fv", fv);
        bodyParams.put("type", type);
    }

    /**
     * Creates the IWorkbookFunctionsPvRequest
     *
     * @return the IWorkbookFunctionsPvRequest instance
     */
    public IWorkbookFunctionsPvRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsPvRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsPvRequest instance
     */
    public IWorkbookFunctionsPvRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsPvRequest request = new WorkbookFunctionsPvRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("rate")) {
            request.body.rate = getParameter("rate");
        }

        if (hasParameter("nper")) {
            request.body.nper = getParameter("nper");
        }

        if (hasParameter("pmt")) {
            request.body.pmt = getParameter("pmt");
        }

        if (hasParameter("fv")) {
            request.body.fv = getParameter("fv");
        }

        if (hasParameter("type")) {
            request.body.type = getParameter("type");
        }

        return request;
    }
}

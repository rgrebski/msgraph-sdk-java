// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsEffectRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsEffectRequest;

/**
 * The class for the Base Workbook Functions Effect Request Builder.
 */
public class BaseWorkbookFunctionsEffectRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsEffect
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param nominalRate the nominalRate
     * @param npery the npery
     */
    public BaseWorkbookFunctionsEffectRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement nominalRate, final com.google.gson.JsonElement npery) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("nominalRate", nominalRate);
        bodyParams.put("npery", npery);
    }

    /**
     * Creates the IWorkbookFunctionsEffectRequest
     *
     * @return the IWorkbookFunctionsEffectRequest instance
     */
    public IWorkbookFunctionsEffectRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsEffectRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsEffectRequest instance
     */
    public IWorkbookFunctionsEffectRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsEffectRequest request = new WorkbookFunctionsEffectRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("nominalRate")) {
            request.body.nominalRate = getParameter("nominalRate");
        }

        if (hasParameter("npery")) {
            request.body.npery = getParameter("npery");
        }

        return request;
    }
}

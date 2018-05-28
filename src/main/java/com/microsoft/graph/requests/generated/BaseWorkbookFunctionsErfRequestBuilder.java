// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsErfRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsErfRequest;

/**
 * The class for the Base Workbook Functions Erf Request Builder.
 */
public class BaseWorkbookFunctionsErfRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsErf
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param lowerLimit the lowerLimit
     * @param upperLimit the upperLimit
     */
    public BaseWorkbookFunctionsErfRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement lowerLimit, final com.google.gson.JsonElement upperLimit) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("lowerLimit", lowerLimit);
        bodyParams.put("upperLimit", upperLimit);
    }

    /**
     * Creates the IWorkbookFunctionsErfRequest
     *
     * @return the IWorkbookFunctionsErfRequest instance
     */
    public IWorkbookFunctionsErfRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsErfRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsErfRequest instance
     */
    public IWorkbookFunctionsErfRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsErfRequest request = new WorkbookFunctionsErfRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("lowerLimit")) {
            request.body.lowerLimit = getParameter("lowerLimit");
        }

        if (hasParameter("upperLimit")) {
            request.body.upperLimit = getParameter("upperLimit");
        }

        return request;
    }
}

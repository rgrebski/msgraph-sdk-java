// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsNorm_S_DistRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsNorm_S_DistRequest;

/**
 * The class for the Base Workbook Functions Norm_S_Dist Request Builder.
 */
public class BaseWorkbookFunctionsNorm_S_DistRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNorm_S_Dist
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param z the z
     * @param cumulative the cumulative
     */
    public BaseWorkbookFunctionsNorm_S_DistRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement z, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("z", z);
        bodyParams.put("cumulative", cumulative);
    }

    /**
     * Creates the IWorkbookFunctionsNorm_S_DistRequest
     *
     * @return the IWorkbookFunctionsNorm_S_DistRequest instance
     */
    public IWorkbookFunctionsNorm_S_DistRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsNorm_S_DistRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNorm_S_DistRequest instance
     */
    public IWorkbookFunctionsNorm_S_DistRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsNorm_S_DistRequest request = new WorkbookFunctionsNorm_S_DistRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("z")) {
            request.body.z = getParameter("z");
        }

        if (hasParameter("cumulative")) {
            request.body.cumulative = getParameter("cumulative");
        }

        return request;
    }
}

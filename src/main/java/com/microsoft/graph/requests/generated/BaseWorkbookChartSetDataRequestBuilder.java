// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookChartSetDataRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartSetDataRequest;

/**
 * The class for the Base Workbook Chart Set Data Request Builder.
 */
public class BaseWorkbookChartSetDataRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookChartSetData
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param sourceData the sourceData
     * @param seriesBy the seriesBy
     */
    public BaseWorkbookChartSetDataRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement sourceData, final String seriesBy) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("sourceData", sourceData);
        bodyParams.put("seriesBy", seriesBy);
    }

    /**
     * Creates the IWorkbookChartSetDataRequest
     *
     * @return the IWorkbookChartSetDataRequest instance
     */
    public IWorkbookChartSetDataRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookChartSetDataRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartSetDataRequest instance
     */
    public IWorkbookChartSetDataRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookChartSetDataRequest request = new WorkbookChartSetDataRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("sourceData")) {
            request.body.sourceData = getParameter("sourceData");
        }

        if (hasParameter("seriesBy")) {
            request.body.seriesBy = getParameter("seriesBy");
        }

        return request;
    }
}

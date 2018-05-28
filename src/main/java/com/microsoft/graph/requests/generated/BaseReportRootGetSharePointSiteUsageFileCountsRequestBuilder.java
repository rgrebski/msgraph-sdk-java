// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsageFileCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsageFileCountsRequest;

/**
 * The class for the Base Report Root Get Share Point Site Usage File Counts Request Builder.
 */
public class BaseReportRootGetSharePointSiteUsageFileCountsRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetSharePointSiteUsageFileCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public BaseReportRootGetSharePointSiteUsageFileCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetSharePointSiteUsageFileCountsRequest
     *
     * @return the IReportRootGetSharePointSiteUsageFileCountsRequest instance
     */
    public IReportRootGetSharePointSiteUsageFileCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetSharePointSiteUsageFileCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSharePointSiteUsageFileCountsRequest instance
     */
    public IReportRootGetSharePointSiteUsageFileCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetSharePointSiteUsageFileCountsRequest request = new ReportRootGetSharePointSiteUsageFileCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsUserActivityCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsUserActivityCountsRequest;

/**
 * The class for the Base Report Root Get Teams User Activity Counts Request Builder.
 */
public class BaseReportRootGetTeamsUserActivityCountsRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetTeamsUserActivityCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public BaseReportRootGetTeamsUserActivityCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetTeamsUserActivityCountsRequest
     *
     * @return the IReportRootGetTeamsUserActivityCountsRequest instance
     */
    public IReportRootGetTeamsUserActivityCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetTeamsUserActivityCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetTeamsUserActivityCountsRequest instance
     */
    public IReportRootGetTeamsUserActivityCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetTeamsUserActivityCountsRequest request = new ReportRootGetTeamsUserActivityCountsRequest(
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

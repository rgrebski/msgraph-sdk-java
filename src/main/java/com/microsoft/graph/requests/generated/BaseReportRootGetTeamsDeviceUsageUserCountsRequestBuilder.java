// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsDeviceUsageUserCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsDeviceUsageUserCountsRequest;

/**
 * The class for the Base Report Root Get Teams Device Usage User Counts Request Builder.
 */
public class BaseReportRootGetTeamsDeviceUsageUserCountsRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetTeamsDeviceUsageUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public BaseReportRootGetTeamsDeviceUsageUserCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetTeamsDeviceUsageUserCountsRequest
     *
     * @return the IReportRootGetTeamsDeviceUsageUserCountsRequest instance
     */
    public IReportRootGetTeamsDeviceUsageUserCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetTeamsDeviceUsageUserCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetTeamsDeviceUsageUserCountsRequest instance
     */
    public IReportRootGetTeamsDeviceUsageUserCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetTeamsDeviceUsageUserCountsRequest request = new ReportRootGetTeamsDeviceUsageUserCountsRequest(
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

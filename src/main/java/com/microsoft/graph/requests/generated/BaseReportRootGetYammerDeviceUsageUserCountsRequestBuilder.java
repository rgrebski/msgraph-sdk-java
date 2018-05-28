// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerDeviceUsageUserCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerDeviceUsageUserCountsRequest;

/**
 * The class for the Base Report Root Get Yammer Device Usage User Counts Request Builder.
 */
public class BaseReportRootGetYammerDeviceUsageUserCountsRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetYammerDeviceUsageUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public BaseReportRootGetYammerDeviceUsageUserCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetYammerDeviceUsageUserCountsRequest
     *
     * @return the IReportRootGetYammerDeviceUsageUserCountsRequest instance
     */
    public IReportRootGetYammerDeviceUsageUserCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetYammerDeviceUsageUserCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetYammerDeviceUsageUserCountsRequest instance
     */
    public IReportRootGetYammerDeviceUsageUserCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetYammerDeviceUsageUserCountsRequest request = new ReportRootGetYammerDeviceUsageUserCountsRequest(
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

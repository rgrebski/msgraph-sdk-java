// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequest;

/**
 * The class for the Base Report Root Get Skype For Business Device Usage Distribution User Counts Request Builder.
 */
public class BaseReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public BaseReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequest
     *
     * @return the IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequest instance
     */
    public IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequest instance
     */
    public IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequest request = new ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequest(
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

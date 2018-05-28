// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerActivityCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerActivityCountsRequest;

/**
 * The class for the Base Report Root Get Yammer Activity Counts Request Builder.
 */
public class BaseReportRootGetYammerActivityCountsRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetYammerActivityCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public BaseReportRootGetYammerActivityCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetYammerActivityCountsRequest
     *
     * @return the IReportRootGetYammerActivityCountsRequest instance
     */
    public IReportRootGetYammerActivityCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetYammerActivityCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetYammerActivityCountsRequest instance
     */
    public IReportRootGetYammerActivityCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetYammerActivityCountsRequest request = new ReportRootGetYammerActivityCountsRequest(
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

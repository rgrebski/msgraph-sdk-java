// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsDeviceUsageUserDetailRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsDeviceUsageUserDetailRequest;

/**
 * The class for the Base Report Root Get Teams Device Usage User Detail Request Builder.
 */
public class BaseReportRootGetTeamsDeviceUsageUserDetailRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetTeamsDeviceUsageUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param date the date
     */
    public BaseReportRootGetTeamsDeviceUsageUserDetailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.microsoft.graph.models.extensions.DateOnly date) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("date", date));
    }
    /**
     * The request builder for this ReportRootGetTeamsDeviceUsageUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public BaseReportRootGetTeamsDeviceUsageUserDetailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetTeamsDeviceUsageUserDetailRequest
     *
     * @return the IReportRootGetTeamsDeviceUsageUserDetailRequest instance
     */
    public IReportRootGetTeamsDeviceUsageUserDetailRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetTeamsDeviceUsageUserDetailRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetTeamsDeviceUsageUserDetailRequest instance
     */
    public IReportRootGetTeamsDeviceUsageUserDetailRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetTeamsDeviceUsageUserDetailRequest request = new ReportRootGetTeamsDeviceUsageUserDetailRequest(
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

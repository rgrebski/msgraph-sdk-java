// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessDeviceUsageUserDetailRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessDeviceUsageUserDetailRequest;

/**
 * The class for the Base Report Root Get Skype For Business Device Usage User Detail Request Builder.
 */
public class BaseReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetSkypeForBusinessDeviceUsageUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param date the date
     */
    public BaseReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.microsoft.graph.models.extensions.DateOnly date) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("date", date));
    }
    /**
     * The request builder for this ReportRootGetSkypeForBusinessDeviceUsageUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public BaseReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetSkypeForBusinessDeviceUsageUserDetailRequest
     *
     * @return the IReportRootGetSkypeForBusinessDeviceUsageUserDetailRequest instance
     */
    public IReportRootGetSkypeForBusinessDeviceUsageUserDetailRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetSkypeForBusinessDeviceUsageUserDetailRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessDeviceUsageUserDetailRequest instance
     */
    public IReportRootGetSkypeForBusinessDeviceUsageUserDetailRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetSkypeForBusinessDeviceUsageUserDetailRequest request = new ReportRootGetSkypeForBusinessDeviceUsageUserDetailRequest(
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

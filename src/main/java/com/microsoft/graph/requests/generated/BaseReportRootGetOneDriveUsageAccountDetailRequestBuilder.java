// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageAccountDetailRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveUsageAccountDetailRequest;

/**
 * The class for the Base Report Root Get One Drive Usage Account Detail Request Builder.
 */
public class BaseReportRootGetOneDriveUsageAccountDetailRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetOneDriveUsageAccountDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param date the date
     */
    public BaseReportRootGetOneDriveUsageAccountDetailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.microsoft.graph.models.extensions.DateOnly date) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("date", date));
    }
    /**
     * The request builder for this ReportRootGetOneDriveUsageAccountDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public BaseReportRootGetOneDriveUsageAccountDetailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetOneDriveUsageAccountDetailRequest
     *
     * @return the IReportRootGetOneDriveUsageAccountDetailRequest instance
     */
    public IReportRootGetOneDriveUsageAccountDetailRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetOneDriveUsageAccountDetailRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetOneDriveUsageAccountDetailRequest instance
     */
    public IReportRootGetOneDriveUsageAccountDetailRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetOneDriveUsageAccountDetailRequest request = new ReportRootGetOneDriveUsageAccountDetailRequest(
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

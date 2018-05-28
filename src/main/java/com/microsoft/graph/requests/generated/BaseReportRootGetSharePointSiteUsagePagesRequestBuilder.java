// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsagePagesRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsagePagesRequest;

/**
 * The class for the Base Report Root Get Share Point Site Usage Pages Request Builder.
 */
public class BaseReportRootGetSharePointSiteUsagePagesRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetSharePointSiteUsagePages
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public BaseReportRootGetSharePointSiteUsagePagesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetSharePointSiteUsagePagesRequest
     *
     * @return the IReportRootGetSharePointSiteUsagePagesRequest instance
     */
    public IReportRootGetSharePointSiteUsagePagesRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetSharePointSiteUsagePagesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSharePointSiteUsagePagesRequest instance
     */
    public IReportRootGetSharePointSiteUsagePagesRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetSharePointSiteUsagePagesRequest request = new ReportRootGetSharePointSiteUsagePagesRequest(
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

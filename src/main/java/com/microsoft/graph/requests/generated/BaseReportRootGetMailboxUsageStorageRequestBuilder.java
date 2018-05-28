// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetMailboxUsageStorageRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetMailboxUsageStorageRequest;

/**
 * The class for the Base Report Root Get Mailbox Usage Storage Request Builder.
 */
public class BaseReportRootGetMailboxUsageStorageRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetMailboxUsageStorage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public BaseReportRootGetMailboxUsageStorageRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetMailboxUsageStorageRequest
     *
     * @return the IReportRootGetMailboxUsageStorageRequest instance
     */
    public IReportRootGetMailboxUsageStorageRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetMailboxUsageStorageRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetMailboxUsageStorageRequest instance
     */
    public IReportRootGetMailboxUsageStorageRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetMailboxUsageStorageRequest request = new ReportRootGetMailboxUsageStorageRequest(
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

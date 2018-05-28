// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IUserActivityRecentCollectionRequest;
import com.microsoft.graph.requests.extensions.UserActivityRecentCollectionRequest;

/**
 * The class for the Base User Activity Recent Collection Request Builder.
 */
public class BaseUserActivityRecentCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IBaseUserActivityRecentCollectionRequestBuilder {

    /**
     * The request builder for this collection of UserActivity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseUserActivityRecentCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IUserActivityRecentCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IUserActivityRecentCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        UserActivityRecentCollectionRequest request = new UserActivityRecentCollectionRequest(
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

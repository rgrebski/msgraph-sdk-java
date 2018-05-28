// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IUserDeltaCollectionRequest;
import com.microsoft.graph.requests.extensions.UserDeltaCollectionRequest;

/**
 * The class for the Base User Delta Collection Request Builder.
 */
public class BaseUserDeltaCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IBaseUserDeltaCollectionRequestBuilder {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseUserDeltaCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IUserDeltaCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IUserDeltaCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        UserDeltaCollectionRequest request = new UserDeltaCollectionRequest(
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

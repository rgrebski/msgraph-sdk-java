// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.GroupDeltaCollectionRequest;
import com.microsoft.graph.requests.extensions.IGroupDeltaCollectionRequest;

/**
 * The class for the Base Group Delta Collection Request Builder.
 */
public class BaseGroupDeltaCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IBaseGroupDeltaCollectionRequestBuilder {

    /**
     * The request builder for this collection of Group
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseGroupDeltaCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IGroupDeltaCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IGroupDeltaCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        GroupDeltaCollectionRequest request = new GroupDeltaCollectionRequest(
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

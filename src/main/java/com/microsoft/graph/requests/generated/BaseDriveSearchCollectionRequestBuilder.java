// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.DriveSearchCollectionRequest;
import com.microsoft.graph.requests.extensions.IDriveSearchCollectionRequest;

/**
 * The class for the Base Drive Search Collection Request Builder.
 */
public class BaseDriveSearchCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IBaseDriveSearchCollectionRequestBuilder {

    /**
     * The request builder for this collection of Drive
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param q the q
     */
    public BaseDriveSearchCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String q) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("q", q));
      }

    public IDriveSearchCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDriveSearchCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        DriveSearchCollectionRequest request = new DriveSearchCollectionRequest(
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

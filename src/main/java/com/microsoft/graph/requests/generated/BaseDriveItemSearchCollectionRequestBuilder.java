// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.DriveItemSearchCollectionRequest;
import com.microsoft.graph.requests.extensions.IDriveItemSearchCollectionRequest;

/**
 * The class for the Base Drive Item Search Collection Request Builder.
 */
public class BaseDriveItemSearchCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IBaseDriveItemSearchCollectionRequestBuilder {

    /**
     * The request builder for this collection of DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param q the q
     */
    public BaseDriveItemSearchCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String q) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("q", q));
      }

    public IDriveItemSearchCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDriveItemSearchCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        DriveItemSearchCollectionRequest request = new DriveItemSearchCollectionRequest(
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

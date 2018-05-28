// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.DriveItemDeltaCollectionRequest;
import com.microsoft.graph.requests.extensions.IDriveItemDeltaCollectionRequest;

/**
 * The class for the Base Drive Item Delta Collection Request Builder.
 */
public class BaseDriveItemDeltaCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IBaseDriveItemDeltaCollectionRequestBuilder {

    /**
     * The request builder for this collection of DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param token the token
     */
    public BaseDriveItemDeltaCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String token) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("token", token));
      }
    /**
     * The request builder for this collection of DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDriveItemDeltaCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IDriveItemDeltaCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDriveItemDeltaCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        DriveItemDeltaCollectionRequest request = new DriveItemDeltaCollectionRequest(
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

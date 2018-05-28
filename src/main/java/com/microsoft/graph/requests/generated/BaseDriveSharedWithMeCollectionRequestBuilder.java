// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.DriveSharedWithMeCollectionRequest;
import com.microsoft.graph.requests.extensions.IDriveSharedWithMeCollectionRequest;

/**
 * The class for the Base Drive Shared With Me Collection Request Builder.
 */
public class BaseDriveSharedWithMeCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IBaseDriveSharedWithMeCollectionRequestBuilder {

    /**
     * The request builder for this collection of Drive
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDriveSharedWithMeCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IDriveSharedWithMeCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDriveSharedWithMeCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        DriveSharedWithMeCollectionRequest request = new DriveSharedWithMeCollectionRequest(
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

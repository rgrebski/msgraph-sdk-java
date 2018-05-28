// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IMailFolderDeltaCollectionRequest;
import com.microsoft.graph.requests.extensions.MailFolderDeltaCollectionRequest;

/**
 * The class for the Base Mail Folder Delta Collection Request Builder.
 */
public class BaseMailFolderDeltaCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IBaseMailFolderDeltaCollectionRequestBuilder {

    /**
     * The request builder for this collection of MailFolder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseMailFolderDeltaCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IMailFolderDeltaCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IMailFolderDeltaCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        MailFolderDeltaCollectionRequest request = new MailFolderDeltaCollectionRequest(
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

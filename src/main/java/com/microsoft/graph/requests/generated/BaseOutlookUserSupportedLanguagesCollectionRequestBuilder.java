// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IOutlookUserSupportedLanguagesCollectionRequest;
import com.microsoft.graph.requests.extensions.OutlookUserSupportedLanguagesCollectionRequest;

/**
 * The class for the Base Outlook User Supported Languages Collection Request Builder.
 */
public class BaseOutlookUserSupportedLanguagesCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IBaseOutlookUserSupportedLanguagesCollectionRequestBuilder {

    /**
     * The request builder for this collection of OutlookUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseOutlookUserSupportedLanguagesCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IOutlookUserSupportedLanguagesCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IOutlookUserSupportedLanguagesCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        OutlookUserSupportedLanguagesCollectionRequest request = new OutlookUserSupportedLanguagesCollectionRequest(
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

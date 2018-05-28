// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.ISiteGetByPathRequest;
import com.microsoft.graph.requests.extensions.SiteGetByPathRequest;

/**
 * The class for the Base Site Get By Path Request Builder.
 */
public class BaseSiteGetByPathRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this SiteGetByPath
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param path the path
     */
    public BaseSiteGetByPathRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String path) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("path", path));
    }

    /**
     * Creates the ISiteGetByPathRequest
     *
     * @return the ISiteGetByPathRequest instance
     */
    public ISiteGetByPathRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the ISiteGetByPathRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ISiteGetByPathRequest instance
     */
    public ISiteGetByPathRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        SiteGetByPathRequest request = new SiteGetByPathRequest(
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

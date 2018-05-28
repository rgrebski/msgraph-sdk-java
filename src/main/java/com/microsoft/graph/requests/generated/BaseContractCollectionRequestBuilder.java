// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.ContractCollectionRequest;
import com.microsoft.graph.requests.extensions.ContractRequestBuilder;
import com.microsoft.graph.requests.extensions.IContractCollectionRequest;
import com.microsoft.graph.requests.extensions.IContractRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Contract Collection Request Builder.
 */
public class BaseContractCollectionRequestBuilder extends BaseRequestBuilder implements IBaseContractCollectionRequestBuilder {

    /**
     * The request builder for this collection of Contract
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseContractCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IContractCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IContractCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ContractCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IContractRequestBuilder byId(final String id) {
        return new ContractRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}

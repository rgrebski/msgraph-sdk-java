// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.GroupReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupWithReferenceRequest;
import com.microsoft.graph.requests.extensions.IGroupReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupWithReferenceRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Group With Reference Request Builder.
 */
public class BaseGroupWithReferenceRequestBuilder extends BaseRequestBuilder implements IBaseGroupWithReferenceRequestBuilder {

    /**
     * The request builder for the Group
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseGroupWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IGroupWithReferenceRequest instance
     */
    public IGroupWithReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IGroupWithReferenceRequest instance
     */
    public IGroupWithReferenceRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new GroupWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IGroupReferenceRequestBuilder reference(){
        return new GroupReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}

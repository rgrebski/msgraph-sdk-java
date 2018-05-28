// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.EducationUserReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserWithReferenceRequest;
import com.microsoft.graph.requests.extensions.IEducationUserReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserWithReferenceRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Education User With Reference Request Builder.
 */
public class BaseEducationUserWithReferenceRequestBuilder extends BaseRequestBuilder implements IBaseEducationUserWithReferenceRequestBuilder {

    /**
     * The request builder for the EducationUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseEducationUserWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IEducationUserWithReferenceRequest instance
     */
    public IEducationUserWithReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IEducationUserWithReferenceRequest instance
     */
    public IEducationUserWithReferenceRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new EducationUserWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IEducationUserReferenceRequestBuilder reference(){
        return new EducationUserReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}

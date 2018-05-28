// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.EducationSchoolReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolWithReferenceRequest;
import com.microsoft.graph.requests.extensions.IEducationSchoolReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolWithReferenceRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Education School With Reference Request Builder.
 */
public class BaseEducationSchoolWithReferenceRequestBuilder extends BaseRequestBuilder implements IBaseEducationSchoolWithReferenceRequestBuilder {

    /**
     * The request builder for the EducationSchool
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseEducationSchoolWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IEducationSchoolWithReferenceRequest instance
     */
    public IEducationSchoolWithReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IEducationSchoolWithReferenceRequest instance
     */
    public IEducationSchoolWithReferenceRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new EducationSchoolWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IEducationSchoolReferenceRequestBuilder reference(){
        return new EducationSchoolReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}

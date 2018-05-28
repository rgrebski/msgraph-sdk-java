// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.EducationClassRenewRequest;
import com.microsoft.graph.requests.extensions.IEducationClassRenewRequest;

/**
 * The class for the Base Education Class Renew Request Builder.
 */
public class BaseEducationClassRenewRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this EducationClassRenew
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseEducationClassRenewRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IEducationClassRenewRequest
     *
     * @return the IEducationClassRenewRequest instance
     */
    public IEducationClassRenewRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IEducationClassRenewRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IEducationClassRenewRequest instance
     */
    public IEducationClassRenewRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        EducationClassRenewRequest request = new EducationClassRenewRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}

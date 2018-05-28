// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.ReferenceRequestBody;
import com.microsoft.graph.models.extensions.EducationClass;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.EducationClassCollectionReferenceRequest;
import com.microsoft.graph.requests.extensions.EducationClassWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationClassCollectionPage;
import com.microsoft.graph.requests.extensions.IEducationClassCollectionReferenceRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Education Class Collection Reference Request.
 */
public class BaseEducationClassCollectionReferenceRequest extends BaseCollectionRequest<BaseEducationClassCollectionResponse, IEducationClassCollectionPage> implements IBaseEducationClassCollectionReferenceRequest {

    /**
     * The request builder for this collection of EducationClass
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseEducationClassCollectionReferenceRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseEducationClassCollectionResponse.class, IEducationClassCollectionPage.class);
    }

    public void post(final EducationClass newEducationClass, final ICallback<EducationClass> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/education/classes/" + newEducationClass.id);
        new EducationClassWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newEducationClass, body, callback);
    }

    public EducationClass post(final EducationClass newEducationClass) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/education/classes/" + newEducationClass.id);
        return new EducationClassWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getOptions())
                .post(newEducationClass, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEducationClassCollectionReferenceRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (EducationClassCollectionReferenceRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEducationClassCollectionReferenceRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (EducationClassCollectionReferenceRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IEducationClassCollectionReferenceRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (EducationClassCollectionReferenceRequest)this;
    }
}

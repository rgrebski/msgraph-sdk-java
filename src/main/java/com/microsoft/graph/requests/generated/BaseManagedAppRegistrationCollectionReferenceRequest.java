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
import com.microsoft.graph.models.extensions.ManagedAppRegistration;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationCollectionPage;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationCollectionReferenceRequest;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionReferenceRequest;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationWithReferenceRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed App Registration Collection Reference Request.
 */
public class BaseManagedAppRegistrationCollectionReferenceRequest extends BaseCollectionRequest<BaseManagedAppRegistrationCollectionResponse, IManagedAppRegistrationCollectionPage> implements IBaseManagedAppRegistrationCollectionReferenceRequest {

    /**
     * The request builder for this collection of ManagedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseManagedAppRegistrationCollectionReferenceRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseManagedAppRegistrationCollectionResponse.class, IManagedAppRegistrationCollectionPage.class);
    }

    public void post(final ManagedAppRegistration newManagedAppRegistration, final ICallback<ManagedAppRegistration> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/deviceAppManagement/managedAppRegistrations/" + newManagedAppRegistration.id);
        new ManagedAppRegistrationWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newManagedAppRegistration, body, callback);
    }

    public ManagedAppRegistration post(final ManagedAppRegistration newManagedAppRegistration) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/deviceAppManagement/managedAppRegistrations/" + newManagedAppRegistration.id);
        return new ManagedAppRegistrationWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getOptions())
                .post(newManagedAppRegistration, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedAppRegistrationCollectionReferenceRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (ManagedAppRegistrationCollectionReferenceRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedAppRegistrationCollectionReferenceRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (ManagedAppRegistrationCollectionReferenceRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IManagedAppRegistrationCollectionReferenceRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (ManagedAppRegistrationCollectionReferenceRequest)this;
    }
}

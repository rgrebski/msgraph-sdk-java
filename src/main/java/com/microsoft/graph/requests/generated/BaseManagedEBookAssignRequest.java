// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.models.extensions.ManagedEBookAssignBody;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.IManagedEBookAssignRequest;
import com.microsoft.graph.requests.extensions.ManagedEBookAssignRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed EBook Assign Request.
 */
public class BaseManagedEBookAssignRequest extends BaseRequest implements IBaseManagedEBookAssignRequest {
    protected final ManagedEBookAssignBody body;

    /**
     * The request for this ManagedEBookAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseManagedEBookAssignRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, Void.class);
        body = new ManagedEBookAssignBody();
    }

    public void post(final ICallback<Void> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public Void post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedEBookAssignRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (ManagedEBookAssignRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IManagedEBookAssignRequest top(final int value) {
        getQueryOptions().add(new QueryOption("$top", value+""));
        return (ManagedEBookAssignRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedEBookAssignRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (ManagedEBookAssignRequest)this;
    }

}

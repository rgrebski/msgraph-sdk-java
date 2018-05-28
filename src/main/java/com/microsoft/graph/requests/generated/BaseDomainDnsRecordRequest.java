// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.models.extensions.DomainDnsRecord;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.DomainDnsRecordRequest;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Domain Dns Record Request.
 */
public class BaseDomainDnsRecordRequest extends BaseRequest implements IBaseDomainDnsRecordRequest {

    /**
     * The request for the DomainDnsRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseDomainDnsRecordRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<? extends DomainDnsRecord> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the DomainDnsRecord from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DomainDnsRecord> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DomainDnsRecord from the service
     *
     * @return the DomainDnsRecord from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DomainDnsRecord get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this DomainDnsRecord with a source
     *
     * @param sourceDomainDnsRecord the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DomainDnsRecord sourceDomainDnsRecord, final ICallback<DomainDnsRecord> callback) {
        send(HttpMethod.PATCH, callback, sourceDomainDnsRecord);
    }

    /**
     * Patches this DomainDnsRecord with a source
     *
     * @param sourceDomainDnsRecord the source object with updates
     * @return the updated DomainDnsRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DomainDnsRecord patch(final DomainDnsRecord sourceDomainDnsRecord) throws ClientException {
        return send(HttpMethod.PATCH, sourceDomainDnsRecord);
    }

    /**
     * Creates a DomainDnsRecord with a new object
     *
     * @param newDomainDnsRecord the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DomainDnsRecord newDomainDnsRecord, final ICallback<DomainDnsRecord> callback) {
        send(HttpMethod.POST, callback, newDomainDnsRecord);
    }

    /**
     * Creates a DomainDnsRecord with a new object
     *
     * @param newDomainDnsRecord the new object to create
     * @return the created DomainDnsRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DomainDnsRecord post(final DomainDnsRecord newDomainDnsRecord) throws ClientException {
        return send(HttpMethod.POST, newDomainDnsRecord);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDomainDnsRecordRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DomainDnsRecordRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDomainDnsRecordRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DomainDnsRecordRequest)this;
     }

}


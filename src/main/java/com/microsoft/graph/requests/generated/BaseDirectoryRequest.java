// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.models.extensions.Directory;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.DirectoryRequest;
import com.microsoft.graph.requests.extensions.IDirectoryRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Directory Request.
 */
public class BaseDirectoryRequest extends BaseRequest implements IBaseDirectoryRequest {

    /**
     * The request for the Directory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseDirectoryRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<Directory> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the Directory from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Directory> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Directory from the service
     *
     * @return the Directory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Directory get() throws ClientException {
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
     * Patches this Directory with a source
     *
     * @param sourceDirectory the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Directory sourceDirectory, final ICallback<Directory> callback) {
        send(HttpMethod.PATCH, callback, sourceDirectory);
    }

    /**
     * Patches this Directory with a source
     *
     * @param sourceDirectory the source object with updates
     * @return the updated Directory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Directory patch(final Directory sourceDirectory) throws ClientException {
        return send(HttpMethod.PATCH, sourceDirectory);
    }

    /**
     * Creates a Directory with a new object
     *
     * @param newDirectory the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Directory newDirectory, final ICallback<Directory> callback) {
        send(HttpMethod.POST, callback, newDirectory);
    }

    /**
     * Creates a Directory with a new object
     *
     * @param newDirectory the new object to create
     * @return the created Directory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Directory post(final Directory newDirectory) throws ClientException {
        return send(HttpMethod.POST, newDirectory);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDirectoryRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DirectoryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDirectoryRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DirectoryRequest)this;
     }

}


// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.WebApp;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Web App Request.
 */
public interface IBaseWebAppRequest extends IHttpRequest {

    /**
     * Gets the WebApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WebApp> callback);

    /**
     * Gets the WebApp from the service
     *
     * @return the WebApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WebApp get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WebApp with a source
     *
     * @param sourceWebApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WebApp sourceWebApp, final ICallback<WebApp> callback);

    /**
     * Patches this WebApp with a source
     *
     * @param sourceWebApp the source object with updates
     * @return the updated WebApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WebApp patch(final WebApp sourceWebApp) throws ClientException;

    /**
     * Posts a WebApp with a new object
     *
     * @param newWebApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WebApp newWebApp, final ICallback<WebApp> callback);

    /**
     * Posts a WebApp with a new object
     *
     * @param newWebApp the new object to create
     * @return the created WebApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WebApp post(final WebApp newWebApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseWebAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseWebAppRequest expand(final String value);

}


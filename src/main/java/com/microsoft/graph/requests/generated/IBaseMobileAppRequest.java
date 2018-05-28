// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.MobileApp;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Mobile App Request.
 */
public interface IBaseMobileAppRequest extends IHttpRequest {

    /**
     * Gets the MobileApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<MobileApp> callback);

    /**
     * Gets the MobileApp from the service
     *
     * @return the MobileApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileApp get() throws ClientException;

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
     * Patches this MobileApp with a source
     *
     * @param sourceMobileApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MobileApp sourceMobileApp, final ICallback<MobileApp> callback);

    /**
     * Patches this MobileApp with a source
     *
     * @param sourceMobileApp the source object with updates
     * @return the updated MobileApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileApp patch(final MobileApp sourceMobileApp) throws ClientException;

    /**
     * Posts a MobileApp with a new object
     *
     * @param newMobileApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MobileApp newMobileApp, final ICallback<MobileApp> callback);

    /**
     * Posts a MobileApp with a new object
     *
     * @param newMobileApp the new object to create
     * @return the created MobileApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileApp post(final MobileApp newMobileApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseMobileAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseMobileAppRequest expand(final String value);

}


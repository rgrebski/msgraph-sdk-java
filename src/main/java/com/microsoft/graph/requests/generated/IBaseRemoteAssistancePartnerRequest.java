// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.RemoteAssistancePartner;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Remote Assistance Partner Request.
 */
public interface IBaseRemoteAssistancePartnerRequest extends IHttpRequest {

    /**
     * Gets the RemoteAssistancePartner from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<RemoteAssistancePartner> callback);

    /**
     * Gets the RemoteAssistancePartner from the service
     *
     * @return the RemoteAssistancePartner from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RemoteAssistancePartner get() throws ClientException;

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
     * Patches this RemoteAssistancePartner with a source
     *
     * @param sourceRemoteAssistancePartner the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final RemoteAssistancePartner sourceRemoteAssistancePartner, final ICallback<RemoteAssistancePartner> callback);

    /**
     * Patches this RemoteAssistancePartner with a source
     *
     * @param sourceRemoteAssistancePartner the source object with updates
     * @return the updated RemoteAssistancePartner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RemoteAssistancePartner patch(final RemoteAssistancePartner sourceRemoteAssistancePartner) throws ClientException;

    /**
     * Posts a RemoteAssistancePartner with a new object
     *
     * @param newRemoteAssistancePartner the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final RemoteAssistancePartner newRemoteAssistancePartner, final ICallback<RemoteAssistancePartner> callback);

    /**
     * Posts a RemoteAssistancePartner with a new object
     *
     * @param newRemoteAssistancePartner the new object to create
     * @return the created RemoteAssistancePartner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RemoteAssistancePartner post(final RemoteAssistancePartner newRemoteAssistancePartner) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseRemoteAssistancePartnerRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseRemoteAssistancePartnerRequest expand(final String value);

}


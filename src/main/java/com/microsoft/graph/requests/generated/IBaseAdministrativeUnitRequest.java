// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.AdministrativeUnit;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Administrative Unit Request.
 */
public interface IBaseAdministrativeUnitRequest extends IHttpRequest {

    /**
     * Gets the AdministrativeUnit from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AdministrativeUnit> callback);

    /**
     * Gets the AdministrativeUnit from the service
     *
     * @return the AdministrativeUnit from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AdministrativeUnit get() throws ClientException;

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
     * Patches this AdministrativeUnit with a source
     *
     * @param sourceAdministrativeUnit the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AdministrativeUnit sourceAdministrativeUnit, final ICallback<AdministrativeUnit> callback);

    /**
     * Patches this AdministrativeUnit with a source
     *
     * @param sourceAdministrativeUnit the source object with updates
     * @return the updated AdministrativeUnit
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AdministrativeUnit patch(final AdministrativeUnit sourceAdministrativeUnit) throws ClientException;

    /**
     * Posts a AdministrativeUnit with a new object
     *
     * @param newAdministrativeUnit the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AdministrativeUnit newAdministrativeUnit, final ICallback<AdministrativeUnit> callback);

    /**
     * Posts a AdministrativeUnit with a new object
     *
     * @param newAdministrativeUnit the new object to create
     * @return the created AdministrativeUnit
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AdministrativeUnit post(final AdministrativeUnit newAdministrativeUnit) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseAdministrativeUnitRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseAdministrativeUnitRequest expand(final String value);

}


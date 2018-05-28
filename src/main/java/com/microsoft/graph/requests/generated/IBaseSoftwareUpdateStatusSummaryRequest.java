// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.SoftwareUpdateStatusSummary;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Software Update Status Summary Request.
 */
public interface IBaseSoftwareUpdateStatusSummaryRequest extends IHttpRequest {

    /**
     * Gets the SoftwareUpdateStatusSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<SoftwareUpdateStatusSummary> callback);

    /**
     * Gets the SoftwareUpdateStatusSummary from the service
     *
     * @return the SoftwareUpdateStatusSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SoftwareUpdateStatusSummary get() throws ClientException;

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
     * Patches this SoftwareUpdateStatusSummary with a source
     *
     * @param sourceSoftwareUpdateStatusSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SoftwareUpdateStatusSummary sourceSoftwareUpdateStatusSummary, final ICallback<SoftwareUpdateStatusSummary> callback);

    /**
     * Patches this SoftwareUpdateStatusSummary with a source
     *
     * @param sourceSoftwareUpdateStatusSummary the source object with updates
     * @return the updated SoftwareUpdateStatusSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SoftwareUpdateStatusSummary patch(final SoftwareUpdateStatusSummary sourceSoftwareUpdateStatusSummary) throws ClientException;

    /**
     * Posts a SoftwareUpdateStatusSummary with a new object
     *
     * @param newSoftwareUpdateStatusSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SoftwareUpdateStatusSummary newSoftwareUpdateStatusSummary, final ICallback<SoftwareUpdateStatusSummary> callback);

    /**
     * Posts a SoftwareUpdateStatusSummary with a new object
     *
     * @param newSoftwareUpdateStatusSummary the new object to create
     * @return the created SoftwareUpdateStatusSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SoftwareUpdateStatusSummary post(final SoftwareUpdateStatusSummary newSoftwareUpdateStatusSummary) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseSoftwareUpdateStatusSummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseSoftwareUpdateStatusSummaryRequest expand(final String value);

}


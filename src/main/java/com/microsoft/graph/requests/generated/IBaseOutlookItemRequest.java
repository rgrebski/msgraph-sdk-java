// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.OutlookItem;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Outlook Item Request.
 */
public interface IBaseOutlookItemRequest extends IHttpRequest {

    /**
     * Gets the OutlookItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<OutlookItem> callback);

    /**
     * Gets the OutlookItem from the service
     *
     * @return the OutlookItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OutlookItem get() throws ClientException;

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
     * Patches this OutlookItem with a source
     *
     * @param sourceOutlookItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OutlookItem sourceOutlookItem, final ICallback<OutlookItem> callback);

    /**
     * Patches this OutlookItem with a source
     *
     * @param sourceOutlookItem the source object with updates
     * @return the updated OutlookItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OutlookItem patch(final OutlookItem sourceOutlookItem) throws ClientException;

    /**
     * Posts a OutlookItem with a new object
     *
     * @param newOutlookItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OutlookItem newOutlookItem, final ICallback<OutlookItem> callback);

    /**
     * Posts a OutlookItem with a new object
     *
     * @param newOutlookItem the new object to create
     * @return the created OutlookItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OutlookItem post(final OutlookItem newOutlookItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseOutlookItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseOutlookItemRequest expand(final String value);

}


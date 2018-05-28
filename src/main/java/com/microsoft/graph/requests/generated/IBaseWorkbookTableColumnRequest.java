// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.WorkbookTableColumn;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Table Column Request.
 */
public interface IBaseWorkbookTableColumnRequest extends IHttpRequest {

    /**
     * Gets the WorkbookTableColumn from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WorkbookTableColumn> callback);

    /**
     * Gets the WorkbookTableColumn from the service
     *
     * @return the WorkbookTableColumn from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookTableColumn get() throws ClientException;

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
     * Patches this WorkbookTableColumn with a source
     *
     * @param sourceWorkbookTableColumn the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookTableColumn sourceWorkbookTableColumn, final ICallback<WorkbookTableColumn> callback);

    /**
     * Patches this WorkbookTableColumn with a source
     *
     * @param sourceWorkbookTableColumn the source object with updates
     * @return the updated WorkbookTableColumn
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookTableColumn patch(final WorkbookTableColumn sourceWorkbookTableColumn) throws ClientException;

    /**
     * Posts a WorkbookTableColumn with a new object
     *
     * @param newWorkbookTableColumn the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookTableColumn newWorkbookTableColumn, final ICallback<WorkbookTableColumn> callback);

    /**
     * Posts a WorkbookTableColumn with a new object
     *
     * @param newWorkbookTableColumn the new object to create
     * @return the created WorkbookTableColumn
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookTableColumn post(final WorkbookTableColumn newWorkbookTableColumn) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseWorkbookTableColumnRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseWorkbookTableColumnRequest expand(final String value);

}


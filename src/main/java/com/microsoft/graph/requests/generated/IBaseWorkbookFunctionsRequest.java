// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Request.
 */
public interface IBaseWorkbookFunctionsRequest extends IHttpRequest {

    /**
     * Gets the WorkbookFunctions from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WorkbookFunctions> callback);

    /**
     * Gets the WorkbookFunctions from the service
     *
     * @return the WorkbookFunctions from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookFunctions get() throws ClientException;

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
     * Patches this WorkbookFunctions with a source
     *
     * @param sourceWorkbookFunctions the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookFunctions sourceWorkbookFunctions, final ICallback<WorkbookFunctions> callback);

    /**
     * Patches this WorkbookFunctions with a source
     *
     * @param sourceWorkbookFunctions the source object with updates
     * @return the updated WorkbookFunctions
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookFunctions patch(final WorkbookFunctions sourceWorkbookFunctions) throws ClientException;

    /**
     * Posts a WorkbookFunctions with a new object
     *
     * @param newWorkbookFunctions the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookFunctions newWorkbookFunctions, final ICallback<WorkbookFunctions> callback);

    /**
     * Posts a WorkbookFunctions with a new object
     *
     * @param newWorkbookFunctions the new object to create
     * @return the created WorkbookFunctions
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookFunctions post(final WorkbookFunctions newWorkbookFunctions) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseWorkbookFunctionsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseWorkbookFunctionsRequest expand(final String value);

}


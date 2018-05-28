// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.WorkbookTableColumn;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnCollectionPage;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Table Column Collection Request.
 */
public interface IBaseWorkbookTableColumnCollectionRequest {

    void get(final ICallback<IWorkbookTableColumnCollectionPage> callback);

    IWorkbookTableColumnCollectionPage get() throws ClientException;

    void post(final WorkbookTableColumn newWorkbookTableColumn, final ICallback<WorkbookTableColumn> callback);

    WorkbookTableColumn post(final WorkbookTableColumn newWorkbookTableColumn) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookTableColumnCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookTableColumnCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IWorkbookTableColumnCollectionRequest top(final int value);

}

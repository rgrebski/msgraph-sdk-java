// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.WorkbookTableColumn;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Table Column Collection Page.
 */
public class BaseWorkbookTableColumnCollectionPage extends BaseCollectionPage<WorkbookTableColumn, IWorkbookTableColumnCollectionRequestBuilder> implements IBaseWorkbookTableColumnCollectionPage {

    /**
     * A collection page for WorkbookTableColumn
     *
     * @param response the serialized BaseWorkbookTableColumnCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseWorkbookTableColumnCollectionPage(final BaseWorkbookTableColumnCollectionResponse response, final IWorkbookTableColumnCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}

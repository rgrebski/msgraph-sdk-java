// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.DirectoryRole;
import com.microsoft.graph.requests.extensions.IDirectoryRoleCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Directory Role Collection Page.
 */
public class BaseDirectoryRoleCollectionPage extends BaseCollectionPage<DirectoryRole, IDirectoryRoleCollectionRequestBuilder> implements IBaseDirectoryRoleCollectionPage {

    /**
     * A collection page for DirectoryRole
     *
     * @param response the serialized BaseDirectoryRoleCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseDirectoryRoleCollectionPage(final BaseDirectoryRoleCollectionResponse response, final IDirectoryRoleCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}

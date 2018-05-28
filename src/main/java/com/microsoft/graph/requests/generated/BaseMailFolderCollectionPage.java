// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.MailFolder;
import com.microsoft.graph.requests.extensions.IMailFolderCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Mail Folder Collection Page.
 */
public class BaseMailFolderCollectionPage extends BaseCollectionPage<MailFolder, IMailFolderCollectionRequestBuilder> implements IBaseMailFolderCollectionPage {

    /**
     * A collection page for MailFolder
     *
     * @param response the serialized BaseMailFolderCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseMailFolderCollectionPage(final BaseMailFolderCollectionResponse response, final IMailFolderCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}

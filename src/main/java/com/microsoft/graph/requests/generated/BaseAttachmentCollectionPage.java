// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.Attachment;
import com.microsoft.graph.requests.extensions.IAttachmentCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Attachment Collection Page.
 */
public class BaseAttachmentCollectionPage extends BaseCollectionPage<Attachment, IAttachmentCollectionRequestBuilder> implements IBaseAttachmentCollectionPage {

    /**
     * A collection page for Attachment
     *
     * @param response the serialized BaseAttachmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseAttachmentCollectionPage(final BaseAttachmentCollectionResponse response, final IAttachmentCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}

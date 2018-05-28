// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.ConversationThread;
import com.microsoft.graph.requests.extensions.IConversationThreadCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Conversation Thread Collection Page.
 */
public class BaseConversationThreadCollectionPage extends BaseCollectionPage<ConversationThread, IConversationThreadCollectionRequestBuilder> implements IBaseConversationThreadCollectionPage {

    /**
     * A collection page for ConversationThread
     *
     * @param response the serialized BaseConversationThreadCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseConversationThreadCollectionPage(final BaseConversationThreadCollectionResponse response, final IConversationThreadCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.models.extensions.Post;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IConversationThreadReplyRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationThreadRequest;
import com.microsoft.graph.requests.extensions.IPostCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPostRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Conversation Thread Request Builder.
 */
public interface IBaseConversationThreadRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IConversationThreadRequest instance
     */
    IConversationThreadRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IConversationThreadRequest instance
     */
    IConversationThreadRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IPostCollectionRequestBuilder posts();

    IPostRequestBuilder posts(final String id);
    IConversationThreadReplyRequestBuilder reply(final Post post);

}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.DirectoryObjectCheckMemberGroupsCollectionRequest;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCheckMemberGroupsCollectionRequest;

/**
 * The class for the Base Directory Object Check Member Groups Collection Request Builder.
 */
public class BaseDirectoryObjectCheckMemberGroupsCollectionRequestBuilder extends BaseActionRequestBuilder implements IBaseDirectoryObjectCheckMemberGroupsCollectionRequestBuilder {

    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param groupIds the groupIds
     */
    public BaseDirectoryObjectCheckMemberGroupsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<String> groupIds) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("groupIds", groupIds);
      }

    public IDirectoryObjectCheckMemberGroupsCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDirectoryObjectCheckMemberGroupsCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        DirectoryObjectCheckMemberGroupsCollectionRequest request = new DirectoryObjectCheckMemberGroupsCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("groupIds")) {
            request.body.groupIds = getParameter("groupIds");
        }
  
        return request;
    }
}

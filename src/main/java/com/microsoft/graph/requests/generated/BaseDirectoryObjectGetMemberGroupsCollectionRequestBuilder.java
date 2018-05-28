// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.DirectoryObjectGetMemberGroupsCollectionRequest;
import com.microsoft.graph.requests.extensions.IDirectoryObjectGetMemberGroupsCollectionRequest;

/**
 * The class for the Base Directory Object Get Member Groups Collection Request Builder.
 */
public class BaseDirectoryObjectGetMemberGroupsCollectionRequestBuilder extends BaseActionRequestBuilder implements IBaseDirectoryObjectGetMemberGroupsCollectionRequestBuilder {

    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param securityEnabledOnly the securityEnabledOnly
     */
    public BaseDirectoryObjectGetMemberGroupsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Boolean securityEnabledOnly) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("securityEnabledOnly", securityEnabledOnly);
      }

    public IDirectoryObjectGetMemberGroupsCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDirectoryObjectGetMemberGroupsCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        DirectoryObjectGetMemberGroupsCollectionRequest request = new DirectoryObjectGetMemberGroupsCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("securityEnabledOnly")) {
            request.body.securityEnabledOnly = getParameter("securityEnabledOnly");
        }
  
        return request;
    }
}

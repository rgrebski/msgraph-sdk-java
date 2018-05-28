// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyAddGroupRequest;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyAddGroupRequest;

/**
 * The class for the Base Group Lifecycle Policy Add Group Request Builder.
 */
public class BaseGroupLifecyclePolicyAddGroupRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this GroupLifecyclePolicyAddGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param groupId the groupId
     */
    public BaseGroupLifecyclePolicyAddGroupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String groupId) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("groupId", groupId);
    }

    /**
     * Creates the IGroupLifecyclePolicyAddGroupRequest
     *
     * @return the IGroupLifecyclePolicyAddGroupRequest instance
     */
    public IGroupLifecyclePolicyAddGroupRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IGroupLifecyclePolicyAddGroupRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IGroupLifecyclePolicyAddGroupRequest instance
     */
    public IGroupLifecyclePolicyAddGroupRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        GroupLifecyclePolicyAddGroupRequest request = new GroupLifecyclePolicyAddGroupRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("groupId")) {
            request.body.groupId = getParameter("groupId");
        }

        return request;
    }
}

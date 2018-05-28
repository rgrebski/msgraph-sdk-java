// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IOrganizationSetMobileDeviceManagementAuthorityRequest;
import com.microsoft.graph.requests.extensions.OrganizationSetMobileDeviceManagementAuthorityRequest;

/**
 * The class for the Base Organization Set Mobile Device Management Authority Request Builder.
 */
public class BaseOrganizationSetMobileDeviceManagementAuthorityRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this OrganizationSetMobileDeviceManagementAuthority
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseOrganizationSetMobileDeviceManagementAuthorityRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IOrganizationSetMobileDeviceManagementAuthorityRequest
     *
     * @return the IOrganizationSetMobileDeviceManagementAuthorityRequest instance
     */
    public IOrganizationSetMobileDeviceManagementAuthorityRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IOrganizationSetMobileDeviceManagementAuthorityRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IOrganizationSetMobileDeviceManagementAuthorityRequest instance
     */
    public IOrganizationSetMobileDeviceManagementAuthorityRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        OrganizationSetMobileDeviceManagementAuthorityRequest request = new OrganizationSetMobileDeviceManagementAuthorityRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}

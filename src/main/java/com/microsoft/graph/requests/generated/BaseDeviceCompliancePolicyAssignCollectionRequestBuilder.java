// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyAssignment;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyAssignCollectionRequest;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyAssignCollectionRequest;

/**
 * The class for the Base Device Compliance Policy Assign Collection Request Builder.
 */
public class BaseDeviceCompliancePolicyAssignCollectionRequestBuilder extends BaseActionRequestBuilder implements IBaseDeviceCompliancePolicyAssignCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param assignments the assignments
     */
    public BaseDeviceCompliancePolicyAssignCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<DeviceCompliancePolicyAssignment> assignments) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("assignments", assignments);
      }

    public IDeviceCompliancePolicyAssignCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDeviceCompliancePolicyAssignCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        DeviceCompliancePolicyAssignCollectionRequest request = new DeviceCompliancePolicyAssignCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("assignments")) {
            request.body.assignments = getParameter("assignments");
        }
  
        return request;
    }
}

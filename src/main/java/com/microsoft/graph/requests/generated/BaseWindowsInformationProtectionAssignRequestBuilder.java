// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAssignRequest;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAssignRequest;

/**
 * The class for the Base Windows Information Protection Assign Request Builder.
 */
public class BaseWindowsInformationProtectionAssignRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WindowsInformationProtectionAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param assignments the assignments
     */
    public BaseWindowsInformationProtectionAssignRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<TargetedManagedAppPolicyAssignment> assignments) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("assignments", assignments);
    }

    /**
     * Creates the IWindowsInformationProtectionAssignRequest
     *
     * @return the IWindowsInformationProtectionAssignRequest instance
     */
    public IWindowsInformationProtectionAssignRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWindowsInformationProtectionAssignRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWindowsInformationProtectionAssignRequest instance
     */
    public IWindowsInformationProtectionAssignRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WindowsInformationProtectionAssignRequest request = new WindowsInformationProtectionAssignRequest(
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

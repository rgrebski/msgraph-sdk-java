// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest;
import com.microsoft.graph.requests.extensions.IDeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest;

/**
 * The class for the Base Device Management Verify Windows Enrollment Auto Discovery Request Builder.
 */
public class BaseDeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this DeviceManagementVerifyWindowsEnrollmentAutoDiscovery
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param domainName the domainName
     */
    public BaseDeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String domainName) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("domainName", domainName));
    }

    /**
     * Creates the IDeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest
     *
     * @return the IDeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest instance
     */
    public IDeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IDeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest instance
     */
    public IDeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest request = new DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}

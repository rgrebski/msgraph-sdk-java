// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.DeviceManagementGetEffectivePermissionsCollectionRequest;
import com.microsoft.graph.requests.extensions.IDeviceManagementGetEffectivePermissionsCollectionRequest;

/**
 * The class for the Base Device Management Get Effective Permissions Collection Request Builder.
 */
public class BaseDeviceManagementGetEffectivePermissionsCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IBaseDeviceManagementGetEffectivePermissionsCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param scope the scope
     */
    public BaseDeviceManagementGetEffectivePermissionsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String scope) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("scope", scope));
      }

    public IDeviceManagementGetEffectivePermissionsCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDeviceManagementGetEffectivePermissionsCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        DeviceManagementGetEffectivePermissionsCollectionRequest request = new DeviceManagementGetEffectivePermissionsCollectionRequest(
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

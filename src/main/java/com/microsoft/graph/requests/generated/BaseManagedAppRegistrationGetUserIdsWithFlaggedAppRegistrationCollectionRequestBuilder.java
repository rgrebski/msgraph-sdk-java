// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest;

/**
 * The class for the Base Managed App Registration Get User Ids With Flagged App Registration Collection Request Builder.
 */
public class BaseManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IBaseManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequestBuilder {

    /**
     * The request builder for this collection of ManagedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest request = new ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest(
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

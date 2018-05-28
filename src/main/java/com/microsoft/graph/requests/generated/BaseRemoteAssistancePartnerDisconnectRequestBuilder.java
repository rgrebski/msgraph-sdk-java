// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IRemoteAssistancePartnerDisconnectRequest;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerDisconnectRequest;

/**
 * The class for the Base Remote Assistance Partner Disconnect Request Builder.
 */
public class BaseRemoteAssistancePartnerDisconnectRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this RemoteAssistancePartnerDisconnect
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseRemoteAssistancePartnerDisconnectRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IRemoteAssistancePartnerDisconnectRequest
     *
     * @return the IRemoteAssistancePartnerDisconnectRequest instance
     */
    public IRemoteAssistancePartnerDisconnectRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IRemoteAssistancePartnerDisconnectRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IRemoteAssistancePartnerDisconnectRequest instance
     */
    public IRemoteAssistancePartnerDisconnectRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        RemoteAssistancePartnerDisconnectRequest request = new RemoteAssistancePartnerDisconnectRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}

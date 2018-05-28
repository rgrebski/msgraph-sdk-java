// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.DirectoryObjectRestoreRequest;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRestoreRequest;

/**
 * The class for the Base Directory Object Restore Request Builder.
 */
public class BaseDirectoryObjectRestoreRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this DirectoryObjectRestore
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDirectoryObjectRestoreRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IDirectoryObjectRestoreRequest
     *
     * @return the IDirectoryObjectRestoreRequest instance
     */
    public IDirectoryObjectRestoreRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IDirectoryObjectRestoreRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDirectoryObjectRestoreRequest instance
     */
    public IDirectoryObjectRestoreRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        DirectoryObjectRestoreRequest request = new DirectoryObjectRestoreRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}

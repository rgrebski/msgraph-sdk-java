// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IDriveItemCreateUploadSessionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Drive Item Create Upload Session Request Builder.
 */
public interface IBaseDriveItemCreateUploadSessionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDriveItemCreateUploadSessionRequest
     *
     * @return the IDriveItemCreateUploadSessionRequest instance
     */
    IDriveItemCreateUploadSessionRequest buildRequest();

    /**
     * Creates the IDriveItemCreateUploadSessionRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDriveItemCreateUploadSessionRequest instance
     */
    IDriveItemCreateUploadSessionRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}

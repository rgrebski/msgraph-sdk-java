// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionRequest;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Drive Item Collection Request Builder.
 */
public interface IBaseDriveItemCollectionRequestBuilder extends IRequestBuilder {

    IDriveItemCollectionRequest buildRequest();

    IDriveItemCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IDriveItemRequestBuilder byId(final String id);

}

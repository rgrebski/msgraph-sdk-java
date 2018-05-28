// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IDriveItemVersionCollectionRequest;
import com.microsoft.graph.requests.extensions.IDriveItemVersionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Drive Item Version Collection Request Builder.
 */
public interface IBaseDriveItemVersionCollectionRequestBuilder extends IRequestBuilder {

    IDriveItemVersionCollectionRequest buildRequest();

    IDriveItemVersionCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IDriveItemVersionRequestBuilder byId(final String id);

}

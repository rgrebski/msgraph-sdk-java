// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionPolicyCollectionRequest;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionPolicyRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Windows Information Protection Policy Collection Request Builder.
 */
public interface IBaseWindowsInformationProtectionPolicyCollectionRequestBuilder extends IRequestBuilder {

    IWindowsInformationProtectionPolicyCollectionRequest buildRequest();

    IWindowsInformationProtectionPolicyCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IWindowsInformationProtectionPolicyRequestBuilder byId(final String id);

}

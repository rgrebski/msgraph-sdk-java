// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordCollectionRequest;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Domain Dns Record Collection Request Builder.
 */
public interface IBaseDomainDnsRecordCollectionRequestBuilder extends IRequestBuilder {

    IDomainDnsRecordCollectionRequest buildRequest();

    IDomainDnsRecordCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IDomainDnsRecordRequestBuilder byId(final String id);

}

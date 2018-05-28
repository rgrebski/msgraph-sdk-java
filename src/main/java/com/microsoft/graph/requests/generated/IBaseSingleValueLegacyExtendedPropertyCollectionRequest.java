// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Single Value Legacy Extended Property Collection Request.
 */
public interface IBaseSingleValueLegacyExtendedPropertyCollectionRequest {

    void get(final ICallback<ISingleValueLegacyExtendedPropertyCollectionPage> callback);

    ISingleValueLegacyExtendedPropertyCollectionPage get() throws ClientException;

    void post(final SingleValueLegacyExtendedProperty newSingleValueLegacyExtendedProperty, final ICallback<SingleValueLegacyExtendedProperty> callback);

    SingleValueLegacyExtendedProperty post(final SingleValueLegacyExtendedProperty newSingleValueLegacyExtendedProperty) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISingleValueLegacyExtendedPropertyCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISingleValueLegacyExtendedPropertyCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    ISingleValueLegacyExtendedPropertyCollectionRequest top(final int value);

}

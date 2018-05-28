// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.ManagedAppRegistration;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationCollectionReferenceRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Managed App Registration Collection Reference Request.
 */
public interface IBaseManagedAppRegistrationCollectionReferenceRequest {

    void post(final ManagedAppRegistration newManagedAppRegistration, final ICallback<ManagedAppRegistration> callback);

    ManagedAppRegistration post(final ManagedAppRegistration newManagedAppRegistration) throws ClientException;

    IManagedAppRegistrationCollectionReferenceRequest select(final String value);

    IManagedAppRegistrationCollectionReferenceRequest top(final int value);

}

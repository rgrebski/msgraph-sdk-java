// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.TermsAndConditions;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Terms And Conditions With Reference Request.
 */
public interface IBaseTermsAndConditionsWithReferenceRequest extends IHttpRequest {

    void post(final TermsAndConditions newTermsAndConditions, final IJsonBackedObject payload, final ICallback<TermsAndConditions> callback);

    TermsAndConditions post(final TermsAndConditions newTermsAndConditions, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<TermsAndConditions> callback);

    TermsAndConditions get() throws ClientException;

	void delete(final ICallback<TermsAndConditions> callback);

	void delete() throws ClientException;

	void patch(final TermsAndConditions sourceTermsAndConditions, final ICallback<TermsAndConditions> callback);

	TermsAndConditions patch(final TermsAndConditions sourceTermsAndConditions) throws ClientException;

    IBaseTermsAndConditionsWithReferenceRequest select(final String value);

    IBaseTermsAndConditionsWithReferenceRequest expand(final String value);

}

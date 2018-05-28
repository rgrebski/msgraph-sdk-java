// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Directory Object With Reference Request.
 */
public interface IBaseDirectoryObjectWithReferenceRequest extends IHttpRequest {

    void post(final DirectoryObject newDirectoryObject, final IJsonBackedObject payload, final ICallback<DirectoryObject> callback);

    DirectoryObject post(final DirectoryObject newDirectoryObject, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<DirectoryObject> callback);

    DirectoryObject get() throws ClientException;

	void delete(final ICallback<DirectoryObject> callback);

	void delete() throws ClientException;

	void patch(final DirectoryObject sourceDirectoryObject, final ICallback<DirectoryObject> callback);

	DirectoryObject patch(final DirectoryObject sourceDirectoryObject) throws ClientException;

    IBaseDirectoryObjectWithReferenceRequest select(final String value);

    IBaseDirectoryObjectWithReferenceRequest expand(final String value);

}

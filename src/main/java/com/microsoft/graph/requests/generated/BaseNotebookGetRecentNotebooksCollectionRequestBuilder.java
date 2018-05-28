// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.INotebookGetRecentNotebooksCollectionRequest;
import com.microsoft.graph.requests.extensions.NotebookGetRecentNotebooksCollectionRequest;

/**
 * The class for the Base Notebook Get Recent Notebooks Collection Request Builder.
 */
public class BaseNotebookGetRecentNotebooksCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IBaseNotebookGetRecentNotebooksCollectionRequestBuilder {

    /**
     * The request builder for this collection of Notebook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param includePersonalNotebooks the includePersonalNotebooks
     */
    public BaseNotebookGetRecentNotebooksCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Boolean includePersonalNotebooks) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("includePersonalNotebooks", includePersonalNotebooks));
      }

    public INotebookGetRecentNotebooksCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public INotebookGetRecentNotebooksCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        NotebookGetRecentNotebooksCollectionRequest request = new NotebookGetRecentNotebooksCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}

// 
// Copyright (c) Microsoft and contributors.  All rights reserved.
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//   http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// 
// See the License for the specific language governing permissions and
// limitations under the License.
// 

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.monitoring.autoscale;

import com.microsoft.windowsazure.management.ManagementConfiguration;
import com.microsoft.windowsazure.management.SubscriptionCloudCredentials;
import com.microsoft.windowsazure.services.core.ServiceClient;
import java.net.URI;
import javax.inject.Inject;
import javax.inject.Named;

public class AutoscaleClientImpl extends ServiceClient<AutoscaleClientImpl> implements AutoscaleClient
{
    private URI baseUri;
    
    /**
    * Optional base uri parameter.
    */
    public URI getBaseUri() { return this.baseUri; }
    
    private SubscriptionCloudCredentials credentials;
    
    /**
    * When you create a Windows Azure subscription, it is uniquely identified
    * by a subscription ID. The subscription ID forms part of the URI for
    * every call that you make to the Service Management API.  The Windows
    * Azure Service ManagementAPI use mutual authentication of management
    * certificates over SSL to ensure that a request made to the service is
    * secure.  No anonymous requests are allowed.
    */
    public SubscriptionCloudCredentials getCredentials() { return this.credentials; }
    
    private SettingOperations settings;
    
    /**
    * Operations for managing the autoscale settings.
    */
    public SettingOperations getSettings() { return this.settings; }
    
    /**
    * Initializes a new instance of the AutoscaleClientImpl class.
    *
    */
    private AutoscaleClientImpl()
    {
        super();
        this.settings = new SettingOperationsImpl(this);
    }
    
    /**
    * Initializes a new instance of the AutoscaleClientImpl class.
    *
    * @param credentials When you create a Windows Azure subscription, it is
    * uniquely identified by a subscription ID. The subscription ID forms part
    * of the URI for every call that you make to the Service Management API.
    * The Windows Azure Service ManagementAPI use mutual authentication of
    * management certificates over SSL to ensure that a request made to the
    * service is secure.  No anonymous requests are allowed.
    * @param baseUri Optional base uri parameter.
    */
    public AutoscaleClientImpl(SubscriptionCloudCredentials credentials, URI baseUri)
    {
        this();
        if (credentials == null)
        {
            throw new NullPointerException("credentials");
        }
        if (baseUri == null)
        {
            throw new NullPointerException("baseUri");
        }
        this.credentials = credentials;
        this.baseUri = baseUri;
        
        httpClient = credentials.initializeClient();
    }
    
    /**
    * Initializes a new instance of the AutoscaleClientImpl class.
    *
    * @param credentials When you create a Windows Azure subscription, it is
    * uniquely identified by a subscription ID. The subscription ID forms part
    * of the URI for every call that you make to the Service Management API.
    * The Windows Azure Service ManagementAPI use mutual authentication of
    * management certificates over SSL to ensure that a request made to the
    * service is secure.  No anonymous requests are allowed.
    */
    @Inject
    public AutoscaleClientImpl(@Named(ManagementConfiguration.SUBSCRIPTION_CLOUD_CREDENTIALS) SubscriptionCloudCredentials credentials) throws java.net.URISyntaxException
    {
        this();
        if (credentials == null)
        {
            throw new NullPointerException("credentials");
        }
        this.credentials = credentials;
        this.baseUri = new URI("https://management.core.windows.net");
        
        httpClient = credentials.initializeClient();
    }
}

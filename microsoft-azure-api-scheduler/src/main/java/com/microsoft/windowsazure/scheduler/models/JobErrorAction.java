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

package com.microsoft.windowsazure.scheduler.models;

/**
* Action to invoke for the job error.
*/
public class JobErrorAction
{
    private JobQueueMessage queueMessage;
    
    /**
    * Queue and message for a queue message action type.
    */
    public JobQueueMessage getQueueMessage() { return this.queueMessage; }
    
    /**
    * Queue and message for a queue message action type.
    */
    public void setQueueMessage(JobQueueMessage queueMessage) { this.queueMessage = queueMessage; }
    
    private JobHttpRequest request;
    
    /**
    * Request for a http or https action type.
    */
    public JobHttpRequest getRequest() { return this.request; }
    
    /**
    * Request for a http or https action type.
    */
    public void setRequest(JobHttpRequest request) { this.request = request; }
    
    private JobActionType type;
    
    /**
    * Type of action. Can be one of http, https, storageQueue.
    */
    public JobActionType getType() { return this.type; }
    
    /**
    * Type of action. Can be one of http, https, storageQueue.
    */
    public void setType(JobActionType type) { this.type = type; }
    
    /**
    * Initializes a new instance of the JobErrorAction class.
    *
    */
    public JobErrorAction()
    {
    }
}

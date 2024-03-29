/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 29 23:34:58 EDT 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.codehaus.jackson.annotate.JsonProperty;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

/**
 * Salesforce DTO for SObject PermissionSetAssignment
 */
@XStreamAlias("PermissionSetAssignment")
public class PermissionSetAssignment extends AbstractSObjectBase {

    // PermissionSetId
    private String PermissionSetId;

    @JsonProperty("PermissionSetId")
    public String getPermissionSetId() {
        return this.PermissionSetId;
    }

    @JsonProperty("PermissionSetId")
    public void setPermissionSetId(String PermissionSetId) {
        this.PermissionSetId = PermissionSetId;
    }

    // AssigneeId
    private String AssigneeId;

    @JsonProperty("AssigneeId")
    public String getAssigneeId() {
        return this.AssigneeId;
    }

    @JsonProperty("AssigneeId")
    public void setAssigneeId(String AssigneeId) {
        this.AssigneeId = AssigneeId;
    }

}
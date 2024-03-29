/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 29 23:34:58 EDT 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.codehaus.jackson.annotate.JsonProperty;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

/**
 * Salesforce DTO for SObject DocumentAttachmentMap
 */
@XStreamAlias("DocumentAttachmentMap")
public class DocumentAttachmentMap extends AbstractSObjectBase {

    // ParentId
    private String ParentId;

    @JsonProperty("ParentId")
    public String getParentId() {
        return this.ParentId;
    }

    @JsonProperty("ParentId")
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    // DocumentId
    private String DocumentId;

    @JsonProperty("DocumentId")
    public String getDocumentId() {
        return this.DocumentId;
    }

    @JsonProperty("DocumentId")
    public void setDocumentId(String DocumentId) {
        this.DocumentId = DocumentId;
    }

    // DocumentSequence
    private Integer DocumentSequence;

    @JsonProperty("DocumentSequence")
    public Integer getDocumentSequence() {
        return this.DocumentSequence;
    }

    @JsonProperty("DocumentSequence")
    public void setDocumentSequence(Integer DocumentSequence) {
        this.DocumentSequence = DocumentSequence;
    }

}
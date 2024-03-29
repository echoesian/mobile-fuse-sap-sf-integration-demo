/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 29 23:34:58 EDT 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.codehaus.jackson.annotate.JsonProperty;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

/**
 * Salesforce DTO for SObject Attachment
 */
@XStreamAlias("Attachment")
public class Attachment extends AbstractSObjectBase {

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

    // IsPrivate
    private Boolean IsPrivate;

    @JsonProperty("IsPrivate")
    public Boolean getIsPrivate() {
        return this.IsPrivate;
    }

    @JsonProperty("IsPrivate")
    public void setIsPrivate(Boolean IsPrivate) {
        this.IsPrivate = IsPrivate;
    }

    // ContentType
    private String ContentType;

    @JsonProperty("ContentType")
    public String getContentType() {
        return this.ContentType;
    }

    @JsonProperty("ContentType")
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    // BodyLength
    private Integer BodyLength;

    @JsonProperty("BodyLength")
    public Integer getBodyLength() {
        return this.BodyLength;
    }

    @JsonProperty("BodyLength")
    public void setBodyLength(Integer BodyLength) {
        this.BodyLength = BodyLength;
    }

    // Body
    // blob field url, use getBlobField to get the content
    @XStreamAlias("Body")
    private String BodyUrl;

    @JsonProperty("Body")
    public String getBodyUrl() {
        return this.BodyUrl;
    }

    @JsonProperty("Body")
    public void setBodyUrl(String BodyUrl) {
        this.BodyUrl = BodyUrl;
    }

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

}
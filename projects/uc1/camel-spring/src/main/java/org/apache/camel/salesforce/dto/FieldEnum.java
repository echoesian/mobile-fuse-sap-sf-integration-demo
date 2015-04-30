/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 29 23:34:58 EDT 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Field
 */
public enum FieldEnum {

    // ArchivedBy
    ARCHIVEDBY("ArchivedBy"),
    // ArchivedDate
    ARCHIVEDDATE("ArchivedDate"),
    // created
    CREATED("created"),
    // DeletedBy
    DELETEDBY("DeletedBy"),
    // DeletedDate
    DELETEDDATE("DeletedDate"),
    // contentDocPublished
    CONTENTDOCPUBLISHED("contentDocPublished"),
    // contentDocFeatured
    CONTENTDOCFEATURED("contentDocFeatured"),
    // contentDocRepublished
    CONTENTDOCREPUBLISHED("contentDocRepublished"),
    // contentDocUnpublished
    CONTENTDOCUNPUBLISHED("contentDocUnpublished"),
    // contentDocSubscribed
    CONTENTDOCSUBSCRIBED("contentDocSubscribed"),
    // contentDocUnsubscribed
    CONTENTDOCUNSUBSCRIBED("contentDocUnsubscribed"),
    // feedEvent
    FEEDEVENT("feedEvent"),
    // IsArchived
    ISARCHIVED("IsArchived"),
    // Owner
    OWNER("Owner"),
    // ownerAccepted
    OWNERACCEPTED("ownerAccepted"),
    // ownerAssignment
    OWNERASSIGNMENT("ownerAssignment"),
    // Parent
    PARENT("Parent"),
    // PublishStatus
    PUBLISHSTATUS("PublishStatus"),
    // locked
    LOCKED("locked"),
    // unlocked
    UNLOCKED("unlocked"),
    // Title
    TITLE("Title");

    final String value;

    private FieldEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static FieldEnum fromValue(String value) {
        for (FieldEnum e : FieldEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
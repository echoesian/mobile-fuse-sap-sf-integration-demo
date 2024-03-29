/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 29 23:34:58 EDT 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist SiteType
 */
public enum SiteTypeEnum {

    // Siteforce
    SITEFORCE("Siteforce"),
    // Visualforce
    VISUALFORCE("Visualforce"),
    // User
    USER("User");

    final String value;

    private SiteTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static SiteTypeEnum fromValue(String value) {
        for (SiteTypeEnum e : SiteTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
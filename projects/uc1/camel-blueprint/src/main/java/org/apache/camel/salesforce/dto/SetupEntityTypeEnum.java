/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Mon Mar 02 02:58:34 EST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist SetupEntityType
 */
public enum SetupEntityTypeEnum {

    // ApexClass
    APEXCLASS("ApexClass"),
    // ApexPage
    APEXPAGE("ApexPage"),
    // ExternalDataSource
    EXTERNALDATASOURCE("ExternalDataSource");

    final String value;

    private SetupEntityTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static SetupEntityTypeEnum fromValue(String value) {
        for (SetupEntityTypeEnum e : SetupEntityTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}

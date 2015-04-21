/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Mon Mar 02 02:58:34 EST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist State
 */
public enum StateEnum {

    // Active
    ACTIVE("Active"),
    // Inactive
    INACTIVE("Inactive"),
    // Obsolete
    OBSOLETE("Obsolete");

    final String value;

    private StateEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static StateEnum fromValue(String value) {
        for (StateEnum e : StateEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}

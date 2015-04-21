/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Mon Mar 02 02:58:34 EST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Reason
 */
public enum ReasonEnum {

    // Installation
    INSTALLATION("Installation"),
    // Equipment Complexity
    EQUIPMENT_COMPLEXITY("Equipment Complexity"),
    // Performance
    PERFORMANCE("Performance"),
    // Breakdown
    BREAKDOWN("Breakdown"),
    // Equipment Design
    EQUIPMENT_DESIGN("Equipment Design"),
    // Feedback
    FEEDBACK("Feedback"),
    // Other
    OTHER("Other");

    final String value;

    private ReasonEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ReasonEnum fromValue(String value) {
        for (ReasonEnum e : ReasonEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}

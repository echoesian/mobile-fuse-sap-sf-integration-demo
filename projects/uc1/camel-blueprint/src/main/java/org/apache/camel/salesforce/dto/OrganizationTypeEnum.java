/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Mon Mar 02 02:58:34 EST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist OrganizationType
 */
public enum OrganizationTypeEnum {

    // Team Edition
    TEAM_EDITION("Team Edition"),
    // Professional Edition
    PROFESSIONAL_EDITION("Professional Edition"),
    // Enterprise Edition
    ENTERPRISE_EDITION("Enterprise Edition"),
    // Developer Edition
    DEVELOPER_EDITION("Developer Edition"),
    // Personal Edition
    PERSONAL_EDITION("Personal Edition"),
    // Unlimited Edition
    UNLIMITED_EDITION("Unlimited Edition"),
    // Contact Manager Edition
    CONTACT_MANAGER_EDITION("Contact Manager Edition"),
    // Base Edition
    BASE_EDITION("Base Edition");

    final String value;

    private OrganizationTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static OrganizationTypeEnum fromValue(String value) {
        for (OrganizationTypeEnum e : OrganizationTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}

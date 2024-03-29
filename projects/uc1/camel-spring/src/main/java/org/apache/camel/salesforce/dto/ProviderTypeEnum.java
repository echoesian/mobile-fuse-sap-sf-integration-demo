/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 29 23:34:58 EDT 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ProviderType
 */
public enum ProviderTypeEnum {

    // Facebook
    FACEBOOK("Facebook"),
    // Janrain
    JANRAIN("Janrain"),
    // Salesforce
    SALESFORCE("Salesforce"),
    // OpenIdConnect
    OPENIDCONNECT("OpenIdConnect"),
    // MicrosoftACS
    MICROSOFTACS("MicrosoftACS"),
    // LinkedIn
    LINKEDIN("LinkedIn"),
    // Twitter
    TWITTER("Twitter"),
    // Google
    GOOGLE("Google");

    final String value;

    private ProviderTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ProviderTypeEnum fromValue(String value) {
        for (ProviderTypeEnum e : ProviderTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
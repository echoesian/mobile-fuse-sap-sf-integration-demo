/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 29 23:34:58 EDT 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ForecastCategory
 */
public enum ForecastCategoryEnum {

    // Omitted
    OMITTED("Omitted"),
    // Pipeline
    PIPELINE("Pipeline"),
    // BestCase
    BESTCASE("BestCase"),
    // Forecast
    FORECAST("Forecast"),
    // Closed
    CLOSED("Closed");

    final String value;

    private ForecastCategoryEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ForecastCategoryEnum fromValue(String value) {
        for (ForecastCategoryEnum e : ForecastCategoryEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
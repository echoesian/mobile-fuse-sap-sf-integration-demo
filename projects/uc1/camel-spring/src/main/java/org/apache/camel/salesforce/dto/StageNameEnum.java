/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 29 23:34:58 EDT 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist StageName
 */
public enum StageNameEnum {

    // Prospecting
    PROSPECTING("Prospecting"),
    // Qualification
    QUALIFICATION("Qualification"),
    // Needs Analysis
    NEEDS_ANALYSIS("Needs Analysis"),
    // Value Proposition
    VALUE_PROPOSITION("Value Proposition"),
    // Id. Decision Makers
    ID__DECISION_MAKERS("Id. Decision Makers"),
    // Perception Analysis
    PERCEPTION_ANALYSIS("Perception Analysis"),
    // Proposal/Price Quote
    PROPOSAL_PRICE_QUOTE("Proposal/Price Quote"),
    // Negotiation/Review
    NEGOTIATION_REVIEW("Negotiation/Review"),
    // Closed Won
    CLOSED_WON("Closed Won"),
    // Closed Lost
    CLOSED_LOST("Closed Lost");

    final String value;

    private StageNameEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static StageNameEnum fromValue(String value) {
        for (StageNameEnum e : StageNameEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
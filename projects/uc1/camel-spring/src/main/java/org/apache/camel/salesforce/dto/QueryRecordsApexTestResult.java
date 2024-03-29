/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 29 23:34:58 EDT 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type ApexTestResult
 */
public class QueryRecordsApexTestResult extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<ApexTestResult> records;

    public List<ApexTestResult> getRecords() {
        return records;
    }

    public void setRecords(List<ApexTestResult> records) {
        this.records = records;
    }
}

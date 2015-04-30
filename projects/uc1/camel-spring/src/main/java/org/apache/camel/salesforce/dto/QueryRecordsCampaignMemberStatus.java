/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 29 23:34:58 EDT 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type CampaignMemberStatus
 */
public class QueryRecordsCampaignMemberStatus extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<CampaignMemberStatus> records;

    public List<CampaignMemberStatus> getRecords() {
        return records;
    }

    public void setRecords(List<CampaignMemberStatus> records) {
        this.records = records;
    }
}
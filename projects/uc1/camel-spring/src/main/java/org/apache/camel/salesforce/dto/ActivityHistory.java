/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 29 23:34:58 EDT 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

/**
 * Salesforce DTO for SObject ActivityHistory
 */
@XStreamAlias("ActivityHistory")
public class ActivityHistory extends AbstractSObjectBase {

    // AccountId
    private String AccountId;

    @JsonProperty("AccountId")
    public String getAccountId() {
        return this.AccountId;
    }

    @JsonProperty("AccountId")
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    // WhoId
    private String WhoId;

    @JsonProperty("WhoId")
    public String getWhoId() {
        return this.WhoId;
    }

    @JsonProperty("WhoId")
    public void setWhoId(String WhoId) {
        this.WhoId = WhoId;
    }

    // WhatId
    private String WhatId;

    @JsonProperty("WhatId")
    public String getWhatId() {
        return this.WhatId;
    }

    @JsonProperty("WhatId")
    public void setWhatId(String WhatId) {
        this.WhatId = WhatId;
    }

    // Subject
    @XStreamConverter(PicklistEnumConverter.class)
    private SubjectEnum Subject;

    @JsonProperty("Subject")
    public SubjectEnum getSubject() {
        return this.Subject;
    }

    @JsonProperty("Subject")
    public void setSubject(SubjectEnum Subject) {
        this.Subject = Subject;
    }

    // IsTask
    private Boolean IsTask;

    @JsonProperty("IsTask")
    public Boolean getIsTask() {
        return this.IsTask;
    }

    @JsonProperty("IsTask")
    public void setIsTask(Boolean IsTask) {
        this.IsTask = IsTask;
    }

    // ActivityDate
    private org.joda.time.DateTime ActivityDate;

    @JsonProperty("ActivityDate")
    public org.joda.time.DateTime getActivityDate() {
        return this.ActivityDate;
    }

    @JsonProperty("ActivityDate")
    public void setActivityDate(org.joda.time.DateTime ActivityDate) {
        this.ActivityDate = ActivityDate;
    }

    // Status
    @XStreamConverter(PicklistEnumConverter.class)
    private StatusEnum Status;

    @JsonProperty("Status")
    public StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(StatusEnum Status) {
        this.Status = Status;
    }

    // Priority
    @XStreamConverter(PicklistEnumConverter.class)
    private PriorityEnum Priority;

    @JsonProperty("Priority")
    public PriorityEnum getPriority() {
        return this.Priority;
    }

    @JsonProperty("Priority")
    public void setPriority(PriorityEnum Priority) {
        this.Priority = Priority;
    }

    // ActivityType
    @XStreamConverter(PicklistEnumConverter.class)
    private ActivityTypeEnum ActivityType;

    @JsonProperty("ActivityType")
    public ActivityTypeEnum getActivityType() {
        return this.ActivityType;
    }

    @JsonProperty("ActivityType")
    public void setActivityType(ActivityTypeEnum ActivityType) {
        this.ActivityType = ActivityType;
    }

    // IsClosed
    private Boolean IsClosed;

    @JsonProperty("IsClosed")
    public Boolean getIsClosed() {
        return this.IsClosed;
    }

    @JsonProperty("IsClosed")
    public void setIsClosed(Boolean IsClosed) {
        this.IsClosed = IsClosed;
    }

    // IsAllDayEvent
    private Boolean IsAllDayEvent;

    @JsonProperty("IsAllDayEvent")
    public Boolean getIsAllDayEvent() {
        return this.IsAllDayEvent;
    }

    @JsonProperty("IsAllDayEvent")
    public void setIsAllDayEvent(Boolean IsAllDayEvent) {
        this.IsAllDayEvent = IsAllDayEvent;
    }

    // IsVisibleInSelfService
    private Boolean IsVisibleInSelfService;

    @JsonProperty("IsVisibleInSelfService")
    public Boolean getIsVisibleInSelfService() {
        return this.IsVisibleInSelfService;
    }

    @JsonProperty("IsVisibleInSelfService")
    public void setIsVisibleInSelfService(Boolean IsVisibleInSelfService) {
        this.IsVisibleInSelfService = IsVisibleInSelfService;
    }

    // DurationInMinutes
    private Integer DurationInMinutes;

    @JsonProperty("DurationInMinutes")
    public Integer getDurationInMinutes() {
        return this.DurationInMinutes;
    }

    @JsonProperty("DurationInMinutes")
    public void setDurationInMinutes(Integer DurationInMinutes) {
        this.DurationInMinutes = DurationInMinutes;
    }

    // Location
    private String Location;

    @JsonProperty("Location")
    public String getLocation() {
        return this.Location;
    }

    @JsonProperty("Location")
    public void setLocation(String Location) {
        this.Location = Location;
    }

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    // CallDurationInSeconds
    private Integer CallDurationInSeconds;

    @JsonProperty("CallDurationInSeconds")
    public Integer getCallDurationInSeconds() {
        return this.CallDurationInSeconds;
    }

    @JsonProperty("CallDurationInSeconds")
    public void setCallDurationInSeconds(Integer CallDurationInSeconds) {
        this.CallDurationInSeconds = CallDurationInSeconds;
    }

    // CallType
    @XStreamConverter(PicklistEnumConverter.class)
    private CallTypeEnum CallType;

    @JsonProperty("CallType")
    public CallTypeEnum getCallType() {
        return this.CallType;
    }

    @JsonProperty("CallType")
    public void setCallType(CallTypeEnum CallType) {
        this.CallType = CallType;
    }

    // CallDisposition
    private String CallDisposition;

    @JsonProperty("CallDisposition")
    public String getCallDisposition() {
        return this.CallDisposition;
    }

    @JsonProperty("CallDisposition")
    public void setCallDisposition(String CallDisposition) {
        this.CallDisposition = CallDisposition;
    }

    // CallObject
    private String CallObject;

    @JsonProperty("CallObject")
    public String getCallObject() {
        return this.CallObject;
    }

    @JsonProperty("CallObject")
    public void setCallObject(String CallObject) {
        this.CallObject = CallObject;
    }

    // ReminderDateTime
    private org.joda.time.DateTime ReminderDateTime;

    @JsonProperty("ReminderDateTime")
    public org.joda.time.DateTime getReminderDateTime() {
        return this.ReminderDateTime;
    }

    @JsonProperty("ReminderDateTime")
    public void setReminderDateTime(org.joda.time.DateTime ReminderDateTime) {
        this.ReminderDateTime = ReminderDateTime;
    }

    // IsReminderSet
    private Boolean IsReminderSet;

    @JsonProperty("IsReminderSet")
    public Boolean getIsReminderSet() {
        return this.IsReminderSet;
    }

    @JsonProperty("IsReminderSet")
    public void setIsReminderSet(Boolean IsReminderSet) {
        this.IsReminderSet = IsReminderSet;
    }

    // EndDateTime
    private org.joda.time.DateTime EndDateTime;

    @JsonProperty("EndDateTime")
    public org.joda.time.DateTime getEndDateTime() {
        return this.EndDateTime;
    }

    @JsonProperty("EndDateTime")
    public void setEndDateTime(org.joda.time.DateTime EndDateTime) {
        this.EndDateTime = EndDateTime;
    }

}
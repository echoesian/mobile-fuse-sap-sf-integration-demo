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
 * Salesforce DTO for SObject EmailServicesFunction
 */
@XStreamAlias("EmailServicesFunction")
public class EmailServicesFunction extends AbstractSObjectBase {

    // IsActive
    private Boolean IsActive;

    @JsonProperty("IsActive")
    public Boolean getIsActive() {
        return this.IsActive;
    }

    @JsonProperty("IsActive")
    public void setIsActive(Boolean IsActive) {
        this.IsActive = IsActive;
    }

    // FunctionName
    private String FunctionName;

    @JsonProperty("FunctionName")
    public String getFunctionName() {
        return this.FunctionName;
    }

    @JsonProperty("FunctionName")
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    // AuthorizedSenders
    private String AuthorizedSenders;

    @JsonProperty("AuthorizedSenders")
    public String getAuthorizedSenders() {
        return this.AuthorizedSenders;
    }

    @JsonProperty("AuthorizedSenders")
    public void setAuthorizedSenders(String AuthorizedSenders) {
        this.AuthorizedSenders = AuthorizedSenders;
    }

    // IsAuthenticationRequired
    private Boolean IsAuthenticationRequired;

    @JsonProperty("IsAuthenticationRequired")
    public Boolean getIsAuthenticationRequired() {
        return this.IsAuthenticationRequired;
    }

    @JsonProperty("IsAuthenticationRequired")
    public void setIsAuthenticationRequired(Boolean IsAuthenticationRequired) {
        this.IsAuthenticationRequired = IsAuthenticationRequired;
    }

    // IsTlsRequired
    private Boolean IsTlsRequired;

    @JsonProperty("IsTlsRequired")
    public Boolean getIsTlsRequired() {
        return this.IsTlsRequired;
    }

    @JsonProperty("IsTlsRequired")
    public void setIsTlsRequired(Boolean IsTlsRequired) {
        this.IsTlsRequired = IsTlsRequired;
    }

    // AttachmentOption
    @XStreamConverter(PicklistEnumConverter.class)
    private AttachmentOptionEnum AttachmentOption;

    @JsonProperty("AttachmentOption")
    public AttachmentOptionEnum getAttachmentOption() {
        return this.AttachmentOption;
    }

    @JsonProperty("AttachmentOption")
    public void setAttachmentOption(AttachmentOptionEnum AttachmentOption) {
        this.AttachmentOption = AttachmentOption;
    }

    // ApexClassId
    private String ApexClassId;

    @JsonProperty("ApexClassId")
    public String getApexClassId() {
        return this.ApexClassId;
    }

    @JsonProperty("ApexClassId")
    public void setApexClassId(String ApexClassId) {
        this.ApexClassId = ApexClassId;
    }

    // OverLimitAction
    @XStreamConverter(PicklistEnumConverter.class)
    private OverLimitActionEnum OverLimitAction;

    @JsonProperty("OverLimitAction")
    public OverLimitActionEnum getOverLimitAction() {
        return this.OverLimitAction;
    }

    @JsonProperty("OverLimitAction")
    public void setOverLimitAction(OverLimitActionEnum OverLimitAction) {
        this.OverLimitAction = OverLimitAction;
    }

    // FunctionInactiveAction
    @XStreamConverter(PicklistEnumConverter.class)
    private FunctionInactiveActionEnum FunctionInactiveAction;

    @JsonProperty("FunctionInactiveAction")
    public FunctionInactiveActionEnum getFunctionInactiveAction() {
        return this.FunctionInactiveAction;
    }

    @JsonProperty("FunctionInactiveAction")
    public void setFunctionInactiveAction(FunctionInactiveActionEnum FunctionInactiveAction) {
        this.FunctionInactiveAction = FunctionInactiveAction;
    }

    // AddressInactiveAction
    @XStreamConverter(PicklistEnumConverter.class)
    private AddressInactiveActionEnum AddressInactiveAction;

    @JsonProperty("AddressInactiveAction")
    public AddressInactiveActionEnum getAddressInactiveAction() {
        return this.AddressInactiveAction;
    }

    @JsonProperty("AddressInactiveAction")
    public void setAddressInactiveAction(AddressInactiveActionEnum AddressInactiveAction) {
        this.AddressInactiveAction = AddressInactiveAction;
    }

    // AuthenticationFailureAction
    @XStreamConverter(PicklistEnumConverter.class)
    private AuthenticationFailureActionEnum AuthenticationFailureAction;

    @JsonProperty("AuthenticationFailureAction")
    public AuthenticationFailureActionEnum getAuthenticationFailureAction() {
        return this.AuthenticationFailureAction;
    }

    @JsonProperty("AuthenticationFailureAction")
    public void setAuthenticationFailureAction(AuthenticationFailureActionEnum AuthenticationFailureAction) {
        this.AuthenticationFailureAction = AuthenticationFailureAction;
    }

    // AuthorizationFailureAction
    @XStreamConverter(PicklistEnumConverter.class)
    private AuthorizationFailureActionEnum AuthorizationFailureAction;

    @JsonProperty("AuthorizationFailureAction")
    public AuthorizationFailureActionEnum getAuthorizationFailureAction() {
        return this.AuthorizationFailureAction;
    }

    @JsonProperty("AuthorizationFailureAction")
    public void setAuthorizationFailureAction(AuthorizationFailureActionEnum AuthorizationFailureAction) {
        this.AuthorizationFailureAction = AuthorizationFailureAction;
    }

    // IsErrorRoutingEnabled
    private Boolean IsErrorRoutingEnabled;

    @JsonProperty("IsErrorRoutingEnabled")
    public Boolean getIsErrorRoutingEnabled() {
        return this.IsErrorRoutingEnabled;
    }

    @JsonProperty("IsErrorRoutingEnabled")
    public void setIsErrorRoutingEnabled(Boolean IsErrorRoutingEnabled) {
        this.IsErrorRoutingEnabled = IsErrorRoutingEnabled;
    }

    // ErrorRoutingAddress
    private String ErrorRoutingAddress;

    @JsonProperty("ErrorRoutingAddress")
    public String getErrorRoutingAddress() {
        return this.ErrorRoutingAddress;
    }

    @JsonProperty("ErrorRoutingAddress")
    public void setErrorRoutingAddress(String ErrorRoutingAddress) {
        this.ErrorRoutingAddress = ErrorRoutingAddress;
    }

    // IsTextAttachmentsAsBinary
    private Boolean IsTextAttachmentsAsBinary;

    @JsonProperty("IsTextAttachmentsAsBinary")
    public Boolean getIsTextAttachmentsAsBinary() {
        return this.IsTextAttachmentsAsBinary;
    }

    @JsonProperty("IsTextAttachmentsAsBinary")
    public void setIsTextAttachmentsAsBinary(Boolean IsTextAttachmentsAsBinary) {
        this.IsTextAttachmentsAsBinary = IsTextAttachmentsAsBinary;
    }

}
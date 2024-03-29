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
 * Salesforce DTO for SObject Name
 */
@XStreamAlias("Name")
public class Name extends AbstractSObjectBase {

    // LastName
    private String LastName;

    @JsonProperty("LastName")
    public String getLastName() {
        return this.LastName;
    }

    @JsonProperty("LastName")
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    // FirstName
    private String FirstName;

    @JsonProperty("FirstName")
    public String getFirstName() {
        return this.FirstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    // Type
    @XStreamConverter(PicklistEnumConverter.class)
    private TypeEnum Type;

    @JsonProperty("Type")
    public TypeEnum getType() {
        return this.Type;
    }

    @JsonProperty("Type")
    public void setType(TypeEnum Type) {
        this.Type = Type;
    }

    // Alias
    private String Alias;

    @JsonProperty("Alias")
    public String getAlias() {
        return this.Alias;
    }

    @JsonProperty("Alias")
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    // UserRoleId
    private String UserRoleId;

    @JsonProperty("UserRoleId")
    public String getUserRoleId() {
        return this.UserRoleId;
    }

    @JsonProperty("UserRoleId")
    public void setUserRoleId(String UserRoleId) {
        this.UserRoleId = UserRoleId;
    }

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

    // ProfileId
    private String ProfileId;

    @JsonProperty("ProfileId")
    public String getProfileId() {
        return this.ProfileId;
    }

    @JsonProperty("ProfileId")
    public void setProfileId(String ProfileId) {
        this.ProfileId = ProfileId;
    }

    // Title
    private String Title;

    @JsonProperty("Title")
    public String getTitle() {
        return this.Title;
    }

    @JsonProperty("Title")
    public void setTitle(String Title) {
        this.Title = Title;
    }

    // Email
    private String Email;

    @JsonProperty("Email")
    public String getEmail() {
        return this.Email;
    }

    @JsonProperty("Email")
    public void setEmail(String Email) {
        this.Email = Email;
    }

    // Phone
    private String Phone;

    @JsonProperty("Phone")
    public String getPhone() {
        return this.Phone;
    }

    @JsonProperty("Phone")
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    // Username
    private String Username;

    @JsonProperty("Username")
    public String getUsername() {
        return this.Username;
    }

    @JsonProperty("Username")
    public void setUsername(String Username) {
        this.Username = Username;
    }

}
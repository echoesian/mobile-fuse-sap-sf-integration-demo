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
 * Salesforce DTO for SObject CustomConsoleComponent
 */
@XStreamAlias("CustomConsoleComponent")
public class CustomConsoleComponent extends AbstractSObjectBase {

    // DeveloperName
    private String DeveloperName;

    @JsonProperty("DeveloperName")
    public String getDeveloperName() {
        return this.DeveloperName;
    }

    @JsonProperty("DeveloperName")
    public void setDeveloperName(String DeveloperName) {
        this.DeveloperName = DeveloperName;
    }

    // Language
    @XStreamConverter(PicklistEnumConverter.class)
    private LanguageEnum Language;

    @JsonProperty("Language")
    public LanguageEnum getLanguage() {
        return this.Language;
    }

    @JsonProperty("Language")
    public void setLanguage(LanguageEnum Language) {
        this.Language = Language;
    }

    // MasterLabel
    private String MasterLabel;

    @JsonProperty("MasterLabel")
    public String getMasterLabel() {
        return this.MasterLabel;
    }

    @JsonProperty("MasterLabel")
    public void setMasterLabel(String MasterLabel) {
        this.MasterLabel = MasterLabel;
    }

    // NamespacePrefix
    private String NamespacePrefix;

    @JsonProperty("NamespacePrefix")
    public String getNamespacePrefix() {
        return this.NamespacePrefix;
    }

    @JsonProperty("NamespacePrefix")
    public void setNamespacePrefix(String NamespacePrefix) {
        this.NamespacePrefix = NamespacePrefix;
    }

    // ButtonText
    private String ButtonText;

    @JsonProperty("ButtonText")
    public String getButtonText() {
        return this.ButtonText;
    }

    @JsonProperty("ButtonText")
    public void setButtonText(String ButtonText) {
        this.ButtonText = ButtonText;
    }

    // ButtonStyle
    private String ButtonStyle;

    @JsonProperty("ButtonStyle")
    public String getButtonStyle() {
        return this.ButtonStyle;
    }

    @JsonProperty("ButtonStyle")
    public void setButtonStyle(String ButtonStyle) {
        this.ButtonStyle = ButtonStyle;
    }

    // ButtonIconUrl
    private String ButtonIconUrl;

    @JsonProperty("ButtonIconUrl")
    public String getButtonIconUrl() {
        return this.ButtonIconUrl;
    }

    @JsonProperty("ButtonIconUrl")
    public void setButtonIconUrl(String ButtonIconUrl) {
        this.ButtonIconUrl = ButtonIconUrl;
    }

    // ButtonWidth
    private Integer ButtonWidth;

    @JsonProperty("ButtonWidth")
    public Integer getButtonWidth() {
        return this.ButtonWidth;
    }

    @JsonProperty("ButtonWidth")
    public void setButtonWidth(Integer ButtonWidth) {
        this.ButtonWidth = ButtonWidth;
    }

    // AbsoluteWidth
    private Integer AbsoluteWidth;

    @JsonProperty("AbsoluteWidth")
    public Integer getAbsoluteWidth() {
        return this.AbsoluteWidth;
    }

    @JsonProperty("AbsoluteWidth")
    public void setAbsoluteWidth(Integer AbsoluteWidth) {
        this.AbsoluteWidth = AbsoluteWidth;
    }

    // RelativeWidth
    private Double RelativeWidth;

    @JsonProperty("RelativeWidth")
    public Double getRelativeWidth() {
        return this.RelativeWidth;
    }

    @JsonProperty("RelativeWidth")
    public void setRelativeWidth(Double RelativeWidth) {
        this.RelativeWidth = RelativeWidth;
    }

    // AbsoluteHeight
    private Integer AbsoluteHeight;

    @JsonProperty("AbsoluteHeight")
    public Integer getAbsoluteHeight() {
        return this.AbsoluteHeight;
    }

    @JsonProperty("AbsoluteHeight")
    public void setAbsoluteHeight(Integer AbsoluteHeight) {
        this.AbsoluteHeight = AbsoluteHeight;
    }

    // RelativeHeight
    private Double RelativeHeight;

    @JsonProperty("RelativeHeight")
    public Double getRelativeHeight() {
        return this.RelativeHeight;
    }

    @JsonProperty("RelativeHeight")
    public void setRelativeHeight(Double RelativeHeight) {
        this.RelativeHeight = RelativeHeight;
    }

    // IsWidthFixed
    private Boolean IsWidthFixed;

    @JsonProperty("IsWidthFixed")
    public Boolean getIsWidthFixed() {
        return this.IsWidthFixed;
    }

    @JsonProperty("IsWidthFixed")
    public void setIsWidthFixed(Boolean IsWidthFixed) {
        this.IsWidthFixed = IsWidthFixed;
    }

    // IsHeightFixed
    private Boolean IsHeightFixed;

    @JsonProperty("IsHeightFixed")
    public Boolean getIsHeightFixed() {
        return this.IsHeightFixed;
    }

    @JsonProperty("IsHeightFixed")
    public void setIsHeightFixed(Boolean IsHeightFixed) {
        this.IsHeightFixed = IsHeightFixed;
    }

    // IsHidden
    private Boolean IsHidden;

    @JsonProperty("IsHidden")
    public Boolean getIsHidden() {
        return this.IsHidden;
    }

    @JsonProperty("IsHidden")
    public void setIsHidden(Boolean IsHidden) {
        this.IsHidden = IsHidden;
    }

    // IsPopoutDisabled
    private Boolean IsPopoutDisabled;

    @JsonProperty("IsPopoutDisabled")
    public Boolean getIsPopoutDisabled() {
        return this.IsPopoutDisabled;
    }

    @JsonProperty("IsPopoutDisabled")
    public void setIsPopoutDisabled(Boolean IsPopoutDisabled) {
        this.IsPopoutDisabled = IsPopoutDisabled;
    }

    // VisualforcePageId
    private String VisualforcePageId;

    @JsonProperty("VisualforcePageId")
    public String getVisualforcePageId() {
        return this.VisualforcePageId;
    }

    @JsonProperty("VisualforcePageId")
    public void setVisualforcePageId(String VisualforcePageId) {
        this.VisualforcePageId = VisualforcePageId;
    }

}
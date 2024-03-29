/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Apr 29 23:34:58 EDT 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.codehaus.jackson.annotate.JsonProperty;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

/**
 * Salesforce DTO for SObject ChatterActivity
 */
@XStreamAlias("ChatterActivity")
public class ChatterActivity extends AbstractSObjectBase {

    // ParentId
    private String ParentId;

    @JsonProperty("ParentId")
    public String getParentId() {
        return this.ParentId;
    }

    @JsonProperty("ParentId")
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    // PostCount
    private Integer PostCount;

    @JsonProperty("PostCount")
    public Integer getPostCount() {
        return this.PostCount;
    }

    @JsonProperty("PostCount")
    public void setPostCount(Integer PostCount) {
        this.PostCount = PostCount;
    }

    // CommentCount
    private Integer CommentCount;

    @JsonProperty("CommentCount")
    public Integer getCommentCount() {
        return this.CommentCount;
    }

    @JsonProperty("CommentCount")
    public void setCommentCount(Integer CommentCount) {
        this.CommentCount = CommentCount;
    }

    // CommentReceivedCount
    private Integer CommentReceivedCount;

    @JsonProperty("CommentReceivedCount")
    public Integer getCommentReceivedCount() {
        return this.CommentReceivedCount;
    }

    @JsonProperty("CommentReceivedCount")
    public void setCommentReceivedCount(Integer CommentReceivedCount) {
        this.CommentReceivedCount = CommentReceivedCount;
    }

    // LikeReceivedCount
    private Integer LikeReceivedCount;

    @JsonProperty("LikeReceivedCount")
    public Integer getLikeReceivedCount() {
        return this.LikeReceivedCount;
    }

    @JsonProperty("LikeReceivedCount")
    public void setLikeReceivedCount(Integer LikeReceivedCount) {
        this.LikeReceivedCount = LikeReceivedCount;
    }

    // InfluenceRawRank
    private Integer InfluenceRawRank;

    @JsonProperty("InfluenceRawRank")
    public Integer getInfluenceRawRank() {
        return this.InfluenceRawRank;
    }

    @JsonProperty("InfluenceRawRank")
    public void setInfluenceRawRank(Integer InfluenceRawRank) {
        this.InfluenceRawRank = InfluenceRawRank;
    }

}
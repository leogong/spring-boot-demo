package com.leo.dataobject;

/**
 * TagDO Created by leo on 10/20/15.
 */
public class TagDO {

    private Long    oId;
    private Integer tagPublishedRefCount;
    private Integer tagReferenceCount;
    private String  tagTitle;

    public Long getoId() {
        return oId;
    }

    public void setoId(Long oId) {
        this.oId = oId;
    }

    public Integer getTagPublishedRefCount() {
        return tagPublishedRefCount;
    }

    public void setTagPublishedRefCount(Integer tagPublishedRefCount) {
        this.tagPublishedRefCount = tagPublishedRefCount;
    }

    public Integer getTagReferenceCount() {
        return tagReferenceCount;
    }

    public void setTagReferenceCount(Integer tagReferenceCount) {
        this.tagReferenceCount = tagReferenceCount;
    }

    public String getTagTitle() {
        return tagTitle;
    }

    public void setTagTitle(String tagTitle) {
        this.tagTitle = tagTitle;
    }
}

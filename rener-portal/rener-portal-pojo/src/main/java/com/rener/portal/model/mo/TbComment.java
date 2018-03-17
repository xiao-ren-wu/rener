package com.rener.portal.model.mo;

import java.util.Date;

public class TbComment {
    private Long commentId;

    private Long userId;

    private Long goodsId;

    private Long storeId;

    private Integer praiseLevel;

    private Date uploadTime;

    private String uploadPlace;

    private String photo;

    private Date createTime;

    private Date updateTime;

    private Integer anonymityTag;

    private String commentInfo;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Integer getPraiseLevel() {
        return praiseLevel;
    }

    public void setPraiseLevel(Integer praiseLevel) {
        this.praiseLevel = praiseLevel;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getUploadPlace() {
        return uploadPlace;
    }

    public void setUploadPlace(String uploadPlace) {
        this.uploadPlace = uploadPlace == null ? null : uploadPlace.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getAnonymityTag() {
        return anonymityTag;
    }

    public void setAnonymityTag(Integer anonymityTag) {
        this.anonymityTag = anonymityTag;
    }

    public String getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(String commentInfo) {
        this.commentInfo = commentInfo == null ? null : commentInfo.trim();
    }
}
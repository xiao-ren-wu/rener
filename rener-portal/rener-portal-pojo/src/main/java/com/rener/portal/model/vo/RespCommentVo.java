package com.rener.portal.model.vo;

import java.sql.Date;
import java.util.List;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/29
 * @Time:11:47
 * @JDK versions: 1.8.0_101
 */
public class RespCommentVo {
    private Long commentId;

    private Long userId;

    private Long goodsId;

    private Long storeId;

    private Byte praiseLevel;

    private Date uploadTime;

    private String uploadPlace;

    private List<String> photoList;

    private Date createTime;

    private Date updateTime;

    private Byte anonymityTag;

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

    public Byte getPraiseLevel() {
        return praiseLevel;
    }

    public void setPraiseLevel(Byte praiseLevel) {
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
        this.uploadPlace = uploadPlace;
    }

    public List<String> getPhotoList() {
        return photoList;
    }

    public void setPhotoList(List<String> photoList) {
        this.photoList = photoList;
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

    public Byte getAnonymityTag() {
        return anonymityTag;
    }

    public void setAnonymityTag(Byte anonymityTag) {
        this.anonymityTag = anonymityTag;
    }

    public String getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(String commentInfo) {
        this.commentInfo = commentInfo;
    }
}

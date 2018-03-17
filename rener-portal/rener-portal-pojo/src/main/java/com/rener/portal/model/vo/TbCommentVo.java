package com.rener.portal.model.vo;

import java.sql.Date;

/**
 * Created with IDEA
 * author:Dick_YangDi
 * Date:2018/1/24
 * Time:19:05
 * JDK versions: 1.8.0_101
 */
public class TbCommentVo {

    private Long commentId;

    private Long userId;

    private Long goodsId;

    private Long storeId;

    private Byte praiseLevel;

    private Date uploadTime;

    private String uploadPlace;

    private PhotoList photo;

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

    public PhotoList getPhoto() {
        return photo;
    }

    public void setPhoto(PhotoList photo) {
        this.photo = photo;
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

    @Override
    public String toString() {
        return "TbCommentVo{" +
                "commentId=" + commentId +
                ", userId=" + userId +
                ", goodsId=" + goodsId +
                ", storeId=" + storeId +
                ", praiseLevel=" + praiseLevel +
                ", uploadTime=" + uploadTime +
                ", uploadPlace='" + uploadPlace + '\'' +
                ", photo=" + photo +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", anonymityTag=" + anonymityTag +
                ", commentInfo='" + commentInfo + '\'' +
                '}';
    }
}
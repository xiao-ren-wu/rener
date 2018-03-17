package com.rener.portal.model.vo;

import java.sql.Date;

/**
 * @author lidan@meng_zhu
 * @date 2018/2/4 0004 17:28
 */
public class TbCommentsVo {

    private Integer praiseLevel;

    private String userNickname;

    private String userPhoto;

    private Date uploadTime;

    private String photo;

    private String commentInfo;

    private String storeName;

    private String storeIcon;

    private String goodsName;

    public String getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(String commentInfo) {
        this.commentInfo = commentInfo;
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


    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreIcon() {
        return storeIcon;
    }

    public void setStoreIcon(String storeIcon) {
        this.storeIcon = storeIcon;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }
}

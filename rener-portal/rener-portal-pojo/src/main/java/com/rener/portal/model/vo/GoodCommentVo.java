package com.rener.portal.model.vo;

import java.sql.Date;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/2/5
 * @Time:10:30
 * @JDK versions: 1.8.0_101
 */
public class GoodCommentVo {
//    SELECT u.user_id,u.user_nickname,u.user_photo,
//    c.comment_id,c.anonymity_tag,c.comment_info,c.create_time,c.praise_level,c.photo,
//    c.goods_id,c.store_id,c.upload_place
//    FROM tb_comment c,tb_users u WHERE c.user_id=u.user_id

    private Long userId;
    private String userNickname;
    private String userPhoto;
    private Long commentId;
    private Integer anonymityTag;
    private String commentInfo;
    private Date createTime;
    private Byte praiseLevel;
    private PhotoList photo;
    private Long goodsId;
    private Long storeId;
    private String uploadPlace;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
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
        this.commentInfo = commentInfo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getPraiseLevel() {
        return praiseLevel;
    }

    public void setPraiseLevel(Byte praiseLevel) {
        this.praiseLevel = praiseLevel;
    }

    public PhotoList getPhoto() {
        return photo;
    }

    public void setPhoto(PhotoList photo) {
        this.photo = photo;
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

    public String getUploadPlace() {
        return uploadPlace;
    }

    public void setUploadPlace(String uploadPlace) {
        this.uploadPlace = uploadPlace;
    }


}

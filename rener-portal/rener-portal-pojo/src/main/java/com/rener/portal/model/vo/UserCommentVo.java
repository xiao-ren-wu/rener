package com.rener.portal.model.vo;

import java.sql.Date;
import java.util.List;

public class UserCommentVo {

    private String userNickname;
    private String userPhoto;
    private Integer praiseLevel;
    private String commentInfo;
    private String createTime;
    private String photo;
    private List<String> pic;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
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

    public Integer getPraiseLevel() {
        return praiseLevel;
    }

    public void setPraiseLevel(Integer praiseLevel) {
        this.praiseLevel = praiseLevel;
    }

    public String getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(String commentInfo) {
        this.commentInfo = commentInfo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<String> getPic() {
        return pic;
    }

    public void setPic(List<String> pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return "UserCommentVo{" +
                "userNickname='" + userNickname + '\'' +
                ", userPhoto='" + userPhoto + '\'' +
                ", praiseLevel=" + praiseLevel +
                ", commentInfo='" + commentInfo + '\'' +
                ", createTime='" + createTime + '\'' +
                ", photo='" + photo+ '\'' +
                ", pic=" + pic +
                '}';
    }
}

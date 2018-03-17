package com.rener.portal.model.vo;

/**
 * Created with IDEA
 * author:Dick_YangDi
 * Date:2018/1/23
 * Time:23:32
 * JDK versions: 1.8.0_101
 */
public class TbFriendshipVo {
    private Long userId;
    private String userNickname;
    private String userPhoto;
    private Byte userOnlineState;

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

    public Byte getUserOnlinestate() {
        return userOnlineState;
    }

    public void setUserOnlinestate(Byte userOnlinestate) {
        this.userOnlineState = userOnlinestate;
    }

    @Override
    public String toString() {
        return "TbFriendshipVo{" +
                "userId=" + userId +
                ", userNickname='" + userNickname + '\'' +
                ", userPhoto='" + userPhoto + '\'' +
                ", userOnlineState=" + userOnlineState +
                '}';
    }
}

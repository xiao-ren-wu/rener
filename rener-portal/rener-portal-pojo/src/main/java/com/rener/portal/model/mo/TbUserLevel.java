package com.rener.portal.model.mo;

import java.util.Date;

public class TbUserLevel {
    private Integer userLevelId;

    private String userLevelName;

    private String userLevelPhoto;

    private Integer userLevelIntegralup;

    private Integer userLevelIntegraldown;

    private Date createTime;

    private Date updateTime;

    public Integer getUserLevelId() {
        return userLevelId;
    }

    public void setUserLevelId(Integer userLevelId) {
        this.userLevelId = userLevelId;
    }

    public String getUserLevelName() {
        return userLevelName;
    }

    public void setUserLevelName(String userLevelName) {
        this.userLevelName = userLevelName == null ? null : userLevelName.trim();
    }

    public String getUserLevelPhoto() {
        return userLevelPhoto;
    }

    public void setUserLevelPhoto(String userLevelPhoto) {
        this.userLevelPhoto = userLevelPhoto == null ? null : userLevelPhoto.trim();
    }

    public Integer getUserLevelIntegralup() {
        return userLevelIntegralup;
    }

    public void setUserLevelIntegralup(Integer userLevelIntegralup) {
        this.userLevelIntegralup = userLevelIntegralup;
    }

    public Integer getUserLevelIntegraldown() {
        return userLevelIntegraldown;
    }

    public void setUserLevelIntegraldown(Integer userLevelIntegraldown) {
        this.userLevelIntegraldown = userLevelIntegraldown;
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
}
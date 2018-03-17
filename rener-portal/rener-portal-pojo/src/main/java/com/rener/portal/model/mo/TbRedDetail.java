package com.rener.portal.model.mo;

import java.util.Date;

public class TbRedDetail {
    private Long redDetailId;

    private Long userId;

    private Long redPacketId;

    private Date getTime;

    private Date endTime;

    private Integer userMode;

    private Date createTime;

    private Date updateTime;

    public Long getRedDetailId() {
        return redDetailId;
    }

    public void setRedDetailId(Long redDetailId) {
        this.redDetailId = redDetailId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRedPacketId() {
        return redPacketId;
    }

    public void setRedPacketId(Long redPacketId) {
        this.redPacketId = redPacketId;
    }

    public Date getGetTime() {
        return getTime;
    }

    public void setGetTime(Date getTime) {
        this.getTime = getTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getUserMode() {
        return userMode;
    }

    public void setUserMode(Integer userMode) {
        this.userMode = userMode;
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
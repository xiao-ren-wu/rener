package com.rener.portal.model.mo;

import java.util.Date;

public class TbFriendship {
    private Long friendshipId;

    private Long userId;

    private Long firendId;

    private Date createTime;

    private Date updateTime;

    public Long getFriendshipId() {
        return friendshipId;
    }

    public void setFriendshipId(Long friendshipId) {
        this.friendshipId = friendshipId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getFirendId() {
        return firendId;
    }

    public void setFirendId(Long firendId) {
        this.firendId = firendId;
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
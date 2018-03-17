package com.rener.portal.model.mo;

import java.util.Date;

public class TbColle {
    private Long colleId;

    private Long colleStoreId;

    private Long colleUserId;

    private Date colleDate;

    private Integer colleState;

    private Date createTime;

    private Date updateTime;

    public Long getColleId() {
        return colleId;
    }

    public void setColleId(Long colleId) {
        this.colleId = colleId;
    }

    public Long getColleStoreId() {
        return colleStoreId;
    }

    public void setColleStoreId(Long colleStoreId) {
        this.colleStoreId = colleStoreId;
    }

    public Long getColleUserId() {
        return colleUserId;
    }

    public void setColleUserId(Long colleUserId) {
        this.colleUserId = colleUserId;
    }

    public Date getColleDate() {
        return colleDate;
    }

    public void setColleDate(Date colleDate) {
        this.colleDate = colleDate;
    }

    public Integer getColleState() {
        return colleState;
    }

    public void setColleState(Integer colleState) {
        this.colleState = colleState;
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
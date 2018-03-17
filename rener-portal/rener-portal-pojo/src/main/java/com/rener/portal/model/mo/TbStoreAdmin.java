package com.rener.portal.model.mo;

import java.util.Date;

public class TbStoreAdmin {
    private Long storeAdminId;

    private Long storeId;

    private Long adminId;

    private Date createTime;

    private Date updateTime;

    public Long getStoreAdminId() {
        return storeAdminId;
    }

    public void setStoreAdminId(Long storeAdminId) {
        this.storeAdminId = storeAdminId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
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
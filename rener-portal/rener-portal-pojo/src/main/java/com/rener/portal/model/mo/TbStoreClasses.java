package com.rener.portal.model.mo;

import java.util.Date;

public class TbStoreClasses {
    private Integer storeClassesId;

    private String storeClassesName;

    private Date createTime;

    private Date updateTime;

    public Integer getStoreClassesId() {
        return storeClassesId;
    }

    public void setStoreClassesId(Integer storeClassesId) {
        this.storeClassesId = storeClassesId;
    }

    public String getStoreClassesName() {
        return storeClassesName;
    }

    public void setStoreClassesName(String storeClassesName) {
        this.storeClassesName = storeClassesName == null ? null : storeClassesName.trim();
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
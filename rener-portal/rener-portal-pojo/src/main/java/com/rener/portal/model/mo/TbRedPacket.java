package com.rener.portal.model.mo;

import java.util.Date;

public class TbRedPacket {
    private Long redClassesId;

    private Long storeId;

    private Integer redFacevalue;

    private Integer redAgeing;

    private Integer redAddprop;

    private Date createTime;

    private Date updateTime;

    public Long getRedClassesId() {
        return redClassesId;
    }

    public void setRedClassesId(Long redClassesId) {
        this.redClassesId = redClassesId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Integer getRedFacevalue() {
        return redFacevalue;
    }

    public void setRedFacevalue(Integer redFacevalue) {
        this.redFacevalue = redFacevalue;
    }

    public Integer getRedAgeing() {
        return redAgeing;
    }

    public void setRedAgeing(Integer redAgeing) {
        this.redAgeing = redAgeing;
    }

    public Integer getRedAddprop() {
        return redAddprop;
    }

    public void setRedAddprop(Integer redAddprop) {
        this.redAddprop = redAddprop;
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
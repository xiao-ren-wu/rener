package com.rener.portal.model.mo;

import java.math.BigDecimal;
import java.util.Date;

public class TbIntegralStore {
    private Long integralStoreId;

    private String integralStoreName;

    private String integralStorePhoto;

    private Integer integralCost;

    private BigDecimal price;

    private Date createTime;

    private Date updateTime;

    public Long getIntegralStoreId() {
        return integralStoreId;
    }

    public void setIntegralStoreId(Long integralStoreId) {
        this.integralStoreId = integralStoreId;
    }

    public String getIntegralStoreName() {
        return integralStoreName;
    }

    public void setIntegralStoreName(String integralStoreName) {
        this.integralStoreName = integralStoreName == null ? null : integralStoreName.trim();
    }

    public String getIntegralStorePhoto() {
        return integralStorePhoto;
    }

    public void setIntegralStorePhoto(String integralStorePhoto) {
        this.integralStorePhoto = integralStorePhoto == null ? null : integralStorePhoto.trim();
    }

    public Integer getIntegralCost() {
        return integralCost;
    }

    public void setIntegralCost(Integer integralCost) {
        this.integralCost = integralCost;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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
package com.rener.portal.model.mo;

import java.util.Date;

public class TbDiscount {
    private Long discountId;

    private Double discountRate;

    private Date createTime;

    private Date updateTime;

    private String priceDiscripe;

    public Long getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
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

    public String getPriceDiscripe() {
        return priceDiscripe;
    }

    public void setPriceDiscripe(String priceDiscripe) {
        this.priceDiscripe = priceDiscripe;
    }
}


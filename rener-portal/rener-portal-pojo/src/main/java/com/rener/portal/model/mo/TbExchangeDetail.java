package com.rener.portal.model.mo;

import java.math.BigDecimal;
import java.util.Date;

public class TbExchangeDetail {
    private Long exchangeDetailId;

    private Long exchangeIntegralId;

    private Integer exchangeCount;

    private BigDecimal exchangePrice;

    private Integer costIntegral;

    private Integer mark;

    private Date createTime;

    private Date updateTime;

    public Long getExchangeDetailId() {
        return exchangeDetailId;
    }

    public void setExchangeDetailId(Long exchangeDetailId) {
        this.exchangeDetailId = exchangeDetailId;
    }

    public Long getExchangeIntegralId() {
        return exchangeIntegralId;
    }

    public void setExchangeIntegralId(Long exchangeIntegralId) {
        this.exchangeIntegralId = exchangeIntegralId;
    }

    public Integer getExchangeCount() {
        return exchangeCount;
    }

    public void setExchangeCount(Integer exchangeCount) {
        this.exchangeCount = exchangeCount;
    }

    public BigDecimal getExchangePrice() {
        return exchangePrice;
    }

    public void setExchangePrice(BigDecimal exchangePrice) {
        this.exchangePrice = exchangePrice;
    }

    public Integer getCostIntegral() {
        return costIntegral;
    }

    public void setCostIntegral(Integer costIntegral) {
        this.costIntegral = costIntegral;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
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
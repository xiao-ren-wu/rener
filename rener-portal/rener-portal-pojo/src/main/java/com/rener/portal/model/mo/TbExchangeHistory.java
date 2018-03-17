package com.rener.portal.model.mo;

import java.math.BigDecimal;
import java.util.Date;

public class TbExchangeHistory {
    private Long exchangeId;

    private Long userId;

    private BigDecimal exchangeTotalPrice;

    private Integer costTotalGradeIntegral;

    private Integer mark;

    private Date createTime;

    private Date updateTime;

    public Long getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(Long exchangeId) {
        this.exchangeId = exchangeId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getExchangeTotalPrice() {
        return exchangeTotalPrice;
    }

    public void setExchangeTotalPrice(BigDecimal exchangeTotalPrice) {
        this.exchangeTotalPrice = exchangeTotalPrice;
    }

    public Integer getCostTotalGradeIntegral() {
        return costTotalGradeIntegral;
    }

    public void setCostTotalGradeIntegral(Integer costTotalGradeIntegral) {
        this.costTotalGradeIntegral = costTotalGradeIntegral;
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
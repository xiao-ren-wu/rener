package com.rener.portal.model.mo;

import java.math.BigDecimal;
import java.util.Date;

public class TbOrderDetailses {
    private Long orderdetailsId;

    private Long orderId;

    private Long goodsId;

    private Integer goodsNumber;

    private BigDecimal goodsTotalprice;

    private Integer mark;

    private Date createTime;

    private Date updateTime;

    public Long getOrderdetailsId() {
        return orderdetailsId;
    }

    public void setOrderdetailsId(Long orderdetailsId) {
        this.orderdetailsId = orderdetailsId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public BigDecimal getGoodsTotalprice() {
        return goodsTotalprice;
    }

    public void setGoodsTotalprice(BigDecimal goodsTotalprice) {
        this.goodsTotalprice = goodsTotalprice;
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
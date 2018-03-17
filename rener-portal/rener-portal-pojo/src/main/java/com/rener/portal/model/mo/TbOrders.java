package com.rener.portal.model.mo;

import java.math.BigDecimal;
import java.util.Date;

public class TbOrders {
    private Long orderId;

    private Long userId;

    private Integer orderState;

    private Date orderCreatedate;

    private BigDecimal orderTotalprice;

    private Date orderOutdata;

    private Integer mark;

    private Date createTime;

    private Date updateTime;

    private Date payTime;

    private Date sendTime;

    private Date recieveTime;

    private String orderNum;

    private Long storeId;

    private String orderDescribe;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Date getOrderCreatedate() {
        return orderCreatedate;
    }

    public void setOrderCreatedate(Date orderCreatedate) {
        this.orderCreatedate = orderCreatedate;
    }

    public BigDecimal getOrderTotalprice() {
        return orderTotalprice;
    }

    public void setOrderTotalprice(BigDecimal orderTotalprice) {
        this.orderTotalprice = orderTotalprice;
    }

    public Date getOrderOutdata() {
        return orderOutdata;
    }

    public void setOrderOutdata(Date orderOutdata) {
        this.orderOutdata = orderOutdata;
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

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getRecieveTime() {
        return recieveTime;
    }

    public void setRecieveTime(Date recieveTime) {
        this.recieveTime = recieveTime;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreDescribe() {
        return orderDescribe;
    }

    public void setStoreDescribe(String orderDescribe) {
        this.orderDescribe = orderDescribe == null ? null : orderDescribe.trim();
    }
}
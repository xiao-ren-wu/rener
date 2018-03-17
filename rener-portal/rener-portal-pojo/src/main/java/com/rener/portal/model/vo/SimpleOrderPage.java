package com.rener.portal.model.vo;

import com.rener.portal.model.mo.TbStores;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * @Created with IDEA
 * @author:GaoPan
 * @Date:2018/1/27
 * @Time:23:28
 * @JDK versions: 1.8.0_101
 */
public class SimpleOrderPage implements Serializable {
    /**
     * 商铺信息
     */
    private TbStores tbStores;
    /**
     * 订单ID
     */
    private Long orderId;
    /**
     * 支付时间
     */
    private Date payTime;
    /**
     * 订单状态
     */
    private BigDecimal orderTotalprice;


    public BigDecimal getOrderTotalprice() {
        return orderTotalprice;
    }

    public void setOrderTotalprice(BigDecimal orderTotalprice) {
        this.orderTotalprice = orderTotalprice;
    }

    private Integer orderState;

    private String  stateMessage;

    public String getStateMessage() {
        return stateMessage;
    }

    public void setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
    }

    public TbStores getTbStores() {
        return tbStores;
    }

    public void setTbStores(TbStores tbStores) {
        this.tbStores = tbStores;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }
}

package com.rener.portal.model.vo;

import com.rener.portal.model.mo.TbStores;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

/**
 * @Created with IDEA
 * @author:GaoPan
 * @Date:2018/1/25
 * @Time:14:59
 * @JDK versions: 1.8.0_101
 */
public class OrderPage implements Serializable {
    /**
     * 店铺信息
     */
    private TbStores tbStores;
    /**
     * 订单状态
     */
    private Integer orderState;
    /**
     * 订单原价
     */
    private String orderTotalprice;

    public String getOrderNowprice() {
        return orderNowprice;
    }

    public void setOrderNowprice(String orderNowprice) {
        this.orderNowprice = orderNowprice;
    }

    public String getOrderDescribe() {
        return orderDescribe;
    }

    public void setOrderDescribe(String orderDescribe) {
        this.orderDescribe = orderDescribe;
    }

    /**
     * 订单现价
     */

    private String orderNowprice;
    /**
     * 订单编号
     */
    private String orderNum;

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 订单Id
     */
    private Long orderId;
    /**
     * 订单详情
     */
    private List<OrderPageDetail> orderPageDetails;
    /**
     * 用户昵称
     */
    private String userNickname;
    /**
     * 配送费
     */
    private String delieverCost;
    /**
     * 商品原价
     */
    private String goodsTotalprice;
    /**
     * 商品现价
     */
    private String nowPrice;
    /**
     * 订单描述
     */
    private String orderDescribe;
    /**
     * 支付时间
     */
    private Date payTime;
    /**
     * 提交时间
     */
    private Date createTime;

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getCreate_time() {
        return createTime;
    }

    public void setCreate_time(Date createTime) {
        this.createTime = createTime;
    }

    public String getStoreDescribe() {
        return orderDescribe;
    }

    public void setStoreDescribe(String orderDescribe) {
        this.orderDescribe = orderDescribe;
    }

    public String getGoodsTotalprice() {
        return goodsTotalprice;
    }

    public void setGoodsTotalprice(String goodsTotalprice) {
        this.goodsTotalprice = goodsTotalprice;
    }

    public String getNowPrice() {
        return nowPrice;
    }

    public void setNowPrice(String nowPrice) {
        this.nowPrice = nowPrice;
    }

    public String getDelieverCost() {
        return delieverCost;
    }

    public void setDelieverCost(String delieverCost) {
        this.delieverCost = delieverCost;
    }

    public TbStores getTbStores() {

        return tbStores;
    }

    public void setTbStores(TbStores tbStores) {
        this.tbStores = tbStores;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public String getOrderTotalprice() {
        return orderTotalprice;
    }

    public void setOrderTotalprice(String orderTotalprice) {
        this.orderTotalprice = orderTotalprice;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public List<OrderPageDetail> getOrderPageDetails() {
        return orderPageDetails;
    }

    public void setOrderPageDetails(List<OrderPageDetail> orderPageDetails) {
        this.orderPageDetails = orderPageDetails;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }
}
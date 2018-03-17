package com.rener.portal.model.vo;

import java.sql.Date;
import java.util.List;

/**
 * @author lenovo
 */
public class ResultOrdersDetails {
    /**
     * 订单详情
     */
    private List<OrdereDetails> ordereItems;
    /**
     * 订单ID
     */
    private Long orderId;
    /**
     * 支付时间
     */
    private Date payTime;
    /**
     * 发货时间
     */
    private Date sendTime;
    /**
     * 收货时间
     */
    private Date recieveTime;

    @Override
    public String toString() {
        return "ResultOrdersDetails{" +
                "ordereItems=" + ordereItems +
                ", orderId=" + orderId +
                ", payTime=" + payTime +
                ", sendTime=" + sendTime +
                ", recieveTime=" + recieveTime +
                ", storePic='" + storePic + '\'' +
                ", storeId=" + storeId +
                ", storeName='" + storeName + '\'' +
                '}';
    }

    /**
     * 商铺图片
     */
    private String storePic;
    /**
     * 店铺ID
     */
    private Long storeId;
    /**
     * 店铺名称
     */
    private String storeName;

    public List<OrdereDetails> getOrdereItems() {
        return ordereItems;
    }

    public void setOrdereItems(List<OrdereDetails> ordereItems) {
        this.ordereItems = ordereItems;
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

    public String getStorePic() {
        return storePic;
    }

    public void setStorePic(String storePic) {
        this.storePic = storePic;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}

package com.rener.portal.model.mo;

import java.util.Date;

public class TbAddress {
    private Long addressId;

    private Long userId;

    private String consignee;

    private String consigneeTel;

    private String consigneeAddress;

    private Integer defaultAddress;

    private Date createTime;

    private Date updateTime;

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getConsigneeTel() {
        return consigneeTel;
    }

    public void setConsigneeTel(String consigneeTel) {
        this.consigneeTel = consigneeTel == null ? null : consigneeTel.trim();
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress == null ? null : consigneeAddress.trim();
    }

    public Integer getDefaultAddress() {
        return defaultAddress;
    }

    public void setDefaultAddress(Integer defaultAddress) {
        this.defaultAddress = defaultAddress;
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

    @Override
    public String toString() {
        return "TbAddress{" +
                "addressId=" + addressId +
                ", userId=" + userId +
                ", consignee='" + consignee + '\'' +
                ", consigneeTel='" + consigneeTel + '\'' +
                ", consigneeAddress='" + consigneeAddress + '\'' +
                ", defaultAddress=" + defaultAddress +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
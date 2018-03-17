package com.rener.portal.model.vo;

/**
 * @Created with IDEA
 * @author:Yuwenbo
 * @Date:2018/2/2
 * @Time:18:05
 * @JDK versions: 1.8.0_101
 */
public class UserAddressVo {
    private Long userId;

    private Long addressId;

    private String consignee;

    private String consigneeTel;

    private String consigneeAddress;

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
        this.consignee = consignee;
    }

    public String getConsigneeTel() {
        return consigneeTel;
    }

    public void setConsigneeTel(String consigneeTel) {
        this.consigneeTel = consigneeTel;
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }
}

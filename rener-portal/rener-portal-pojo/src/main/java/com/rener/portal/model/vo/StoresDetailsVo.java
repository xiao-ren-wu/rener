package com.rener.portal.model.vo;

import java.util.List;

public class StoresDetailsVo{

    private String storeName;
    private String storeAddress;
    private String storeTel;
    private String storeIcon;
    private Long storeId;

    private String workDates;
    private Integer storeLevel;
    private String businessPermit;
    private String safePermit;
    private String storePic;

    private String picList;

    public String getPicList() {
        return picList;
    }

    public void setPicList(String picList) {
        this.picList = picList;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStoreTel() {
        return storeTel;
    }

    public void setStoreTel(String storeTel) {
        this.storeTel = storeTel;
    }

    public String getStoreIcon() {
        return storeIcon;
    }

    public void setStoreIcon(String storeIcon) {
        this.storeIcon = storeIcon;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getWorkDates() {
        return workDates;
    }

    public void setWorkDates(String workDates) {
        this.workDates = workDates;
    }

    public Integer getStoreLevel() {
        return storeLevel;
    }

    public void setStoreLevel(Integer storeLevel) {
        this.storeLevel = storeLevel;
    }

    public String getBusinessPermit() {
        return businessPermit;
    }

    public void setBusinessPermit(String businessPermit) {
        this.businessPermit = businessPermit;
    }

    public String getSafePermit() {
        return safePermit;
    }

    public void setSafePermit(String safePermit) {
        this.safePermit = safePermit;
    }

    public String getStorePic() {
        return storePic;
    }

    public void setStorePic(String storePic) {
        this.storePic = storePic;
    }

    @Override
    public String toString() {
        return "StoresDetailsVo{" +
                "storeName='" + storeName + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", storeTel='" + storeTel + '\'' +
                ", storeIcon='" + storeIcon + '\'' +
                ", storeId=" + storeId +
                ", workDates='" + workDates + '\'' +
                ", storeLevel=" + storeLevel +
                ", businessPermit='" + businessPermit + '\'' +
                ", safePermit='" + safePermit + '\'' +
                ", storePic='" + storePic + '\'' +
                ", picList=" + picList +
                '}';
    }
}

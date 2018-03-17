package com.rener.portal.model.vo;

import java.util.List;

public class StoreDetailsVo2 {
    private Long storeId;
    private String storeName;
    private String storeAddress;
    private String storeTel;
    private String workDates;
    private Integer storeLevel;
    private List<String> storePic;

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

    public List<String> getStorePic() {
        return storePic;
    }

    public void setStorePic(List<String> storePic) {
        this.storePic = storePic;
    }

    @Override
    public String toString() {
        return "StoreDetailsVo2{" +
                "storeName='" + storeName + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", storeTel='" + storeTel + '\'' +
                ", storeId=" + storeId +
                ", workDates='" + workDates + '\'' +
                ", storeLevel=" + storeLevel +
                ", storePic='" + storePic + '\'' +
                '}';
    }
}

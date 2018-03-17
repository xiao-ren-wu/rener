package com.rener.portal.model.vo;

public class StoresVo {

    private String storeName;
    private String storeAddress;
    private String storeTel;
    private String storeIcon;
    private Long storeId;

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

    @Override
    public String toString() {
        return "StoresVo{" +
                "storeName='" + storeName + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", storeTel='" + storeTel + '\'' +
                ", storeIcon='" + storeIcon + '\'' +
                ", storeId=" + storeId +
                '}';
    }
}

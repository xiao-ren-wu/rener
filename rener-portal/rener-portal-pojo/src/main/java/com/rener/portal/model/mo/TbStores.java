package com.rener.portal.model.mo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbStores implements Serializable {
    private Long storeId;

    private String storeName;

    private String storeAddress;

    private String storeTel;

    private Integer storeClassesId;

    private Date openingHours;

    private String workDates;

    private BigDecimal delieverCost;

    private String businessPermit;

    private String safePermit;

    private Integer storeLevel;

    private String storeIcon;

    private String storePic;

    private Date createTime;

    private Date updateTime;

    private String storeIntroduce;

    private String storeDescribe;

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
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress == null ? null : storeAddress.trim();
    }

    public String getStoreTel() {
        return storeTel;
    }

    public void setStoreTel(String storeTel) {
        this.storeTel = storeTel == null ? null : storeTel.trim();
    }

    public Integer getStoreClassesId() {
        return storeClassesId;
    }

    public void setStoreClassesId(Integer storeClassesId) {
        this.storeClassesId = storeClassesId;
    }

    public Date getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(Date openingHours) {
        this.openingHours = openingHours;
    }

    public String getWorkDates() {
        return workDates;
    }

    public void setWorkDates(String workDates) {
        this.workDates = workDates == null ? null : workDates.trim();
    }

    public BigDecimal getDelieverCost() {
        return delieverCost;
    }

    public void setDelieverCost(BigDecimal delieverCost) {
        this.delieverCost = delieverCost;
    }

    public String getBusinessPermit() {
        return businessPermit;
    }

    public void setBusinessPermit(String businessPermit) {
        this.businessPermit = businessPermit == null ? null : businessPermit.trim();
    }

    public String getSafePermit() {
        return safePermit;
    }

    public void setSafePermit(String safePermit) {
        this.safePermit = safePermit == null ? null : safePermit.trim();
    }

    public Integer getStoreLevel() {
        return storeLevel;
    }

    public void setStoreLevel(Integer storeLevel) {
        this.storeLevel = storeLevel;
    }

    public String getStoreIcon() {
        return storeIcon;
    }

    public void setStoreIcon(String storeIcon) {
        this.storeIcon = storeIcon == null ? null : storeIcon.trim();
    }

    public String getStorePic() {
        return storePic;
    }

    public void setStorePic(String storePic) {
        this.storePic = storePic == null ? null : storePic.trim();
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

    public String getStoreIntroduce() {
        return storeIntroduce;
    }

    public void setStoreIntroduce(String storeIntroduce) {
        this.storeIntroduce = storeIntroduce == null ? null : storeIntroduce.trim();
    }

    public String getStoreDescribe() {
        return storeDescribe;
    }

    public void setStoreDescribe(String storeDescribe) {
        this.storeDescribe = storeDescribe == null ? null : storeDescribe.trim();
    }
}
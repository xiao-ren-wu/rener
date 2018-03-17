package com.rener.portal.model.vo;

import java.sql.Date;

public class UserRedView {
    private Short redFacevalue;

    private Date redAgeing;

    private Byte redAddprop;

    private String storeName;

    private Date getTime;

    private Date endTime;

    private Byte userMode;

    public Short getRedFacevalue() {
        return redFacevalue;
    }

    public void setRedFacevalue(Short redFacevalue) {
        this.redFacevalue = redFacevalue;
    }

    public Date getRedAgeing() {
        return redAgeing;
    }

    public void setRedAgeing(Date redAgeing) {
        this.redAgeing = redAgeing;
    }

    public Byte getRedAddprop() {
        return redAddprop;
    }

    public void setRedAddprop(Byte redAddprop) {
        this.redAddprop = redAddprop;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Date getGetTime() {
        return getTime;
    }

    public void setGetTime(Date getTime) {
        this.getTime = getTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Byte getUserMode() {
        return userMode;
    }

    public void setUserMode(Byte userMode) {
        this.userMode = userMode;
    }
}

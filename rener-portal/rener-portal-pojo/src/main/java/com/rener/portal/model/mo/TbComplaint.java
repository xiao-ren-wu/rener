package com.rener.portal.model.mo;

import java.util.Date;

public class TbComplaint {
    private Long complaintId;

    private String complaintPic;

    private Long userId;

    private Date createTime;

    private Date updateTime;

    private String complaintReason;

    public Long getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(Long complaintId) {
        this.complaintId = complaintId;
    }

    public String getComplaintPic() {
        return complaintPic;
    }

    public void setComplaintPic(String complaintPic) {
        this.complaintPic = complaintPic == null ? null : complaintPic.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public String getComplaintReason() {
        return complaintReason;
    }

    public void setComplaintReason(String complaintReason) {
        this.complaintReason = complaintReason == null ? null : complaintReason.trim();
    }
}
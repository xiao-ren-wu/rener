package com.rener.portal.model.vo;

import java.sql.Date;

/**
 * Created with IDEA
 * author:Dick_YangDi
 * Date:2018/1/24
 * Time:19:29
 * JDK versions: 1.8.0_101
 */
public class TbComplaintVo {
    private Long complaintId;

    private PhotoList complaintPic;

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

    public PhotoList getComplaintPic() {
        return complaintPic;
    }

    public void setComplaintPic(PhotoList complaintPic) {
        this.complaintPic = complaintPic;
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
        this.complaintReason = complaintReason;
    }

}

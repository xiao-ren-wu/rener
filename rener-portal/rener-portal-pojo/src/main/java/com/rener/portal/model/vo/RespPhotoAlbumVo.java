package com.rener.portal.model.vo;

import java.sql.Date;
import java.util.List;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/28
 * @Time:13:58
 * @JDK versions: 1.8.0_101
 */
public class RespPhotoAlbumVo {
    private Long photoAlbumId;
    private List<String> photoUrl;
    private Date createTime;
    private Integer photoNumber;
    private String monthTime;

    public String getMonthTime() {
        return monthTime;
    }

    public void setMonthTime(String monthTime) {
        this.monthTime = monthTime;
    }

    public Integer getPhotoNumber() {
        return photoNumber;
    }

    public void setPhotoNumber(Integer photoNumber) {
        this.photoNumber = photoNumber;
    }

    public Long getPhotoAlbumId() {
        return photoAlbumId;
    }

    public void setPhotoAlbumId(Long photoAlbumId) {
        this.photoAlbumId = photoAlbumId;
    }

    public List<String> getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(List<String> photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

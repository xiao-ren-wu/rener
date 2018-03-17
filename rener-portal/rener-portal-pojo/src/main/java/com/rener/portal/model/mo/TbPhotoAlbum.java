package com.rener.portal.model.mo;

import java.util.Date;

public class TbPhotoAlbum {
    private Long photoAlbumId;

    private String displayPhoto;

    private Long userId;

    private Date uploadTime;

    private Date createTime;

    private Date updateTime;

    public Long getPhotoAlbumId() {
        return photoAlbumId;
    }

    public void setPhotoAlbumId(Long photoAlbumId) {
        this.photoAlbumId = photoAlbumId;
    }

    public String getDisplayPhoto() {
        return displayPhoto;
    }

    public void setDisplayPhoto(String displayPhoto) {
        this.displayPhoto = displayPhoto == null ? null : displayPhoto.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
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
}
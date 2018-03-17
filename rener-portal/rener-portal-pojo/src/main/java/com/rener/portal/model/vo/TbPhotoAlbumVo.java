package com.rener.portal.model.vo;

import java.sql.Date;

/**
 * Created with IDEA
 * author:Dick_YangDi
 * Date:2018/1/24
 * Time:11:08
 * JDK versions: 1.8.0_101
 */
public class TbPhotoAlbumVo {
    private Long photoAlbumId;
    private PhotoList displayPhoto;
    private Date createTime;

    @Override
    public String toString() {
        return "TbPhotoAlbumVo{" +
                "photoAlbumId=" + photoAlbumId +
                ", displayPhoto=" + displayPhoto +
                ", createTime=" + createTime +
                '}';
    }

    public Long getPhotoAlbumId() {
        return photoAlbumId;
    }

    public void setPhotoAlbumId(Long photoAlbumId) {
        this.photoAlbumId = photoAlbumId;
    }

    public PhotoList getDisplayPhoto() {
        return displayPhoto;
    }

    public void setDisplayPhoto(PhotoList displayPhoto) {
        this.displayPhoto = displayPhoto;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

package com.rener.portal.service;

import com.rener.portal.model.vo.RespPhotoAlbumVo;

import java.sql.Date;
import java.util.List;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/25
 * @Time:15:07
 * @JDK versions: 1.8.0_101
 */
public interface PhotoAlbumService {
    List<RespPhotoAlbumVo> selectById(Long id, Long page);

    boolean insert(Date uploadTime, Date updateTime, Date createTime, String displayPhoto);

    List<RespPhotoAlbumVo> selectByMonth(Long id);

    List<RespPhotoAlbumVo> selectMonthById(Long id, String dateString);

    int delete(Long id);
}

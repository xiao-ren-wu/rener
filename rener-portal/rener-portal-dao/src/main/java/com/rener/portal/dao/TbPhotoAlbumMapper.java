package com.rener.portal.dao;


import com.rener.portal.model.mo.TbPhotoAlbum;
import com.rener.portal.model.vo.TbPhotoAlbumVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IDEA
 * author:Dick_YangDi
 * Date:2018/1/24
 * Time:14:03
 * JDK versions: 1.8.0_101
 */
public interface TbPhotoAlbumMapper {
    List<TbPhotoAlbumVo> selectById(@Param("id") Long id, @Param("page") Long page);

    boolean insert(TbPhotoAlbum tbPhotoAlbum);

    List<TbPhotoAlbumVo> selectAllById(@Param("id") Long id);

    List<TbPhotoAlbumVo> selectAllMonthById(@Param("id") Long id);

    List<TbPhotoAlbumVo> selectMonthById(@Param("id") Long id, @Param("dateString") String dateString);

    int deleteByPhotoAlbumId(@Param("id") Long id);
}


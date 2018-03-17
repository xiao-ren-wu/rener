package com.rener.portal.service.impl;

import com.rener.portal.dao.TbPhotoAlbumMapper;
import com.rener.portal.model.mo.TbPhotoAlbum;
import com.rener.portal.model.vo.RespPhotoAlbumVo;
import com.rener.portal.model.vo.TbPhotoAlbumVo;
import com.rener.portal.service.PhotoAlbumService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/25
 * @Time:15:25
 * @JDK versions: 1.8.0_101
 */

@Service
public class PhotoAlbumServiceImpl implements PhotoAlbumService {
    @Resource
    private TbPhotoAlbumMapper tbPhotoAlbumMapper;

    /**
     * 根据id分页查询，若没有数据将返回null
     */
    @Override
    public List<RespPhotoAlbumVo> selectById(Long id, Long page) {
        return tbPhotoAlbumVoToRespPhotoAlbumVo(tbPhotoAlbumMapper.selectById(id,(page-1)*7));
    }

    @Override
    @Transactional
    public boolean insert(Date uploadTime,Date updateTime,Date createTime,String displayPhoto) {
        TbPhotoAlbum tbPhotoAlbum = new TbPhotoAlbum();
        tbPhotoAlbum.setUploadTime(uploadTime);
        tbPhotoAlbum.setUpdateTime(updateTime);
        tbPhotoAlbum.setCreateTime(createTime);
        tbPhotoAlbum.setDisplayPhoto(displayPhoto);
        return tbPhotoAlbumMapper.insert(tbPhotoAlbum);
    }

    /**
     * 按照月份显示部分图片
     * @param id
     * @return
     */
    @Override
    public List<RespPhotoAlbumVo> selectByMonth(Long id) {
        return tbPhotoAlbumVoToRespPhotoAlbumVo(tbPhotoAlbumMapper.selectAllMonthById(id));
    }

    /**
     * 显示某月一个人所有的相册
     * @param id
     * @param dateString
     * @return
     */
    @Override
    public List<RespPhotoAlbumVo> selectMonthById(Long id, String dateString) {
        return tbPhotoAlbumVoToRespPhotoAlbumVo(tbPhotoAlbumMapper.selectMonthById(id,dateString));
    }

    @Override
    @Transactional
    public int delete(Long id) {
        return tbPhotoAlbumMapper.deleteByPhotoAlbumId(id);
    }

    private List<RespPhotoAlbumVo> tbPhotoAlbumVoToRespPhotoAlbumVo(List<TbPhotoAlbumVo> tbPhotoAlbumVos){
        List<RespPhotoAlbumVo> respPhotoAlbumVos = new ArrayList<>();
        TbPhotoAlbumVo tbPhotoAlbumVo;
        RespPhotoAlbumVo respPhotoAlbumVo;
        for(int i=0;tbPhotoAlbumVos!=null&&i<tbPhotoAlbumVos.size();i++){
            tbPhotoAlbumVo = tbPhotoAlbumVos.get(i);
            respPhotoAlbumVo = new RespPhotoAlbumVo();
            respPhotoAlbumVo.setCreateTime(tbPhotoAlbumVo.getCreateTime());
            respPhotoAlbumVo.setMonthTime(tbPhotoAlbumVo.getCreateTime().toString().substring(0,tbPhotoAlbumVo.getCreateTime().toString().lastIndexOf("-")));
            respPhotoAlbumVo.setPhotoUrl(tbPhotoAlbumVo.getDisplayPhoto().getUrlList());
            respPhotoAlbumVo.setPhotoAlbumId(tbPhotoAlbumVo.getPhotoAlbumId());
            respPhotoAlbumVo.setPhotoNumber(tbPhotoAlbumVo.getDisplayPhoto().getUrlList().size());
            respPhotoAlbumVos.add(respPhotoAlbumVo);
        }
        return respPhotoAlbumVos;
    }
}

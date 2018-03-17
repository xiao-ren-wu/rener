package com.rener.portal.service.impl;

import com.rener.portal.dao.TbComplaintMapper;
import com.rener.portal.model.vo.RespComplaintVo;
import com.rener.portal.model.vo.TbComplaintVo;
import com.rener.portal.service.ComplaintService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/25
 * @Time:15:16
 * @JDK versions: 1.8.0_101
 */
@Service
public class ComplaintServiceImpl implements ComplaintService {
    @Resource
    private TbComplaintMapper tbComplaintMapper;

    @Override
    @Transactional
    public boolean insert(TbComplaintVo tbComplaint) {
        return tbComplaintMapper.insert(tbComplaint);
    }

    @Override
    public List<RespComplaintVo> selectAll() {
        List<TbComplaintVo> tbComplaintVos = tbComplaintMapper.selectAll();
        return tbComplaintVoToRespComplaintVo(tbComplaintVos);
    }

    @Override
    public List<RespComplaintVo> selectByUserId(Long id) {
        List<TbComplaintVo> tbComplaintVos = tbComplaintMapper.selectByUserId(id);
        return tbComplaintVoToRespComplaintVo(tbComplaintVos);
    }

    private List<RespComplaintVo> tbComplaintVoToRespComplaintVo(List<TbComplaintVo> tbComplaintVos) {
        List<RespComplaintVo> respComplaintVoList = new ArrayList<>();
        TbComplaintVo tbComplaintVo;
        RespComplaintVo respComplaintVo;
        for (int i = 0; tbComplaintVos != null && i < tbComplaintVos.size(); i++) {
            tbComplaintVo = tbComplaintVos.get(i);
            respComplaintVo = new RespComplaintVo();
            respComplaintVo.setComplaintId(tbComplaintVo.getComplaintId());
            respComplaintVo.setPhotoList(tbComplaintVo.getComplaintPic().getUrlList());
            respComplaintVo.setComplaintReason(tbComplaintVo.getComplaintReason());
            respComplaintVo.setUserId(tbComplaintVo.getUserId());
            respComplaintVo.setCreateTime(tbComplaintVo.getCreateTime());
            respComplaintVo.setUpdateTime(tbComplaintVo.getUpdateTime());
            respComplaintVoList.add(respComplaintVo);
        }
        return respComplaintVoList;
    }

    @Override
    @Transactional
    public int delete(Long id) {
        int i = tbComplaintMapper.deleteByComplaintId(id);
        return i;
    }
}

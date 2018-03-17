package com.rener.portal.service;

import com.rener.portal.model.vo.RespComplaintVo;
import com.rener.portal.model.vo.TbComplaintVo;

import java.util.List;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/25
 * @Time:15:06
 * @JDK versions: 1.8.0_101
 */
public interface ComplaintService {
    boolean insert(TbComplaintVo tbComplaint);

    List<RespComplaintVo> selectAll();

    List<RespComplaintVo> selectByUserId(Long id);

    int delete(Long id);
}

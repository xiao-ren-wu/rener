package com.rener.portal.dao;


import com.rener.portal.model.vo.TbComplaintVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IDEA
 * author:Dick_YangDi
 * Date:2018/1/24
 * Time:17:09
 * JDK versions: 1.8.0_101
 */

@Repository
public interface TbComplaintMapper {
    boolean insert(TbComplaintVo tbComplaint);

    List<TbComplaintVo> selectAll();
    List<TbComplaintVo> selectByUserId(@Param("id") Long id);
    int deleteByComplaintId(@Param("id") Long id);
}


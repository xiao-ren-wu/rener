package com.rener.portal.dao;


import com.rener.portal.model.vo.TbCommentsVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lidan@meng_zhu
 * @date 2018/2/4 0004 17:41
 */
@Repository
public interface TbCommentsMapper {
    List<TbCommentsVo> commentsOne(@Param("user_id") long user_id);
    List<TbCommentsVo> commentsTwo(@Param("user_id")long user_id);
    List<TbCommentsVo> commentsThree(@Param("user_id") long user_id);
    List<TbCommentsVo> commentsFour(@Param("user_id") long user_id);

}

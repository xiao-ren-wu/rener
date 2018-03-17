package com.rener.portal.service;

import com.rener.portal.model.vo.TbCommentsVo;

import java.util.List;

/**
 * @author lidan@meng_zhu
 * @date 2018/2/4 0004 19:05
 */
public interface TbCommentsService {
    List<TbCommentsVo> commentsOne(long user_id);
    List<TbCommentsVo> commentsTwo(long user_id);
    List<TbCommentsVo> commentsThree(long user_id);
    List<TbCommentsVo> commentsFour(long user_id);

}

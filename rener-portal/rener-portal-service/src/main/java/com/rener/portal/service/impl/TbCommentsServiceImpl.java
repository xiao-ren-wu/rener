package com.rener.portal.service.impl;


import com.rener.portal.dao.TbCommentsMapper;
import com.rener.portal.model.vo.TbCommentsVo;
import com.rener.portal.service.TbCommentsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lidan@meng_zhu
 * @date 2018/2/4 0004 19:06
 */
@Service
public class TbCommentsServiceImpl implements TbCommentsService{
    @Resource
    public TbCommentsMapper tbCommentsMapper;


    @Override
    public List<TbCommentsVo> commentsOne(long user_id) {
        List<TbCommentsVo> list = tbCommentsMapper.commentsOne(user_id);
        return list;
    }

    @Override
    public List<TbCommentsVo> commentsTwo(long user_id) {

        List<TbCommentsVo> list = tbCommentsMapper.commentsTwo(user_id);
        return list;
    }

    @Override
    public List<TbCommentsVo> commentsThree(long user_id) {

        List<TbCommentsVo> list = tbCommentsMapper.commentsThree(user_id);
        return list;
    }

    @Override
    public List<TbCommentsVo> commentsFour(long user_id) {

        List<TbCommentsVo> list = tbCommentsMapper.commentsFour(user_id);
        return list;
    }
}

package com.rener.portal.service.impl;

import com.rener.portal.dao.TbColleMapper;
import com.rener.portal.model.mo.TbColle;
import com.rener.portal.service.ChangeCollectState;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Created with IDEA
 * @author:Yuwenbo
 * @Date:2018/1/25
 * @Time:15:56
 * @JDK versions: 1.8.0_101
 */
@Service
public class ChangeCollectStateImpl implements ChangeCollectState {
    @Resource
    TbColleMapper tbColleMapper;
    @Override
    public Integer changeCollectState(Long storeId, Long userId) {
        TbColle colle = new TbColle();
        colle.setColleUserId(userId);
        colle.setColleStoreId(storeId);
        colle.setColleDate(new Date());
        //查询用户收藏标志位，没有返回null
        Integer tag = tbColleMapper.findCollectState(colle);
        //该用户之前没有收藏过，添加收藏信息
        if(null==tag){
            tbColleMapper.addCollectState(colle);
            return 0;
        }
        //更改用户收藏标志位
        else{
            tag=(tag+1)%2;
            colle.setColleState(tag);
            tbColleMapper.changeCollectState(colle);
            return tag;
        }
    }
}

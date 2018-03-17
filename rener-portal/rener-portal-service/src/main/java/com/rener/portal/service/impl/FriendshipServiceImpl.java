package com.rener.portal.service.impl;

import com.rener.portal.dao.TbFriendshipMapper;
import com.rener.portal.model.mo.TbFriendship;
import com.rener.portal.model.vo.RespFriendshipVo;
import com.rener.portal.model.vo.TbFriendshipVo;
import com.rener.portal.service.FriendshipService;
import com.rener.portal.service.util.PinYingUtil;
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
 * @Time:15:19
 * @JDK versions: 1.8.0_101
 */
@Service
public class FriendshipServiceImpl implements FriendshipService {
    @Resource
    private TbFriendshipMapper tbFriendshipMapper;


    @Override
    public List<RespFriendshipVo> selectAll(Long userId) {
        List<TbFriendshipVo> list = tbFriendshipMapper.select(userId);
        List<RespFriendshipVo> respFriendshipVos= new ArrayList<>();
        String py="abcdefghijklmnopqrstuvwxyz".toUpperCase();
        RespFriendshipVo respFriendshipVo;
        List<TbFriendshipVo> tbFriendshipVos;
        for(int i=0;i<py.length();i++){
            respFriendshipVo = new RespFriendshipVo();
            respFriendshipVo.setInitial(py.charAt(i));
            tbFriendshipVos = new ArrayList<>();
            for(TbFriendshipVo l:list){
                if(PinYingUtil.getPinYinHead(l.getUserNickname())==py.charAt(i)){
                    tbFriendshipVos.add(l);
                }
            }
            respFriendshipVo.setFriendShipVo(tbFriendshipVos);
            if(respFriendshipVo.getFriendShipVo().size()!=0) {
                respFriendshipVos.add(respFriendshipVo);
            }
        }
        return respFriendshipVos;
    }

    /**
     * @param userId
     * @param firendId
     * @param createTime
     * @param updateTime
     * @return
     */
    @Override
    @Transactional
    public boolean insert(Long userId, Long firendId, Date createTime, Date updateTime) {
        TbFriendship tbFriendship = new TbFriendship();
        tbFriendship.setUserId(userId);
        tbFriendship.setFirendId(firendId);
        tbFriendship.setCreateTime(createTime);
        tbFriendship.setUpdateTime(updateTime);
        return tbFriendshipMapper.insert(tbFriendship);
    }


    /**
     * @param userId
     * @param friendId
     * @return
     */
    @Override
    @Transactional
    public int delete(Long userId, Long friendId) {
        TbFriendship tbFriendship = new TbFriendship();
        tbFriendship.setUserId(userId);
        tbFriendship.setFirendId(friendId);
        return tbFriendshipMapper.delete(tbFriendship);
    }
}

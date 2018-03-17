package com.rener.portal.service;

import com.rener.portal.model.vo.RespFriendshipVo;
import com.rener.portal.model.vo.TbFriendshipVo;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/25
 * @Time:15:07
 * @JDK versions: 1.8.0_101
 */
public interface FriendshipService {
    /**
     *
     * @param userId
     * @return
     */
    List<RespFriendshipVo> selectAll(Long userId);

    /**
     *
     * @param userId
     * @param firendId
     * @param createTime
     * @param updateTime
     * @return
     */
    boolean insert(Long userId, Long firendId, Date createTime, Date updateTime);

    /**
     *
     * @param userId
     * @param friendId
     * @return
     */
    int delete(Long userId, Long friendId);
}

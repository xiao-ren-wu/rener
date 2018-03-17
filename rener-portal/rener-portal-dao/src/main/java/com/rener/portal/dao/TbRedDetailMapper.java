package com.rener.portal.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Yuwenbo
 */
@Repository
public interface TbRedDetailMapper {
    /**
     * 通过用户id查询该用户红包个数
     *
     * @param userId
     * @return
     */
    Integer countRedPacket(Long userId);
}
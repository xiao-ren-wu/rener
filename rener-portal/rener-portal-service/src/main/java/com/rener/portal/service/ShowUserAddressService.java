package com.rener.portal.service;

import com.rener.portal.model.vo.UserAddressVo;

import java.util.List;

/**
 * @Created with IDEA
 * @author:Yuwenbo
 * @Date:2018/2/1
 * @Time:17:25
 * @JDK versions: 1.8.0_101
 */
public interface ShowUserAddressService {
    /**
     * 通过用户id和返回的地址位置继续查询用户地址
     * @param userId
     * @param currentNum
     * @return
     */
    List<UserAddressVo> findUserAddress(Long userId, Long addressId,int currentNum);

    /**
     * 通过地址id删除用户对应的地址
     * @param addressId
     * @return
     */
    int deleteUserAddress(Long addressId);

}

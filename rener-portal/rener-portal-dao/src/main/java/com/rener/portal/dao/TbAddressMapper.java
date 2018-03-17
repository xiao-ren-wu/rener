package com.rener.portal.dao;


import com.rener.portal.model.mo.TbAddress;
import com.rener.portal.model.vo.UserAddressVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Yuwenbo
 */
@Repository
public interface TbAddressMapper {
    /**
     * 添加用户地址
     *
     * @param tbAddress
     * @return
     */
    int insertUserAddress(TbAddress tbAddress);

    /**
     * 通过用户id查询用户的收货地址数量
     *
     * @param userId
     * @return
     */
    int countUserAddress(Long userId);

    /**
     * 通过用户id当前查询的次数和每一页的容量查询指定的用户收藏地址
     *
     * @param userId
     * @param pageSize   页尺寸
     * @param currentNum 要查询的页
     * @return
     */

    List<UserAddressVo> selectUserAddress(@Param("userId") Long userId, @Param("pageSize") Integer pageSize, @Param("currentNum") Integer currentNum);

    /**
     * @return
     * @apiNote 返回默认收货地址
     */
    TbAddress selectAddressDefault();

    /**
     * 通过地址id删除对应的用户收货地址
     *
     * @param addressId
     * @return
     */
    int delUserAddress(Long addressId);

    /**
     * @param userId
     * @param pageSize
     * @param currentNum
     * @return
     */
    List<TbAddress> selectUserAddress1(@Param("userId") Long userId, @Param("pageSize") Integer pageSize, @Param("currentNum") Integer currentNum);

    TbAddress selectUserAddressById(@Param("addressId")Long addressId);
}
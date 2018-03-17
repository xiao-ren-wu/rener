package com.rener.portal.service;



/**
 * @Created with IDEA
 * @author:Yuwenbo
 * @Date:2018/1/28
 * @Time:13:57
 * @JDK versions: 1.8.0_101
 */
public interface UpdateUserMsgService {
    /**
     * 通过用户id更改用户昵称
     * @param userId
     * @param nickName
     */
    int updateUserNickName(Long userId, String nickName);

    /**
     * 通过用户id更改用户头像url
     * @param userId
     * @param icon
     */
    int updateUserIcon(Long userId, String icon);

    /**
     * 更改用户生日
     * @param userId
     * @param birth
     */
    int updateBirth(Long userId, String birth);

    /**
     * 添加收货地址
     * @param userId    收货人id
     * @param consignee 收货人姓名
     * @param consigneeTel  收货人电话
     * @param consigneeAddress  收货地址
     */
    int addUserAddress(Long userId, String consignee, String consigneeTel, String consigneeAddress);

}

package com.rener.portal.service;

import com.rener.portal.model.vo.UserHomeMsgVo;

/**
 * @author Yuwenbo
 */
public interface UserHomeService {
    /**
     * @param id :用户id
     * @apiNote 通过用户的id查找用户的所有信息
     */
    UserHomeMsgVo findUserByIdService(Long id);

    /**
     * @param oldPass 原密码
     * @param newpass 新密码
     * @param userId  用户id
     * @return 如果修改密码成功，返回1，修改密码失败，返回0
     * @apiNote 修改用户密码
     */
    Integer upDateUserPasswordService(String oldPass, String newpass, Long userId);
}

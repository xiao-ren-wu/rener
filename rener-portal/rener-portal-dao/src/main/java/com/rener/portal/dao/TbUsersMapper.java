package com.rener.portal.dao;


import com.rener.portal.model.mo.TbUsers;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


/**
 * @author Yuwenbo
 */
@Repository
public interface TbUsersMapper {
    /**
     * 通过用户id查找到用户的信息
     *
     * @param userId
     * @return
     */
    TbUsers findUserById(Long userId);

    /**
     * 通过用id更改用户的信息
     *
     * @param tbUsers
     * @return 返回用户成功修改信息的条数，失败返回0
     */
    int updateUserMsgById(TbUsers tbUsers);

    String findpasswordById(Long userId);

    /**
     * 登陆
     *
     * @param userTel
     * @param userPwd
     * @return
     */
    TbUsers login(@Param("userTel") String userTel, @Param("userPwd") String userPwd);

    /**
     * 注册
     *
     * @param tbUsers
     */
    void enroll(@Param("tbUsers") TbUsers tbUsers);

    /**
     * 下线
     */
    void exit(@Param("userId") long userId);

    void update(@Param("userId") long userId);

    /**
     * chenkuan
     *
     * @return 返回针对商铺详情的 用户信息
     */
    TbUsers selectToStore();

    String selectNameById(@Param("userId") Long userId);

    TbUsers  inspect(@Param("userTel") String userTel);

}


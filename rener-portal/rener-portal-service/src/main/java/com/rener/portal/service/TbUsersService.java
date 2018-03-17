package com.rener.portal.service;

import com.rener.portal.model.mo.TbUsers;

public interface TbUsersService {
    TbUsers login(String userTel, String userPwd);//登陆

    void enroll(TbUsers tbUsers);//注册

    void exit(long userId);//退出登录

    TbUsers inspect(String userTel);
}

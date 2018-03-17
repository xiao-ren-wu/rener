package com.rener.portal.service.impl;


import com.rener.portal.dao.TbUsersMapper;
import com.rener.portal.model.mo.TbUsers;
import com.rener.portal.service.TbUsersService;
import com.rener.portal.service.util.Md5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbUsersServiceImpl implements TbUsersService {
    @Resource
    private TbUsersMapper tbUsersMapper;

    /*注册*/
    @Override
    public void enroll(TbUsers tbUsers) {
        String pwd = tbUsers.getUserPwd();
        tbUsers.setUserPwd(Md5Util.md5(pwd));
        tbUsersMapper.enroll(tbUsers);
    }

    /*退出登录*/
    @Override
    public void exit(long userId) {
        tbUsersMapper.exit(userId);
    }



    /*登陆*/
    @Override
    public TbUsers login(String userTel, String userPwd) {

        String md5Util = Md5Util.md5(userPwd);
        System.out.println(md5Util);
        System.out.println(userTel);
        TbUsers tbUsers = tbUsersMapper.login(userTel, md5Util);
        if (tbUsers != null) {
      //      tbUsers.setUserOnlinestate(1);
            System.out.println(tbUsers.getUserId());
            tbUsersMapper.update(tbUsers.getUserId());
        }
        return tbUsers;
    }


    /*检验是否重复*/
    @Override
    public TbUsers inspect(String userTel) {
        System.out.println(userTel+"*************");
        TbUsers tbUsers = tbUsersMapper.inspect(userTel);
        if (tbUsers != null)
        {

            return tbUsers;
        }
        else
            return null;
    }

}

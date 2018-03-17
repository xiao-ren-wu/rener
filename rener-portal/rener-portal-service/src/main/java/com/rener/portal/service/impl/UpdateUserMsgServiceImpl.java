package com.rener.portal.service.impl;

import com.rener.portal.dao.TbAddressMapper;
import com.rener.portal.dao.TbUsersMapper;
import com.rener.portal.model.mo.TbAddress;
import com.rener.portal.model.mo.TbUsers;
import com.rener.portal.model.utils.DateToString;
import com.rener.portal.service.UpdateUserMsgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Created with IDEA
 * @author:Yuwenbo
 * @Date:2018/1/28
 * @Time:14:26
 * @JDK versions: 1.8.0_101
 */
@Service
public class UpdateUserMsgServiceImpl implements UpdateUserMsgService{
    @Resource
    TbUsersMapper tbUsersMapper;
    @Resource
    TbAddressMapper tbAddressMapper;
    @Override
    public int updateUserNickName(Long userId, String nickName) {
        TbUsers users = new TbUsers();
        users.setUserId(userId);
        users.setUserNickname(nickName);
        int flag = tbUsersMapper.updateUserMsgById(users);
        return flag;
    }

    @Override
    public int updateUserIcon(Long userId, String icon) {
        TbUsers users = new TbUsers();
        users.setUserId(userId);
        users.setUserPhoto(icon);
        int flag = tbUsersMapper.updateUserMsgById(users);
        return flag;
    }
    @Override
    public int updateBirth(Long userId, String birth) {
        TbUsers users = new TbUsers();
        users.setUserId(userId);
        users.setUserBirth(new java.sql.Date(DateToString.StringToDate(birth)));
        int flag = tbUsersMapper.updateUserMsgById(users);
        return flag;
    }

    @Override
    public int addUserAddress(Long userId, String consignee, String consigneeTel, String consigneeAddress) {
        TbAddress tbAddress=new TbAddress();
        tbAddress.setConsignee(consignee);
        tbAddress.setConsigneeAddress(consigneeAddress);
        tbAddress.setConsigneeTel(consigneeTel);
        tbAddress.setUserId(userId);
        int flag = tbAddressMapper.insertUserAddress(tbAddress);
        return flag;
    }
}

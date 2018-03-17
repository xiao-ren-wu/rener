package com.rener.portal.service.impl;

import com.rener.portal.dao.TbRedDetailMapper;
import com.rener.portal.dao.TbUsersMapper;
import com.rener.portal.model.mo.TbUsers;
import com.rener.portal.model.utils.DateToString;
import com.rener.portal.model.vo.UserHomeMsgVo;
import com.rener.portal.service.UserHomeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Yuwenbo
 */
@Service
public class UserHomeServiceImpl implements UserHomeService {
    @Resource
    TbUsersMapper tbUsersMapper;
    @Resource
    TbRedDetailMapper tbRedDetailMapper;

    @Override
    public UserHomeMsgVo findUserByIdService(Long id) {
        TbUsers user = tbUsersMapper.findUserById(id);
        Integer redCount = tbRedDetailMapper.countRedPacket(id);
        if(null==redCount){
            redCount=0;
        }
        UserHomeMsgVo msgVo = new UserHomeMsgVo();
        msgVo.setRedPackNum(redCount);
        msgVo.setUserId(id);
        msgVo.setUserNickname(user.getUserNickname());
        msgVo.setUserPhoto(user.getUserPhoto());
        msgVo.setUserBalance(user.getUserBalance());
        msgVo.setUserIntegral(user.getUserIntegral());
        msgVo.setUserBirth(DateToString.dateToString(user.getUserBirth().getTime()));
        msgVo.setUseTel(user.getUserTel());
        return msgVo;
    }

    @Override
    public Integer upDateUserPasswordService(String oldPass, String newpass, Long userId) {
        String findPassword = tbUsersMapper.findpasswordById(userId);
        int flag = 0;
        if (findPassword != null && oldPass != null && findPassword.equals(md5(oldPass))) {
            newpass = md5(newpass);
            TbUsers users = new TbUsers();
            users.setUserId(userId);
            users.setUserPwd(newpass);
            flag = tbUsersMapper.updateUserMsgById(users);
        }
        return flag;
    }

    /**
     * 使用md5的算法进行加密
     */
    private String md5(String plainText) {
        byte[] secretBytes = null;
        try {
            secretBytes = MessageDigest.getInstance("md5").digest(
                    plainText.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5算法异常！");
        }
        String md5code = new BigInteger(1, secretBytes).toString(16);
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code = "0" + md5code;
        }
        return md5code;
    }
}

package com.rener.portal.service.impl;

import com.rener.portal.dao.TbAddressMapper;
import com.rener.portal.model.mo.TbAddress;
import com.rener.portal.model.vo.UserAddressVo;
import com.rener.portal.service.ShowUserAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Created with IDEA
 * @author:Yuwenbo
 * @Date:2018/2/1
 * @Time:18:13
 * @JDK versions: 1.8.0_101
 */
@Service
public class ShowUserAddressImpl implements ShowUserAddressService{
    @Resource
    TbAddressMapper tbAddressMapper;
    private int totalNum;
    private int pageSize=100;
    private int countUserAddress(Long userId) {
        totalNum = tbAddressMapper.countUserAddress(userId);
        return totalNum;
    }

    @Override
    public List<UserAddressVo> findUserAddress(Long userId, Long addressId,int currentNum) {
        if(0==totalNum){
            totalNum=countUserAddress(userId);
        }
        if(totalNum==currentNum){
            return null;
        }
        if(0!=currentNum&&addressId==-1){
            currentNum++;
        }
        if(addressId!=-1){
            tbAddressMapper.delUserAddress(addressId);
        }
        List<UserAddressVo> tbAddresses = tbAddressMapper.selectUserAddress(userId, pageSize, currentNum);
        return tbAddresses;
    }

    @Override
    public int deleteUserAddress(Long addressId) {
        int flag = tbAddressMapper.delUserAddress(addressId);
        return flag;
    }
}

package com.rener.portal.web.action;

import com.rener.portal.model.mo.TbUsers;
import com.rener.portal.model.vo.UserAddressVo;
import com.rener.portal.service.ShowUserAddressService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Created with IDEA
 * @author:Yuwenbo
 * @Date:2018/2/1
 * @Time:18:25
 * @JDK versions: 1.8.0_101
 * 展示用户收藏地址
 */
@Controller
@CrossOrigin
@RequestMapping("userAddress")
public class showUserAddress {
    @Resource
    ShowUserAddressService showUserAddressService;

    /**
     * 展示用户收货地址，如果只展示收货地址addressId=-1,如果删除收货地址，传递真的addressId
     * @param addressId
     * @return
     */
    @RequestMapping("findUserAddress")
    public @ResponseBody
    List<UserAddressVo> findAddressByUserIdAndCurrentNum(Long addressId, HttpSession httpSession){
        TbUsers user = (TbUsers) httpSession.getAttribute("user");
        List<UserAddressVo> userAddress = showUserAddressService.findUserAddress(user.getUserId(),addressId,0);
        return userAddress;
    }
}

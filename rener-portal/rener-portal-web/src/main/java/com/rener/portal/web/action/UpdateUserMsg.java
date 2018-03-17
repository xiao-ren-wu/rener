package com.rener.portal.web.action;

import com.alibaba.fastjson.JSONObject;
import com.rener.portal.model.mo.TbUsers;
import com.rener.portal.service.UpdateUserMsgService;
import com.rener.portal.service.UserHomeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.LinkedHashMap;

/**
 * @Created with IDEA
 * @author:Yuwenbo
 * @Date:2018/1/25
 * @Time:15:16
 * @JDK versions: 1.8.0_101
 * @apiNote 更改用户信息
 */
@CrossOrigin
@Controller
@RequestMapping("updateUserMsg")
public class UpdateUserMsg {
    @Resource
    UserHomeService userHomeService;
    @Resource
    UpdateUserMsgService updateUserMsgService;

    /**
     * 更改用户密码，密码不正确或者更改失败返回0
     * @return
     */
    @RequestMapping(value = "/updatePwd",method = RequestMethod.POST)
    public @ResponseBody
    JSONObject updatePassWord(@RequestBody LinkedHashMap<String,String> msg, HttpSession httpSession){
        TbUsers user = (TbUsers)httpSession.getAttribute("user");
        Integer tag = userHomeService.upDateUserPasswordService(msg.get("oldPass"), msg.get("newPass"), user.getUserId());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag",tag);
        return jsonObject;
    }

    /**
     * 更改用户昵称，成功返回1，失败返回0
     * @return
     */
    @RequestMapping(value = "updateUserNickName" ,method = RequestMethod.POST)
    public @ResponseBody int updateUserNickName(@RequestBody LinkedHashMap<String,String> name,HttpSession httpSession){
        TbUsers user = (TbUsers) httpSession.getAttribute("user");
        int flag = updateUserMsgService.updateUserNickName(user.getUserId(), name.get("nickName"));
        return flag;
    }

    /**
     * 更改用户生日
     * @param birth
     * @return
     */

    @RequestMapping("updateUserBirth")
    public @ResponseBody JSONObject updateUserBirth(HttpSession httpSession,String birth){
        TbUsers user = (TbUsers) httpSession.getAttribute("user");
        int flag = updateUserMsgService.updateBirth(user.getUserId(), birth);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag",flag);
        return jsonObject;
    }

    /**
     * 通过用户id更改用户图像
     * @return
     */
    @RequestMapping("updateUserIcon")
    public @ResponseBody JSONObject updateUserIcon(){return null;}

    /**
     * 通过用户id添加用户的收货地址相关信息
     * @param address
     * @return
     */
    @RequestMapping(value = "addUserAddress",method = RequestMethod.POST)
    public @ResponseBody int addArrdess(@RequestBody LinkedHashMap<String,String> address,HttpSession httpSession){
        TbUsers user = (TbUsers) httpSession.getAttribute("user");
        int flag = updateUserMsgService.addUserAddress(user.getUserId(), address.get("consignee"),
               address.get("tel"), address.get("area") + address.get("address"));
        return flag;
    }
}

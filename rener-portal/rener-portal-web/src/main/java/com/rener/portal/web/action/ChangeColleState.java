package com.rener.portal.web.action;

import com.rener.portal.model.mo.TbUsers;
import com.rener.portal.service.ChangeCollectState;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @Created with IDEA
 * @author:Yuwenbo
 * @Date:2018/1/29
 * @Time:11:26
 * @JDK versions: 1.8.0_101
 */
@Controller
@CrossOrigin
@RequestMapping("colleState")
public class ChangeColleState {
    @Resource
    ChangeCollectState changeCollectState;
    @RequestMapping("changeState")
    public @ResponseBody Integer changeColleState(@RequestParam("storeId") Long storeId, HttpSession httpSession){
        TbUsers user = (TbUsers) httpSession.getAttribute("user");
        Integer flag = changeCollectState.changeCollectState(storeId, user.getUserId());
        return flag;
    }
}

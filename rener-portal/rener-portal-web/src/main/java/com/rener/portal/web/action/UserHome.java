package com.rener.portal.web.action;

import com.alibaba.fastjson.JSONObject;
import com.rener.portal.model.mo.TbUsers;
import com.rener.portal.model.vo.UserHomeMsgVo;
import com.rener.portal.service.UserHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Yuwenbo
 */
@CrossOrigin
@RequestMapping("/userHome")
@Controller
public class UserHome {
    @Resource
    UserHomeService userHomeService;
    /**
     * 通过用户id查询用户信息
     *
     * @return
     */
    @RequestMapping("findUserById")
    public @ResponseBody
    JSONObject findUserById(HttpServletRequest httpServletRequest) {
        HttpSession httpSession = httpServletRequest.getSession();
        TbUsers user = (TbUsers) httpSession.getAttribute("user");
        UserHomeMsgVo userVo = userHomeService.findUserByIdService(user.getUserId());
        JSONObject userMsg = new JSONObject();
        userMsg.put("userHome", userVo);
        return userMsg;
    }
}

package com.rener.portal.web.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.rener.portal.model.mo.TbUsers;
import com.rener.portal.service.TbUsersService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.LinkedHashMap;

/**
 * @author lidan@meng_zhu
 * @date 2018/1/26 0026 21:35
 */
@Controller
@CrossOrigin
/*@RequestMapping("user")*/
public class TbUsersAtion {
    @Resource
    public TbUsersService tbUsersService;
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public @ResponseBody
    JSONObject getLogin(@RequestBody LinkedHashMap<String, Object> list,
                        HttpSession httpSession) {
        String JSONStr = JSON.toJSONString(list);//json字符串
        JSONObject json = JSON.parseObject(JSONStr);//json对象
        String tell = json.getString("tell");
        String pwd = json.getString("pwd");
        JSONObject jsonObject = new JSONObject();
        if (tell != null && pwd != null) {
            TbUsers tbUsers = tbUsersService.login(tell, pwd);//获取用户信息
            if (tbUsers == null) {
                jsonObject.put("status", "0");
            } else {
                // /把用户信息存储到session
                httpSession.setAttribute("user", tbUsers);
                System.out.println(((TbUsers)httpSession.getAttribute("user")).getUserNickname());
                jsonObject.put("status", "1");
            }
        } else {
            jsonObject.put("status", "0");
        }
        return jsonObject;
    }

    /*注册*/
    @RequestMapping(value = "enroll", method = RequestMethod.POST)
    public @ResponseBody
    JSONObject getEnroll(@Valid @RequestBody LinkedHashMap<String, Object> list,
                         BindingResult bindingResult) {
        String JSONStr = JSON.toJSONString(list);//json字符串
        JSONObject json = JSON.parseObject(JSONStr);
        String userNickname = json.getString("userNickname");
        String userPwd = json.getString("userPwd");
        String userTel = json.getString("userTel");
        String userEmail = json.getString("userEmail");
        int userSex = Integer.parseInt(json.getString("userSex"));
        JSONObject jsonObject = new JSONObject();
        TbUsers tbUsers = new TbUsers();
        tbUsers.setUserNickname(userNickname);
        tbUsers.setUserPwd(userPwd);
        tbUsers.setUserTel(userTel);
        tbUsers.setUserEmail(userEmail);
        tbUsers.setUserSex(userSex);
        TbUsers tbUsers1 = tbUsersService.inspect(userTel);
        if (tbUsers1 == null) {
            if (bindingResult.hasErrors()) {
                jsonObject.put("status", "0");
            } else {
                tbUsersService.enroll(tbUsers);
                jsonObject.put("status", "1");
            }
        } else {
            jsonObject.put("status", "0");
        }
        return jsonObject;
    }

    /*退出*/
    @RequestMapping(value = "exit", method = RequestMethod.GET)
    public JSONObject getExit(HttpSession httpSession) {
      //  String JSONStr = JSON.toJSONString(list);//json字符串
       // JSONObject json = JSON.parseObject(JSONStr);
        JSONObject jsonObject = new JSONObject();
        //Integer i = json.getInteger("i");
//        if (i == 1) {
            tbUsersService.exit(((TbUsers) httpSession.getAttribute("user")).getUserId());
            jsonObject.put("status", "1");
//        } else {
//            jsonObject.put("status", "0");
//        }
        httpSession.removeAttribute("user");
        return jsonObject;
    }
}

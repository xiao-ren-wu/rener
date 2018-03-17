package com.rener.portal.web.action;

import com.alibaba.fastjson.JSONObject;
import com.rener.portal.model.mo.TbUsers;
import com.rener.portal.model.vo.RespFriendshipVo;
import com.rener.portal.model.vo.TbFriendshipVo;
import com.rener.portal.service.FriendshipService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.util.List;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/25
 * @Time:16:26
 * @JDK versions: 1.8.0_101
 */
@CrossOrigin
@Controller
@RequestMapping("/friendShip")
public class Friendship {
    @Resource
    private FriendshipService friendshipService;

//    根据好友的id（后期从session中拿数据）
    @RequestMapping("/allFriend")
    public @ResponseBody
    List<RespFriendshipVo> allFriend(HttpSession session) {
        List<RespFriendshipVo> respFriendshipVos = friendshipService.selectAll(((TbUsers)session.getAttribute("user")).getUserId());
        return respFriendshipVos;
    }

    @RequestMapping("/insert")
    public @ResponseBody
    JSONObject insertFriend(HttpSession session,@RequestParam Long friendId) {
        Date date = new Date(System.currentTimeMillis());
        Long userId = ((TbUsers) session.getAttribute("user")).getUserId();
        boolean insert = friendshipService.insert(userId,friendId, date, date);
        JSONObject jsonObject = new JSONObject();
        if (insert) {
            jsonObject.put("msg", true);
        } else {
            jsonObject.put("msg", false);
        }
        return jsonObject;
    }

    @RequestMapping("/delete")
    public @ResponseBody
    JSONObject deleteFriend(HttpSession session,@RequestParam Long friendId) {
        Long userId = ((TbUsers) session.getAttribute("user")).getUserId();
        int delete = friendshipService.delete(userId, friendId);
        JSONObject jsonObject = new JSONObject();
        if (delete != 0) {
            jsonObject.put("msg", "true");
        }else {
            jsonObject.put("msg", "false");
        }
        return jsonObject;
    }
}

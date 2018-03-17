package com.rener.portal.web.action;

import com.alibaba.fastjson.JSONObject;
import com.rener.portal.model.mo.TbUsers;
import com.rener.portal.model.utils.ResultVo;
import com.rener.portal.model.vo.PayOrderPage;
import com.rener.portal.model.vo.SimpleOrderPage;
import com.rener.portal.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.text.html.CSS.getAttribute;

/**
 * @Created with IDEA
 * @author:GaoPan
 * @Date:2018/1/29
 * @Time:1:30
 * @JDK versions: 1.8.0_1011
 */

@Controller
@RequestMapping("/order")
@CrossOrigin
public class OrderController {
    @Resource
    OrderService orderService;

    /**
     * @param status
     * @param id
     * @apiNote更新订单状态
     */
    @RequestMapping("/updateOrderStatus")
    public @ResponseBody
    void updateOrderStatus(@RequestParam("status") Integer status, @RequestParam("id[]") Long[] id) {
        List<Long> idList = new ArrayList<>();
        for (Long i : id) {
            idList.add(i);
        }
        orderService.setOrderStatus(idList, new Long(status));
    }

    /**
     * @param id
     * @param session
     * @apiNote并保存订单信息
     */
    @RequestMapping("/save")
    public @ResponseBody
    void saveOrders(@RequestParam("ids") Long[] id, HttpSession session) {
        session.removeAttribute("idList");
        TbUsers tbUsers = (TbUsers) session.getAttribute("user");
        List<Long> idList = new ArrayList<>();
        for (Long i : id) {
            idList.add(i);
            System.out.println(i);
        }
        List<Long> longList = orderService.saveorders(idList, tbUsers.getUserId());
        session.setAttribute("idList", longList);
    }

    /**
     * @return 返回订单信息
     */
    @RequestMapping("/pay")
    public @ResponseBody
    JSONObject pay(HttpSession session) {
        TbUsers user = (TbUsers) session.getAttribute("user");
        Long userId = user.getUserId();
        List<Long> idList = (List<Long>) session.getAttribute("idList");
        PayOrderPage information = null;
        Long defaultAddres = (Long) session.getAttribute("defaultAddres");
        information = orderService.getPageOrderInformation(idList, userId, defaultAddres);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("payMsg", information);
        session.removeAttribute("defaultAddres");
        return jsonObject;
    }

    /**
     * @param status
     * @return 根据订单状态返回订单信息
     */
    @RequestMapping("/getOrder")
    public @ResponseBody
    JSONObject getOrder(@RequestParam("status") Integer status, HttpSession session) {
        TbUsers tbUsers = (TbUsers) session.getAttribute("user");
        ResultVo<SimpleOrderPage> allOrderByStatus = null;
        if (status != null) {
            allOrderByStatus = orderService.getAllOrderByStatus(status, tbUsers.getUserId());
        }

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg", allOrderByStatus);
        return jsonObject;
    }

    @RequestMapping("/receivePay")
    public @ResponseBody
    void receivePay(HttpSession httpSession, @RequestParam("orderIds") List<Long> orderIds) {
        String message = "";
        orderService.saveOrderDescribe(message, orderIds);
        httpSession.removeAttribute("idList");
    }

    @RequestMapping("/changeAddress")
    public @ResponseBody
    void changeAddress(HttpSession httpSession, @RequestParam("addressId") Long addressId) {
        httpSession.setAttribute("defaultAddres", addressId);
    }
}

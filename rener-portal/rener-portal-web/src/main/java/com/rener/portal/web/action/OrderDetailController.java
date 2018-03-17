package com.rener.portal.web.action;

import com.alibaba.fastjson.JSONObject;
import com.rener.portal.model.vo.OrderPage;
import com.rener.portal.service.OrderDetailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Created with IDEA
 * @author:GaoPan
 * @Date:2018/1/29
 * @Time:1:31
 * @JDK versions: 1.8.0_101
 */
@Controller
@CrossOrigin
@RequestMapping("/orderDetail")
public class OrderDetailController {
    @Resource
    private OrderDetailService orderDetailService;

    @RequestMapping("/getOrderDetail")
    public @ResponseBody
    JSONObject getOrderDetail(@RequestParam("orderId") Long orderId) {
        OrderPage byOrderId = null;
        if (orderId != null) {
            byOrderId = orderDetailService.getOrderDetailByOrderId(orderId);
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("orderDetail", byOrderId);
        return jsonObject;
    }
}
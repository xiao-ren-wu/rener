package com.rener.portal.service;

import com.rener.portal.model.vo.OrderPage;

/**
 * @Created with IDEA
 * @author:GaoPan
 * @Date:2018/1/27
 * @Time:1:44
 * @JDK versions: 1.8.0_101
 */
public interface OrderDetailService {
    /**
     * @param orderId
     * @return
     * @apiNote更具订单Id返回订单详细信息
     */
    OrderPage getOrderDetailByOrderId(Long orderId);
}

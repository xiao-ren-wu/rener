package com.rener.portal.service.impl;

import com.rener.portal.dao.OrderPageMapper;
import com.rener.portal.model.vo.OrderPage;
import com.rener.portal.service.OrderDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Created with IDEA
 * @author:GaoPan
 * @Date:2018/1/27
 * @Time:2:11
 * @JDK versions: 1.8.0_101
 */
@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    @Resource
    private OrderPageMapper orderPageMapper;

    @Override
    public OrderPage getOrderDetailByOrderId(Long orderId) {
        return orderPageMapper.selectOrdersById(orderId);
    }
}

package com.rener.portal.service;

import com.rener.portal.model.utils.ResultVo;
import com.rener.portal.model.vo.PayOrderPage;
import com.rener.portal.model.vo.SimpleOrderPage;

import java.util.List;

public interface OrderService {
    /**
     * @param status
     * @return更具状态返回订单信息
     */
    ResultVo<SimpleOrderPage> getPageOrderOfStatus(int status, int count, Long userId);

    /**
     * @param goodsId
     * @return返回下单页面信息
     */
    PayOrderPage getPageOrderInformation(List<Long> goodsId, Long userId,Long addressId);

    /**
     * @param orderIds
     * @param status
     * @apiNote更改订单状态
     */
    void setOrderStatus(List<Long> orderIds, Long status);

    /**
     * @param goodsId
     * @apiNote保存订单信息
     */
    List<Long>  saveorders(List<Long> goodsId, Long userId);

    void saveOrderDescribe(String message, List<Long> orderIds);

    ResultVo<SimpleOrderPage> getAllOrderByStatus(int status, Long userId);
}

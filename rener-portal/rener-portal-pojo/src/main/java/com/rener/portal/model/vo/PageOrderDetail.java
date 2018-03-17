package com.rener.portal.model.vo;

import com.rener.portal.model.mo.TbStores;

/**
 * @Created with IDEA
 * @author:GaoPan
 * @Date:2018/1/25
 * @Time:14:59
 * @JDK versions: 1.8.0_101
 */
public class PageOrderDetail {
    /**
     * 店铺信息
     */
    private TbStores tbStores;
    /**
     * 订单状态
     */
    private Integer orderState;
    /**
     * 订单总价
     */
    private Double orderTotalprice;
    /**
     * 订单编号
     */
    private Long orderId;
}
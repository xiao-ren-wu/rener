package com.rener.portal.model.vo;

import com.rener.portal.model.mo.TbAddress;

import java.io.Serializable;
import java.util.List;

/**
 * @Created with IDEA
 * @author:GaoPan
 * @Date:2018/1/28
 * @Time:2:58
 * @JDK versions: 1.8.0_101
 */
public class PayOrderPage implements Serializable {
    /**
     * 收货人地址信息
     */
    private TbAddress address;

    /**
     * 订单详情描述
     */
    private List<OrderPage> orderPages;

    public List<OrderPage> getOrderPages() {
        return orderPages;
    }

    public void setOrderPages(List<OrderPage> orderPages) {
        this.orderPages = orderPages;
    }

    public TbAddress getAddress() {
        return address;
    }

    public void setAddress(TbAddress address) {
        this.address = address;
    }
}

package com.rener.portal.model.vo;

import com.rener.portal.model.mo.TbGoods;
import java.io.Serializable;

public class OrdereDetails implements Serializable{
    /**
     * 商品信息
     */
    private TbGoods tbGoods;

    private Integer goodsNumber;

    private Long goodsTotalprice;

    private String orderDescribe;

    private Long orderdetails_id;

    public TbGoods getTbGoods() {
        return tbGoods;
    }

    public void setTbGoods(TbGoods tbGoods) {
        this.tbGoods = tbGoods;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Long getGoodsTotalprice() {
        return goodsTotalprice;
    }

    public void setGoodsTotalprice(Long goodsTotalprice) {
        this.goodsTotalprice = goodsTotalprice;
    }

    public String getOrderDescribe() {
        return orderDescribe;
    }

    public void setOrderDescribe(String orderDescribe) {
        this.orderDescribe = orderDescribe;
    }

    public Long getOrderdetails_id() {
        return orderdetails_id;
    }

    public void setOrderdetails_id(Long orderdetails_id) {
        this.orderdetails_id = orderdetails_id;
    }
}

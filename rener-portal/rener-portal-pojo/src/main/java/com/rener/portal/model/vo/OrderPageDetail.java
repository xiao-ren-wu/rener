package com.rener.portal.model.vo;

import com.rener.portal.model.mo.TbGoods;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Created with IDEA
 * @author:GaoPan
 * @Date:2018/1/27
 * @Time:3:17
 * @JDK versions: 1.8.0_101
 */
public class OrderPageDetail implements Serializable {
    private TbGoods tbGoods;
    private Integer goodsNumber;
    private String goodsTotalprice;

    private String nowPrice;

    public String getNowPrice() {
        return nowPrice;
    }

    public void setNowPrice(String nowPrice) {
        this.nowPrice = nowPrice;
    }

    public String getGoodsTotalprice() {
        return goodsTotalprice;
    }

    public void setGoodsTotalprice(String goodsTotalprice) {
        this.goodsTotalprice = goodsTotalprice;
    }

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
}

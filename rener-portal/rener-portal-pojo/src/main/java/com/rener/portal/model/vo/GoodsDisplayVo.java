package com.rener.portal.model.vo;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @Created with IDEA
 * @author:Yuwenbo
 * @Date:2018/1/30
 * @Time:18:17
 * @JDK versions: 1.8.0_101
 */
public class GoodsDisplayVo {

    private Long goodsId;

    private Long storeId;

    private Double praiseRate;

    private String goodsName;

    private String goodsPic;

    private Integer goodsSales;

    private Double goodsHeat;

    private String goodsPrice;

    private String nowPrice;

    private Long discountId;

    private Double discountRate;

    private Integer colleState;

    public Integer getColleState() {
        return colleState;
    }

    public void setColleState(Integer colleState) {
        this.colleState = colleState;
    }

    private List<String> goodsPicDetail =new ArrayList<String>();

    public List<String> getGoodsPicDetail() {
        return goodsPicDetail;
    }

    public void setGoodsPicDetail(List<String> goodsPicDetail) {
        this.goodsPicDetail = goodsPicDetail;
    }

    public String getNowPrice() {
        return nowPrice;
    }

    public void setNowPrice(String nowPrice) {
        this.nowPrice = nowPrice;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Double getPraiseRate() {
        return praiseRate;
    }

    public void setPraiseRate(Double praiseRate) {
        this.praiseRate = praiseRate;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsPic() {
        return goodsPic;
    }

    public void setGoodsPic(String goodsPic) {
        this.goodsPic = goodsPic;
    }

    public Integer getGoodsSales() {
        return goodsSales;
    }

    public void setGoodsSales(Integer goodsSales) {
        this.goodsSales = goodsSales;
    }

    public Double getGoodsHeat() {
        return goodsHeat;
    }

    public void setGoodsHeat(Double goodsHeat) {
        this.goodsHeat = goodsHeat;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Long getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }
}

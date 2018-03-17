package com.rener.portal.model.vo;

import java.io.Serializable;

/**
 * @author zhuwenqiang
 */
public class AllGoodsVo implements Serializable {
    private Long goodsId;
    private String goodsName;
    private String goodsPic;
    private Double praiseRate;
    private Double goodsPrice;
    private Integer goodsSales;
    private Double discountRate;
    private String storeName;
    private String storeAddress;
    private Double nowPrice;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
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

    public Double getPraiseRate() {
        return praiseRate;
    }

    public void setPraiseRate(Double praiseRate) {
        this.praiseRate = praiseRate;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsSales() {
        return goodsSales;
    }

    public void setGoodsSales(Integer goodsSales) {
        this.goodsSales = goodsSales;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public Double getNowPrice() {
        return nowPrice;
    }

    public void setNowPrice(Double nowPrice) {
        this.nowPrice = nowPrice;
    }

    @Override
    public String toString() {
        return "AllGoodsVo{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPic='" + goodsPic + '\'' +
                ", praiseRate=" + praiseRate +
                ", goodsPrice=" + goodsPrice +
                ", goodsSales=" + goodsSales +
                ", discountRate=" + discountRate +
                ", storeName='" + storeName + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", nowPrice=" + nowPrice +
                '}';
    }
}

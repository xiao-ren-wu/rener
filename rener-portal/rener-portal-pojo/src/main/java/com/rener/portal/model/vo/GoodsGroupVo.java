package com.rener.portal.model.vo;

public class GoodsGroupVo {
    private Long goodsId;
    private String goodsName;
    private String goodsPic;
    private String storeAddress;
    private String priceDiscripe;

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

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getPriceDiscripe() {
        return priceDiscripe;
    }

    public void setPriceDiscripe(String priceDiscripe) {
        this.priceDiscripe = priceDiscripe;
    }

    @Override
    public String toString() {
        return "GoodsGroupVo{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPic='" + goodsPic + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", priceDiscripe='" + priceDiscripe + '\'' +
                '}';
    }
}

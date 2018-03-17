package com.rener.portal.model.vo;

import java.io.Serializable;

/**
 * @author zhuwenqiang
 */
public class GoodsTypeVo implements Serializable {
    private String goodsType;

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    @Override
    public String toString() {
        return "GoodsTypeVo{" +
                "goodsType='" + goodsType + '\'' +
                '}';
    }
}

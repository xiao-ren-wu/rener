package com.rener.portal.model.vo;

import java.io.Serializable;

/**
 * @author zhuwenqiang
 */
public class GoodsNameVo implements Serializable {
    private String goodsName;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Override
    public String toString() {
        return "GoodsNameVo{" +
                "goodsName='" + goodsName + '\'' +
                '}';
    }
}

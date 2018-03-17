package com.rener.portal.model.vo;

import java.io.Serializable;

/**
 * @author zhuwenqiang
 */
public class GoodsPicNameVo implements Serializable {
    private String goodsType;
    private String goodsSamplePic;

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsSamplePic() {
        return goodsSamplePic;
    }

    public void setGoodsSamplePic(String goodsSamplePic) {
        this.goodsSamplePic = goodsSamplePic;
    }

    @Override
    public String toString() {
        return "GoodsPicNameVo{" +
                "goodsType='" + goodsType + '\'' +
                ", goodsSamplePic='" + goodsSamplePic + '\'' +
                '}';
    }
}



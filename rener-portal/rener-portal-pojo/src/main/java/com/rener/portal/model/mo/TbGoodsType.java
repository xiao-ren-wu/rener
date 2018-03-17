package com.rener.portal.model.mo;

import java.util.Date;

public class TbGoodsType {
    private Long goodsTypeId;

    private String goodsType;

    private String goodsSamplePic;

    private Date createTime;

    private Date updateTime;

    public Long getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Long goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public String getGoodsSamplePic() {
        return goodsSamplePic;
    }

    public void setGoodsSamplePic(String goodsSamplePic) {
        this.goodsSamplePic = goodsSamplePic == null ? null : goodsSamplePic.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
package com.rener.portal.model.mo;

import java.util.Date;

public class TbGoodsCar {
    private Long goodsCarId;

    private Long goodsId;

    private Long userId;

    private Integer count;

    private Integer mark;

    private Date createTime;

    private Date updateTime;

    public Long getGoodsCarId() {
        return goodsCarId;
    }

    public void setGoodsCarId(Long goodsCarId) {
        this.goodsCarId = goodsCarId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
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
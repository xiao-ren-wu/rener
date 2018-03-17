package com.rener.portal.model.vo;

public class TbGoodsCarView {
    private Long goods_car_id;

    private TbGoodsInfo tbGoodesInfo;

    private Integer count;

    private Long goods_id;

    public TbGoodsInfo getTbGoodesInfo() {
        return tbGoodesInfo;
    }

    public void setTbGoodesInfo(TbGoodsInfo tbGoodesInfo) {
        this.tbGoodesInfo = tbGoodesInfo;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Long getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Long goods_id) {
        this.goods_id = goods_id;
    }

    public Long getGoods_car_id() {

        return goods_car_id;
    }

    public void setGoods_car_id(Long goods_car_id) {
        this.goods_car_id = goods_car_id;
    }
}

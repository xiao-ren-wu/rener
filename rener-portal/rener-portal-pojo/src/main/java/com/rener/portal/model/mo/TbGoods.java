package com.rener.portal.model.mo;

import java.math.BigDecimal;
import java.util.Date;

public class TbGoods {
    private Long goodsId;

    private Long storeId;

    private String goodsName;

    private String goodsPic;

    private String goodsPicDetail;

    private Integer goodsSales;

    private Integer evaluationNumber;

    private Double praiseRate;

    private Double goodsHeat;

    private BigDecimal goodsPrice;

    private Long discountId;

    private Integer convertGrade;

    private Integer souvenirTag;

    private Long goodsTypeId;

    private Integer appointmentTag;

    private Date createTime;

    private Date updateTime;

    private String goodsDetail;

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

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsPic() {
        return goodsPic;
    }

    public void setGoodsPic(String goodsPic) {
        this.goodsPic = goodsPic == null ? null : goodsPic.trim();
    }

    public String getGoodsPicDetail() {
        return goodsPicDetail;
    }

    public void setGoodsPicDetail(String goodsPicDetail) {
        this.goodsPicDetail = goodsPicDetail == null ? null : goodsPicDetail.trim();
    }

    public Integer getGoodsSales() {
        return goodsSales;
    }

    public void setGoodsSales(Integer goodsSales) {
        this.goodsSales = goodsSales;
    }

    public Integer getEvaluationNumber() {
        return evaluationNumber;
    }

    public void setEvaluationNumber(Integer evaluationNumber) {
        this.evaluationNumber = evaluationNumber;
    }

    public Double getPraiseRate() {
        return praiseRate;
    }

    public void setPraiseRate(Double praiseRate) {
        this.praiseRate = praiseRate;
    }

    public Double getGoodsHeat() {
        return goodsHeat;
    }

    public void setGoodsHeat(Double goodsHeat) {
        this.goodsHeat = goodsHeat;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Long getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public Integer getConvertGrade() {
        return convertGrade;
    }

    public void setConvertGrade(Integer convertGrade) {
        this.convertGrade = convertGrade;
    }

    public Integer getSouvenirTag() {
        return souvenirTag;
    }

    public void setSouvenirTag(Integer souvenirTag) {
        this.souvenirTag = souvenirTag;
    }

    public Long getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Long goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public Integer getAppointmentTag() {
        return appointmentTag;
    }

    public void setAppointmentTag(Integer appointmentTag) {
        this.appointmentTag = appointmentTag;
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

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail == null ? null : goodsDetail.trim();
    }
}
package com.rener.portal.service;

import com.rener.portal.model.vo.AllGoodsVo;
import com.rener.portal.model.vo.GoodsTypeVo;

import java.util.List;

/**
 * @author zhuwenqiang
 */
public interface FuzzySelectService {
    List<GoodsTypeVo> fuzzySelectType(String types);//从数据库中模糊查询包含该字段的商品类型

//    List<AllGoodsVo> selectByType(String types);//通过模糊商品类型查询商品

    List<GoodsTypeVo> goodsHeatType();//查询热度前四的商品类型
}

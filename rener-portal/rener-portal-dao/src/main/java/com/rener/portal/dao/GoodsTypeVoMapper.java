package com.rener.portal.dao;

import com.rener.portal.model.vo.AllGoodsVo;
import com.rener.portal.model.vo.GoodsTypeVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhuwenqiang
 */
@Repository
public interface GoodsTypeVoMapper {
    List<GoodsTypeVo> type();//查询所有商品的类型，加载页面时返回

    List<GoodsTypeVo>  selectSomeType(@Param("number") Integer number);//从数据库查询6-8个商品类型，加载页面时返回

    List<GoodsTypeVo> fuzzySelectType(@Param("types") String types);//从数据库中模糊查询包含该字段的商品类型

    List<GoodsTypeVo> goodsHeatType();//查询按热度商品类型
}

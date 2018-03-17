package com.rener.portal.dao;

import com.rener.portal.model.vo.AllGoodsVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhuwenaiqng
 */
@Repository
public interface AllGoodsVoMapper {
//    List<AllGoodsVo> SelectAllGoods();//查詢所有商品，页面加载时展示

    //List<AllGoodsVo> SelectOneGoods(@Param("names") String names);//通过名称模糊查询商品信息，浮动的五个和搜所框里的商品名称，返回满足该条件的商品信息

//    List<AllGoodsVo> SelectGoodsByType(@Param("types") String types, @Param("start") Integer start);//通过商品类型，查询满足条件所有商品
//    List<AllGoodsVo> SelectAllGoodsByName(@Param("names") String names, @Param("start") Integer start);//通过模糊商品名称查询这一类商品，此次项目没用到

    /**
     * @param types   商品类型
     * @param address 商区地址
     * @param auto    按什么排序
     * @return 查询满足该条件的所有商品信息
     */

    List<AllGoodsVo> Selectes(@Param("types") String types, @Param("address") String address, @Param("auto") String auto);

    /**
     * chenkuan
     *
     * @return 返回针对商铺详情的商品信息 (@Param("userId") Integer userId, @Param("storeId") Integer storeId
     */
    List<AllGoodsVo> selectGoodsToStore(@Param("storeId") Long storeId);


}

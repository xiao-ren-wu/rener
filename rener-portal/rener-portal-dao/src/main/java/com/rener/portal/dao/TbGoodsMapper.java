package com.rener.portal.dao;


import com.rener.portal.model.mo.TbGoods;
import com.rener.portal.model.vo.TbGoodsInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Yuwenbo
 */
@Repository
public interface TbGoodsMapper {
    TbGoods findGoodsById(Long goodsId);

    void updateGoodsMag();

    TbGoodsInfo selectGoodsInfo(Long goodsId);

    List<Long> selectGoodsId(List<Long> storeId);

    List<Long> selectTypeCount(List<Long> list);

    BigDecimal selectGoodsPrice(Long goodsId);

    int updateGoodsNum(@Param("goodsId") Long goodsId, @Param("num") Integer num);

    Long selectDiscountById(@Param("goodsId") Long goodsId);

}

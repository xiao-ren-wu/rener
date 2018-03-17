package com.rener.portal.dao;

import com.rener.portal.model.mo.TbGoodsCar;
import com.rener.portal.model.vo.TbGoodsCarView;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbGoodsCarMapper {
    /**
     * @param storeId
     * @param goodsId
     * @return一个店铺的商品
     */
    List<TbGoodsCar> selectByStoreId(@Param("storeId") Long storeId,
                                     @Param("goodsId") List<Long> goodsId,@Param("userId")Long userId);

    List<TbGoodsCarView> selectByUserId(@Param("userId") Long userId);

    Integer insert(TbGoodsCar tbGoodsCar);

    void delete(List<Long> idList);

    Integer updateCnt(@Param("count") Integer cnt, @Param("goodsCarId") Long goodsCarId);

    Integer updateCntInStore(@Param("userId") Long userId, @Param("goodsId") Long goodsId);

    Integer updateOnMark(@Param("userId") Long userId, @Param("goodsId") Long goodsId);

//    Integer updateOffMark(@Param("userId") Long userId, @Param("goodsId") Long goodsId);

    void updateN(@Param("goodsCarId") Long goodsCarId, @Param("n") Long n);

    Integer cntAddOne(@Param("userId") Long userId, @Param("goodsId") Long goodsId);

    Integer findCount(@Param("userId") Long userId, @Param("goodsId") Long goodsId);
}


package com.rener.portal.service;

import com.rener.portal.model.mo.TbGoodsCar;
import com.rener.portal.model.vo.TbGoodsCarView;

import java.util.List;
import java.util.Map;
import java.util.Vector;

public interface TbGoodsCarService {
//    Integer outGoodsCar(Long userId, Long goodsId);

    Integer deleteGoods(List<Long> idList);

    Integer inGoodsCar(Long userId, Long goodsId);

    Map<String, Vector<TbGoodsCarView>> showGoodsCar(Long userId);

    Integer updateCount(Integer cnt, Long goodsCarId);

    void setN(Long goodsCarId, Long n);

//    Integer cntAddOne(Long userId, Long goodsId);
}

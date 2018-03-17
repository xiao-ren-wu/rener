package com.rener.portal.service;

import com.rener.portal.model.vo.GoodsDisplayVo;

/**
 * @Created with IDEA
 * @author:Yuwenbo
 * @Date:2018/1/29
 * @Time:11:06
 * @JDK versions: 1.8.0_101
 */
public interface ShowOneGoodsService {
    /**
     * 通过商品id找到商品
     * @param goodsId
     * @return
     */
    GoodsDisplayVo findOneGoods(Long goodsId,Long userId);
}

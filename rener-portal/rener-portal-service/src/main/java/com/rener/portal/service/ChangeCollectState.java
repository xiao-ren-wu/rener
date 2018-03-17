package com.rener.portal.service;

/**
 * @Created with IDEA
 * @author:Yuwenbo
 * @Date:2018/1/25
 * @Time:15:49
 * @JDK versions: 1.8.0_101
 */
public interface ChangeCollectState {

    /**
     * 通过用户id和商铺id更改收藏标志位
     * 如果该用户之前没有收藏过该商品，则新建一条数据，如果之前收藏过，更改收藏标志位
     * @param storeId 店铺id
     * @param userId    用户id
     * @return  返回收藏标志
     */
    Integer changeCollectState(Long storeId, Long userId);
}

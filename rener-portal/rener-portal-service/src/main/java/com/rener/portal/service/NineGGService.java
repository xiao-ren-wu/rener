package com.rener.portal.service;

import java.util.Map;

/**
 * 提取九宫格的收藏店铺数量和订单数量
 * @author 大表哥陈
 */
public interface NineGGService {
    Map<String,Integer> selectNine(Long userId);
}

package com.rener.portal.service.impl;

import com.rener.portal.dao.TbColleMapper;
import com.rener.portal.dao.TbOrdersMapper;
import com.rener.portal.service.NineGGService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 大表哥陈
 */
@Service
public class NineGGServiceImpl implements NineGGService {
    @Resource
    TbColleMapper tbColleMapper;
    @Resource
    TbOrdersMapper tbOrdersMapper;
    @Override
    public Map<String, Integer> selectNine(Long userId) {
        Map map = new HashMap();
        int colleCounts = tbColleMapper.colleCounts(userId);
        int orderCounts = tbOrdersMapper.selectOrderNum(userId);
        map.put("colleCounts",colleCounts);
        map.put("orderCounts",orderCounts);
        return map;
    }
}

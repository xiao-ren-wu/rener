package com.rener.portal.service.impl;

import com.rener.portal.dao.AllGoodsVoMapper;
import com.rener.portal.dao.GoodsTypeVoMapper;
import com.rener.portal.model.vo.AllGoodsVo;
import com.rener.portal.model.vo.GoodsTypeVo;
import com.rener.portal.service.FuzzySelectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author zhuwenqiang
 */
@Service
public class FuzzySelectServiceImpl implements FuzzySelectService {
    @Resource
    private GoodsTypeVoMapper goodsTypeVoMapper;
    @Resource
    private AllGoodsVoMapper allGoodsVoMapper;

    //模糊查询商品类型
    @Override
    public List<GoodsTypeVo> fuzzySelectType(String types) {
        List<GoodsTypeVo> goodsTypeVos = goodsTypeVoMapper.fuzzySelectType(types);
        return goodsTypeVos;
    }

    @Override
    public List<GoodsTypeVo> goodsHeatType() {
        List<GoodsTypeVo> goodsTypeVoList = goodsTypeVoMapper.goodsHeatType();
        List<String> str = new ArrayList<>();
        List<GoodsTypeVo> list = new ArrayList<>();
        for (GoodsTypeVo vo:goodsTypeVoList){
            if (!str.contains(vo.getGoodsType())&&str.size()<7){
                str.add(vo.getGoodsType());
                list.add(vo);
            }
        }
        return list;
    }
}

package com.rener.portal.dao;

import com.rener.portal.model.vo.GoodsGroupVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsGroupVoMapper {

//    List<GoodsGroupVo> goodsGroup();

    List<GoodsGroupVo> SelectesGoodsGroup(@Param("types") String types, @Param("address") String address, @Param("auto") String auto);

}

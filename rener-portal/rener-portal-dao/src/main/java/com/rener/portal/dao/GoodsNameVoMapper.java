package com.rener.portal.dao;

import com.rener.portal.model.vo.GoodsNameVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Zhuwenqiang
 */
@Repository
public interface GoodsNameVoMapper {
    /**
     * 查询按销量排序前五的商品名称，加载页面时返回
     */
//    List<GoodsNameVo> goodsName();

//    List<GoodsNameVo> fuzzysearch();//模糊查询商品名称，下拉框中显示的
}

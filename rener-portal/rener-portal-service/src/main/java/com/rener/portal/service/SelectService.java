package com.rener.portal.service;

import com.rener.portal.model.vo.AllGoodsVo;
import com.rener.portal.model.vo.GoodsAddressVo;
import com.rener.portal.model.vo.GoodsTypeVo;

import java.util.List;

/**
 * @author zhuwenqiang
 */
public interface SelectService {
    List<GoodsTypeVo> types();//查询所有商品的类型，加载页面时返回

    List<GoodsAddressVo> address();//查詢商品地址(去重)，在全部商区里，加载页面时返回

    List<String> auto();//设置排序类型

    /**
     * @param types   商品类型
     * @param address 商区地址
     * @param auto    按什么排序
     * @return 查询满足该条件的所有商品信息
     */
    List<AllGoodsVo> Selectes(String types, String address, String auto);

}

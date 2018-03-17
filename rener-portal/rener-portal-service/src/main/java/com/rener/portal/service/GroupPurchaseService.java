package com.rener.portal.service;

import com.rener.portal.model.vo.*;

import java.util.List;
import java.util.Set;

/**
 * @author zhuwenqiang
 */
public interface GroupPurchaseService {
    List<GoodsPicNameVo> PicName();//查询销量前四的商品类型和URL，加载页面时返回
    List<GoodsTypeVo>  selectSomeType();//从数据库随机查询6-8个商品类型，加载页面时返回
    List<GoodsTypeVo> types();//查询所有商品的类型，加载页面时返回
    List<String> address();//查詢商品地址(去重)，在全部商区里，加载页面时返回
    List<String> auto();//设置排序类型
//    List<GoodsGroupVo> goodsGroup();
    List<GoodsGroupVo> selectGoodsGroup(String types,String address,String auto);//页面查询

}

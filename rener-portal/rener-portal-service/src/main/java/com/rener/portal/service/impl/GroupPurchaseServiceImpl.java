package com.rener.portal.service.impl;

import com.rener.portal.dao.*;
import com.rener.portal.model.vo.*;
import com.rener.portal.service.GroupPurchaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author zhuwenqiang
 */
@Service
public class GroupPurchaseServiceImpl implements GroupPurchaseService {
    @Resource
    private AllGoodsVoMapper allGoodsVoMapper;
    @Resource
    private GoodsPicNameVoMapper goodsPicNameVoMapper;
    @Resource
    private GoodsTypeVoMapper goodsTypeVoMapper;
    @Resource
    private GoodsAddressVoMapper goodsAddressVoMapper;
    @Resource
    private GoodsGroupVoMapper goodsGroupVoMapper;
    //查询销量前四的商品类型和样图
    @Override
    public List<GoodsPicNameVo> PicName() {
        List<String> thisType = new ArrayList<>();
        List<GoodsPicNameVo> goodsPicNameVos = new ArrayList<GoodsPicNameVo>();
        List<GoodsPicNameVo> list = goodsPicNameVoMapper.PicName();
        for (GoodsPicNameVo vo:list
                ) {
            if (!thisType.contains(vo.getGoodsType())&&goodsPicNameVos.size()<4){
                goodsPicNameVos.add(vo);
                thisType.add(vo.getGoodsType());
            }
        }
        return goodsPicNameVos;
    }
    //从数据库随机查询6-8个商品类型，加载页面时返回
    @Override
    public List<GoodsTypeVo> selectSomeType() {
        Random r = new Random();
        int n = Math.abs(r.nextInt() % 2) +7;
        List<GoodsTypeVo> someType = goodsTypeVoMapper.selectSomeType(n);
        return someType;
    }
    //查询所有商品的类型，加载页面时返回,在全部类型里，两个页面
    @Override
    public List<GoodsTypeVo> types() {
        GoodsTypeVo goodsTypeVo = new GoodsTypeVo();
        goodsTypeVo.setGoodsType("全部分类");
        List<GoodsTypeVo> type = goodsTypeVoMapper.type();
        List<GoodsTypeVo> types =new ArrayList<>();
        types.add(goodsTypeVo);
        for (GoodsTypeVo goodsTypeVo1:type){
            types.add(goodsTypeVo1);
        }
        return types;
    }
    //查詢商品地址(去重)，在全部商区里，加载页面时返回,两个页面
    @Override
    public List<String> address() {
        GoodsAddressVo goodsAddressVo = new GoodsAddressVo();
        goodsAddressVo.setStoreAddress("全部商区");
        List<GoodsAddressVo> address = goodsAddressVoMapper.address();
        Set<String> addresses = new HashSet<>();
        for (GoodsAddressVo goodsAddressVo1:address){
            String address1 = goodsAddressVo1.getStoreAddress();
            int indexOf = address1.indexOf("区");
            address1 = address1.substring(0, indexOf+1);
            addresses.add(address1);
        }
        addresses.add("全部商区");
        Stack<String> stack = new Stack<>();
        List<String> strings = new ArrayList<>();
        for (String ss:addresses){
            stack.push(ss);
        }
        while (!stack.isEmpty()){
            strings.add(stack.pop());
        }
        return strings;

    }
    //两个页面
    @Override
    public List<String> auto() {
        List<String> auto = new ArrayList<>();
        auto.add("智能排序");
        auto.add("销量");
        auto.add("热度");
        auto.add("价格");
        auto.add("距离");
        return auto;
    }

    ////查询商品折扣详情
//    @Override
//    public List<GoodsGroupVo> goodsGroup() {
//        List<GoodsGroupVo> list = new ArrayList<>();
//
//            list=goodsGroupVoMapper.goodsGroup();
//
//        for (GoodsGroupVo allGoodsVo:list) {
//            String addresses = allGoodsVo.getStoreAddress();
//            int indexOf = addresses.indexOf("区");
//            String address  = addresses.substring(0,indexOf+1);
//            allGoodsVo.setStoreAddress(address);
//        }
//
//        return list;
//    }
//按需求查询商品折扣详情
    @Override
    public List<GoodsGroupVo> selectGoodsGroup(String types, String address, String auto) {
        List<GoodsGroupVo> list = new ArrayList<>();
//        if (start==0){
//            start=3;

//        }
//       if (start==2){
//            list=goodsGroupVoMapper.SelectesGoodsGroup(types, address, auto,start+1);
//        }else {
            list=goodsGroupVoMapper.SelectesGoodsGroup(types, address, auto);
//        }

        for (GoodsGroupVo allGoodsVo:list) {
            String addresses = allGoodsVo.getStoreAddress();
            int indexOf = addresses.indexOf("区");
            address  = addresses.substring(0,indexOf+1);
            allGoodsVo.setStoreAddress(address);
        }
        return list;
    }
}

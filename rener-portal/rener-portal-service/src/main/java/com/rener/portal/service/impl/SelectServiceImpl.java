package com.rener.portal.service.impl;

import com.rener.portal.dao.AllGoodsVoMapper;
import com.rener.portal.dao.GoodsAddressVoMapper;
import com.rener.portal.dao.GoodsTypeVoMapper;
import com.rener.portal.model.vo.AllGoodsVo;
import com.rener.portal.model.vo.GoodsAddressVo;
import com.rener.portal.model.vo.GoodsTypeVo;
import com.rener.portal.service.SelectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuwenqiang
 */
@Service
public class SelectServiceImpl implements SelectService {
    @Resource
    private AllGoodsVoMapper allGoodsVoMapper;

    @Override
    public List<GoodsTypeVo> types() {
        return null;
    }

    @Override
    public List<GoodsAddressVo> address() {
        return null;
    }

    @Override
    public List<String> auto() {
        return null;
    }

    //按需查询商品信息
    @Override
    public List<AllGoodsVo> Selectes(String types, String address, String auto) {
        List<AllGoodsVo> selectes = new ArrayList<>();
//        if (start >= 0) {
        selectes = allGoodsVoMapper.Selectes(types, address, auto);
//        if (selectes.size() == 0) {
//            selectes = allGoodsVoMapper.Selectes("全部分类", address, auto);
//        }
//        }
        for (AllGoodsVo allGoodsVo : selectes) {
            Double goodsPrice = allGoodsVo.getGoodsPrice();
            Double priceRate = allGoodsVo.getDiscountRate();
            Double nowPrice = goodsPrice * priceRate;
            DecimalFormat df = new DecimalFormat(".##");
            String st = df.format(nowPrice);
            nowPrice = Double.parseDouble(st);
            allGoodsVo.setNowPrice(nowPrice);
            String addresses = allGoodsVo.getStoreAddress();
            int indexOf = addresses.indexOf("区");
            addresses = addresses.substring(0, indexOf + 1);
            allGoodsVo.setStoreAddress(addresses);
        }
        return selectes;
    }

    /**通过商品类型查询商
     * @param types
     * @param start
     * @return
     */
    //通过商品类型查询商品
//    @Override
//    public List<AllGoodsVo> SelectGoodsByType(String types) {
//        List<AllGoodsVo> selectGoodsByType = allGoodsVoMapper.SelectGoodsByType(types);
//        if (selectGoodsByType == null){
//            selectGoodsByType = allGoodsVoMapper.SelectAllGoods();
//        }
//        for (AllGoodsVo allGoodsVo:selectGoodsByType) {
//            String addresses = allGoodsVo.getStoreAddress();
//            int indexOf = addresses.indexOf("区");
//            addresses  = addresses.substring(0,indexOf+1);
//            allGoodsVo.setStoreAddress(addresses);
//        }
//        return selectGoodsByType;
//    }


}

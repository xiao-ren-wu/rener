package com.rener.portal.service.impl;

import com.rener.portal.dao.TbColleMapper;
import com.rener.portal.dao.TbDiscountMapper;
import com.rener.portal.dao.TbGoodsMapper;
import com.rener.portal.model.mo.TbColle;
import com.rener.portal.model.mo.TbGoods;
import com.rener.portal.model.vo.GoodsDisplayVo;
import com.rener.portal.service.ShowOneGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @Created with IDEA
 * @author:Yuwenbo
 * @Date:2018/1/29
 * @Time:11:08
 * @JDK versions: 1.8.0_101
 */
@Service
public class ShowOneGoodsServiceImpl implements ShowOneGoodsService {
    @Resource
    TbGoodsMapper tbGoodsMapper;
    @Resource
    TbDiscountMapper tbDiscountMapper;
    @Resource
    TbColleMapper tbColleMapper;
    @Override
    public GoodsDisplayVo findOneGoods(Long goodsId,Long userId) {
        TbGoods goods = tbGoodsMapper.findGoodsById(goodsId);
        GoodsDisplayVo goodsDetail = new GoodsDisplayVo();
        this.copy(goods,goodsDetail,goodsId);
        Long storeId = goodsDetail.getStoreId();
        TbColle tbColle = new TbColle();
        tbColle.setColleUserId(userId);
        tbColle.setColleStoreId(storeId);
        goodsDetail.setColleState(tbColleMapper.findCollectState(tbColle)==null?1:0);
        return goodsDetail;
    }
    private void copy(TbGoods tbGoods,GoodsDisplayVo goodsDisplayVo,Long goodsId){
        DecimalFormat df = new DecimalFormat("#.00");
        goodsDisplayVo.setGoodsId(tbGoods.getGoodsId());
        goodsDisplayVo.setStoreId(tbGoods.getStoreId());
        goodsDisplayVo.setPraiseRate(tbGoods.getPraiseRate());
        goodsDisplayVo.setGoodsName(tbGoods.getGoodsName());
        goodsDisplayVo.setGoodsPic(tbGoods.getGoodsPic());
        goodsDisplayVo.setGoodsSales(tbGoods.getGoodsSales());
        goodsDisplayVo.setGoodsHeat(tbGoods.getGoodsHeat());
        goodsDisplayVo.setGoodsPrice(df.format(tbGoods.getGoodsPrice()));
        Double discountRate = tbDiscountMapper.findDiscountRate(goodsId);
        if(discountRate==null){
            discountRate=1.0;
        }
        BigDecimal rate = new BigDecimal(discountRate);
        goodsDisplayVo.setNowPrice(df.format(tbGoods.getGoodsPrice().multiply(rate)));
        goodsDisplayVo.setDiscountId(tbGoods.getDiscountId());
        goodsDisplayVo.setDiscountRate(discountRate);
        //将字符串拼接转换成List
        String[] picDetail=tbGoods.getGoodsPicDetail().split("@@");
        for(String pic:picDetail){
            goodsDisplayVo.getGoodsPicDetail().add(pic);
        }
    }
}

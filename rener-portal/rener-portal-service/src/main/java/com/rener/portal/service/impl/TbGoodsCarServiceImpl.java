package com.rener.portal.service.impl;

import com.rener.portal.dao.TbGoodsCarMapper;
import com.rener.portal.dao.TbGoodsMapper;
import com.rener.portal.model.mo.TbGoodsCar;
import com.rener.portal.model.vo.TbGoodsCarView;
import com.rener.portal.service.TbGoodsCarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class TbGoodsCarServiceImpl implements TbGoodsCarService {
    @Resource
    private TbGoodsCarMapper tbGoodsCarMapper;

//    @Override
//    public Integer outGoodsCar(Long userId, Long goodsId) {
//        Integer result = new Integer(0);
//        if (null != userId && null != goodsId) {
//            result = tbGoodsCarMapper.updateOffMark(userId, goodsId);
//        }
//        return result;
//    }

    @Override
    public Integer deleteGoods(List<Long> idList) {
        if (null != idList && 0 != idList.size()) {
            tbGoodsCarMapper.delete(idList);
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public Integer inGoodsCar(Long userId, Long goodsId) {
        Integer resultUpdate = null;
        if (null != userId && null != goodsId) {
            TbGoodsCar tbGoodsCar = new TbGoodsCar();
            tbGoodsCar.setUserId(userId);
            tbGoodsCar.setGoodsId(goodsId);
            if (0 == (resultUpdate = tbGoodsCarMapper.updateCntInStore(userId, goodsId))
                    && 0 == (resultUpdate = tbGoodsCarMapper.updateOnMark(userId, goodsId))
                    ) {
                resultUpdate = tbGoodsCarMapper.insert(tbGoodsCar);
            }
        }
        return resultUpdate;
    }

    @Override
    public  Map<String, Vector<TbGoodsCarView>> showGoodsCar(Long userId) {
        if (null != userId) {
            //获取所有的该用户添加到购物车里的商品
            List<TbGoodsCarView> goodsList = tbGoodsCarMapper.selectByUserId(userId);
            //storeList用于存放购物车里所有出现的店铺id
            List<String> storeList = new ArrayList();
            //goodsMap存储该方法的返回值结果
            Map<String, Vector<TbGoodsCarView>> goodsMap = new LinkedHashMap<String, Vector<TbGoodsCarView>>();
            //遍历所有商品,将购物车中出现的所有商铺添加到storeList中
            for (TbGoodsCarView t : goodsList) {
                int index;
                for (index = 0;
                     index < storeList.size()
                             && !(t.getTbGoodesInfo().getStoreName().
                             equals(storeList.get(index)));
                     index++){}
                if (index == storeList.size()) {
                    storeList.add(t.getTbGoodesInfo().getStoreName());
                }
            }
            //将商品按店铺分类存入goodsMap中
            for (String storeName : storeList) {
                Vector<TbGoodsCarView> goodsVector = new Vector<TbGoodsCarView>();
                for (TbGoodsCarView t : goodsList) {
                    if (storeName.equals(t.getTbGoodesInfo().getStoreName())) {
                        goodsVector.add(t);
                    }
                }
                goodsMap.put(storeName, goodsVector);
            }
            return goodsMap;
        } else {
            return null;
        }
    }

    @Override
    public Integer updateCount(Integer cnt, Long goodsCarId) {
        if (null != cnt && null != goodsCarId) {
            tbGoodsCarMapper.updateCnt(cnt, goodsCarId);
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public void setN(Long goodsCarId, Long n) {
        tbGoodsCarMapper.updateN(goodsCarId,n);
    }

//    @Override
//    public Integer cntAddOne(Long userId, Long goodsId) {
//        Integer result = 0, cnt = -1;
//        if (null != userId && null != goodsId) {
//            result = tbGoodsCarMapper.cntAddOne(userId, goodsId);
//        }
//        if (0 != result) {
//            cnt = tbGoodsCarMapper.findCount(userId, goodsId);
//        }
//        return cnt;
//    }
}

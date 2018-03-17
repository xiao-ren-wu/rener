package com.rener.portal.web.action;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.rener.portal.model.mo.TbUsers;
import com.rener.portal.model.vo.TbGoodsCarView;
import com.rener.portal.service.TbGoodsCarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.*;

@CrossOrigin
@Controller
@RequestMapping("goodsBasket")
public class GoodsCar {
    @Resource
    private TbGoodsCarService tbGoodsCarServiceImpl;

    @RequestMapping("showBasket")
    public @ResponseBody
    JSONObject showBasket(HttpSession session) {
        TbUsers user = null != session ? (TbUsers) session.getAttribute("user") : null;
        Long userId = null != user ? user.getUserId() : null;
        //接收service层返回的按店铺分类的所有商品
        Map<String, Vector<TbGoodsCarView>> map = tbGoodsCarServiceImpl.showGoodsCar(userId);
        JSONObject jsonObject = new JSONObject();
        JSONArray storeArray = new JSONArray();
        //获得所有店铺名称的集合
        Set<String> storeNames = null != map ? map.keySet() : null;
        //获取遍历店铺名称集合的迭代器
        Iterator<String> it = null != storeNames ? storeNames.iterator() : null;
        //前端渲染页面需要这个n,status代表本次请求是否成功
        int n, status;
        //初始化n和status
        n = status = 0;
        //创建价钱格式
        DecimalFormat priceFormat = new DecimalFormat("#.00");
        if (null != it) {
            //遍历店铺名称
            while (it.hasNext()) {
                //获取本次遍历的店铺的名称
                String storeName = it.next();
                JSONObject storeObject = new JSONObject();
                JSONArray goodsArray = new JSONArray();
                //遍历购物车中该店铺的所有商品
                for (TbGoodsCarView t : map.get(storeName)) {
                    JSONObject goodsObject = new JSONObject();
                    goodsObject.put("count", t.getCount());
                    goodsObject.put("discountRate", t.getTbGoodesInfo().getDiscountRate());
                    goodsObject.put("goodsName", t.getTbGoodesInfo().getGoodsName());
                    goodsObject.put("goodsPic", t.getTbGoodesInfo().getGoodsPic());
                    goodsObject.put("prePrice", t.getTbGoodesInfo().getGoodsPrice());
                    goodsObject.put("nowPrice",
                            new BigDecimal(
                                    priceFormat.format(
                                    t.getTbGoodesInfo().getGoodsPrice().multiply(
                                    new BigDecimal(t.getTbGoodesInfo().getDiscountRate()))
                                    )
                            )
                    );
                    goodsObject.put("goodsId", t.getGoods_id());
                    goodsObject.put("goodsCarId", t.getGoods_car_id());
                    goodsObject.put("n", n);
                    tbGoodsCarServiceImpl.setN(t.getGoods_car_id(), new Long(n));
                    ++n;
                    goodsArray.add(goodsObject);
                }
                storeObject.put("storeName", storeName);
                storeObject.put("goodsList", goodsArray);
                storeObject.put("storeId",
                        map.get(storeName).get(0).getTbGoodesInfo().getStoreId());
                storeObject.put("price", 0);
                storeArray.add(storeObject);
                status = 1;
            }
        } else {
            status = 0;
        }
        jsonObject.put("status", status);
        //如果这个first改了,前端还得改,太麻烦了
        jsonObject.put("first", storeArray);
        return jsonObject;
    }

    @RequestMapping("deleteGoods")
    public @ResponseBody
    JSONObject deleteGoods(Long[] goodsCarIds) {
        List<Long> goodsCarIdList = new ArrayList<Long>();
        if (null != goodsCarIds) {
            for (Long t : goodsCarIds) {
                goodsCarIdList.add(t);
            }
        }
        Integer status = tbGoodsCarServiceImpl.deleteGoods(goodsCarIdList);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", status);
        return jsonObject;
    }

    @RequestMapping("modifyCnt")
    public @ResponseBody
    JSONObject modifyCnt(Integer cnt, Long goodsCarId) {
        JSONObject jsonObject = new JSONObject();
        Integer status = tbGoodsCarServiceImpl.updateCount(cnt, goodsCarId);
        jsonObject.put("status", status);
        return jsonObject;
    }

    @RequestMapping("addGoods")
    public @ResponseBody
    JSONObject addGoods(HttpSession session, Long goodsId) {
        TbUsers tbUsers = null != session ? (TbUsers) session.getAttribute("user") : null;
        Long userId = null != tbUsers ? tbUsers.getUserId() : null;
        JSONObject jsonObject = new JSONObject();
        Integer status = null;
        if (null != userId && null != goodsId) {
            status = tbGoodsCarServiceImpl.inGoodsCar(userId, goodsId);
        }
        if (null == status) {
            jsonObject.put("status", 0);
        }
        else {
            jsonObject.put("status", 1);
        }
        return jsonObject;
    }

//    @RequestMapping("offMark")
//    public @ResponseBody
//    JSONObject offMark(HttpSession session, Long goodsId) {
//        TbUsers tbUsers = null != session ? (TbUsers) session.getAttribute("user") : null;
//        Long userId = null != tbUsers ? tbUsers.getUserId() : null;
//        JSONObject jsonObject = new JSONObject();
//        Integer status = null != userId && null != goodsId ?
//                tbGoodsCarServiceImpl.outGoodsCar(userId, goodsId) : null;
//        if (null == status || 0 == status) {
//            jsonObject.put("status", 0);
//        }
//        else {
//            jsonObject.put("status", 1);
//        }
//        return jsonObject;
//    }

//    @RequestMapping("clickBasket")
//    public @ResponseBody JSONObject clickBasket(HttpSession session, Long goodsId) {
//        TbUsers tbUsers = null != session ? (TbUsers) session.getAttribute("user") : null;
//        Long userId = null != tbUsers ? tbUsers.getUserId() : null;
//        JSONObject jsonObject = new JSONObject();
//        Integer cnt = -1;
//        if (null != userId && null != goodsId) {
//            cnt = tbGoodsCarServiceImpl.cntAddOne(userId, goodsId);
//        }
//        if (-1 == cnt) {
//            jsonObject.put("status", 0);
//        } else {
//            jsonObject.put("status", 1);
//            jsonObject.put("count", cnt);
//        }
//        return jsonObject;
//    }
}

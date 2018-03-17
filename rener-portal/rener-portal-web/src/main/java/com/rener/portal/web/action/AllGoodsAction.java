package com.rener.portal.web.action;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.rener.portal.model.vo.*;
import com.rener.portal.service.GroupPurchaseService;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/**
 * @author zhuwenqiang
 */
@Controller
@CrossOrigin
@RequestMapping("/goods")
public class AllGoodsAction {
    @Resource
    private GroupPurchaseService groupPurchaseService;
//    @RequestMapping(value = "/goodsGroup", method = RequestMethod.GET)
//    public @ResponseBody
//    JSONObject all(@RequestParam("start") Integer start, HttpSession httpSession) {
////        String JSONStr = JSON.toJSONString(list);//json字符串
////        JSONObject json=JSON.parseObject(JSONStr);//json对象
//        String address2;
//        String auto2;
//        String types2;
//        address2 = "全部商区";
//        auto2 = "智能排序";
//        types2 = "全部分类";
//
////        if (!json.containsKey("address")){
////            address2 = "全部商区";
////        }else {
////            address2 = json.getString("address");
////        }
////        if (!json.containsKey("auto")){
////            auto2 = "智能排序";
////        }else {
////            auto2 = json.getString("auto");
////        }
////        if (!json.containsKey("types")){
////            types2 = "全部分类";
////        }else {
////            types2 = json.getString("types");
////        }
//
//        //存入session
////        httpSession.setAttribute("types",types2);
////        httpSession.setAttribute("address",address2);
////        httpSession.setAttribute("auto",auto2);
//
////        Integer start = json.getInteger("start");
//
//        List<GoodsPicNameVo> goodsPicNameVo = groupPurchaseService.PicName();
//
//        List<GoodsTypeVo> goodsTypeVos = groupPurchaseService.selectSomeType();
//
//        List<GoodsTypeVo> types = groupPurchaseService.types();
//
//        List<String> address = groupPurchaseService.address();
//
//        List<String> auto = groupPurchaseService.auto();
//
//        List<GoodsGroupVo> goodsGroup = groupPurchaseService.selectGoodsGroup(types2, address2, auto2);
//
////        List<GoodsGroupVo> firstList = new ArrayList<>();
////
////        List<GoodsGroupVo> lastList = new ArrayList<>();
//
////        if (goodsGroup.size() > 3) {
////            for (int i = 0; i < 3; i++) {
////                firstList.add(goodsGroup.get(i));
////            }
////            for (int i = 3; i < goodsGroup.size(); i++) {
////                lastList.add(goodsGroup.get(i));
////            }
////        } else {
////            for (int i = 0; i < goodsGroup.size(); i++) {
////                firstList.add(goodsGroup.get(i));
////            }
////        }
//
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("goodsPicName", goodsPicNameVo);
//        jsonObject.put("goodsType", goodsTypeVos);
//        jsonObject.put("types", types);
//        jsonObject.put("address", address);
//        jsonObject.put("autoes", auto);
////        jsonObject.put("firstList", firstList);
////        jsonObject.put("lastList", lastList);
//        jsonObject.put("goodsGroup", goodsGroup);
//        return jsonObject;
//    }

    @RequestMapping(value = "/rest", method = RequestMethod.POST)
    public @ResponseBody
    JSONObject find(@RequestBody LinkedHashMap<String, Object> list, HttpSession httpSession) {
        String JSONStr = JSON.toJSONString(list);//json字符串
        JSONObject json = JSON.parseObject(JSONStr);//json对象
//        JSONArray jsonArray = new JSONArray();
        String type = json.getString("type");
        String address = json.getString("address");
        String auto = json.getString("auto");
//        Integer start = json.getInteger("start");
        List<GoodsPicNameVo> goodsPicNameVo = groupPurchaseService.PicName();

        List<GoodsTypeVo> goodsTypeVos = groupPurchaseService.selectSomeType();

        List<GoodsTypeVo> types = groupPurchaseService.types();

        List<String> addresses = groupPurchaseService.address();

        List<String> autoes = groupPurchaseService.auto();
        //获取session
//        String types2 = (String) httpSession.getAttribute("types");
//        String address2 = (String) httpSession.getAttribute("address");
//        String auto2 = (String) httpSession.getAttribute("auto");
        Integer status;
        List<GoodsGroupVo> goodsGroup = groupPurchaseService.selectGoodsGroup(type, address, auto);
        if (goodsGroup.size() <3) {
            status = 0;
        } else {
            status = 1;
        }
        JSONObject jsonObject = new JSONObject();
        List<GoodsGroupVo> firstList = new ArrayList<>();

        List<GoodsGroupVo> lastList = new ArrayList<>();

        if (goodsGroup.size() > 3) {
            for (int i = 0; i < 3; i++) {
                firstList.add(goodsGroup.get(i));
            }
            for (int i = 3; i < goodsGroup.size(); i++) {
                lastList.add(goodsGroup.get(i));
            }
        } else {
            for (int i = 0; i < goodsGroup.size(); i++) {
                firstList.add(goodsGroup.get(i));
            }
        }
        jsonObject.put("goodsPicName", goodsPicNameVo);
        jsonObject.put("goodsType", goodsTypeVos);
        jsonObject.put("types", types);
        jsonObject.put("address", addresses);
        jsonObject.put("autoes", autoes);
//        jsonObject.put("goodsGroup", goodsGroup);
//        jsonObject.put("status", status);
        jsonObject.put("firstList", firstList);
        jsonObject.put("lastList", lastList);
        return jsonObject;
    }

    @RequestMapping("JSP")
    public String jsp() {
        return "Test";
    }

}

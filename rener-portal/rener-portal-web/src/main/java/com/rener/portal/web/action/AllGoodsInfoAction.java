package com.rener.portal.web.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.rener.portal.model.vo.AllGoodsVo;
import com.rener.portal.model.vo.GoodsTypeVo;
import com.rener.portal.service.GroupPurchaseService;
import com.rener.portal.service.SelectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author zhuwenqiang
 */
@Controller
@CrossOrigin
@RequestMapping(value = "/allInfo")
public class AllGoodsInfoAction {
    @Resource
    private SelectService selectService;
    @Resource
    private GroupPurchaseService groupPurchaseService;

    @RequestMapping(value = "/allGoodsInfo",method = RequestMethod.POST)
    public @ResponseBody JSONObject allGoodsInfo( @RequestBody LinkedHashMap<String,Object> list,HttpSession httpSession){
//        @RequestBody LinkedHashMap<String,Object> list,
        String JSONStr = JSON.toJSONString(list);//json字符串
        JSONObject json=JSON.parseObject(JSONStr);//json对象
        String type = json.getString("type");
        String address;
        String autoes;
        if (!json.containsKey("address")){
            address = "全部商区";
        }else {
            address = json.getString("address");
        }
        if (!json.containsKey("auto")){
            autoes = "智能排序";
        }else {
            autoes = json.getString("auto");
        }
        //放入session
//        httpSession.setAttribute("types",type);

//        httpSession.setAttribute("address",address);

//        httpSession.setAttribute("auto",autoes);

        List<GoodsTypeVo> goodsTypeVos = groupPurchaseService.types();

        List<String> goodsAddressVos = groupPurchaseService.address();

        List<String> auto= groupPurchaseService.auto();
//        Integer start = 0;
        List<AllGoodsVo> allGoodsVos = selectService.Selectes(type,address,autoes);
        List<AllGoodsVo> firstGoods = new ArrayList<>();
        List<AllGoodsVo> lastGoods = new ArrayList<>();
        if (allGoodsVos.size()>5){
            for (int i=0;i<5;i++){
                firstGoods.add(allGoodsVos.get(i));
            }
            for (int i=5;i<allGoodsVos.size();i++){
                lastGoods.add(allGoodsVos.get(i));
            }
        }else {
            for (int i=0;i<allGoodsVos.size();i++){
                firstGoods.add(allGoodsVos.get(i));
            }
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("goodsType",goodsTypeVos);
        jsonObject.put("goodsAddress",goodsAddressVos);
        jsonObject.put("autoes",auto);
//        jsonObject.put("allGoods",allGoodsVos);
        jsonObject.put("firstGoods",firstGoods);
        jsonObject.put("lastGoods",lastGoods);
        return jsonObject;
    }
//
//    @RequestMapping("more")
//    public @ResponseBody JSONObject moreGoods(@RequestBody LinkedHashMap<String,Object> list,HttpSession httpSession){
//        String JSONStr = JSON.toJSONString(list);
//        //json字符串
//        JSONObject json=JSON.parseObject(JSONStr);
//        //json对象
//        Integer start = json.getInteger("start");
//
//        //获取session
//        String types = (String) httpSession.getAttribute("types");
//        String address = (String) httpSession.getAttribute("address");
//        String auto = (String) httpSession.getAttribute("auto");
//
//        List<AllGoodsVo> allGoodsVos = selectService.Selectes(types,address,auto);
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("allGoods",allGoodsVos);
//        return jsonObject;
//    }
}

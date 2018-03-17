package com.rener.portal.web.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.rener.portal.model.vo.GoodsTypeVo;
import com.rener.portal.service.FuzzySelectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * @author zhuwenqiang
 */

@Controller
@CrossOrigin
@RequestMapping("/fuzzySelectType")
public class FuzzySelectAction {
    @Resource
    private FuzzySelectService fuzzySelectService;

    @RequestMapping(value = "/goodsHeatType",method = RequestMethod.GET)
    public @ResponseBody
    JSONObject selectType(HttpSession httpSession){
//        @RequestBody LinkedHashMap<String,Object> list
//        String JSONStr = JSON.toJSONString(list);//json字符串
//        JSONObject json=JSON.parseObject(JSONStr);//json对象
//        String types = null;
//        if (json.containsKey("types")){
//            types = json.getString("types");
//        }
        //存入session
//        httpSession.setAttribute("types",types);

        JSONObject jsonObject = new JSONObject();
        List<GoodsTypeVo> goodsHeatType = fuzzySelectService.goodsHeatType();
        jsonObject.put("goodsHeatType",goodsHeatType);
        return jsonObject;
    }
    @RequestMapping("/selectType")
    public @ResponseBody JSONObject moreGoods(@RequestParam("types") String types, HttpSession httpSession) {
        JSONObject jsonObject = new JSONObject();
        List<GoodsTypeVo> selectGoodsType = fuzzySelectService.fuzzySelectType(types);
        jsonObject.put("selectGoodsType", selectGoodsType);
        return jsonObject;
    }
}

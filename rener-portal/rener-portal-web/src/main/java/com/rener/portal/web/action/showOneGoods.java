package com.rener.portal.web.action;

import com.rener.portal.model.mo.TbUsers;
import com.rener.portal.model.vo.GoodsDisplayVo;
import com.rener.portal.service.ShowOneGoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @Created with IDEA
 * @author:Yuwenbo
 * @Date:2018/1/29
 * @Time:11:04
 * @JDK versions: 1.8.0_101
 */
@Controller
@CrossOrigin
@RequestMapping("goods")
public class showOneGoods {
    @Resource
    ShowOneGoodsService showOneGoodsService;
    @RequestMapping("showOneGoods")
    public @ResponseBody GoodsDisplayVo showOneGoods(HttpSession httpSession,Long goodsId){
        TbUsers user = (TbUsers) httpSession.getAttribute("user");
        Long userId = (null == user ? new Long(-1) : user.getUserId());
        GoodsDisplayVo goods = showOneGoodsService.findOneGoods(goodsId, userId);
        return goods;
    }
}

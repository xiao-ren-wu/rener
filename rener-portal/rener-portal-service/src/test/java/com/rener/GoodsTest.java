package com.rener;

import com.rener.portal.model.vo.*;
import com.rener.portal.service.FuzzySelectService;
import com.rener.portal.service.GroupPurchaseService;
import com.rener.portal.service.ShowOneGoodsService;
import com.rener.portal.service.impl.FuzzySelectServiceImpl;
import com.rener.portal.service.impl.GroupPurchaseServiceImpl;
import com.rener.portal.service.impl.SelectServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Set;

public class GoodsTest {
    private ApplicationContext applicationContext;
    @Before
    public void before() {
        String[] strings = new String[]{"spring/spring-portal-service.xml",
                "spring/spring-portal-dao.xml"};
        applicationContext = new ClassPathXmlApplicationContext(strings);
    }
//    @Test
//    public void haha(){
//        ShowOneGoodsService showOneGoodsServiceImpl = applicationContext.getBean("showOneGoodsServiceImpl", ShowOneGoodsService.class);
//        showOneGoodsServiceImpl.findOneGoods(new Long(1));
//    }
//模糊查询包该含字段的商品类型
    @Test
    public void test01(){
        FuzzySelectService fuzzySelectService= applicationContext.getBean("fuzzySelectServiceImpl", FuzzySelectService.class);
        List<GoodsTypeVo> list = fuzzySelectService.fuzzySelectType("包");
        for (GoodsTypeVo goodsTypeVo :
                list) {
            System.out.println(goodsTypeVo);
        }
    }
//
//    //查询商品地址
//
    @Test
    public void test02(){
        GroupPurchaseService groupPurchaseService = applicationContext.getBean("groupPurchaseServiceImpl", GroupPurchaseServiceImpl.class);
        List<String> list = groupPurchaseService.address();
        for (String goodsTypeVo:list){
            System.out.println(goodsTypeVo);
        }
    }
//
//    //查询商品类型
    @Test
    public void test03(){
        GroupPurchaseService groupPurchaseService = applicationContext.getBean("groupPurchaseServiceImpl", GroupPurchaseServiceImpl.class);
        List<GoodsTypeVo> list = groupPurchaseService.types();
        for (GoodsTypeVo goodsTypeVo:list){
            System.out.println(goodsTypeVo);
        }
    }
//查询热度前四的商品类型
    @Test
    public void test031(){
        FuzzySelectServiceImpl fuzzySelectServiceImpl = applicationContext.getBean("fuzzySelectServiceImpl", FuzzySelectServiceImpl.class);
        List<GoodsTypeVo> list =fuzzySelectServiceImpl.goodsHeatType();
        for (GoodsTypeVo goodsTypeVo:list){
            System.out.println(goodsTypeVo);
        }
    }
//
////auto
    @Test
    public void test04(){
        GroupPurchaseService groupPurchaseService = applicationContext.getBean("groupPurchaseServiceImpl", GroupPurchaseServiceImpl.class);
        List<String> list = groupPurchaseService.auto();
        for (String goodsTypeVo:list){
            System.out.println(goodsTypeVo);
        }
    }
////加载团购页显示商品
//
////    @Test
////    public void test05(){
////        GroupPurchaseService groupPurchaseService = applicationContext.getBean("groupPurchaseServiceImpl", GroupPurchaseServiceImpl.class);
////        List<GoodsGroupVo> list = groupPurchaseService.goodsGroup(0);
////        for (GoodsGroupVo goodsGroupVo:list){
////            System.out.println(goodsGroupVo);
////        }
////    }
////按需求选择商品
    @Test
    public void test06(){
        GroupPurchaseService groupPurchaseService = applicationContext.getBean("groupPurchaseServiceImpl", GroupPurchaseServiceImpl.class);
        List<GoodsGroupVo> list = groupPurchaseService.selectGoodsGroup("全部分类", "全部商区", "智能排序");
        for (GoodsGroupVo goodsGroupVo:list){
            System.out.println(goodsGroupVo);
        }
    }
//
//    //查询销量前四的商品样图和类型
    @Test
    public void test07(){
        GroupPurchaseService groupPurchaseService = applicationContext.getBean("groupPurchaseServiceImpl", GroupPurchaseServiceImpl.class);
        List<GoodsPicNameVo> list = groupPurchaseService.PicName();
        for (GoodsPicNameVo goodsPicNameVo:list){
            System.out.println(goodsPicNameVo);
        }
    }
//
//    //随机生成6-8个商品种类
//    @Test
//    public void test08(){
//        GroupPurchaseService groupPurchaseService = applicationContext.getBean("groupPurchaseServiceImpl", GroupPurchaseServiceImpl.class);
//        List<GoodsTypeVo> list = groupPurchaseService.selectSomeType();
//        for (GoodsTypeVo goodsTypeVo:list){
//            System.out.println(goodsTypeVo);
//        }
//    }
//
//    //模糊查询
    @Test
    public void test09(){
        SelectServiceImpl selectService = applicationContext.getBean("selectServiceImpl",SelectServiceImpl.class);
        List<AllGoodsVo> list = selectService.Selectes("包", "长安", "智能排序");
        for (AllGoodsVo goodsTypeVo:list){
            System.out.println(goodsTypeVo);
        }
    }
//
//    @Test
//    public void test11(){
//        FuzzySelectService fuzzySelectService= applicationContext.getBean("fuzzySelectServiceImpl", FuzzySelectService.class);
//        List<AllGoodsVo> list = fuzzySelectService.selectByType("面包",0);
//        for (AllGoodsVo goodsTypeVo :
//                list) {
//            System.out.println(goodsTypeVo);
//        }
//    }

}

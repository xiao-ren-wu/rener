package com.rener;

import com.rener.portal.dao.OrderPageMapper;
import com.rener.portal.dao.SimpleOrderPageMapper;
import com.rener.portal.dao.TbOrderDetailsesMapper;
import com.rener.portal.dao.TbOrdersMapper;
import com.rener.portal.model.mo.TbGoods;
import com.rener.portal.model.mo.TbOrderDetailses;
import com.rener.portal.model.po.OrderState;
import com.rener.portal.model.vo.GoodsDisplayVo;
import com.rener.portal.model.vo.OrderPage;
import com.rener.portal.model.vo.SimpleOrderPage;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;

/**
 * @Created with IDEA
 * @author:GaoPan
 * @Date:2018/1/26
 * @Time:23:59
 * @JDK versions: 1.8.0_101
 */
public class TbOrderMapperTest {
    private ApplicationContext ac;

    @Before
    public void before() {
        String strings = "spring/spring-portal-dao.xml";
        System.out.println("3");
        ac = new ClassPathXmlApplicationContext(strings);
    }

    @Test
    public void test1() {
        TbOrdersMapper tbOrdersMapper = ac.getBean("tbOrdersMapper", TbOrdersMapper.class);
        tbOrdersMapper.updateTotalPrice(new Long(1), new BigDecimal(40.5));
    }

    @Test
    public void test2() {
        OrderPageMapper pageMapper = ac.getBean("orderPageMapper", OrderPageMapper.class);
//        OrderPage page = pageMapper.selectOrdersById(new Long(1));
//        System.out.println(page.toString());
        List<Long> lists = new ArrayList<>();
        lists.add(new Long(1));
        lists.add(new Long(2));
        List<OrderPage> orderPages = pageMapper.selectOrdersByIds(lists);
        System.out.println(orderPages.toString());

    }

    @Test
    public void test3() {
        SimpleOrderPageMapper pageMapper = ac.getBean("simpleOrderPageMapper", SimpleOrderPageMapper.class);
        List<SimpleOrderPage> simpleOrderPages = pageMapper.selectOrderByStatus(new Long(1), 0, 3, new OrderState());
        System.out.println(simpleOrderPages.toString());
    }

    @Test
    public void test4() {
        TbOrderDetailsesMapper acBean = ac.getBean("tbOrderDetailsesMapper", TbOrderDetailsesMapper.class);
        TbOrderDetailses tbOrderDetailses = new TbOrderDetailses();
        tbOrderDetailses.setGoodsId(new Long(1));
        tbOrderDetailses.setGoodsTotalprice(new BigDecimal(12.6));
        tbOrderDetailses.setOrderId(new Long(1));
        tbOrderDetailses.setGoodsNumber(new Integer(12));
        acBean.insert(tbOrderDetailses.getOrderId(), tbOrderDetailses.getGoodsId(), tbOrderDetailses.getGoodsNumber(), tbOrderDetailses.getGoodsTotalprice());
    }

    @Test
    public void test5() {
        SimpleOrderPageMapper pageMapper = ac.getBean("simpleOrderPageMapper", SimpleOrderPageMapper.class);
        List<SimpleOrderPage> list = pageMapper.selectOrderByStatus(new Long(0), 0, 7, new OrderState());
        System.out.println(list.toString());
    }

    @Test
    public void test() {
        BigDecimal bigDecimal = new BigDecimal(new Double(12.22323423432343222));
        String s = bigDecimal.toString();
        int i = s.lastIndexOf(".");
        String substring = s.substring(0, i + 3);
        System.out.println(substring);
    }
}
package com.rener;

import com.rener.portal.dao.TbAddressMapper;
import com.rener.portal.dao.TbGoodsCarMapper;
import com.rener.portal.dao.TbOrdersMapper;
import com.rener.portal.model.mo.TbAddress;
import com.rener.portal.model.mo.TbGoodsCar;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * @Created with IDEA
 * @author:GaoPan
 * @Date:2018/1/28
 * @Time:3:57
 * @JDK versions: 1.8.0_101
 */
public class TbAddressTest {
    private ApplicationContext ac;

    @Before
    public void before() {
        String strings = "spring/spring-portal-dao.xml";
        System.out.println("3");
        ac = new ClassPathXmlApplicationContext(strings);
    }

    @Test
    public void test1() {
        TbAddressMapper tbAddressMapper = ac.getBean("tbAddressMapper", TbAddressMapper.class);
        TbAddress tbAddress = tbAddressMapper.selectAddressDefault();
        System.out.println(tbAddress.toString());
    }

    @Test
    public void testTbGoodsCar(){
        TbGoodsCarMapper tbGoodsCarMapper = ac.getBean("tbGoodsCarMapper", TbGoodsCarMapper.class);
        TbGoodsCar tbGoodsCar = new TbGoodsCar();
        tbGoodsCar.setUserId(new Long(2));
        tbGoodsCar.setGoodsId(new Long(3));
        tbGoodsCarMapper.insert(tbGoodsCar);
    }
}

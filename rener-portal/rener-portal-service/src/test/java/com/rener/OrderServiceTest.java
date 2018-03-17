package com.rener;

import com.rener.portal.service.OrderService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @Created with IDEA
 * @author:GaoPan
 * @Date:2018/1/28
 * @Time:9:08
 * @JDK versions: 1.8.0_101
 */
public class OrderServiceTest {
    private ApplicationContext applicationContext;

    @Before
    public void before() {
        String[] strings = new String[]{"spring/spring-portal-service.xml",
                "spring/spring-portal-dao.xml"};
        applicationContext = new ClassPathXmlApplicationContext(strings);
    }

    @Test
    public void test01() {
//        JSON.toJSONString()
        OrderService service = applicationContext.getBean("orderServiceImpl", OrderService.class);
        List<Long> goodsId = new ArrayList<>();
        for (int i = 1; i < 7; i++) {
            goodsId.add(new Long(i));
        }
//        service.saveorders(goodsId);
//        service.setOrderStatus(new Long(1),new Long(3));
    }

//    @Test
//    public void test02() {
//        OrderService service = applicationContext.getBean("orderServiceImpl", OrderService.class);
//        List<SimpleOrderPage> pageOrderOfStatus = service.getPageOrderOfStatus(1, 0);
//        System.out.println(JSON.toJSONString(pageOrderOfStatus));
//    }
}

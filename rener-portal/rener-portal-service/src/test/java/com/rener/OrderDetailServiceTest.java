package com.rener;

import com.alibaba.fastjson.JSON;
import com.rener.portal.model.vo.OrderPage;
import com.rener.portal.service.OrderDetailService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Created with IDEA
 * @author:GaoPan
 * @Date:2018/1/28
 * @Time:9:08
 * @JDK versions: 1.8.0_101
 */
public class OrderDetailServiceTest {
    private ApplicationContext applicationContext;

    @Before
    public void before() {
        String[] strings = new String[]{"spring/spring-portal-service.xml",
                "spring/spring-portal-dao.xml"};
        applicationContext = new ClassPathXmlApplicationContext(strings);
    }

    @Test
    public void test01() {
        OrderDetailService orderDetailServiceImpl = applicationContext.getBean("orderDetailServiceImpl", OrderDetailService.class);
        OrderPage orderDetailByOrderId = orderDetailServiceImpl.getOrderDetailByOrderId(new Long(1));
        System.out.println(JSON.toJSONString(orderDetailByOrderId));
    }

}

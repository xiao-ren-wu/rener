package com.rener;

import com.rener.portal.service.UserHomeService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * @Created with IDEA
 * @author:Yuwenbo
 * @Date:2018/1/25
 * @Time:16:43
 * @JDK versions: 1.8.0_101
 */
public class Updatepwd {
    private ApplicationContext applicationContext;
//
//    @Before
//    public void before() {
//        String[] strings = new String[]{"spring/spring-portal-service.xml",
//                "spring/spring-portal-dao.xml"};
//        applicationContext = new ClassPathXmlApplicationContext(strings);
//    }
//
    @Test
    public void updatePwd(){

        BigDecimal bigDecimal = new BigDecimal(new Double(12.23));
        System.out.println(bigDecimal);

    }
}

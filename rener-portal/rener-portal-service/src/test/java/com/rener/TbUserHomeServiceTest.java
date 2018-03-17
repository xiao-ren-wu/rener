package com.rener;

import com.alibaba.fastjson.JSONArray;

import com.rener.portal.model.vo.UserHomeMsgVo;

import com.rener.portal.service.UserHomeService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TbUserHomeServiceTest {
    private ApplicationContext applicationContext;

    @Before
    public void before() {
        String[] strings = new String[]{"spring/spring-portal-service.xml",
                "spring/spring-portal-dao.xml"};
        applicationContext = new ClassPathXmlApplicationContext(strings);
    }

    @Test
    public void changePassWordTest() {
        UserHomeService userHomeService = applicationContext.getBean("userHomeServiceImpl", UserHomeService.class);
        UserHomeMsgVo userByIdService = userHomeService.findUserByIdService(new Long(1));
        String s = JSONArray.toJSONString(userByIdService);
        System.out.println(s);
    }

}

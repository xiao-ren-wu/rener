package com.rener;

import com.rener.portal.model.mo.TbUsers;
import com.rener.portal.service.TbUsersService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TbUsersServiceTest {
    private ApplicationContext applicationContext;

    @Before
    public void before() {
        String[] strings = new String[]{"spring/spring-portal-service.xml",
                "spring/spring-portal-dao.xml"};
        applicationContext = new ClassPathXmlApplicationContext(strings);
    }

    @Test
    public void loginTset() {
        TbUsersService tbUsersService = applicationContext.getBean("tbUsersServiceImpl", TbUsersService.class);

        tbUsersService.login("12345678912", "123456");
    }

    @Test
    public void inspect()
    {
        TbUsersService tbUsersService = applicationContext.getBean("tbUsersServiceImpl",TbUsersService.class);
        tbUsersService.inspect("17729500805");
        System.out.println("ok");
    }
}

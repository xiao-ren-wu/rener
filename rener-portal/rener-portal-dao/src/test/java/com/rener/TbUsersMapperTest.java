package com.rener;

import com.rener.portal.dao.TbUsersMapper;
import com.rener.portal.model.mo.TbUsers;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author lidan@meng_zhu
 * @date 2018/1/25 0025 13:50
 */
public class TbUsersMapperTest {

    private ApplicationContext applicationContext;

    @Before
    public void before() {
        String xmlPath = "spring/spring-portal-dao.xml";
        applicationContext = new ClassPathXmlApplicationContext(xmlPath);

    }

@org.junit.Test
public void test() {
    TbUsersMapper tbUsersMapper = (TbUsersMapper) applicationContext.getBean("tbUsersMapper");
    /*
     * 注册
//     */
//        TbUsers tbUsers = new TbUsers();
//        tbUsers.setUserNickname("lidan");
//        tbUsers.setUserSex(new Integer(1));
//        tbUsers.setUserEmail("111111111@qq.com");
//        //tbUsers.setUserBirth(new Date(System.currentTimeMillis()));
//        tbUsers.setUserPwd("1234567");
//        tbUsers.setUserTel("111111111");
//        tbUsersMapper.enroll(tbUsers);
//        System.out.println();
//    }
//    public TbUsers test1() {
//       /**
//         * 登陆
//         */
//       TbUsers tbUsers= tbUsersMapper.login(new String("12345678912"), new String("123456"));
//        System.out.println("ok");
    }
}

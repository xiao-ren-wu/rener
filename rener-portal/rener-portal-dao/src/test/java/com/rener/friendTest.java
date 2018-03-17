package com.rener;

import com.rener.portal.dao.TbFriendshipMapper;
import com.rener.portal.model.mo.TbFriendship;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/31
 * @Time:5:22
 * @JDK versions: 1.8.0_101
 */
public class friendTest {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-portal-dao.xml");
        TbFriendshipMapper tbFriendshipMapper = applicationContext.getBean("tbFriendshipMapper", TbFriendshipMapper.class);
        TbFriendship tbFriendship = new TbFriendship();
        Date date = new Date(System.currentTimeMillis());
        tbFriendship.setUpdateTime(date);
        tbFriendship.setCreateTime(date);
        tbFriendship.setFirendId(new Long(1));
        tbFriendship.setUserId(new Long(3));
        boolean insert = tbFriendshipMapper.insert(tbFriendship);
        System.out.println(insert);
    }
}

package com.rener;

import com.alibaba.fastjson.JSON;
import com.qiniu.util.Json;
import com.rener.portal.model.vo.RespFriendshipVo;
import com.rener.portal.model.vo.TbFriendshipVo;
import com.rener.portal.service.FriendshipService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/25
 * @Time:15:46
 * @JDK versions: 1.8.0_101
 */
public class FriendshipServiceTest {
    private ApplicationContext applicationContext;

    @Before
    public void before() {
        String[] strings = new String[]{"spring/spring-portal-service.xml",
                "spring/spring-portal-dao.xml"};
        applicationContext = new ClassPathXmlApplicationContext(strings);
    }

    @Test
    public void selectTset() {
        FriendshipService friendshipServiceImpl = applicationContext.getBean("friendshipServiceImpl", FriendshipService.class);
        List<RespFriendshipVo> respFriendshipVos = friendshipServiceImpl.selectAll((long) 3);
        System.out.println(JSON.toJSONString(respFriendshipVos));
    }

    @Test
    public void insertTest(){
        FriendshipService friendshipService = applicationContext.getBean("friendshipServiceImpl", FriendshipService.class);
        boolean insert = friendshipService.insert(new Long((long) 5), new Long((long) 6), new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()));
        System.out.println(insert);
    }

    @Test
    public void deleteTest(){
        FriendshipService friendshipServiceImpl = applicationContext.getBean("friendshipServiceImpl", FriendshipService.class);
        int delete = friendshipServiceImpl.delete((long) 2,(long)1);
        System.out.println(delete);
    }

    @Test
    public void tetse1(){
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
//        System.out.println(time.format(nowTime));
        System.out.println(date);
    }
}

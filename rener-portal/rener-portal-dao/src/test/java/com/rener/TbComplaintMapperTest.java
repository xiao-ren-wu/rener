package com.rener;

import com.alibaba.fastjson.JSON;
import com.rener.portal.dao.TbComplaintMapper;
import com.rener.portal.dao.TbFriendshipMapper;
import com.rener.portal.model.mo.TbFriendship;
import com.rener.portal.model.vo.TbComplaintVo;
import com.rener.portal.model.vo.TbFriendshipVo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/27
 * @Time:19:56
 * @JDK versions: 1.8.0_101
 */
public class TbComplaintMapperTest {
    private ApplicationContext applicationContext;

    @Before
    public void before() {
        String xmlPath = "spring/spring-portal-dao.xml";
        applicationContext = new ClassPathXmlApplicationContext(xmlPath);
    }

    @Test
    public void test() {
        ApplicationContext ac = applicationContext;
        TbFriendshipMapper tbFriendshipMapper = ac.getBean("tbFriendshipMapper", TbFriendshipMapper.class);
        List<TbFriendshipVo> select = tbFriendshipMapper.select(new Long(3));
        for(int i=0;i<select.size();i++){
            System.out.println(select.get(i));
        }
//        System.out.println(JSON.toJSONString(select));
    }

    @Test
    public void test2(){
        ApplicationContext ac = applicationContext;
        TbComplaintMapper tbComplaintMapper = ac.getBean("tbComplaintMapper", TbComplaintMapper.class);
        int i = tbComplaintMapper.deleteByComplaintId(new Long(1));
        System.out.println(i);
    }
}

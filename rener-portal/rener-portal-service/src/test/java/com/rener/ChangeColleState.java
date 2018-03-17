package com.rener;

import com.rener.portal.service.ChangeCollectState;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;

/**
 * @Created with IDEA
 * @author:Yuwenbo
 * @Date:2018/1/25
 * @Time:16:12
 * @JDK versions: 1.8.0_101
 */
public class ChangeColleState {

    private ApplicationContext applicationContext;

    @Before
    public void before() {
        String[] strings = new String[]{"spring/spring-portal-service.xml",
                "spring/spring-portal-dao.xml"};
        applicationContext = new ClassPathXmlApplicationContext(strings);
    }

    @Test
    public void changeColleState() {
        ChangeCollectState state = applicationContext.getBean("changeCollectStateImpl", ChangeCollectState.class);
        Integer tag = state.changeCollectState(new Long(3), new Long(3));
        System.out.println(tag);
    }

    @Test
    public void test01() {
        int machineId = 1;//最大支持1-9个集群机器部署
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if (hashCodeV < 0) {//
            hashCodeV = -hashCodeV;
        }
        // 0 代表前面补充0
        // 4 代表长度为4
        // d 代表参数为正数型
        String orderId = machineId + String.format("%015d", hashCodeV);
        System.out.println(orderId);
        
    }
}

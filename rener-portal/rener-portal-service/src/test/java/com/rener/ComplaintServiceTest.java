package com.rener;

import com.alibaba.fastjson.JSON;
import com.rener.portal.model.vo.RespComplaintVo;
import com.rener.portal.service.ComplaintService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/28
 * @Time:9:50
 * @JDK versions: 1.8.0_101
 */
public class ComplaintServiceTest {
    private ApplicationContext applicationContext;

    @Before
    public void before() {
        String[] strings = new String[]{"spring/spring-portal-service.xml",
                "spring/spring-portal-dao.xml"};
        applicationContext = new ClassPathXmlApplicationContext(strings);
    }

    @Test
    public void PageTest() {
        ComplaintService complaintServiceImpl = applicationContext.getBean("complaintServiceImpl", ComplaintService.class);
        List<RespComplaintVo> respComplaintVos = complaintServiceImpl.selectAll();
        System.out.println(JSON.toJSONString(respComplaintVos));
    }

    @Test
    public void deleteTest() {
        ComplaintService complaintServiceImpl = applicationContext.getBean("complaintServiceImpl", ComplaintService.class);
        int delete = complaintServiceImpl.delete(new Long(1));
        System.out.println(delete);
        if (delete != 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }
}

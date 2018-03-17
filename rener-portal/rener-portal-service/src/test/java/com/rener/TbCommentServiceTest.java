package com.rener;

import com.alibaba.fastjson.JSON;
import com.rener.portal.model.vo.RespCommentVo;
import com.rener.portal.service.TbCommentService;
import com.rener.portal.service.TbUsersService;
import com.rener.portal.service.util.Md5Util;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TbCommentServiceTest {
    private ApplicationContext applicationContext;

    @Before
    public void before() {
        String[] strings = new String[]{"spring/spring-portal-service.xml",
                "spring/spring-portal-dao.xml"};
        applicationContext = new ClassPathXmlApplicationContext(strings);
    }
    @Test
    public void loginTset() {     //登录
        String pwd="qqqq";//输入密码
        TbUsersService tbUsersService = applicationContext.getBean("tbUsersServiceImpl", TbUsersService.class);
        String md5 = Md5Util.md5(pwd);
        tbUsersService.login("12345678912", md5);
        System.out.println(md5);
    }

    @Test
    public void test(){
        TbCommentService tbCommentServiceImpl = applicationContext.getBean("tbCommentServiceImpl", TbCommentService.class);
        boolean insert = tbCommentServiceImpl.insert(new Long(1), new Long(1), new Long(1), new Byte((byte) 1), "今晚打老虎", "fdsfa-fadfs-fadf", new Byte((byte) 1), "dfsfsd", new Long(1), new Long(1), new Long(1), new Long(1));
        System.out.println(insert);
    }
    @Test
    public void exit()
    {
        TbUsersService tbUsersService = applicationContext.
                getBean("tbUsersServiceImpl",TbUsersService.class);
        tbUsersService.exit(1);
    }

    @Test
    public void delete(){
        TbCommentService tbCommentServiceImpl = applicationContext.getBean("tbCommentServiceImpl", TbCommentService.class);
        int delete = tbCommentServiceImpl.delete(new Long(5));
        System.out.println(delete);
    }

    @Test
    public void delete1(){
        TbCommentService tbCommentServiceImpl = applicationContext.getBean("tbCommentServiceImpl", TbCommentService.class);
        List<RespCommentVo> respCommentVos = tbCommentServiceImpl.selectAllByStoreId(new Long(1), new Long(0));
        System.out.println(JSON.toJSONString(respCommentVos));
    }
    @Test
    public void sselect(){
        TbCommentService tbCommentService =applicationContext.getBean("tbCommentServiceImpl",TbCommentService.class);
        List<RespCommentVo> respCommentVos = tbCommentService.selectByUserId(new Long(555));
        System.out.println(JSON.toJSONString(respCommentVos));
    }

}

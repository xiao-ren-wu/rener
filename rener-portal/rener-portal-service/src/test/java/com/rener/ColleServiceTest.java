package com.rener;

import com.rener.portal.model.vo.StoresVo;
import com.rener.portal.model.vo.UserCommentVo;
import com.rener.portal.service.ColleService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ColleServiceTest {
    private ApplicationContext applicationContext;

    @Before
    public void before() {
        String[] strings = new String[]{"spring/spring-portal-service.xml",
                "spring/spring-portal-dao.xml"};
        applicationContext = new ClassPathXmlApplicationContext(strings);
    }

//    @Test
//    public void selectStoreTest() {
//        ColleService colleService = applicationContext.getBean("colleServiceImpl",  ColleService.class);
//        List<StoresVo> list=colleService.selectAll(1L,0);
//        for (StoresVo storesVo:list
//             ) {
//            System.out.println(storesVo);
//        }
//    }

    @Test
    public void DateSelectTest() {
        ColleService colleService = applicationContext.getBean("colleServiceImpl",  ColleService.class);
        List<StoresVo> list=colleService.DateSelect("oneMonth",1L,0);
        for (StoresVo storesVo:list
                ) {
            System.out.println(storesVo);
        }
    }

    @Test
    public void selectByClassesTest() {
        ColleService colleService = applicationContext.getBean("colleServiceImpl",  ColleService.class);
        List<String> list=colleService.selectByClasses(1L);
        for (String string:list
                ) {
            System.out.println(string);
        }
    }

    @Test
    public void selectByAreaTest() {
        ColleService colleService = applicationContext.getBean("colleServiceImpl",  ColleService.class);
        Set list=colleService.selectByArea(1L);
        for (Object string:list
                ) {
            System.out.println(string);
        }
    }

    @Test
    public void selectAllDetailToStoreTest(){
        ColleService colleService = applicationContext.getBean("colleServiceImpl",  ColleService.class);
        Map map = colleService.selectAllDetailToStore(1L,12L,"all");
        System.out.println(map);
    }

    @Test
    public void selectOneStoreForClassesTest() {
        ColleService colleService = applicationContext.getBean("colleServiceImpl",  ColleService.class);
        List<StoresVo> list=colleService.selectStoreForClasses(1L,"包子",0);
        for (StoresVo storesVo:list
                ) {
            System.out.println(storesVo);
        }
    }

    @Test
    public void selectOneStoreForAreaTest() {
        ColleService colleService = applicationContext.getBean("colleServiceImpl",  ColleService.class);
        List<StoresVo> list=colleService.selectStoreForArea(1L,"长安区",0);
        for (StoresVo storesVo:list
                ) {
            System.out.println(storesVo);
        }
    }

    @Test
    public void selectByTorPTest() {
        ColleService colleService = applicationContext.getBean("colleServiceImpl",  ColleService.class);
        List<UserCommentVo> list=colleService.selectByTorP("withPic",12L);
        for (UserCommentVo storesVo:list
                ) {
            System.out.println(storesVo);
        }
    }
}

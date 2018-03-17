package com.rener;
import com.alibaba.fastjson.JSON;
import com.rener.portal.model.vo.RespPhotoAlbumVo;
import com.rener.portal.service.PhotoAlbumService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/26
 * @Time:17:35
 * @JDK versions: 1.8.0_101
 */
public class PhotoAlbumTest {
    private ApplicationContext applicationContext;

    @Before
    public void before() {
        String[] strings = new String[]{"spring/spring-portal-service.xml",
                "spring/spring-portal-dao.xml"};
        applicationContext = new ClassPathXmlApplicationContext(strings);
    }

    @Test
    public void selectTset() {//分页查看一个人的所有照片
        PhotoAlbumService photoAlbumServiceImpl = applicationContext.getBean("photoAlbumServiceImpl", PhotoAlbumService.class);
        List<RespPhotoAlbumVo> respPhotoAlbumVos = photoAlbumServiceImpl.selectById(new Long(1), new Long(1));
        System.out.println(JSON.toJSONString(respPhotoAlbumVos));
    }

    @Test//按月产看相册的一些简略图片
    public void demo() {
        PhotoAlbumService photoAlbumServiceImpl = applicationContext.getBean("photoAlbumServiceImpl", PhotoAlbumService.class);
        List<RespPhotoAlbumVo> respPhotoAlbumVos = photoAlbumServiceImpl.selectByMonth(new Long(1));
        System.out.println(JSON.toJSONString(respPhotoAlbumVos));
    }

    @Test//将某一个月的所有照片全部返回给前端
    public void demo1(){
        PhotoAlbumService photoAlbumServiceImpl = applicationContext.getBean("photoAlbumServiceImpl", PhotoAlbumService.class);
        List<RespPhotoAlbumVo> respPhotoAlbumVos = photoAlbumServiceImpl.selectMonthById(new Long(1), "2018-1-11 12:12:12");
        System.out.println(JSON.toJSONString(respPhotoAlbumVos));
    }
}

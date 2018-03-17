package com.rener;

import com.rener.portal.dao.TbPhotoAlbumMapper;
import com.rener.portal.model.mo.TbPhotoAlbum;
import com.rener.portal.model.vo.TbPhotoAlbumVo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.util.List;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/26
 * @Time:17:25
 * @JDK versions: 1.8.0_101
 */
public class TbPhotoAlbumMapperTest {
    private ApplicationContext applicationContext;

    @Before
    public void before() {
        String xmlPath = "spring/spring-portal-dao.xml";
        applicationContext = new ClassPathXmlApplicationContext(xmlPath);
    }

    @Test
    public void test() {
        ApplicationContext ac = applicationContext;
        TbPhotoAlbumMapper tbPhotoAlbumMapper = ac.getBean("tbPhotoAlbumMapper", TbPhotoAlbumMapper.class);
        List<TbPhotoAlbumVo> tbPhotoAlbumVos = tbPhotoAlbumMapper.selectMonthById(new Long(1), "2018-02-00 12:12:12");
        for(int i=0;i<tbPhotoAlbumVos.size();i++){
            System.out.println(tbPhotoAlbumVos.get(i));
        }
    }

    @Test
    public void test0(){
        ApplicationContext ac = applicationContext;
        TbPhotoAlbumMapper tbPhotoAlbumMapper = ac.getBean("tbPhotoAlbumMapper", TbPhotoAlbumMapper.class);
        TbPhotoAlbum tbPhotoAlbum = new TbPhotoAlbum();
        tbPhotoAlbum.setDisplayPhoto("12313-1231-132-123");
        tbPhotoAlbum.setCreateTime(new Date(System.currentTimeMillis()));
        tbPhotoAlbum.setUpdateTime(new Date(System.currentTimeMillis()));
        tbPhotoAlbum.setUploadTime(new Date(System.currentTimeMillis()));
        tbPhotoAlbum.setUserId(new Long(1));
        boolean insert = tbPhotoAlbumMapper.insert(tbPhotoAlbum);
        System.out.println(insert);
    }

    @Test
    public void test1(){
        ApplicationContext ac = applicationContext;
        TbPhotoAlbumMapper tbPhotoAlbumMapper = ac.getBean("tbPhotoAlbumMapper", TbPhotoAlbumMapper.class);
        int i = tbPhotoAlbumMapper.deleteByPhotoAlbumId(new Long(3));
        System.out.println(i);
    }
}

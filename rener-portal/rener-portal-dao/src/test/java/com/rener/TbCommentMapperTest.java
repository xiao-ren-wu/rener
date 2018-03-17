package com.rener;

import com.alibaba.fastjson.JSON;
import com.rener.portal.dao.TbCommentKeyMapper;
import com.rener.portal.dao.TbCommentMapper;
import com.rener.portal.dao.TbPhotoAlbumMapper;
import com.rener.portal.model.vo.GoodCommentVo;
import com.rener.portal.model.vo.PhotoList;
import com.rener.portal.model.vo.TbCommentVo;
import com.rener.portal.model.vo.TbPhotoAlbumVo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

public class TbCommentMapperTest {
    private ApplicationContext applicationContext;

    @Before
    public void before() {
        String xmlPath = "spring/spring-portal-dao.xml";
        applicationContext = new ClassPathXmlApplicationContext(xmlPath);
    }

    @Test
    public void demo1(){
        ApplicationContext ac = applicationContext;
        TbCommentMapper tbCommentMapper = ac.getBean("tbCommentMapper", TbCommentMapper.class);
        List<TbCommentVo> tbCommentVos = tbCommentMapper.selectAllByStoreId(new Long(1), new Long(0));
        for(int i=0;i<tbCommentVos.size();i++){
            System.out.println(tbCommentVos.get(i));
        }
    }

    @Test
    public void test() {
        TbCommentMapper tbCommentMapper = applicationContext.getBean("tbCommentMapper", TbCommentMapper.class);
        tbCommentMapper.commentall(new Long(1));
        System.out.println("ok");
    }


    @Test
    public void test1(){
        ApplicationContext ac = applicationContext;
        TbPhotoAlbumMapper tbPhotoAlbumMapper = ac.getBean("tbPhotoAlbumMapper", TbPhotoAlbumMapper.class);
//        List<TbPhotoAlbumVo> tbPhotoAlbumVos = tbPhotoAlbumMapper.selectById(new Long(1),new Long(1));
        List<TbPhotoAlbumVo> tbPhotoAlbumVos = tbPhotoAlbumMapper.selectAllById(new Long(1));
//        for(int i=0;i<tbPhotoAlbumVos.size();i++){
//            System.out.println(tbPhotoAlbumVos.get(i));
//            for(int j=0;j<tbPhotoAlbumVos.get(i).getDisplayPhoto().getUrlList().size();j++){
//                System.out.println(tbPhotoAlbumVos.get(i).getDisplayPhoto().getUrlList().get(j));
//            }
//        }
//        String[] year = tbPhotoAlbumVos.get(1).getCreateTime().toString().split("-");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = dateFormat.format(tbPhotoAlbumVos.get(1).getCreateTime());
        System.out.println(date);
//        for(int i=0;i<year.length;i++){
//            System.out.println(year[i]);
//        }
    }

    @Test
    public void test2(){
        ApplicationContext ac = applicationContext;
        TbPhotoAlbumMapper tbPhotoAlbumMapper = ac.getBean("tbPhotoAlbumMapper", TbPhotoAlbumMapper.class);
        List<TbPhotoAlbumVo> tbPhotoAlbumVos = tbPhotoAlbumMapper.selectAllMonthById(new Long(1));
        System.out.println(JSON.toJSONString(tbPhotoAlbumVos));
    }

    @Test
    public void test3(){
        ApplicationContext ac = applicationContext;
        TbCommentMapper tbCommentMapper = ac.getBean("tbCommentMapper", TbCommentMapper.class);
        TbCommentVo tbComment = new TbCommentVo();
        Date date = new Date(System.currentTimeMillis());
        tbComment.setUserId(new Long(1));
        tbComment.setGoodsId(new Long(1));
        tbComment.setStoreId(new Long(1));
        tbComment.setPraiseLevel(new Byte((byte) 1));
        tbComment.setUploadTime(date);
        tbComment.setUploadPlace("今晚打老虎");
        tbComment.setPhoto(new PhotoList("123465-4654-45678"));
        tbComment.setCreateTime(date);
        tbComment.setUpdateTime(date);
        tbComment.setAnonymityTag(new Byte((byte) 1));
        tbComment.setCommentInfo("今晚打老虎");
        tbCommentMapper.insert(tbComment);
        System.out.println();
    }

    @Test
    public void test4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-portal-dao.xml");
        TbCommentMapper tbCommentMapper = applicationContext.getBean("tbCommentMapper", TbCommentMapper.class);
        int delete = tbCommentMapper.delete(new Long(3));
        System.out.println(delete);
    }


    @Test
    public void test7(){
        ApplicationContext ac = applicationContext;
        TbCommentMapper tbCommentMapper = ac.getBean("tbCommentMapper", TbCommentMapper.class);
        List<GoodCommentVo> pic = tbCommentMapper.selectCommentToGoods(new Long(1), "pic", new Long(0));
        List<GoodCommentVo> noPic = tbCommentMapper.selectCommentToGoods(new Long(1), "noPic", new Long(0));
        List<GoodCommentVo> aNew = tbCommentMapper.selectCommentToGoods(new Long(1), "new", new Long(0));
        System.out.println(JSON.toJSONString(pic));
        System.out.println(JSON.toJSONString(noPic));
        System.out.println(JSON.toJSONString(aNew));
    }

}













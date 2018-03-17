package com.rener;

import com.rener.portal.dao.AllGoodsVoMapper;
import com.rener.portal.dao.StoresVoMapper;
import com.rener.portal.dao.TbCommentKeyMapper;
import com.rener.portal.dao.TbCommentMapper;
import com.rener.portal.model.vo.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class TbStoreMapperTest {

    private ApplicationContext applicationContext;

    @Before
    public void before() {
        String strings = "spring/spring-portal-dao.xml";
        System.out.println("3");
        applicationContext = new ClassPathXmlApplicationContext(strings);
    }

    /** chenkuan
     * 一次一次查询所有
     */
    @Test
    public void PageSelectTest(){
        StoresVoMapper storesVoMapper=applicationContext.getBean("storesVoMapper", StoresVoMapper.class);
        List<StoresVo> map=storesVoMapper.SelectAll(1L,0);
        System.out.println(map);
    }

    /**
     * 按地區
     */
    @Test
    public void SelectByAreaTest(){
        StoresVoMapper storesVoMapper=applicationContext.getBean("storesVoMapper", StoresVoMapper.class);
        List<String> list=storesVoMapper.SelectAreaString(1L);
        for (String string:list
                ) {
            System.out.println(string);
        }
    }

    /**
     * 按類別
     */
    @Test
    public void SelectByClassesTest() {
        StoresVoMapper storesVoMapper = applicationContext.getBean("storesVoMapper", StoresVoMapper.class);
        List<String> list = storesVoMapper.SelectClassesString(1L);
        for (String string : list
                ) {
            System.out.println(string);
        }
    }


    @Test
    public void selectOneStoreForAreaTest() {
        StoresVoMapper storesVoMapper = applicationContext.getBean("storesVoMapper", StoresVoMapper.class);
        List<StoresVo> list = storesVoMapper.selectStoresForArea(1L,"长安区",0);
        for (StoresVo storesVo:list
             ) {
            System.out.println(storesVo);
        }
    }

    @Test
    public void selectOneStoreForClassesTest() {
        StoresVoMapper storesVoMapper = applicationContext.getBean("storesVoMapper", StoresVoMapper.class);
        List<StoresVo> list = storesVoMapper.selectStoresForClasses(1L,"包子",0);
        for (StoresVo storesVo:list
                ) {
            System.out.println(storesVo);
        }
    }
    @Test
    public void DateSelectTest(){
        StoresVoMapper storesVoMapper=applicationContext.getBean("storesVoMapper", StoresVoMapper.class);
        List<StoresVo> list=storesVoMapper.DateSelect("oneWeek",1L,0);
        for (StoresVo storesVo:list
                ) {
            System.out.println(storesVo);
        }
    }

    @Test
    public void selectToStoreTest(){
        StoresVoMapper storesVoMapper = applicationContext.getBean("storesVoMapper", StoresVoMapper.class);
        StoresDetailsVo s = storesVoMapper.selectToStore(12L);
        System.out.println(s);
    }

    @Test
    public void selectGoodsToStoreTest(){
        AllGoodsVoMapper allGoodsVo = applicationContext.getBean("allGoodsVoMapper", AllGoodsVoMapper.class);
        List<AllGoodsVo> s = allGoodsVo.selectGoodsToStore(12L);
        for (AllGoodsVo a:s
             ) {
            System.out.println(a);
        }
    }

    @Test
    public void selectCommentToStoreTest(){
        TbCommentMapper tbCommentMapper = applicationContext.getBean("tbCommentMapper", TbCommentMapper.class);
        List<UserCommentVo> s = tbCommentMapper.selectCommentToStore(12L,"new");
        for (UserCommentVo temp:s
                ) {
            System.out.println(temp);
        }
    }
    @Test
    public void countTest(){
        TbCommentMapper tbCommentMapper = applicationContext.getBean("tbCommentMapper",TbCommentMapper.class);
        Integer count = tbCommentMapper.selectCount1(12L);
        System.out.println(count);
    }
    @Test
    public void countKeyTest(){
        TbCommentKeyMapper tbCommentKeyMapper = applicationContext.getBean("tbCommentKeyMapper",TbCommentKeyMapper.class);
        TbCommentKeyVo count = tbCommentKeyMapper.selectCount(12L);
        System.out.println(count);
    }
    }

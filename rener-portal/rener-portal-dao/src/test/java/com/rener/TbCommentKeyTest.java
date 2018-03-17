package com.rener;

import com.rener.portal.dao.TbCommentKeyMapper;
import com.rener.portal.model.mo.TbCommentKey;
import com.rener.portal.model.vo.TbCommentKeyVo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/30
 * @Time:22:17
 * @JDK versions: 1.8.0_101
 */
public class TbCommentKeyTest {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-portal-dao.xml");
        TbCommentKeyMapper tbCommentKeyMapper = applicationContext.getBean("tbCommentKeyMapper", TbCommentKeyMapper.class);
        TbCommentKey tbCommentKey = new TbCommentKey();
        tbCommentKey.setCommentId(new Long(1));
        tbCommentKey.setDelicious(new Long(1));
        tbCommentKey.setGoodHealth(new Long(1));
        tbCommentKey.setStoreId(new Long(1));
        tbCommentKey.setGreatLocation(new Long(1));
        tbCommentKey.setGoodService(new Long(1));
        boolean insert = tbCommentKeyMapper.insert(tbCommentKey);
        System.out.println(insert);
    }

    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-portal-dao.xml");
        TbCommentKeyMapper tbCommentKeyMapper = applicationContext.getBean("tbCommentKeyMapper", TbCommentKeyMapper.class);
        TbCommentKeyVo tbCommentKeys = tbCommentKeyMapper.selectCount(new Long(1));
        System.out.println(tbCommentKeys);
    }

    @Test
    public void test03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-portal-dao.xml");
        TbCommentKeyMapper tbCommentKeyMapper = applicationContext.getBean("tbCommentKeyMapper", TbCommentKeyMapper.class);
        int delete = tbCommentKeyMapper.delete(new Long(9));
        System.out.println(delete);
    }

    @Test
    public void test04(){

    }
}

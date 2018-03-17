package com.rener;

import com.rener.portal.dao.GoodsTypeVoMapper;
import com.rener.portal.dao.TbGoodsCarMapper;
import com.rener.portal.model.vo.GoodsTypeVo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TB {
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring-portal-dao.xml");
        TbGoodsCarMapper tbGoodsCarMapper = ac.getBean("tbGoodsCarMapper", TbGoodsCarMapper.class);
        tbGoodsCarMapper.updateOnMark(new Long(1), new Long(1));
    }
}

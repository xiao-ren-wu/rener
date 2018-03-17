package com.rener.portal.dao;

import com.rener.portal.model.vo.GoodsPicNameVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhuwenqiang
 */
@Repository
public interface GoodsPicNameVoMapper {
    //在service层进行处理数据 list数组的属性 contince
    List<GoodsPicNameVo> PicName();//查询销量前四的商品类型和URL，加载页面时返回
}
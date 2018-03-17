package com.rener.portal.dao;

import com.rener.portal.model.vo.GoodsAddressVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhuwenqiang
 */
@Repository
public interface GoodsAddressVoMapper {
    List<GoodsAddressVo> address();//查詢商品地址(去重)，在全部商区里，加载页面时返回
}

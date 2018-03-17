package com.rener.portal.dao;

import com.rener.portal.model.vo.OrderPageDetail;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Created with IDEA
 * @author:GaoPan
 * @Date:2018/1/27
 * @Time:18:07
 * @JDK versions: 1.8.0_101
 */
@Repository
public interface OrderPageDetailMapper {
    /**
     * @param orderId
     * @return
     * @apiNote根据订单Id返回订单详情
     */
    OrderPageDetail selectOrderDetailById(@Param("orderId") Long orderId);
}

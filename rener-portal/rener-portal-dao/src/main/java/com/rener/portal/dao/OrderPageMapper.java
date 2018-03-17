package com.rener.portal.dao;

import com.rener.portal.model.vo.OrderPage;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Created with IDEA
 * @author:GaoPan
 * @Date:2018/1/27
 * @Time:15:17
 * @JDK versions: 1.8.0_101
 */
@Repository
public interface OrderPageMapper {
    /**
     * @param orderIds
     * @return
     * @apiNote根据订单Id返回订单详情
     */
    List<OrderPage> selectOrdersByIds(@Param("list") List<Long> list);

    /**
     * @param orderId
     * @return
     * @apiNote更具订单Id返回订单详情
     */
    OrderPage selectOrdersById(@Param("orderId") Long orderId);
}

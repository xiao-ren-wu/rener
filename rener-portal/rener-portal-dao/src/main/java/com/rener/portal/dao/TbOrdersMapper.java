package com.rener.portal.dao;

import com.rener.portal.model.mo.TbOrders;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.Date;

/**
 * @author lenovo
 */
@Repository
public interface TbOrdersMapper {
    /**
     * @param orderId
     * @return
     * @apiNoteg删除订单
     */
    int deleteById(@Param("orderId") Long orderId);

    /**
     * @param tbOrders
     * @return
     * @apiNote插入订单
     */
    Long insertOrderId(TbOrders tbOrders);

    /**
     * @param orderId
     * @param time
     * @param status
     * @return
     * @apiNote 更具订单状态更改时间
     */
    int updateTimeByStaus(@Param("orderId") Long orderId, @Param("time") Date time, @Param("status") Long status);

    /**
     * @param orderId
     * @param status
     * @return
     * @apiNote 根据订单状态
     */
    int updateStatus(@Param("orderId") Long orderId, @Param("status") Long status);

    /**
     * @param orderId
     * @param totalPrice
     * @return
     * @apiNote更新订单总价钱
     */
    int updateTotalPrice(@Param("orderId") Long orderId, @Param("totalPrice") BigDecimal totalPrice);

    int selectOrderNum(@Param("userId") Long userId);

    int updateOrderDescribe(@Param("message") String message, @Param("orderId") Long orderId, @Param("payTime") Date payTime);
    /**
     * chenkuan
     * @param userId
     * @return 指定用户的订单数量
     */
    int orderCounts(@Param("userId") Long userId);

}
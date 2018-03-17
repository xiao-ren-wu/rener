package com.rener.portal.dao;

import com.rener.portal.model.po.OrderState;
import com.rener.portal.model.vo.SimpleOrderPage;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Created with IDEA
 * @author:GaoPan
 * @Date:2018/1/28
 * @Time:1:26
 * @JDK versions: 1.8.0_101
 */
@Repository
public interface SimpleOrderPageMapper {
    /**
     * @param status
     * @param totalNum
     * @param pageNum
     * @param orderOfStatus
     * @return
     * @apiNote更具订单状态返回订单
     */

    List<SimpleOrderPage> selectAllOrderByStatus(@Param("status") Long status, @Param("userId") Long userId);

    List<SimpleOrderPage> selectOrderByStatus(@Param("status") Long status, @Param("totalNumm") int totalNum, @Param("pageNum") int pageNum, @Param("orderOfStatus") OrderState orderOfStatus);
}

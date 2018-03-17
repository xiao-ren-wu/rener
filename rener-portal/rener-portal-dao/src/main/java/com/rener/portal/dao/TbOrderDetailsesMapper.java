
package com.rener.portal.dao;

import com.rener.portal.model.mo.TbOrderDetailses;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @author lenovo
 */
@Repository
public interface TbOrderDetailsesMapper {
    int deleteById(Long orderdetailsId);

    void

    insert(@Param("orderId") Long orderId, @Param("goodsId") Long goodsId, @Param("goodsNumber") Integer goodsNumber, @Param("goodsTotalprice") BigDecimal goodsTotalprice);

    TbOrderDetailses selectById(Long orderdetailsId);

    int updateById(TbOrderDetailses record);

    BigDecimal selectTotalPrice(@Param("orderId") Long orderId);
}
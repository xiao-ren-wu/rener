package com.rener.portal.dao;


import com.rener.portal.model.mo.TbDiscount;

import org.springframework.stereotype.Repository;

@Repository

public interface TbDiscountMapper {
    Double findDiscountRate(Long discountId);

    TbDiscount selectDiscountMsgByDisCountId(Long discountId);

}
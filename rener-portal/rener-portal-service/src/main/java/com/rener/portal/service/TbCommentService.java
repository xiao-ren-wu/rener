package com.rener.portal.service;

import com.rener.portal.model.vo.RespCommentByGoodsId;
import com.rener.portal.model.vo.RespCommentVo;

import java.util.List;

public interface TbCommentService {

    boolean insert(Long userId, Long goodsId, Long storeId, Byte praiseLevel, String loadPlace, String photo, Byte anonymityTag, String commentInfo
            , Long goodService, Long greatLocation, Long goodHealth, Long delicious);
    List<RespCommentVo> selectByUserId(Long userId);

    List<RespCommentVo> selectAllByStoreId(Long storeId, Long page);

    int delete(Long commentId);

    List<RespCommentByGoodsId> selectCommentToGoods(Long goodsId, String condition, Long page);
}

package com.rener.portal.dao;

import com.rener.portal.model.mo.TbCommentKey;
import com.rener.portal.model.vo.TbCommentKeyVo;
import org.apache.ibatis.annotations.Param;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/30
 * @Time:21:43
 * @JDK versions: 1.8.0_101
 */
public interface TbCommentKeyMapper {
    boolean insert(TbCommentKey tbCommentKey);

    TbCommentKeyVo selectCount(@Param("storeId") Long storeId);

    int delete(@Param("commentId") Long commentId);
}

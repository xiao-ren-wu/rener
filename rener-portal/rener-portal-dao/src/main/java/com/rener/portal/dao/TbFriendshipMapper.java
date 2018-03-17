package com.rener.portal.dao;


import com.rener.portal.model.mo.TbFriendship;
import com.rener.portal.model.vo.TbFriendshipVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IDEA
 * author:Dick_YangDi
 * Date:2018/1/23
 * Time:23:37
 * JDK versions: 1.8.0_101
 */
@Repository
public interface TbFriendshipMapper {
    List<TbFriendshipVo> select(@Param("userId") Long userId);

    boolean insert(TbFriendship tbFriendship);

    int delete(TbFriendship tbFriendship);
}

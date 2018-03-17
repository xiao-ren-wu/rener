package com.rener.portal.dao;

import com.rener.portal.model.mo.TbRedDetail;
import com.rener.portal.model.vo.UserRedView;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface TbUserRedPacketMapper {
    void insert(TbRedDetail tbRedDetai);

    void updateMode(@Param("mode") Integer mode,@Param("newTime")Date newTime,@Param("id")Long id);

    Date selectEndTime(Long id);

    List<UserRedView> selectRedsByUserId(Long id);
}

package com.rener.portal.dao;

import com.rener.portal.model.vo.StoresDetailsVo;
import com.rener.portal.model.vo.StoresVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StoresVoMapper {

    /**
     * chenkuan
     * @param userId 用户id
     * @return 查询所有收藏的店铺 一次查七个
     */
    List<StoresVo> SelectAll(@Param("userId") Long userId, @Param("num") Integer num);
    List<StoresVo> SelectAll1(@Param("userId") Long userId, @Param("num") Integer num);
    /**
     * chenkuan
     *@param userId 用户id
     * @return  按地區分類返回的地區名
     */
    List<String> SelectAreaString(@Param("userId") Long userId);

    /**
     *chenkuan
     * @param userId 用户id
     * @return  按類別分類返回的類別名
     */
    List<String> SelectClassesString(@Param("userId") Long userId);

    /**
     * 根据指定的
     * @param userId 用户
     * @param Classes  类型
     * @return 查找指定类型所收藏的商铺信息
     */
    List<StoresVo> selectStoresForClasses(@Param("userId") Long userId, @Param("Classes") String Classes,@Param("num")Integer num);

    /**
     * 根据指定的
     * @param userId 用户
     * @param Area  类型
     * @return 查找指定地区所收藏的商铺
     */
    List<StoresVo> selectStoresForArea(@Param("userId") Long userId, @Param("Area") String Area,@Param("num")Integer num);

    /**
     * chenkuan
     * @param dateType 日期類型 按幾天查
     * @param userId 用戶id
     * @return  按时间类型返回收藏店铺 一次七个
     */
    List<StoresVo> DateSelect(@Param("dateType") String dateType, @Param("userId") Long userId, @Param("num") Integer num);


    /**
     * chenkuan
     * @return 查看店铺详情时 店铺的详情 @Param("userId") Long userId,
     */
    StoresDetailsVo selectToStore( @Param("storeId") Long storeId);
}

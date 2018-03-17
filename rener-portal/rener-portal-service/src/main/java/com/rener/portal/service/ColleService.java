package com.rener.portal.service;

import com.rener.portal.model.vo.StoresVo;
import com.rener.portal.model.vo.UserCommentVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ColleService {

//    List<TbColle> findAll();
//
//    TbColle findByID(Integer id);
//
//    void saveOrUpdate1(TbColle tbColle);
//
//    void deleteByID(Integer id);
//
//    void add(TbColle tbColle);
//
//    List<TbColle> paging(Integer pageNow,Integer pageSize);

    /**
     * 收藏首次展示
     * @param
     * @param userId
     * @return
     */
    Map<String, StoresVo> selectAll(Long userId, Integer num);

    /**
     *
     * @param userId
     * @return 按類別顯示收藏的商品類型，按地區顯示收藏的商品的類型,轉化為JBK按首字母a-z傳遞
     */
    List<String> selectByClasses(Long userId);

    /**
     *
     * @param userId
     * @return 按地區顯示收藏的商品的地區,轉化為JBK按首字母a-z傳遞
     */
    Set selectByArea(Long userId);

    /**
     *按类别查找收藏的店铺
     * @param userId
     * @param Classes
     * @return
     */
    List<StoresVo> selectStoreForClasses(@Param("userId") Long userId, @Param("Classes") String Classes,@Param("num")Integer num);

    /**
     *按地区查找收藏的店铺
     * @param userId
     * @param Area
     * @return
     */
    List<StoresVo> selectStoreForArea(@Param("userId") Long userId, @Param("Area") String Area,@Param("num")Integer num);

    /**
     * 按日期展示
     * @param dateType
     * @param userId
     * @param
     * @return
     */
    List<StoresVo> DateSelect(String dateType, Long userId, Integer num);

    /**
     * 展示商铺详情信息
     * @param userId
     * @param storeId
     * @return
     */
    Map selectAllDetailToStore(Long userId, Long storeId,String condition);



    /**
     * 根据最新评论 或 带图评论 排序
     * @param condition
     * @param storeId
     * @return
     */
    List<UserCommentVo> selectByTorP(String condition, Long storeId);
}

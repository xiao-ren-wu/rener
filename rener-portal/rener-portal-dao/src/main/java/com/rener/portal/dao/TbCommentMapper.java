package com.rener.portal.dao;



import com.rener.portal.model.mo.TbComment;
import com.rener.portal.model.vo.GoodCommentVo;
import com.rener.portal.model.vo.TbCommentVo;
import com.rener.portal.model.vo.UserCommentVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IDEA
 * author:Dick_YangDi
 * Date:2018/1/24
 * Time:18:41
 * JDK versions: 1.8.0_101
 */
//mybatis是没有具体实现类的,通过动态代理,将xml里的内容创建为与它对应接口的代理对象.
//所以要把注解加在接口上里面.
// IOC将mybatis创建的代理对象加入到Spring容器里
public interface TbCommentMapper{
    /**
     * 插入一条评论
     * @param tbComment
     * @return
     */
    boolean insert(TbCommentVo tbComment);

    /**
     * 我的全部评论
     * 用户查询自己的全部评论:相当于用户自己上传自己的用户id,通过用过id查询自己所有的评论.
     * @param userId
     * @return
     */
    List<TbCommentVo> selectByUserId(@Param("userId") Long userId);


    /**
     *
     * @param userId
     * @returncommentId
     */
    List<TbComment> commentall(@Param("userId") Long userId);

    /**
     *
     * @param storeId
     * @param page
     * @return
     */

    List<TbCommentVo> selectAllByStoreId(@Param("storeId") Long storeId, @Param("page") Long page);

    int delete(@Param("commentId") Long commentId);

    /**
     * 查看一个商品所有的评价
     * @param goodsId
     * @return
     */
    List<GoodCommentVo> selectCommentToGoods(@Param("goodsId") Long goodsId, @Param("condition")String condition,
                                             @Param("page") Long page);

    /**
     * chenkuan
     * @return 返回针对商铺详情的评论@Param("userId") Integer userId, @Param("storeId") Integer storeId
     */
    List<UserCommentVo> selectCommentToStore(@Param("storeId") Long storeId, @Param("condition")String condition);

    /**
     * chenkuan
     * @param condition 按时间排序还是按带图片排序
     * @param storeId 商铺id
     * @return  取七条返回
     */
//    List<UserCommentVo> selectCommentTorP(@Param("condition")String condition,@Param("storeId") Long storeId);

    /**
     * chenkuan
     * @param storeId
     * @return 返回店铺评论总数
     */
    Integer selectCount1(@Param("storeId") Long storeId);


}

package com.rener.portal.service.impl;

import com.rener.portal.dao.TbCommentKeyMapper;
import com.rener.portal.dao.TbCommentMapper;
import com.rener.portal.model.mo.TbCommentKey;
import com.rener.portal.model.vo.*;
import com.rener.portal.service.TbCommentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


@Service
public class TbCommentServiceImpl implements TbCommentService {
    @Resource
    private TbCommentMapper tbCommentMapper;
    @Resource
    private TbCommentKeyMapper tbCommentKeyMapper;

    @Override
    @Transactional
    public boolean insert(Long userId, Long goodsId, Long storeId, Byte praiseLevel, String loadPlace, String photo, Byte anonymityTag, String commentInfo
            , Long goodService, Long greatLocation, Long goodHealth, Long delicious) {
        TbCommentVo tbComment = new TbCommentVo();
        TbCommentKey tbCommentKey = new TbCommentKey();
        Date date = new Date(System.currentTimeMillis());
        tbComment.setUserId(userId);
        tbComment.setGoodsId(goodsId);
        tbComment.setStoreId(storeId);
        tbComment.setPraiseLevel(praiseLevel);
        tbComment.setUploadTime(date);
        tbComment.setUploadPlace(loadPlace);
        tbComment.setPhoto(new PhotoList(photo));
        tbComment.setCreateTime(date);
        tbComment.setUpdateTime(date);
        tbComment.setAnonymityTag(anonymityTag);
        tbComment.setCommentInfo(commentInfo);
        boolean insert1 = tbCommentMapper.insert(tbComment);
        tbCommentKey.setGoodService(goodService);
        tbCommentKey.setGreatLocation(greatLocation);
        tbCommentKey.setStoreId(storeId);
        tbCommentKey.setGoodHealth(goodHealth);
        tbCommentKey.setCommentId(tbComment.getCommentId());
        tbCommentKey.setDelicious(delicious);
        boolean insert2 = tbCommentKeyMapper.insert(tbCommentKey);
        return insert1 && insert2;
    }

    @Override
    public List<RespCommentVo> selectByUserId(Long userId) {
        List<TbCommentVo> tbCommentVos = tbCommentMapper.selectByUserId(userId);
        return tbCommentVoToRespCommentVo(tbCommentVos);
    }

    public List<RespCommentVo> tbCommentVoToRespCommentVo(List<TbCommentVo> tbCommentVos) {
        List<RespCommentVo> respCommentVos = new ArrayList<>();
        TbCommentVo tbCommentVo;
        for (int i = 0; tbCommentVos != null && i < tbCommentVos.size(); i++) {
            tbCommentVo = tbCommentVos.get(i);
            RespCommentVo respCommentVo = new RespCommentVo();
            respCommentVo.setAnonymityTag(tbCommentVo.getAnonymityTag());
            respCommentVo.setCommentId(tbCommentVo.getCommentId());
            respCommentVo.setCommentInfo(tbCommentVo.getCommentInfo());
            respCommentVo.setPhotoList(tbCommentVo.getPhoto().getUrlList());
            respCommentVo.setGoodsId(tbCommentVo.getGoodsId());
            respCommentVo.setPraiseLevel(tbCommentVo.getPraiseLevel());
            respCommentVo.setCreateTime(tbCommentVo.getCreateTime());
            respCommentVo.setStoreId(tbCommentVo.getStoreId());
            respCommentVo.setUserId(tbCommentVo.getUserId());
            respCommentVo.setUpdateTime(tbCommentVo.getUpdateTime());
            respCommentVo.setUploadPlace(tbCommentVo.getUploadPlace());
            respCommentVo.setUploadTime(tbCommentVo.getUploadTime());
            respCommentVos.add(respCommentVo);
        }
        return respCommentVos;
    }

    @Override
    public List<RespCommentVo> selectAllByStoreId(Long storeId, Long page) {
        List<TbCommentVo> tbCommentVos = tbCommentMapper.selectAllByStoreId(storeId, page);
        return tbCommentVoToRespCommentVo(tbCommentVos);
    }

    @Override
    @Transactional
    public int delete(Long commentId) {
        int delete = tbCommentMapper.delete(commentId);
        int delete1 = tbCommentKeyMapper.delete(commentId);
        return delete + delete1;
    }

    @Override
    public List<RespCommentByGoodsId> selectCommentToGoods(Long goodsId, String condition, Long page) {
        List<GoodCommentVo> goodCommentVos = tbCommentMapper.selectCommentToGoods(goodsId, condition, page);
        return goodCommentVotoRespCommentByGoodsId(goodCommentVos);
    }

    public List<RespCommentByGoodsId> goodCommentVotoRespCommentByGoodsId(List<GoodCommentVo> goodCommentVos){
        List<RespCommentByGoodsId> list = new ArrayList<>();
        GoodCommentVo goodCommentVo;
        for(int i=0;goodCommentVos!=null&&i<goodCommentVos.size();i++){
            goodCommentVo = goodCommentVos.get(i);
            RespCommentByGoodsId respCommentByGoodsId = new RespCommentByGoodsId();
            respCommentByGoodsId.setCommentId(goodCommentVo.getCommentId());
            respCommentByGoodsId.setAnonymityTag(goodCommentVo.getAnonymityTag());
            respCommentByGoodsId.setCommentInfo(goodCommentVo.getCommentInfo());
            respCommentByGoodsId.setGoodsId(goodCommentVo.getGoodsId());
            respCommentByGoodsId.setUploadPlace(goodCommentVo.getUploadPlace());
            respCommentByGoodsId.setPhotoURL(goodCommentVo.getPhoto().getUrlList());
            respCommentByGoodsId.setCreateTime(goodCommentVo.getCreateTime());
            respCommentByGoodsId.setPraiseLevel(goodCommentVo.getPraiseLevel());
            respCommentByGoodsId.setStoreId(goodCommentVo.getStoreId());
            respCommentByGoodsId.setUserId(goodCommentVo.getUserId());
            respCommentByGoodsId.setUserNickname(goodCommentVo.getUserNickname());
            respCommentByGoodsId.setUserPhoto(goodCommentVo.getUserPhoto());
            list.add(respCommentByGoodsId);
        }
        return list;
    }
}

package com.rener.portal.service.impl;

import com.rener.portal.dao.AllGoodsVoMapper;
import com.rener.portal.dao.StoresVoMapper;
import com.rener.portal.dao.TbCommentKeyMapper;
import com.rener.portal.dao.TbCommentMapper;
import com.rener.portal.model.vo.*;
import com.rener.portal.service.ColleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.util.*;

@Service
public class ColleServiceImpl implements ColleService {

    @Resource
    private StoresVoMapper storesVoMapper;
    @Resource
    private AllGoodsVoMapper allGoodsVoMapper;
    @Resource
    private TbCommentMapper tbCommentMapper;
    @Resource
    private TbCommentKeyMapper tbCommentKeyMapper;

    /**
     * 收藏首次展示
     *
     * @param userId
     * @param num
     * @return
     */
    @Override
    public Map<String, StoresVo> selectAll(Long userId, Integer num) {
        Map map = new HashMap<String,StoresVo>();
        map.put("first",storesVoMapper.SelectAll(userId, num));
        map.put("second",storesVoMapper.SelectAll1(userId,num));
        return map;
    }

    /**
     * 選擇收藏商鋪中國所有的類別列表
     *
     * @param userId
     * @return
     */
    @Override
    public List<String> selectByClasses(Long userId) {
        return storesVoMapper.SelectClassesString(userId);
    }

    /**
     * 選擇出收藏商鋪中的所有的地區
     *
     * @param userId
     * @return
     */
    @Override
    public Set selectByArea(Long userId) {
        List<String> list = storesVoMapper.SelectAreaString(userId);
        List<String> list2 = new ArrayList<String>();
        for (String string : list
                ) {
            int indexof1 = string.indexOf("区");
            string = string.substring(0, indexof1 + 1);
            int indexof2 = string.indexOf("市");
            string = string.substring(indexof2 + 1, indexof1 + 1);
            list2.add(string);
        }
        Set set = new HashSet<String>();
        for (String s : list2
                ) {
            set.add(s);
        }
        return set;
    }

    @Override
    public List<StoresVo> selectStoreForClasses(Long userId, String Classes, Integer num) {
        return storesVoMapper.selectStoresForClasses(userId, Classes, num);
    }

    @Override
    public List<StoresVo> selectStoreForArea(Long userId, String Area, Integer num) {
        return storesVoMapper.selectStoresForArea(userId, Area, num);
    }

    /**
     * 按最近选择
     *
     * @param dateType
     * @param userId
     * @param
     * @return
     */
    @Override
    public List<StoresVo> DateSelect(String dateType, Long userId, Integer num) {
        return storesVoMapper.DateSelect(dateType, userId, num);
    }

    @Override
    public Map selectAllDetailToStore(Long userId, Long storeId, String condition) {
        Map<String, Object> map = new HashMap<String, Object>(20);

        StoresDetailsVo storesDetailsVo = storesVoMapper.selectToStore(storeId);
        List list1 = new ArrayList<String>();
        StoreDetailsVo2 storeDetailsVo2 = new StoreDetailsVo2();
        String storePic = storesDetailsVo.getStorePic();
        list1.add(storesDetailsVo.getStoreIcon());
        String[] storeSrcs = storePic.split("&&");
        for (int i = 0; i < storeSrcs.length; i++) {
            list1.add(storeSrcs[i]);
        }
        list1.add(storesDetailsVo.getBusinessPermit());
        list1.add(storesDetailsVo.getSafePermit());

        storeDetailsVo2.setStorePic(list1);
        storeDetailsVo2.setStoreId(storesDetailsVo.getStoreId());
        storeDetailsVo2.setStoreAddress(storesDetailsVo.getStoreAddress());
        storeDetailsVo2.setStoreLevel(storesDetailsVo.getStoreLevel());
        storeDetailsVo2.setStoreName(storesDetailsVo.getStoreName());
        storeDetailsVo2.setStoreTel(storesDetailsVo.getStoreTel());
        storeDetailsVo2.setWorkDates(storesDetailsVo.getWorkDates());
        map.put("storeToDetail", storeDetailsVo2);
        List<AllGoodsVo> allGoodsVoList = allGoodsVoMapper.selectGoodsToStore(storeId);
        List<GoodsDetailsVo> goodsDetailsVoList = new ArrayList<GoodsDetailsVo>();
        for (AllGoodsVo a : allGoodsVoList) {
            GoodsDetailsVo goodsDetailsVo = new GoodsDetailsVo();
            goodsDetailsVo.setGoodsId(a.getGoodsId());
            goodsDetailsVo.setGoodsName(a.getGoodsName());
            goodsDetailsVo.setGoodsPrice(a.getGoodsPrice());
            goodsDetailsVo.setGoodsPic(a.getGoodsPic());
            goodsDetailsVo.setGoodsSales(a.getGoodsSales());
            goodsDetailsVo.setCurrentPrice(Double.parseDouble(new DecimalFormat(".##").format(a.getGoodsPrice() * a.getDiscountRate())));
            goodsDetailsVoList.add(goodsDetailsVo);
        }
        map.put("goodsToDetail", goodsDetailsVoList);

        Integer tbCommentKeyVo = tbCommentMapper.selectCount1(storeId);
        map.put("CommentCountToDetail", tbCommentKeyVo);
        map.put("CommentKeyToDetail", tbCommentKeyMapper.selectCount(storeId));
        Map comMap = new HashMap();
        List<UserCommentVo> allList = tbCommentMapper.selectCommentToStore(storeId,"all");
        List<UserCommentVo> newList = tbCommentMapper.selectCommentToStore(storeId, "new");
        List<UserCommentVo> withPicList = tbCommentMapper.selectCommentToStore(storeId, "withPic");
        comMap.put("allComment", hanshu(allList));
        comMap.put("newComment",hanshu(newList));

        List<UserCommentVo> listt = new ArrayList<UserCommentVo>();
        for (UserCommentVo u : withPicList) {
            if (u.getPhoto().length() > 0) {
                listt.add(u);
            }
        }
        comMap.put("withPic",hanshu(listt));
        map.put("commentToDetail",comMap);
        return map;
    }

    @Override
    public List<UserCommentVo> selectByTorP(String condition, Long storeId) {
        List<UserCommentVo> list = tbCommentMapper.selectCommentToStore(storeId, condition);
        List<UserCommentVo> list1 = new ArrayList<UserCommentVo>();
        if (condition.equals("withPic")) {
            for (UserCommentVo u : list) {
                if (u.getPhoto().length() > 0) {
                    list1.add(u);
                }
            }
            return list1;
        } else {
            return list;
        }
    }
    List<UserCommentVo> hanshu (List<UserCommentVo> allList){
        for (UserCommentVo userCommentVo : allList) {
            String date = userCommentVo.getCreateTime().toString();
            String str[] = date.split(" ");
            userCommentVo.setCreateTime(str[0]);
            List list3 = new ArrayList<String>();
            String photo = userCommentVo.getPhoto();
            String[] photos = photo.split("@@");
            for (int i = 0; i < photos.length; i++) {
                list3.add(photos[i]);
            }
            userCommentVo.setPic(list3);
            userCommentVo.setPhoto(null);
        }
        return allList;
    }
}



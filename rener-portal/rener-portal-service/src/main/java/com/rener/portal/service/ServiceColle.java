package com.rener.portal.service;

import com.rener.portal.model.mo.TbColle;

import java.util.List;

public interface ServiceColle {

    List<TbColle> findAll();

    TbColle findByID(Integer id);

    void saveOrUpdate1(TbColle tbColle);

    void deleteByID(Integer id);

    void add(TbColle tbColle);

//    public Page<TbStoreClasses> queryUsersByPage(Page<TbStoreClasses> p);

//    List<TbColle> findAll();
//
//    TbColle findByID(Integer id);
//
//    void saveOrUpdate1(TbColle tbColle);
//
//    void deleteByID(Integer id);
//
//    void add(TbColle tbColle);

//    List<StoresVo> selectStore(Integer userId,Integer cishu);
}

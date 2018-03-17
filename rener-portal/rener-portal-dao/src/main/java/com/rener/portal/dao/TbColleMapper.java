package com.rener.portal.dao;


import com.rener.portal.model.mo.TbColle;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


/**
 * @author Yuwenbo
 * @author Chenkuan
 */
@Repository
public interface TbColleMapper {
    void changeCollectState(TbColle tbColle);

    Integer findCollectState(TbColle tbColle);

    void addCollectState(TbColle tbColle);

    int colleCounts(@Param("userId") Long userId);

//    List<TbColle> find();

//    TbColle findById1(Integer id);
//
//    int updateByPrimaryKey1(TbColle tbColle);
//
//    void deleteByPrimaryKey1(Integer id);
//
//    void insert(TbColle tbColle);
//
//    List<TbColle> fenye(@Param("pageNow") Integer pageNow, @Param("pageSize") Integer pageSize);
}


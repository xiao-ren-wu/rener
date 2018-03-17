package com.rener.portal.dao;

import com.rener.portal.model.mo.TbIntegralStore;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TbIntegralStoreMapper {
    void insertIntegralStore(TbIntegralStore tbIntegralStore);

    void deleteIntegralStore(Long id);

    List<TbIntegralStore> selectAllTbIntegralStore();

    TbIntegralStore selectTbIntegralStore(Long id);

    void updateIntegralStore(TbIntegralStore tbIntegralStore);
}


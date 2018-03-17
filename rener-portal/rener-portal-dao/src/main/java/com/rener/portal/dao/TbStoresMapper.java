package com.rener.portal.dao;

import com.rener.portal.model.mo.TbStores;

public interface TbStoresMapper {
    TbStores selectByStoreId(Long StoreId);

    String selectStoreName(Long storeId);
}

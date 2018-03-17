package com.rener.portal.model.vo;

import java.io.Serializable;

/**
 * @author zhuwenqiang
 */
public class GoodsAddressVo implements Serializable {
    private String storeAddress;

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    @Override
    public String toString() {
        return "GoodsAddressVo{" +
                "storeAddress='" + storeAddress + '\'' +
                '}';
    }
}

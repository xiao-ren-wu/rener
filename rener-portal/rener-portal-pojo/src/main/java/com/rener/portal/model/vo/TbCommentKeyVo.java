package com.rener.portal.model.vo;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/30
 * @Time:22:01
 * @JDK versions: 1.8.0_101
 */
public class TbCommentKeyVo {
    private Long storeId;
    private Long greatLocation;
    private Long goodService;
    private Long delicious;
    private Long goodHealth;

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getGreatLocation() {
        return greatLocation;
    }

    public void setGreatLocation(Long greatLocation) {
        this.greatLocation = greatLocation;
    }

    public Long getGoodService() {
        return goodService;
    }

    public void setGoodService(Long goodService) {
        this.goodService = goodService;
    }

    public Long getDelicious() {
        return delicious;
    }

    public void setDelicious(Long delicious) {
        this.delicious = delicious;
    }

    public Long getGoodHealth() {
        return goodHealth;
    }

    public void setGoodHealth(Long goodHealth) {
        this.goodHealth = goodHealth;
    }

    @Override
    public String toString() {
        return "TbCommentKeyVo{" +
                "storeId=" + storeId +
                ", greatLocation=" + greatLocation +
                ", goodService=" + goodService +
                ", delicious=" + delicious +
                ", goodHealth=" + goodHealth +
                '}';
    }
}

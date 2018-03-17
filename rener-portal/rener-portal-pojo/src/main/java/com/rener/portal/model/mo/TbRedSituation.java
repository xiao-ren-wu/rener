package com.rener.portal.model.mo;

import java.util.Date;

public class TbRedSituation {
    private Long redSituationId;

    private Long redDetailsId;

    private Long orderDetailId;

    private Date createTime;

    private Date updateTime;

    public Long getRedSituationId() {
        return redSituationId;
    }

    public void setRedSituationId(Long redSituationId) {
        this.redSituationId = redSituationId;
    }

    public Long getRedDetailsId() {
        return redDetailsId;
    }

    public void setRedDetailsId(Long redDetailsId) {
        this.redDetailsId = redDetailsId;
    }

    public Long getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Long orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
package com.rener.portal.model.po;

/**
 * @Created with IDEA
 * @author:GaoPan
 * @Date:2018/2/1
 * @Time:17:38
 * @JDK versions: 1.8.0_101
 */
public class OrderState {
    /**
     * 未支付
     */
    public static final int unPay = 0;
    /**
     * 已付款
     */
    public static final int payOf = 1;
    /**
     * 待点评
     */
    public static final int unComment = 2;
    /**
     * 已点评
     */
    public static final int commentOf = 3;
    /**
     * 已到货
     */
    public static final int arrived = 5;
    /**
     * 已取消
     */
    public static final int Cancelled=6;

    public static int getUnPay() {
        return unPay;
    }

    public static int getPayOf() {
        return payOf;
    }

    public static int getUnComment() {
        return unComment;
    }

    public static int getCommentOf() {
        return commentOf;
    }

    public static int getArrived() {
        return arrived;
    }

    public static int getCancelled() {
        return Cancelled;
    }
}

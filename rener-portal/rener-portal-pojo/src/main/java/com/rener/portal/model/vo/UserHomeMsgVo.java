package com.rener.portal.model.vo;

import java.math.BigDecimal;

/**
 * @Created with IDEA
 * @author:Yuwenbo
 * @Date:2018/1/29
 * @Time:17:31
 * @JDK versions: 1.8.0_101
 */
public class UserHomeMsgVo {

    private Long userId;

    private Integer userIntegral;

    private String userPhoto;

    private String userNickname;

    private Integer redPackNum;

    private BigDecimal userBalance;

    private String userBirth;

    private String useTel;

    public String getUseTel() {
        return useTel;
    }

    public void setUseTel(String useTel) {
        this.useTel = useTel;
    }

    public String getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(String userBirth) {
        this.userBirth = userBirth;
    }

    public BigDecimal getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(BigDecimal userBalance) {
        this.userBalance = userBalance;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getUserIntegral() {
        return userIntegral;
    }

    public void setUserIntegral(Integer userIntegral) {
        this.userIntegral = userIntegral;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public Integer getRedPackNum() {
        return redPackNum;
    }

    public void setRedPackNum(Integer redPackNum) {
        this.redPackNum = redPackNum;
    }
}


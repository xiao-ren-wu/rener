package com.rener.portal.model.mo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.sql.Date;

public class TbUsers {
    private Long userId;

    @Pattern(regexp = "[A-Za-z0-9]{6,16}")
    @Size(min = 6, max = 18)
    private String userPwd;

    @Pattern(regexp = "1[3|4|5|8]\\d{9}")
    private String userTel;

    @NotNull
    private Integer userSex;

    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date userBirth;

    @Pattern(regexp = "[A-Za-z\\d]+([-_.][A-Za-z\\d]+)*@([A-Za-z\\d]+[-.])+[A-Za-z\\d]{2,4}")
    private String userEmail;

    private BigDecimal userBalance;

    private Integer userIntegral;

    private String userPhoto;

    @Pattern(regexp = "([\\u4e00-\\u9fa5]+|([a-z]+\\s?)+)")
    private String userNickname;

    private Integer userLevelId;

    private Integer userOnlinestate;

    private Date createTime;

    private Date updateTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Date getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public BigDecimal getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(BigDecimal userBalance) {
        this.userBalance = userBalance;
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
        this.userPhoto = userPhoto == null ? null : userPhoto.trim();
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    public Integer getUserLevelId() {
        return userLevelId;
    }

    public void setUserLevelId(Integer userLevelId) {
        this.userLevelId = userLevelId;
    }

    public Integer getUserOnlinestate() {
        return userOnlinestate;
    }

    public void setUserOnlinestate(Integer userOnlinestate) {
        this.userOnlinestate = userOnlinestate;
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
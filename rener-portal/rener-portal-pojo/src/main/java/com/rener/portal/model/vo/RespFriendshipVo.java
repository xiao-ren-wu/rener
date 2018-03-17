package com.rener.portal.model.vo;

import java.util.List;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/2/8
 * @Time:17:33
 * @JDK versions: 1.8.0_101
 */
public class RespFriendshipVo {
    List<TbFriendshipVo> friendShipVo;
    char initial;

    public List<TbFriendshipVo> getFriendShipVo() {
        return friendShipVo;
    }

    public void setFriendShipVo(List<TbFriendshipVo> friendShipVo) {
        this.friendShipVo = friendShipVo;
    }

    public char getInitial() {
        return initial;
    }

    public void setInitial(char initial) {
        this.initial = initial;
    }
}

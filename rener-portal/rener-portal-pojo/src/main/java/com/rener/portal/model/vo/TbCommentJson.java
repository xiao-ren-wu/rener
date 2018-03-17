package com.rener.portal.model.vo;

import com.rener.portal.model.mo.TbGoods;

import java.util.*;

/**
 * @author lidan@meng_zhu
 * @date 2018/2/5 0005 11:34
 */
public class TbCommentJson {
    private int commentOneSize;
    private int commentTwoSize;
    private int commentThreeSize;
    private int commentFourSize;


    private List<TbCommentsVo> list;

    public int getCommentOneSize() {
        return commentOneSize;
    }

    public void setCommentOneSize(int commentOneSize) {
        this.commentOneSize = commentOneSize;
    }

    public int getCommentTwoSize() {
        return commentTwoSize;
    }

    public void setCommentTwoSize(int commentTwoSize) {
        this.commentTwoSize = commentTwoSize;
    }

    public int getCommentThreeSize() {
        return commentThreeSize;
    }

    public void setCommentThreeSize(int commentThreeSize) {
        this.commentThreeSize = commentThreeSize;
    }

    public int getCommentFourSize() {
        return commentFourSize;
    }

    public void setCommentFourSize(int commentFourSize) {
        this.commentFourSize = commentFourSize;
    }

    public List<TbCommentsVo> getList() {
        return list;
    }

    public void setList(List<TbCommentsVo> list) {
        this.list = list;
    }
}

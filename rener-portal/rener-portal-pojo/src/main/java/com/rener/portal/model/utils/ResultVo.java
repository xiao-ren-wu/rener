package com.rener.portal.model.utils;

import java.util.List;

public class ResultVo<T> {
    /**
     * 一次传输的数据量大小
     */
    private int pageNum = 7;
    private int count = 0;
    private int success = 1;
    private String message = null;
    private int allNum = 0;
    /**
     * 列表信息
     */

    private List<T> items;

    public int getAllNum() {
        return allNum;
    }

    public void setAllNum(int allNum) {
        this.allNum = allNum;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}

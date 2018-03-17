package com.rener.portal.model.vo;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/26
 * @Time:20:14
 * @JDK versions: 1.8.0_101
 */
public class MonthPhotoVo {
    private PhotoList photoList = new PhotoList();
    private String year;
    private String month;

    public PhotoList getPhotoList() {
        return photoList;
    }

    public void setPhotoList(PhotoList photoList) {
        this.photoList = photoList;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "MonthPhotoVo{" +
                "photoList=" + photoList +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                '}';
    }
}

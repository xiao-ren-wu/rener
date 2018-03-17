package com.rener.portal.model.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Created with IDEA
 * @author:Yuwenbo
 * @Date:2018/1/29
 * @Time:18:16
 * @JDK versions: 1.8.0_101
 */
public class DateToString {
    private static SimpleDateFormat sdf;
    static {
        sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
    }

    /**
     * 将秒数转化为指定日期格式 : yyyy-mm-dd
     * @param mill 秒数
     * @return
     */
    public static String dateToString(Long mill){
        String format = sdf.format(mill);
        String[] time=format.split(" ");
        return time[0];
    }

    /**
     *将指定日期转化为秒数
     * @param date 日期格式：yyyy-mm-dd HH-mm-ss
     * @return
     */
    public static Long StringToDate(String date){
        Long time=null;
        try {
            String append=date+" 00-00-00";
            time = sdf.parse(append).getTime();
        } catch (ParseException e) {
            System.out.println("日期转换异常");
        }
        return time;
    }
}
package com.rener;

import com.rener.portal.service.util.Md5Util;

import java.util.ArrayList;

/**
 * @Created with IDEA
 * @author:Yuwenbo
 * @Date:2018/2/4
 * @Time:19:14
 * @JDK versions: 1.8.0_101
 */
public class Test {
    public static void main(String[] args) {
        String s = Md5Util.md5("1234567");
        System.out.println(s);
    }
}

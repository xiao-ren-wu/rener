package com.rener;

import com.rener.portal.service.OrderService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Created with IDEA
 * @author:GaoPan
 * @Date:2018/1/26
 * @Time:17:22
 * @JDK versions: 1.8.0_101
 */

public class TbOrder {
    public static void main(String[] args) {
        //创建12个字符串字节缓冲区
        ByteBuffer bb=ByteBuffer.wrap(new byte[12]);
        //存入字符串
        CharBuffer adbcef = bb.asCharBuffer().put("adbcef");
        System.out.println(Arrays.toString(bb.array()));
        //反转缓冲区
        bb.rewind();
        //设置自己存储次序
        bb.order(ByteOrder.BIG_ENDIAN);
        bb.asCharBuffer().put("abcdef");
        System.out.println(Arrays.toString(bb.array()));
        //反转缓冲区
        bb.rewind();
        //设置字节存储次序
        bb.order(ByteOrder.LITTLE_ENDIAN);
        bb.asCharBuffer().put("abcedf");
        System.out.println(Arrays.toString(bb.array()));
    }
}

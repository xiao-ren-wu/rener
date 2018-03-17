package com.rener.portal.model.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IDEA
 * author:Dick_YangDi
 * Date:2018/1/24
 * Time:10:49
 * JDK versions: 1.8.0_101
 */
public class PhotoList {
    private ArrayList<String> urlList = new ArrayList<String>();

    public PhotoList() {
    }

    public PhotoList(String s) {
        String[] split = s.split("@@");
        for (int i = 0; i < split.length; i++) {
            urlList.add(split[i]);
        }
    }

    public String getAsString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < urlList.size(); i++) {
            if (i == 0) {
                stringBuffer.append(urlList.get(i));
            } else {
                stringBuffer.append("@@" + urlList.get(i));
            }
        }
        return stringBuffer.toString();
    }

    public List<String> getUrlList(){
        return urlList;
    }

    @Override
    public String toString(){
        return getAsString();
    }
}

package com.rener.portal.web.action;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.multipart.MultipartFile;
import utils.QiNiuUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/31
 * @Time:16:04
 * @JDK versions: 1.8.0_101
 */
@Controller
@RequestMapping("file")
public class FileUploadController {


    @RequestMapping(value="upload",method= RequestMethod.POST)
    public String fildUpload(@RequestParam(value="files",required=false) MultipartFile[] files)throws Exception{
        List<String> list = new ArrayList<>();
        QiNiuUtil qiNiuUtil = new QiNiuUtil();
        for (MultipartFile mf : files) {
            String upload = qiNiuUtil.upload(mf);
            if(upload.charAt(upload.length()-1)=='/'){
                System.out.println("插入失敗");
            }else{
                list.add(upload);
            }
        }
        System.out.println(JSON.toJSONString(list));
        return "Test";
    }
}
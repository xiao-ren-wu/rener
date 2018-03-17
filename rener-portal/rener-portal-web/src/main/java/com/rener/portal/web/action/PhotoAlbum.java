package com.rener.portal.web.action;

import com.alibaba.fastjson.JSONObject;
import com.rener.portal.model.mo.TbUsers;
import com.rener.portal.model.vo.RespPhotoAlbumVo;
import com.rener.portal.service.PhotoAlbumService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/26
 * @Time:21:39
 * @JDK versions: 1.8.0_101
 */
@CrossOrigin
@Controller
@RequestMapping("/photo")
public class PhotoAlbum {
    @Resource
    PhotoAlbumService photoAlbumService;
    //显示用每个月的照片缩略图
    @RequestMapping("/allMonth")
    public @ResponseBody List<RespPhotoAlbumVo> demo1(HttpSession httpSession){
        Long userId = ((TbUsers) httpSession.getAttribute("user")).getUserId();
        List<RespPhotoAlbumVo> respPhotoAlbumVos = photoAlbumService.selectByMonth(new Long(userId));
        return respPhotoAlbumVos;
    }

    //显示某个用户一个月所有的照片
    @RequestMapping("/month")
    public @ResponseBody List<RespPhotoAlbumVo> demo2(HttpSession httpSession, @RequestParam String date){
        Long userId = ((TbUsers) httpSession.getAttribute("user")).getUserId();
        List<RespPhotoAlbumVo> respPhotoAlbumVos = photoAlbumService.selectMonthById(userId,date);
        return respPhotoAlbumVos;
    }

    //根据照片id删除某一组照片
    @RequestMapping("/delete")
    public @ResponseBody JSONObject demo4(@RequestParam int photoAlbumId){
        int delete = photoAlbumService.delete(new Long(photoAlbumId));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg",delete);
        return jsonObject;
    }
    //根据某一用户的id的，查询所有照片分页
    @RequestMapping("/all")
    public @ResponseBody JSONObject demo5(HttpSession httpSession,@RequestParam int page){
        Long userId = ((TbUsers)httpSession.getAttribute("user")).getUserId();
        List<RespPhotoAlbumVo> respPhotoAlbumVos = photoAlbumService.selectById(userId, new Long(page));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("photos",respPhotoAlbumVos);
        return jsonObject;
    }
}

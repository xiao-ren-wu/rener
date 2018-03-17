package com.rener.portal.web.action;

import com.alibaba.fastjson.JSONObject;
import com.rener.portal.model.mo.TbUsers;
import com.rener.portal.model.vo.PhotoList;
import com.rener.portal.model.vo.RespComplaintVo;
import com.rener.portal.model.vo.TbComplaintVo;
import com.rener.portal.service.ComplaintService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import utils.QiNiuUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/29
 * @Time:0:10
 * @JDK versions: 1.8.0_101
 */
@CrossOrigin
@Controller
@RequestMapping("/complaint")
public class Complaint {
    @Resource
    private ComplaintService complaintService;

    @RequestMapping("/selectAll")
    public @ResponseBody
    List<RespComplaintVo> selectAll() {
        List<RespComplaintVo> respComplaintVos = complaintService.selectAll();
        return respComplaintVos;
    }

    @RequestMapping("/delete")
    public @ResponseBody JSONObject delete(Long id) {
        int delete = complaintService.delete(id);
        JSONObject jsonObject = new JSONObject();
        if (delete != 0) {
            jsonObject.put("msg", "ojbk");
        } else {
            jsonObject.put("msg", "ojbkk");
        }
        return jsonObject;
    }

    //查询某个人所有的投诉信息
    @RequestMapping("/selectByUserId")
    public @ResponseBody
    List<RespComplaintVo> selectByUserId(Long userId) {
        List<RespComplaintVo> respComplaintVos = complaintService.selectByUserId(userId);
        return respComplaintVos;
    }
    //上传预留
    @RequestMapping("/insert")
    public @ResponseBody
    JSONObject insert(@RequestParam(value = "files", required = false) MultipartFile[] files,String complaintReason,HttpSession httpSession){
        TbComplaintVo tbComplaintVo = new TbComplaintVo();
        Long userId = ((TbUsers) httpSession.getAttribute("user")).getUserId();
        tbComplaintVo.setUserId(userId);
        tbComplaintVo.setComplaintReason(complaintReason);
        QiNiuUtil qiNiuUtil = new QiNiuUtil();
        String pic = qiNiuUtil.uploadFiles(files);
        tbComplaintVo.setComplaintPic(new PhotoList(pic));
        boolean insert = complaintService.insert(tbComplaintVo);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg",insert);
        return jsonObject;
    }

}

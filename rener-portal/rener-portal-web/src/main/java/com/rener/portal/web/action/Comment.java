package com.rener.portal.web.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.rener.portal.model.mo.TbUsers;
import com.rener.portal.model.vo.RespCommentByGoodsId;
import com.rener.portal.model.vo.RespCommentVo;
import com.rener.portal.service.TbCommentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/1/31
 * @Time:5:56
 * @JDK versions: 1.8.0_101
 */
@CrossOrigin
@Controller
@RequestMapping("comment")
public class Comment {
    @Resource
    private TbCommentService tbCommentService;

    //上传文件预留
//    @RequestMapping("insert")
//    public @ResponseBody JSONObject insert(@RequestParam(value = "files", required = false) MultipartFile[] files,
//                       Long userId, Long goodsId, Long storeId, Byte praiseLevel, String loadPlace,
//                       Byte anonymityTag, String commentInfo, Long goodService, Long greatLocation,
//                       Long goodHealth, Long delicious) {
//        QiNiuUtil qiNiuUtil = new QiNiuUtil();
//        String photo = qiNiuUtil.uploadFiles(files);
//        boolean insert = tbCommentService.insert(userId, goodsId, storeId, praiseLevel, loadPlace, photo, anonymityTag, commentInfo, goodService, greatLocation, goodHealth, delicious);
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("status",insert);
//        return jsonObject;
//    }

//    @RequestMapping(value = "/rest", method = RequestMethod.POST)
//    public @ResponseBody
//    JSONObject find(@RequestBody LinkedHashMap<String, Object> list, HttpSession httpSession) {
//        String JSONStr = JSON.toJSONString(list);//json字符串
//        JSONObject json = JSON.parseObject(JSONStr);//json对象
//        JSONArray jsonArray = new JSONArray();
//        String type = json.getString("type");
//        String address = json.getString("address");
//        String auto = json.getString("auto");
//        Integer start = json.getInteger("start");


    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public @ResponseBody JSONObject insert(@RequestBody Map<String,Object> list, HttpSession httpSession) {
//        QiNiuUtil qiNiuUtil = new QiNiuUtil();
//        String photo = qiNiuUtil.uploadFiles((MultipartFile[])map.get("files"));
        String JSONStr = JSON.toJSONString(list);//json字符串
        JSONObject map = JSON.parseObject(JSONStr);//json对象
        TbUsers user = (TbUsers) httpSession.getAttribute("user");
        boolean insert = tbCommentService.insert(user.getUserId(),map.getLong("goodsId"),
                map.getLong("storeId"), map.getByte("praiseLevel"),map.getString("loadPlace"),
                "",map.getByte("anonymityTag") ,map.getString("commentInfo"),
                map.getLong("goodService"),map.getLong("greatLocation"),
                map.getLong("goodHealth") ,map.getLong("delicious"));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status",insert);
        return jsonObject;
    }

    /**
     * 通过用户id查询他所有的评论
     *
     * @param
     * @return
     */
    @RequestMapping("selectByUserId")
    public @ResponseBody
    List<RespCommentVo> selectByUserId(HttpSession httpSession) {
        List<RespCommentVo> respCommentVos = tbCommentService.selectByUserId(((TbUsers)httpSession.getAttribute("user")).getUserId());
        return respCommentVos;
    }

    @RequestMapping("selectAllByStoreId")
    public @ResponseBody
    List<RespCommentVo> selectAllByStoreId(Long storeId, Long page) {
        List<RespCommentVo> respCommentVos = tbCommentService.selectAllByStoreId(storeId, page);
        return respCommentVos;
    }

    @RequestMapping("delete")
    public @ResponseBody
    JSONObject delete(@RequestParam Long commentId) {
        int delete = tbCommentService.delete(commentId);
        JSONObject jsonObject = new JSONObject();
        if (delete > 0) {
            jsonObject.put("msg", "ojbk");
        } else {
            jsonObject.put("msg", "no");
        }
        return jsonObject;
    }

    @RequestMapping("selectAllByGoodsId")
    public @ResponseBody
    List<RespCommentByGoodsId> selectAllByGoodsId(Long goodsId, Long page) {
        List<RespCommentByGoodsId> list = tbCommentService.selectCommentToGoods(goodsId, "new", page);
        return list;
    }


    @RequestMapping("selectAllByGoodsIdNoPic")
    public @ResponseBody
    List<RespCommentByGoodsId> selectAllByGoodsIdNoPic(Long goodsId, Long page) {
        List<RespCommentByGoodsId> list = tbCommentService.selectCommentToGoods(goodsId, "noPic", page);
        return list;
    }


    @RequestMapping("selectAllByGoodsIdPic")
    public @ResponseBody
    List<RespCommentByGoodsId> selectAllByGoodsIdPic(Long goodsId, Long page) {
        List<RespCommentByGoodsId> list = tbCommentService.selectCommentToGoods(goodsId, "pic", page);
        return list;
    }

    @RequestMapping("selectAllByGoodsIdPlus")
    public @ResponseBody
    JSONObject selectAllByGoodsOJBK(Long goodsId, Long page) {
        List<RespCommentByGoodsId> list = tbCommentService.selectCommentToGoods(goodsId, "new", page);
        List<RespCommentByGoodsId> list1 = tbCommentService.selectCommentToGoods(goodsId, "noPic", page);
        List<RespCommentByGoodsId> list2 = tbCommentService.selectCommentToGoods(goodsId, "pic", page);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("newest", list);
        jsonObject.put("NoPic", list1);
        jsonObject.put("Pic", list2);
        return jsonObject;
    }
}

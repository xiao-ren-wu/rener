package com.rener.portal.web.action;

;

import com.rener.portal.model.mo.TbUsers;
import com.rener.portal.model.vo.StoresVo;
import com.rener.portal.model.vo.UserCommentVo;
import com.rener.portal.service.ColleService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.lang.String;

@CrossOrigin
@Controller
@RequestMapping("/colles")
public class ColleAction {
    @Resource
    private ColleService colleService;

    @RequestMapping("list")
    public @ResponseBody
    Map<Object, Object> list(HttpSession session, Integer num) {
        TbUsers user = (TbUsers) session.getAttribute("user");
        Long userId = user.getUserId();
//        Long userId = 1L;
        Map<Object, Object> map = new HashMap<Object, Object>();
        if (num == null) {
            map.put("storesInfo", colleService.selectAll(userId, 0));
            if (colleService.selectAll(userId, 0).size() < 5) {
                map.put("state", "none");
            } else {
                map.put("state", "more");
            }
        } else {
            map.put("storesInfo", colleService.selectAll(userId, num));
            if (colleService.selectAll(userId, num).size() < 5) {
                map.put("state", "none");
            } else {
                map.put("state", "more");
            }
        }
        return map;
    }

    @RequestMapping("selectClassString")
    public @ResponseBody
    List<java.lang.String> selectClass(HttpSession session) {
        TbUsers user = (TbUsers) session.getAttribute("user");
        Long userId = user.getUserId();
//        Long userId = new Long(1);
        List<java.lang.String> list = colleService.selectByClasses(userId);
        return list;
    }

    @RequestMapping("selectAreaString")
    public @ResponseBody
    Set selectArea(HttpSession session) {
        TbUsers user = (TbUsers) session.getAttribute("user");
        Long userId = user.getUserId();
//        Long userId = new Long(1);
        Set set = colleService.selectByArea(userId);
        return set;
    }

    @RequestMapping("selectStoresByDates")
    public @ResponseBody
    List<StoresVo> selectDates(HttpSession session, java.lang.String dateType, Integer num) {
        TbUsers user = (TbUsers) session.getAttribute("user");
        Long userId = user.getUserId();
//        Long userId = new Long(1);
        List<StoresVo> list;
        if (num == null) {
            list = colleService.DateSelect(dateType, userId, 0);
        } else {
            list = colleService.DateSelect(dateType, userId, num);
        }
        return list;
    }

    @RequestMapping("selectStoresByClasses")
    public @ResponseBody
    List<StoresVo> selectStoresByClasses(HttpSession session, java.lang.String classes, Integer num) {
        TbUsers user = (TbUsers) session.getAttribute("user");
        Long userId = user.getUserId();
//        Long userId = new Long(1);
        List<StoresVo> list;
        if (num == null) {
            list = colleService.selectStoreForClasses(userId, classes, 0);
        } else {
            list = colleService.selectStoreForClasses(userId, classes, num);
        }
        return list;
    }

    @RequestMapping("selectStoresByArea")
    public @ResponseBody
    List<StoresVo> selectStoresByArea(HttpSession session, java.lang.String area, Integer num) {
        TbUsers user = (TbUsers) session.getAttribute("user");
        Long userId = user.getUserId();
//        Long userId = new Long(1);
        List<StoresVo> list;
        if (num == null) {
            list = colleService.selectStoreForArea(userId, area, 0);
        } else {
            list = colleService.selectStoreForArea(userId, area, num);
        }
        return list;
    }

    @RequestMapping("selectStoreDetails")
    public @ResponseBody
    Map seleteStoreDetails(HttpSession session, Long storeId, java.lang.String condition) {
        TbUsers user = (TbUsers) session.getAttribute("user");
        Long userId = (null == user) ? new Long(-1) : user.getUserId();
//        Long userId = new Long(1);
        Map map = new HashMap<>();
        if (condition == null) {
            map = colleService.selectAllDetailToStore(userId, storeId, "all");
        } else {
            map = colleService.selectAllDetailToStore(userId, storeId, condition);
        }
        return map;
    }

    @RequestMapping("selectByTorP")
    public @ResponseBody
    List<UserCommentVo> selectByTorP(HttpSession session, String condition, Long storeId) {
        List<UserCommentVo> list = colleService.selectByTorP(condition, storeId);
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("Data",list);
//        System.out.println(jsonObject);
        return list;
    }


//    //跳转到详情页面
//    @RequestMapping("details")
//    public String details(Model model, Integer userId, Integer storeId){
//        //根据ID查询商品
//        Map map =colleService.selectAllDetailToStore(1,storeId);
//        //页面回显
//        model.addAttribute("Detailmap",map);
//        return "DetailOneStore";
//    }
//
//    @RequestMapping
//    public
//    @RequestMapping("/saveOrUpdate")
//    public String saveOrUpdate(TbColle tbColle){
//        //items传递过来，id传递没传递过来？
//        //通过隐藏域传递过来的 <input type="hidden" name="id" value="${item.id }"/>
//        //items对象拿到这个id后，就可以根据id进行修改
//        serviceColle.saveOrUpdate1(tbColle);
//        return "redirect:list";
//    }
//    //根据id进行删除
//    @RequestMapping("deleteById")
//    public String deleteByID(Integer id){
//        serviceColle.deleteByID(id);
//        return "redirect:list";
//    }
//    //批量删除
//    @RequestMapping("deleteByIds")
//    public String deleteByIds(Integer[] id){
//        for (Integer ids:id) {
//            serviceColle.deleteByID(ids);
//        }
//        return "redirect:list";
//    }
//    //插入
//    @RequestMapping("toAdd")
//    public String toAdd(){
//        return "insertStore";
//    }
//    @RequestMapping("add")
//    public String insert(TbColle tbColle){
//        serviceColle.add(tbColle);
//        return "redirect:list";
//    }
//    //分页查询
//    @RequestMapping("toFenYeSelect")
//    public String toFenYeSelect(){
//        return null;
//    }

}

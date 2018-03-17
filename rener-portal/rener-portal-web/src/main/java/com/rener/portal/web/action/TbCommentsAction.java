package com.rener.portal.web.action;


import com.rener.portal.model.mo.TbUsers;
import com.rener.portal.model.vo.TbCommentJson;
import com.rener.portal.model.vo.TbCommentsVo;
import com.rener.portal.service.TbCommentsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author lidan@meng_zhu
 * @date 2018/1/26 0026 11:11
 */
@Controller
@CrossOrigin

public class TbCommentsAction {
    @Resource
    private TbCommentsService tbCommentsService;

    @RequestMapping(value = "comment", method = RequestMethod.GET)
    public @ResponseBody
    TbCommentJson getComment(int i,HttpSession httpSession) {
        System.out.println(i);
       long user_id=((TbUsers) httpSession.getAttribute("user")).getUserId();
        List<TbCommentsVo> list1 = null;
        List<TbCommentsVo> list2 = null;
        List<TbCommentsVo> list3 = null;
        List<TbCommentsVo> list4 = null;
        list1 = tbCommentsService.commentsOne(user_id);
        list2 = tbCommentsService.commentsTwo(user_id);
        list3 = tbCommentsService.commentsThree(user_id);
        list4 = tbCommentsService.commentsFour(user_id);
        TbCommentJson tbCommentJson = new TbCommentJson();
        tbCommentJson.setCommentOneSize(list1.size());
        tbCommentJson.setCommentTwoSize(list2.size());
        tbCommentJson.setCommentThreeSize(list3.size());
        tbCommentJson.setCommentFourSize(list4.size());
        switch (i) {
            case 1:
                tbCommentJson.setList(list1);
                break;
            case 2:
                tbCommentJson.setList(list2);
                break;
            case 3:
                tbCommentJson.setList(list3);
                break;
            case 4:
                tbCommentJson.setList(list4);
                break;
        }
        return tbCommentJson;
    }
}
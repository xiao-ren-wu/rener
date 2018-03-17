package com.rener.portal.web.action;

import com.rener.portal.model.mo.TbUsers;
import com.rener.portal.service.NineGGService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.xml.ws.http.HTTPBinding;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("/nineGG")
public class NineGGAction {
    @Resource
    private NineGGService nineGGService;

    @RequestMapping("/selectCounts")
    public @ResponseBody Map selectCounts(HttpSession httpSession){
        TbUsers user = (TbUsers) httpSession.getAttribute("user");
        if (user==null){
            Map map = new HashMap<Object,Object>();
            map.put("state",0);
            return map;
        }else{
            Long userId = user.getUserId();
            Map<String, Integer> map = nineGGService.selectNine(userId);
    //      Long userId = new Long(1);
            map.put("state",1);
            return map;
        }
    }
}

//package com.rener.manager.web.action;
//
//import com.rener.manager.pojo.vo.User;
//import com.rener.manager.service.ServiceTest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//public class TestAction {
//    @Autowired
//    private ServiceTest serviceTest;
//    @RequestMapping("/test")
//    public @ResponseBody User test(){
//        User user = serviceTest.test();
//        user.setName("manager");
//        return user;
//    }
//}

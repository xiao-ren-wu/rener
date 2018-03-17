package com.rener.portal.web.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.rener.portal.model.mo.TbUsers;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.io.PrintWriter;
import java.util.HashMap;

import java.util.Map;

/**
 * @author lidan@meng_zhu
 * @date 2018/1/31 0031 4:42
 */
public class UserLoginInterceptorBySpring implements HandlerInterceptor {


    /* 在业务处理器处理请求之前被调用 */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest,
                             HttpServletResponse httpServletResponse, Object o) throws Exception {
        String requestURI = httpServletRequest.getRequestURI();
        String contextPath = httpServletRequest.getContextPath();
        String url = requestURI.substring(contextPath.length());
        JSONObject jsonObject = new JSONObject();
        TbUsers tbUsers = (TbUsers) httpServletRequest.getSession().getAttribute("TbUsers");
        PrintWriter out = null;
        out= httpServletResponse.getWriter();

        if (null == tbUsers) {
            jsonObject.put("status","0");
            out.append(jsonObject.toString());
            return false;
        } else {
            jsonObject.put("status","1");
            out.append(jsonObject.toString());
            return true;
        }
    }

    /*// 在业务处理器处理请求完成之后，生成视图之前执行 */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse, Object o,
                           ModelAndView modelAndView) throws Exception {
        if (modelAndView != null) {
            Map<String, String> map = new HashMap<String, String>();
            modelAndView.addAllObjects(map);
        }
    }

    /*// 在DispatcherServlet完全处理完请求之后被调用，可用于清理资源*/
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}

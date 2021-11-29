package com.example.common.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Noob
 * @date 2021/11/27 - 20:31
 */
@Slf4j
@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取session的信息，判断session用户信息是否存在
        Object user = request.getSession().getAttribute("userInfo");
        //未登录
        if(user == null){
            log.debug("未登录请求："+request.getRequestURI());
            response.sendRedirect(request.getContextPath()+"/login");
            return false;
        }
        //登录成功
        log.debug("放行请求："+request.getRequestURI());
        return true;
    }
}

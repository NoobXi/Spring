package com.example.user.controller;

import com.example.common.vo.Result;
import com.example.user.entity.User;
import com.example.user.service.UserService;
import com.wf.captcha.utils.CaptchaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Noob
 * @date 2021/11/27 - 17:11
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/login")
    public Object login(User param, @RequestParam("captcha")String captcha, HttpServletRequest request,HttpSession session){
        //验证码
        if(!CaptchaUtil.ver(captcha,request)){
            return Result.fail("验证码错误！");
        }

    User user=userService.login(param);
    if(user!=null){
        user.setPassword(null);
        session.setAttribute("userInfo",user);
        return Result.success();
    }
    return Result.fail("用户名或密码错误!");
    }
}

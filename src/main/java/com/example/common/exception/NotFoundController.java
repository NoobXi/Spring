package com.example.common.exception;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Noob
 * @date 2021/11/28 - 22:44
 */
@Controller
public class NotFoundController implements ErrorController {



    public String getErrorPath() {
        return "/error";
    }


    @RequestMapping("/error")
    public String error404(){
        return "error/404";
    }
}

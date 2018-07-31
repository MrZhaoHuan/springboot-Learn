package com.zhao.boot.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-30 11:32
 * @描述
 **/
@Controller
public class UserController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        if(true){
            throw new RuntimeException("运行时异常");
        }
        return "hello";
    }
}

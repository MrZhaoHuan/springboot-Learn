package com.zhao.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-27 15:48
 * @描述
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/helloBoot")
    public String hello(){
        return "helloBoot";
    }
}
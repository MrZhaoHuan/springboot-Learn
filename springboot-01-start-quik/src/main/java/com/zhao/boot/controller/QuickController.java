package com.zhao.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-27 16:32
 * @描述
 */
//@Controller
//@ResponseBody
@RestController
public class QuickController {

    @RequestMapping("/show")
    public String show(){
        return "show";
    }
}

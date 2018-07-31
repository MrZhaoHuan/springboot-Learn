package com.zhao.boot.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-28 13:32
 * @描述
 **/
@RestController
public class HelloController {

    @RequestMapping("/msg")
    public String msg(HttpServletRequest request) {
         System.out.println(request.getParameter("name"));
         return "你好mvc";
    }
}

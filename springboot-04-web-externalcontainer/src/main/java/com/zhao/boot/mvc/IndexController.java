package com.zhao.boot.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-30 18:39
 * @描述
 **/
@Controller
public class IndexController {

    @RequestMapping("/success")
    public String index(Model model){
        model.addAttribute("name","zhaohuan");
        return "success";
    }
}

package com.zhao.boot.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-28 21:09
 * @描述
 **/
@Controller
public class ThymeleafController {

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model, HttpServletRequest request){
        //model.addAttribute("username","zhaohuan");
        model.addAttribute("username","<h1>赵寰</h1>");
        request.setAttribute("pwd",123456);

        List<Integer> prods = Arrays.asList(1,2,3);
        request.setAttribute("prods",prods);
        return "success";
    }
}
package com.zhao.boot.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-29 15:44
 * @描述 登录
 **/
@Controller
public class LoginController {
    @RequestMapping(value = "/dashboard.html", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session, Model model) {
        if ("zhaohuan".equals(username) && "123".equals(password)) {
            //登录成功
            session.setAttribute("loginUser", username + "-" + password);
            return "redirect:/main.html";
        } else {
            //登录失败
            model.addAttribute("failMsg", "用户名或密码不正确");
            return "/index.html";
        }
    }

    @RequestMapping(value = "/main.html")
    public String main() {
        return "dashboard";
    }
}
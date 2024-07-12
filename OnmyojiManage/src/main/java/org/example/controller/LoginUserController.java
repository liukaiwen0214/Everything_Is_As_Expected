package org.example.controller;

import org.example.pojo.LoginUserPojo;
import org.example.service.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Onmyoji")
public class LoginUserController {
    @Autowired
    private LoginUserService loginUserService;

    @RequestMapping("/login")
    public String login(@RequestParam(value = "username",required = false) String username, @RequestParam(value = "password",required = false) String password, Model model) {
        // 调用Service层进行登录验证
        LoginUserPojo user = loginUserService.UserLogin(username,password); // 假设UserService有一个login方法，返回User对象或null
        System.out.println("数据库查询："+user);
        if (user != null) {
            // 登录成功，可以跳转到某个页面或进行其他操作
            // 这里只是简单地将用户信息添加到模型中，并跳转到登录成功页面
            model.addAttribute("user", user);
            return "loginSuccess"; // 假设你有一个名为loginSuccess的JSP页面
        } else {
            // 登录失败，可以在模型中添加错误信息，并返回登录页面
            model.addAttribute("error", "用户名或密码错误");
            return "loginFailure"; // 假设你的登录表单在名为login的JSP页面中
        }
    }
}


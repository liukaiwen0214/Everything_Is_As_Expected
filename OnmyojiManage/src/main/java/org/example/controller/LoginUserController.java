package org.example.controller;

import org.example.pojo.LoginUserPojo;
import org.example.service.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class LoginUserController {
    @Autowired
    private LoginUserService loginUserService;

    @Controller
    public class LoginController {
        @RequestMapping("/login")
        public String login(LoginUserPojo loginUserPojo, Model model) {
            // 调用Service层进行登录验证
            LoginUserPojo user = loginUserService.UserLogin(loginUserPojo); // 假设UserService有一个login方法，返回User对象或null

            if (user != null) {
                // 登录成功，可以跳转到某个页面或进行其他操作
                // 这里只是简单地将用户信息添加到模型中，并跳转到登录成功页面
                model.addAttribute("user", user);
                return "loginSuccess"; // 假设你有一个名为loginSuccess的JSP页面
            } else {
                // 登录失败，可以在模型中添加错误信息，并返回登录页面
                model.addAttribute("error", "用户名或密码错误");
                return "login"; // 假设你的登录表单在名为login的JSP页面中
            }
        }
    }
}

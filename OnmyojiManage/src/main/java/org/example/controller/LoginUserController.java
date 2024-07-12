package org.example.controller;

import org.example.pojo.LoginUserPojo;
import org.example.service.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;

@Controller
public class LoginUserController {
    @Resource
    private LoginUserService loginUserService;

    @RequestMapping("/OnmyojiLanding")
    public String log(LoginUserPojo loginUserPojo, Model model) {
        int userLogin = loginUserService.UserLogin(loginUserPojo);
        model.addAttribute("userLogin", userLogin);
        if (userLogin >= 1) {
            return "logok";
        } else
            return "logno";
    }
}

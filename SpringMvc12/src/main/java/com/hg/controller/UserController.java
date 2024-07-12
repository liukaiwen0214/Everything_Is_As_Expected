package com.hg.controller;

import com.hg.pojo.User;
import com.hg.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/golog")
    public String log(User user, Model model) {
        User u = userService.findOne(user);
        model.addAttribute("user", u);
        if (u != null) {
            return "logok";
        } else return "logno";
    }


    @RequestMapping("/goreg")
    public String reg(User user) {
        User u = userService.checkReg(user.getUsername());
        if (u == null) {
            userService.addOne(user);
            return "regok";
        }
        return "regno";
    }
}


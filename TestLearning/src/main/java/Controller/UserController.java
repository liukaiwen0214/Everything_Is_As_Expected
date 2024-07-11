package Controller;

import Pojo.User;
import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/User")
public class UserController {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "Login";
    }

    @RequestMapping("/Login")
    public String Login(User user) {
        user = userService.Login(user.getUserName(), user.getPassWord());
        if (user != null) {
            return "success";
        }
        return "redirect:/User/toLogin";
    }

    @RequestMapping("/Login1")
    public String Login(String UserName, String PassWord) {
        User user = userService.Login(UserName, PassWord);
        if (user != null) {
            return "success";
        }
        return "redirect:/User/toLogin";
    }

    @RequestMapping("/Login2")
    public String Login(HttpServletRequest request) {
        String UserName = request.getParameter("UserName");
        String PassWord = request.getParameter("PassWord");
        User user = userService.Login(UserName, PassWord);
        if (user != null) {
            return "success";
        }
        return "redirect:/User/toLogin";
    }

    @RequestMapping("/toRegister")
    public String toRegister(User user){
        return "register";
    }

    @RequestMapping("/Register")
    public String Register(User user){
        System.out.println("用户名"+user.getUserName()+"密码"+user.getPassWord());
        userService.Register(user);
        return "redirect:/User/toLogin";
    }
}

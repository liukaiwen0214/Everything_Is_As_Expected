package org.example.service;

import org.example.pojo.LoginUserPojo;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface LoginUserService {
    /**
     * 用户登陆
     */
    LoginUserPojo UserLogin(String username, String password);
}

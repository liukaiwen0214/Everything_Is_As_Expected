package org.example.service;

import org.example.pojo.LoginUserPojo;

import java.util.List;

public interface LoginUserService {
    /**
     * 用户登陆
     */
    LoginUserPojo UserLogin(LoginUserPojo loginUserPojo);
}

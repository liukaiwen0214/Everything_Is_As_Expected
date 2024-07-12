package org.example.service;

import com.github.pagehelper.PageInfo;
import org.example.pojo.LoginUserPojo;

import java.util.List;

public interface LoginUserService {
    /**
     * 用户登陆
     */
    int UserLogin(LoginUserPojo userPojo);
}

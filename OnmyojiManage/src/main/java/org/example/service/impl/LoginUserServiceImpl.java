package org.example.service.impl;


import org.example.mapper.LoginUserMapper;
import org.example.service.LoginUserService;
import org.example.pojo.LoginUserPojo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;


@Service("LoginUserService")
public class LoginUserServiceImpl implements LoginUserService {
    @Resource
    private LoginUserMapper loginUserMapper;

    @Override
    public LoginUserPojo UserLogin(String username, String password) {
        return loginUserMapper.UserLogin(username, password);
    }
}

package org.example.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.mapper.LoginUserMapper;
import org.example.service.LoginUserService;
import org.example.pojo.LoginUserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("LoginUserService")
public class LoginUserServiceImpl implements LoginUserService {

    @Resource
    private LoginUserMapper loginUserMapper;


    @Override
    public int UserLogin(LoginUserPojo userPojo) {
        return loginUserMapper.UserLogin(userPojo);
    }
}

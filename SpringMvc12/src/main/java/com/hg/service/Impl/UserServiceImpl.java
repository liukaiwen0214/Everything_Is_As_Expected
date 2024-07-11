package com.hg.service.Impl;

import com.hg.service.UserService;
import org.springframework.stereotype.Service;

import com.hg.dao.UserMapper;
import com.hg.pojo.User;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findOne(User user) {
        return userMapper.findOne(user);
    }

    @Override
    public int addOne(User user) {
       return userMapper.addOne(user);


    }

    @Override
    public User checkReg(String username) {
        return userMapper.checkReg(username);
    }

}


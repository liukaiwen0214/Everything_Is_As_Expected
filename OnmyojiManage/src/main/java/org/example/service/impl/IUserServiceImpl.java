package org.example.service.impl;

import org.example.mapper.IUserMapper;
import org.example.pojo.User;
import org.example.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class IUserServiceImpl implements IUserService {
    @Resource
    private IUserMapper userDao;
    @Override
    public User selectUser(long userId) {
        return userDao.selectUser(userId);
    }

}

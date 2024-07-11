package org.example.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.mapper.LoginUserMapper;
import org.example.service.LoginUserService;
import org.example.pojo.LoginUserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class LoginUserServiceImpl implements LoginUserService {

    @Autowired
    private LoginUserMapper loginUserMapper;

    @Override
    public List<LoginUserPojo> getAllLoginUser() {

        return loginUserMapper.getLoginUserPojoList();
    }

    @Override
    public PageInfo<LoginUserPojo> getEmployeePage(Integer pageNum) {
        //开启分页功能
        PageHelper.startPage(pageNum, 4);
        //查询所有的员工信息
        List<LoginUserPojo> list = loginUserMapper.getLoginUserPojoList();
        //获取分页相关数据
        PageInfo<LoginUserPojo> page = new PageInfo<>(list, 5);
        return page;
    }
}

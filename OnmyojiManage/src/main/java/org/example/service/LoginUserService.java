package org.example.service;

import com.github.pagehelper.PageInfo;
import org.example.pojo.LoginUserPojo;

import java.util.List;

public interface LoginUserService {
    /**
     * 查询所有的员工信息
     *
     * @return
     */
    List<LoginUserPojo> getAllLoginUser();


    /**
     * 获取员工的分页信息
     *
     * @param pageNum
     * @return
     */
    PageInfo<LoginUserPojo> getEmployeePage(Integer pageNum);
}

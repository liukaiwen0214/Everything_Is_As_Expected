package org.example.controller;


import com.github.pagehelper.PageInfo;
import org.example.pojo.LoginUserPojo;
import org.example.service.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LoginUserController {
    @Autowired
    private LoginUserService loginUserService;

    @RequestMapping(value = "/loginUserList/page/{pageNum}", method = RequestMethod.GET)
    public PageInfo<LoginUserPojo> getEmployeePage(@PathVariable("pageNum") Integer pageNum, Model model){
        //获取员工的分页信息
        PageInfo<LoginUserPojo> page = loginUserService.getEmployeePage(pageNum);
        return page;
    }

    @RequestMapping(value = "/OnmyojiManage", method = RequestMethod.GET)
    @ResponseBody
    public List<LoginUserPojo> getAllEmployee(){
        //查询所有的员工信息
        List<LoginUserPojo> list = loginUserService.getAllLoginUser();
        return list;
    }


}

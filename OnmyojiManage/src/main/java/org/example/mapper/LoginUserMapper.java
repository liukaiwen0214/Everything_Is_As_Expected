package org.example.mapper;

import org.example.pojo.LoginUserPojo;


public interface LoginUserMapper {

    LoginUserPojo UserLogin(String username, String password);

}

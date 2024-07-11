package Dao;

import Pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    //登录
    User Login(@Param("UserName") String UserName,@Param("PassWord") String PassWord);

    //注册
    int Register(User user);
}




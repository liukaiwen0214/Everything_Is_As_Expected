package Service;

import Pojo.User;

public interface UserService {

    //登录
    User Login(String UserName,String PassWord);
    //注册
    int Register(User user);
}


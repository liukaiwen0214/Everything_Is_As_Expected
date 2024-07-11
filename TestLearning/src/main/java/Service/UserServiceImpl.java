
package Service;

import Dao.UserDao;
import Pojo.User;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public User Login(String UserName, String PassWord) {
        User user = userDao.Login(UserName, PassWord);
        if (user != null && user.getUserName().equals(UserName) && user.getPassWord().equals(PassWord)) {
            return user;
        }
        return null;
    }

    @Override
    public int Register(User user) {
        return userDao.Register(user);
    }
}

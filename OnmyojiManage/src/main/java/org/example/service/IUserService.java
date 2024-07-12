package org.example.service;

import org.example.pojo.User;
import org.springframework.stereotype.Service;


public interface IUserService {
    public User selectUser(long userId);
}

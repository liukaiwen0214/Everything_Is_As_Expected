package org.example.mapper;

import org.example.pojo.User;

public interface IUserMapper {
    User selectUser(long id);
}

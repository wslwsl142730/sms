package com.dao;

import com.entity.User;

public interface UserDao {

    /*根据用户名查询用户*/
    public User queryByTeUserName(String userName);
    /*用户注册*/
    public void register(User user);
}

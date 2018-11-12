package com.service;

import com.dao.UserDao;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("UserService")
@Transactional
public class UserServiceImpl implements  UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User queryByTeUserName(String userName) {

        return userDao.queryByTeUserName(userName);
    }

    @Override
    public void register(User user) {
        userDao.register(user);
    }
}

package com.service;

import com.entity.User;

public interface UserService {

    public User queryByTeUserName(String userName);

    public void register(User user);

}

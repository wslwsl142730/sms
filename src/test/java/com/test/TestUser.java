package com.test;

import com.entity.User;
import com.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    @Test
    public void test01(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) cpx.getBean("UserService");
        User user = new User();
        user.setName("kkkk");
        user.setUsername("wwwwwwwww");
        user.setPassword("123123123");
        user.setSex("M");
        userService.register(user);
    }
    @Test
    public  void test02(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) cpx.getBean("UserService");
        User user = userService.queryByTeUserName("wwwwwwwww");
        System.out.println(user);
    }
}

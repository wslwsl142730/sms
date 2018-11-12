package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("register")
    public String register(User user){
        if (user.getUsername()!="" && user.getPassword()!="" && user.getName() !="") {
            userService.register(user);
            return "redirect:/login.jsp";
        } else {
            return"redirect:/regist.jsp";
        }
    }
    @RequestMapping("login")
    public String login(User user,HttpServletRequest request){
        User queryByTeUserName = userService.queryByTeUserName(user.getUsername());
        if (queryByTeUserName != null) {
            if (user.getPassword().equals(queryByTeUserName.getPassword())) {
                request.setAttribute("user", queryByTeUserName);
                return "redirect:/emp/queryAll";
            }
        }
        return "redirect:/login.jsp";
    }
}

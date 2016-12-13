package com.controller;

import com.ssm.bean.User;
import com.ssm.service.User.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hs on 2016/12/8.
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(String userName, String passWord) {
        User user = userService.login(userName, passWord);
        return user.toString();
    }
}

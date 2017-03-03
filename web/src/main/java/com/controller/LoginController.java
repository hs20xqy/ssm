package com.controller;

import com.ssm.bean.User;
import com.ssm.service.User.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hs on 2016/12/8.
 */
@Controller
@RequestMapping("/user")
public class LoginController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class.getName());

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(String userName, String passWord) {
        User user = userService.login(userName, passWord);
        if (user == null) {
            return "The user dose not exist !";
        }else {
            return user.toString();
        }
    }
}

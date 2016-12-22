package com.controller;

import com.ssm.bean.User;
import com.ssm.service.User.IUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hs on 2016/12/8.
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    private static final Logger logger = LogManager.getLogger(LoginController.class.getName());

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(String userName, String passWord) {
        if (StringUtils.isEmpty(userName)) {
            logger.error("username can't be null!");
            return "error";
        }
        if (StringUtils.isEmpty(passWord)) {
            logger.error("password can't be null!");
            return "error";
        }
        logger.debug(userName + "is login");
        User user = userService.login(userName, passWord);
        return user.toString();
    }
}

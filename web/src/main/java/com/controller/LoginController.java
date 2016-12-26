package com.controller;

import com.ssm.bean.User;
import com.ssm.service.User.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class.getName());

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(String userName, String passWord) {
        if (StringUtils.isEmpty(userName)) {
            logger.debug("username can't be null!");
            return "error";
        }
        if (StringUtils.isEmpty(passWord)) {
            logger.debug("password can't be null!");
            return "error";
        }
        logger.info(userName + "is login");
        User user = userService.login(userName, passWord);
        return user.toString();
    }
}

package com.controller;

import com.ssm.bean.User;
import com.ssm.service.User.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hs on 2016/12/8.
 */
@Controller
@RequestMapping("/user")
public class LoginController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class.getName());

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/home")
    public ModelAndView loginView() {
        ModelAndView view = new ModelAndView("/login");
        return view;
    }

    @RequestMapping(value = "/login")
    public ModelAndView login(String userName, String passWord) {
        User user = userService.login(userName, passWord);
        ModelAndView view = new ModelAndView();
        if (user == null) {
            view.setViewName("/login");
            view.addObject("msg", "用户名或密码错误");
        }else {
            view.setViewName("/main");
            view.addObject("user", user);
        }
        return view;
    }
}

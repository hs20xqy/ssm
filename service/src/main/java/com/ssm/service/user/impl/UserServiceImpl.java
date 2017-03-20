package com.ssm.service.user.impl;

import com.ssm.dao.user.IUserDao;
import com.ssm.mapper.UserMapper;
import com.ssm.service.user.IUserService;
import com.ssm.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hs on 2016/12/9.
 */
@Service(value = "userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao userDao;


    public User login(String userName, String passWord) {
        // 对密码进行加密处理
        User user = userDao.getUser(userName, passWord);
        return user;
    }

    public boolean register(User user) {
        return  userDao.addUser(user) > 0;
    }
}

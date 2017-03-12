package com.ssm.service.user.impl;

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
    UserMapper userMapper;

    public User login(String userName, String passWord) {
        User user = userMapper.getUser(userName, passWord);
        return user;
    }
}

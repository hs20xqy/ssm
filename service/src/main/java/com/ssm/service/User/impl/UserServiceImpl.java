package com.ssm.service.User.impl;

import com.ssm.mapper.UserMapper;
import com.ssm.service.User.IUserService;
import com.ssm.bean.User;
import com.ssm.dao.user.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hs on 2016/12/9.
 */
@Service
public class UserServiceImpl implements IUserService {

//    private IUserDao userDao;
    @Autowired
    UserMapper userMapper;

    public User login(String userName, String passWord) {
        User user = userMapper.getUser(userName, passWord);
        return user;
    }
}

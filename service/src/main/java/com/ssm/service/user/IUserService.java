package com.ssm.service.user;

import com.ssm.bean.User;

/**
 * Created by hs on 2016/12/8.
 */
public interface IUserService {

    /**
     * 用户登录方法
     * @param userName 用户名
     * @param password 密码
     * @return
     */
    User login(String userName, String password);


    /**
     * 新用户注册
     * @return
     */
    boolean register(User user);

}

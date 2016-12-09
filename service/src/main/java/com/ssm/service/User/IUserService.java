package com.ssm.service.User;

/**
 * Created by hs on 2016/12/8.
 */
public interface IUserService {

    /**
     * 用户登录方法
     * @param userName 用户名
     * @param passWord 密码
     * @return
     */
    boolean login(String userName, String passWord);

}

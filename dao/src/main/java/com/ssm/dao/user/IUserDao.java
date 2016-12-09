package com.ssm.dao.user;

import com.ssm.bean.User;

/**
 * Created by hs on 2016/12/9.
 */
public interface IUserDao {

    /**
     * 根据用户名密码获取用户
     * @param userName 用户名
     * @param passWord 密码
     * @return
     */
    User getUser(String userName, String passWord);

}

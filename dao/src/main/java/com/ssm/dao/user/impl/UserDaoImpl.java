package com.ssm.dao.user.impl;

import com.ssm.bean.User;
import com.ssm.dao.common.BaseDao;
import com.ssm.dao.user.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by hs on 2016/12/9.
 */
@Repository
public class UserDaoImpl implements IUserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

//    public UserDaoImpl() {
//    }



    public User getUser(String userName, String passWord) {

        String result = jdbcTemplate.queryForObject("select username from user where username = ? and password = ?", String.class, new Object[]{userName, passWord});
        User user = new User();
        user.setUserName(result);
        return result == null ? null : user;
    }
}

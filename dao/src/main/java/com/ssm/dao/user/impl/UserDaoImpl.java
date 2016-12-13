//package com.ssm.dao.user.impl;
//
//import com.ssm.bean.User;
//import com.ssm.dao.common.BaseDao;
//import com.ssm.dao.user.IUserDao;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
///**
// * Created by hs on 2016/12/9.
// */
//@Repository
//public class UserDaoImpl implements IUserDao {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
////    public UserDaoImpl() {
////    }
//
//
//
//    public User getUser(String userName, String passWord) {
//
//        List<String> result = jdbcTemplate.queryForList("select username from user where username = ? and password = ?", String.class, new Object[]{userName, passWord});
//        User user = new User();
//        user.setUserName(result.get(0));
//        return result == null ? null : user;
//    }
//}

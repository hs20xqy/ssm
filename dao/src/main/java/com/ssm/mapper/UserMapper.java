package com.ssm.mapper;

import com.ssm.bean.User;

public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    User selectByUserNameAndPassword(String userName, String password);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
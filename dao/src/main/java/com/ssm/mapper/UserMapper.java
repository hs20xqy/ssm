package com.ssm.mapper;

import com.ssm.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by hs on 2016/12/13.
 */
public interface UserMapper {

    @Select("select * from user where username = #{userName} and password = #{passWord}")
    User getUser(@Param("userName") String userName,@Param("passWord") String passWord);

}

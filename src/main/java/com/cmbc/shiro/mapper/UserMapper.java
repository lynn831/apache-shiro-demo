package com.cmbc.shiro.mapper;

import com.cmbc.shiro.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User findByUsername(@Param("username") String username);
}

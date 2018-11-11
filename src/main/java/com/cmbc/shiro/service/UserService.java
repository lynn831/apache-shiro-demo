package com.cmbc.shiro.service;

import com.cmbc.shiro.model.User;

public interface UserService {

    User findByUsername(String username);
}

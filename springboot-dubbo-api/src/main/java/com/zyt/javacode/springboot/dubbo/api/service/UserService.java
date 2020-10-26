package com.zyt.javacode.springboot.dubbo.api.service;

import com.zyt.javacode.springboot.dubbo.api.model.User;

public interface UserService {
    User findUserById(Integer id);

}

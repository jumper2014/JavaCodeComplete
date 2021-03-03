package com.zyt.javacode.springboot.dubbo.server.service;

import com.zyt.javacode.springboot.dubbo.api.model.User;
import com.zyt.javacode.springboot.dubbo.api.service.UserService;
import org.apache.dubbo.config.annotation.Service;

//此处的@Service是dubbo下的注解，不是spring的注解
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("zyt");
        user.setAddress("China");
        user.setTel("88888888");
        return user;
    }
}

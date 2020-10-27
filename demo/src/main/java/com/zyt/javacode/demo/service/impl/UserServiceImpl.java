package com.zyt.javacode.demo.service.impl;

import com.zyt.javacode.demo.domain.User;
import com.zyt.javacode.demo.mapper.UserMapper;
import com.zyt.javacode.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    //增　　
    @Override
    public int add(User user) {
        try {
            userMapper.insertUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int id = user.getId();
        return id;
    }

    //查询　　　　
    @Override
    public User getUserById(int id) {
        User user = userMapper.getUserById(id);
        return user;
    }

    //查询所有
    @Override
    public List<User> getUsers() {
        List<User> users = userMapper.getUsers();
        return users;
    }

    //删除
    @Override
    public void deleteUserById(int id) {
        userMapper.deleteUserById(id);

    }
    //改
    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);

    }
}

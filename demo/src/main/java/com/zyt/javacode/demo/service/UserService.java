package com.zyt.javacode.demo.service;

import com.zyt.javacode.demo.domain.User;

import java.util.List;

public interface UserService {

    public int add(User user);
    public User getUserById(int id);
    public List<User> getUsers();
    public void deleteUserById(int id);
    public void updateUser(User user);

}

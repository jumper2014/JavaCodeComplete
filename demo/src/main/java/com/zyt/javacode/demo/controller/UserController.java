package com.zyt.javacode.demo.controller;

import com.zyt.javacode.demo.domain.User;
import com.zyt.javacode.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("add")
    public int add() {
        User user = new User();
        user.setAge(12);
        user.setName("张三");
        user.setPhone("888888888");
        user.setCreateTime(new Date());
        int id = userService.add(user);
        return id;
    }

    @GetMapping("getUserById")
    public User getUser(int id) {
        User user = userService.getUserById(id);
        System.out.println(user.getCreateTime().toString());
        return user;
    }

    @GetMapping("getUsers")
    public List<User> getUsers() {
        List<User> users = userService.getUsers();
        User user = null;
        for (int i = 0; i < users.size(); i++) {
            user = users.get(i);
            System.out.println("用户id：" + user.getId() + "姓名" + user.getName());
        }
        return users;

    }

    @GetMapping("deleteUserById")
    public void deleteUserById(Long id) {
        User user = null;
        int userId = Integer.parseInt(id.toString());
        user = userService.getUserById(userId);
        userService.deleteUserById(userId);
        System.out.println("删除用户的用户名为:" + user.getName());

    }

}

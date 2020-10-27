package com.zyt.javacode.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;
import com.zyt.javacode.demo.domain.User;

@Mapper
public interface UserMapper {
    // add user
    @Insert("INSERT INTO user(name,phone,createTime,age) VALUES(#{name}, #{phone}, #{createTime},#{age})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id") //主键自增，生成的值将注入对象中
    void insertUser(User user) throws Exception;

    // 查询用户
    @Select("SELECT * FROM user WHERE id = #{id}")
    User getUserById(int id);

    //查询所有用户
    List<User> getUsers();

    //更新用户
    @Update("UPDATE user SET name=#{name},phone=#{phone},createTime=#{createTime},age=#{age} WHERE id =#{id}")
    void updateUser(User user);

    //删除用户
    @Delete("DELETE FROM user where id = #{id}")
    void deleteUserById(int id);


}

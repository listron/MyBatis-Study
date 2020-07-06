package com.listron.dao;

import com.listron.pojo.User;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);

    List<User> getUserLike(String name);

    void addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    //用map传参
    List<User> getUserByLimit(HashMap<String,Object>map);
}

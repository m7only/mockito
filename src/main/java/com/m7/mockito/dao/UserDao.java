package com.m7.mockito.dao;

import com.m7.mockito.entity.User;

import java.util.List;

public interface UserDao {
    User getUserByName(String name);

    List<User> findAllUsers();
}

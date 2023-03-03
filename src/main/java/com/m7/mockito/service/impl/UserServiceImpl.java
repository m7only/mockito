package com.m7.mockito.service.impl;

import com.m7.mockito.dao.UserDao;
import com.m7.mockito.dao.impl.UserDaoImpl;
import com.m7.mockito.entity.User;
import com.m7.mockito.service.UserService;

public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();

    @Override
    public boolean checkUserExist(User user) {
        return userDao.getUserByName(user.getName()) != null;
    }
}

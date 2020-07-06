package com.qst.maven.serviceImp;

import com.qst.maven.dao.UserDao;
import com.qst.maven.entity.User;
import com.qst.maven.service.UserService;

import java.util.List;

public class UserServiceImp implements UserService {
    private UserDao userDao = new UserDao();
    @Override
    public List<User> list(String username) {
        return userDao.list(username);
    }
}

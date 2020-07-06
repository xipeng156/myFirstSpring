package com.qst.service.imple;

import com.qst.dao.UserDao;
import com.qst.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService
{
    @Autowired
    private UserDao userDao;

    public void inset() {
        System.out.println("userservice");
        userDao.insert();
    }
}

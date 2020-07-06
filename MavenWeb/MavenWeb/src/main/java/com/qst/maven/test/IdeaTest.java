package com.qst.maven.test;

import com.qst.maven.dao.UserDao;
import com.qst.maven.entity.User;

import java.util.List;

//解耦：解除耦合，降低关系
public class IdeaTest {
    public static void main(String[] args)
    {
//        System.out.println(JdbcUtils.getConnection());
        UserDao userDao = new UserDao();
        List<User> list = userDao.list("z");
        System.out.println(list);

    }
}

package com.qst.test;

import com.qst.controller.imple.UserController;
import com.qst.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class SpringTest {
    @Test
    public void test(){
        ApplicationContext context = new  ClassPathXmlApplicationContext("spring.xml");
////        UserDao dao = context.getBean(UserDao.class);
//        UserDao dao = (UserDao) context.getBean("ud");
//        dao.insert();
//        @Autowired
//                public UserController userController;

        UserController controller = (UserController) context.getBean(UserController.class);
        controller.insert();
    }


}

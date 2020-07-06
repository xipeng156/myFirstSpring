package com.qst.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/*
@Component：注解注入
@Service：
@Conteoller：
@Repository
@Autowired自动注入
 */
//@Component(value = "ud")
@Repository()
public class UserDao {
    public void insert(){
        System.out.println("userdao");
    }
}

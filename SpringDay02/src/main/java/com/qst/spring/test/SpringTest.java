package com.qst.spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class SpringTest {
    @Test
    public void test01(){
    //IOC容器接口：ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(context);
    }
    @Test
    public void TestCreateDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///qst?serverTimezone=UTC&amp");
        dataSource.setName("root");
        dataSource.setPassword("123456");
    }
}

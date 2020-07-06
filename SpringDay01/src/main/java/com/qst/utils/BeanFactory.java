package com.qst.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BeanFactory {
    private static Properties properties;

    //加载配置文件
    static {
        properties = new Properties();
        InputStream is = BeanFactory.class.getClassLoader().getResourceAsStream("Beans.properties");
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//编写一个创建好的对象的方法
    public static Object getBeans(String beanName){
        String path = properties.getProperty(beanName);
//        System.out.println(path);

//        根据类名创建对象
        try {
            Class cls = Class.forName(path);
            return cls.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
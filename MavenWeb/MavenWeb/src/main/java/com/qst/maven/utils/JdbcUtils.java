package com.qst.maven.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils {
//获取数据库连接：
//    1：导包
//    2：加载驱动
//    3：获取数据库连接
    private static String DRIVER;
    private static String URL;
    private static String username;
    private static String password;
    static {
        Properties properties = new Properties();
        InputStream is = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
        try {
            properties.load(is);
            DRIVER = properties.getProperty("jdbc.driver");
            URL = properties.getProperty("jdbc.url");
            username = properties.getProperty("jdbc.username");
            password = properties.getProperty("jdbc.password");
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){

        try {
            return DriverManager.getConnection(URL,username,password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
public static void close(Connection conn, PreparedStatement smat, ResultSet rs ) {
        try {
            if (rs!=null)
                rs.close();
            if (smat!=null)
                smat.close();
            if (conn!=null)
                conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
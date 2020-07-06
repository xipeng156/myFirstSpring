package com.qst.maven.dao;



import com.qst.maven.entity.User;
import com.qst.maven.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
//    1 编写sql
//    2 获取数据库连接
//    3 获取preparedstatment
//    4 给占位符传参
//    5 执行查询
//    6 处理数据
//    7 关闭资源

    public List<User> list(String uname) {
        List<User> list = new ArrayList<>();

//    1 编写sql
        String sql = "select * from t_user";
//    1.1  查询:用户名非空
        if (uname!=null&&!"".equals(uname)){
            //此代码不执行就没用where
            sql += " where username like ?";
        }
//    2 获取数据库连接
        Connection conn = JdbcUtils.getConnection();
//    3 获取preparedstatment
        PreparedStatement pst = null;
        ResultSet rs=null;
//    4 给占位符传参

//    5 执行查询
        try {
            //    3 获取preparedstatment
            pst = conn.prepareStatement(sql);
            //    4 给占位符传参
            if (uname!=null&&!"".equals(uname)){
                pst.setObject(1,"%"+uname+"%");
            }
            //    5 执行查询
            System.out.println(sql);
            rs = pst.executeQuery();
            //    6 处理数据
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String sex = rs.getString("sex");
                String username = rs.getString("username");
                String ardreess = rs.getString("ardress");
                String classid = rs.getString("classid");

                User user = new User(id,name,age,sex,username,ardreess,classid);
                list.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils.close(conn,pst,rs);
        }

//    7 关闭资源
//        System.out.println(list);
    return list;
    }
}

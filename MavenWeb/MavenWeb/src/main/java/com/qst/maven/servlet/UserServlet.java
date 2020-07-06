package com.qst.maven.servlet;

import com.qst.maven.entity.User;
import com.qst.maven.serviceImp.UserServiceImp;
import org.testng.annotations.Test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserServlet",urlPatterns = "/list")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接收参数
        String username = request.getParameter("username");
        //调用service
        List<User> list = new UserServiceImp().list(username);
        System.out.println(list);
        request.setAttribute("username",username);
        //数据发送给jsp-将数据放入请求域
        request.setAttribute("aaa",list);
        //跳转
        //请求转发、重定向
        request.getRequestDispatcher("index.jsp").forward(request,response);

    }
}

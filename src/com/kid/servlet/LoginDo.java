package com.kid.servlet;

import com.kid.entity.UserEntity;
import com.kid.service.UserService;
import com.kid.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginDo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        //获取参数
        String name = request.getParameter("telphone");
        String pwd = request.getParameter("password");
        UserService service = new UserServiceImpl();
        UserEntity user = service.login(name, pwd);
        if (user==null) {
            //登录失败
            response.sendRedirect("denglu.jsp");
        }else{
            //登录成功
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
            response.sendRedirect("index.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

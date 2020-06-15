package com.kid.servlet;

import com.kid.entity.UserEntity;
import com.kid.service.UserService;
import com.kid.service.impl.UserServiceImpl;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterDo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        //获取参数
        String name = request.getParameter("userName");
        String pwd = request.getParameter("passWord");
        String email = request.getParameter("email");
        String phone = request.getParameter("sms");
        String jzd  = request.getParameter("jzd");
        String QQ  = request.getParameter("qq");
        String bsex  = request.getParameter("RadioGroup1");
        String bname  = request.getParameter("bname");
        UserService service = new UserServiceImpl();
        UserEntity user = new UserEntity(name,pwd,email,phone,jzd,QQ,bsex,bname);
        int row = service.register(user);
        if (row==1) {
            //注册成功
            response.sendRedirect("denglu.jsp");
        }else{
            //注册失败
            response.sendRedirect("zhuce.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

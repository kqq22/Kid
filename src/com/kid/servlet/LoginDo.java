package com.kid.servlet;

import com.kid.dao.AdminDao;
import com.kid.dao.impl.AdminDaoImpl;
import com.kid.entity.AdminEntity;
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
        if (user != null) {
            if (user.getCtype() == 2) {
                //登录成功
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                response.sendRedirect("index.jsp");
            }
        }else {
            //等于1位管理员
            AdminDao adminDao = new AdminDaoImpl();
            AdminEntity admin = adminDao.cLogin(name, pwd);
            if (admin != null) {
                //登录成功
                response.sendRedirect("managerIndex.jsp");
            } else {
                //登录失败
                response.sendRedirect("denglu.jsp");
            }
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

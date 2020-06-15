package com.kid.servlet;

import com.kid.dao.UserDao;
import com.kid.dao.impl.UserDaoImpl;
import com.kid.entity.UserEntity;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SelectUserServlet")
public class SelectUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //初始化dao
        UserDao userDao = new UserDaoImpl();
        //执行查询方法
        List<UserEntity> userList = userDao.FindUserAll();
        //将结果保存
        session.setAttribute("userList",userList);
        //重定向至 usermanager.jsp 页面
        response.sendRedirect("usermanager.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

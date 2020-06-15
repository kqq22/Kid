package com.kid.servlet;

import com.kid.dao.AdminDao;
import com.kid.dao.impl.AdminDaoImpl;
import com.kid.entity.AdminEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * 查询所有管理员信息
 */
@WebServlet(name = "SelectAdminServlet")
public class SelectAdminServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //初始化dao
        AdminDao adminDao = new AdminDaoImpl();
        //执行查询方法
        List<AdminEntity> adminList = adminDao.selectAdmin();
        //将结果保存
        session.setAttribute("adminList",adminList);
        //重定向至 adminmanager.jsp 页面
        response.sendRedirect("adminmanager.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

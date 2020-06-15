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

/**
 * 根据id查询管理员
 */
@WebServlet(name = "FindAdminServlet")
public class FindAdminServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //获取参数
        int id = Integer.parseInt(request.getParameter("id"));
        //初始化dao
        AdminDao adminDao = new AdminDaoImpl();
        //执行查询方法
        AdminEntity admin = adminDao.findAdmin(id);
        //将结果保存
        session.setAttribute("id",id);
        session.setAttribute("findadmin",admin);
        //重定向至 updateadmin.jsp
        response.sendRedirect("updateadmin.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

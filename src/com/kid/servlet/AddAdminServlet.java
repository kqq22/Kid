package com.kid.servlet;

import com.kid.dao.AdminDao;
import com.kid.dao.impl.AdminDaoImpl;
import com.kid.entity.AdminEntity;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 添加管理员
 */
@WebServlet(name = "AddAdminServlet")
public class AddAdminServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        //获取参数
        String name = request.getParameter("userName");
        String pwd = request.getParameter("password");
        AdminEntity admin = new AdminEntity(name,pwd);
        AdminDao adminDao = new AdminDaoImpl();
        int row = adminDao.addAdmin(admin);
        if (row==1) {
            //添加成功
            response.sendRedirect("selectadmin");
        }else{
            //添加失败
            response.sendRedirect("addadmin.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

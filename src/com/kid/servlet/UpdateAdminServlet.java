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
 * 根据id修改管理员信息
 */
@WebServlet(name = "UpdateAdminServlet")
public class UpdateAdminServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        //获取参数
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        int id = (int)(session.getAttribute("id"));
        //将数据存入实体类
        AdminEntity admin = new AdminEntity(name,pwd);
        //执行修改方法
        AdminDao adminDao = new AdminDaoImpl();
        int line = adminDao.updateAdmin(admin,id);
        if(line==1){
            //修改成功 重定向至 selectadmin Servlet
            //将修改后的值存入session中
            session.setAttribute("admin",admin);
            response.sendRedirect("selectadmin");
        }else{
            //修改失败 重定向至 updateadmin.jsp 页面
            response.sendRedirect("updateadmin.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

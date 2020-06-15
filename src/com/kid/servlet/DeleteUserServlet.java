package com.kid.servlet;

import com.kid.dao.UserDao;
import com.kid.dao.impl.UserDaoImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置请求编码格式
        request.setCharacterEncoding("UTF-8");
        //获取参数
        int id = Integer.parseInt(request.getParameter("id"));
        //调用删除方法
        UserDao userDao = new UserDaoImpl();
        int line = userDao.deleteUser(id);
        if(line==1){
            //删除成功  重定向至  selectuser  Servlet页面
            response.sendRedirect("selectuser");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

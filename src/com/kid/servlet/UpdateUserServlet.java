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

@WebServlet(name = "UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码格式、
        request.setCharacterEncoding("UTF-8");
        //获取参数
        String name = request.getParameter("userName");
        String pwd = request.getParameter("passWord");
        String email = request.getParameter("email");
        String phone = request.getParameter("sms");
        int id = Integer.parseInt(request.getParameter("id"));
        //将数据存入实体类
        UserEntity user = new UserEntity(name,pwd,email,phone);
        //执行修改方法
        UserDao dao = new UserDaoImpl();
        int line = dao.updateUser(user,id);
        if(line==1){
            //修改成功
            //将修改后的值存入session中
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
            response.sendRedirect("grzl.jsp");
        }else{
            //修改失败
            response.sendRedirect("grzl.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

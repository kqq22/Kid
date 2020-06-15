package com.kid.servlet;

import com.kid.dao.ActionDao;
import com.kid.dao.impl.ActionDaoImpl;
import com.kid.entity.ActionEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/*
 *根据id查询亲子活动表信息
 */
@WebServlet(name = "FindActionServlet")
public class FindActionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //获取参数
        int id = Integer.parseInt(request.getParameter("id"));
        //初始化dao
        ActionDao dao = new ActionDaoImpl();
        //执行查询方法
        ActionEntity action = dao.findAction(id);
        //将结果保存
        session.setAttribute("aid",id);
        session.setAttribute("findaction",action);
        //重定向至updateaction.jsp
        response.sendRedirect("updateaction.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

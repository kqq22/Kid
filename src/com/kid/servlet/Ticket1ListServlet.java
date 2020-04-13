package com.kid.servlet;

import com.kid.dao.TicketDao;
import com.kid.dao.impl.TicketDaoImpl;
import com.kid.entity.TicketEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class Ticket1ListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //查询票务表信息
        TicketDao dao = new TicketDaoImpl();
        //获取主题参数
        String topic = request.getParameter("topichd");
        //执行查询方法
        List<TicketEntity> list = dao.showTicket(topic);
        //将结果保存到session中
        HttpSession session = request.getSession();
        session.setAttribute("tickethdList",list);
        //重定向至qzhd-1.jsp
        response.sendRedirect("qzhd-1.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

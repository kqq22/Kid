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

@WebServlet(name = "Servlet2")
public class Ticket3ListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get设置编码
        request.setCharacterEncoding("utf-8");
        //response.setContentType("text/html;charset=utf-8");
        //查询票务表信息
        TicketDao dao = new TicketDaoImpl();
        //获取主题参数
        //String topicpw = new String(request.getParameter("topicpw").getBytes("iso8859-1"),"UTF-8");
        String topicpw = request.getParameter("topicpw");
        //执行查询方法
        List<TicketEntity> listpw = dao.showTicket(topicpw);
        //将结果保存到session中
        HttpSession session = request.getSession();
        session.setAttribute("ticketpwList",listpw);
        //重定向至pw-1.jsp
        response.sendRedirect("pw-1.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

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

public class Ticket2ListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get设置编码
        request.setCharacterEncoding("utf-8");
        //response.setContentType("text/html;charset=utf-8");
        //查询票务表信息
        TicketDao dao = new TicketDaoImpl();
        //获取主题参数
        //String topicly = new String(request.getParameter("topicly").getBytes("iso8859-1"),"UTF-8");
        String topicly = request.getParameter("topicly");
        //执行查询方法
        List<TicketEntity> listly = dao.showTicket(topicly);

        //将结果保存到session中
        HttpSession session = request.getSession();
        session.setAttribute("ticketlyList",listly);
        //重定向至qzly-1.jsp
        response.sendRedirect("qzly-1.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

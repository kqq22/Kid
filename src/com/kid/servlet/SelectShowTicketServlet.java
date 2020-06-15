package com.kid.servlet;

import com.kid.dao.ShowTicketDao;
import com.kid.dao.impl.ShowTicketDaoImpl;
import com.kid.entity.ShowTicketEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/*
 *查询亲子活动表信息
 */
@WebServlet(name = "SelectShowTicketServlet")
public class SelectShowTicketServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //查询票务表信息
        //初始化dao
        ShowTicketDao showTicketDao = new ShowTicketDaoImpl();
        //执行查询方法
        List<ShowTicketEntity> showTicketList = showTicketDao.selectShowTicket();
        //将结果保存
        session.setAttribute("showTicketList",showTicketList);
        //重定向至 managerticket.jsp 页面
        response.sendRedirect("managerticket.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
